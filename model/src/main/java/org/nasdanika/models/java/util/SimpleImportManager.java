package org.nasdanika.models.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleImportManager {
	
	private static final String STATIC_PREFIX = "static ";

	// Short name -> Fully Qualified Name.
	private Map<String, String> imports = new LinkedHashMap<>();
	
	// Fully qualified names.
	private Set<String> implicitImports = new HashSet<>();
	
	public SimpleImportManager(Collection<String> implicitImports) {
		if (implicitImports != null) {
			this.implicitImports.addAll(implicitImports);
			for (String ii: this.implicitImports) {
				addImport(ii);
			}
		}
	}

	public String addImport(String fullyQualifiedName) {
		int lastDotIdx = fullyQualifiedName.lastIndexOf('.');
		if (lastDotIdx == -1) {
			return fullyQualifiedName;
		}
		int ltIdx = fullyQualifiedName.indexOf('<', lastDotIdx);
		String shortName = fullyQualifiedName.substring(lastDotIdx + 1, ltIdx == -1 ? fullyQualifiedName.length() : ltIdx);		
		String pShortName = fullyQualifiedName.substring(lastDotIdx + 1, fullyQualifiedName.length());		
		String efqn = imports.get(shortName);
		if (efqn == null) {
			imports.put(shortName, fullyQualifiedName);
			if ("java.lang".equals(fullyQualifiedName.substring(0, lastDotIdx))) {
				implicitImports.add(fullyQualifiedName);
			}
			return pShortName;
		}
		if (efqn.equals(fullyQualifiedName)) {
			return pShortName;
		}
		return fullyQualifiedName.startsWith(STATIC_PREFIX) ? fullyQualifiedName.substring(STATIC_PREFIX.length()) : fullyQualifiedName; 
	}

	public Collection<String> getImports() {
		List<String> ret = new ArrayList<>();
		for (String fqn: imports.values()) {
			if (!isImplicitImport(fqn)) {
				ret.add(fqn);
			}
		}
		Collections.sort(ret);
		return ret;
	}
	
	protected boolean isImplicitImport(String fullyQualifiedTypeName) {
		return implicitImports.contains(fullyQualifiedTypeName);
	}

}