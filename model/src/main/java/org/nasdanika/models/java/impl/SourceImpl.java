/**
 */
package org.nasdanika.models.java.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PropertyComputer;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.GenerationMode;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Position;
import org.nasdanika.models.java.Range;
import org.nasdanika.models.java.Reference;
import org.nasdanika.models.java.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getGenerationMode <em>Generation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends RangeImpl implements Source {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGenerationMode() <em>Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationMode()
	 * @generated
	 * @ordered
	 */
	protected static final GenerationMode GENERATION_MODE_EDEFAULT = GenerationMode.CONTENTS_IF_NO_SOURCE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(JavaPackage.SOURCE__SOURCE, JavaPackage.Literals.SOURCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(JavaPackage.SOURCE__SOURCE, JavaPackage.Literals.SOURCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getChildren() {
		return (EList<Source>)eDynamicGet(JavaPackage.SOURCE__CHILDREN, JavaPackage.Literals.SOURCE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Coverage> getCoverage() {
		return (EList<Coverage>)eDynamicGet(JavaPackage.SOURCE__COVERAGE, JavaPackage.Literals.SOURCE__COVERAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Reference> getReferences() {
		return (EList<Reference>)eDynamicGet(JavaPackage.SOURCE__REFERENCES, JavaPackage.Literals.SOURCE__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationMode getGenerationMode() {
		return (GenerationMode)eDynamicGet(JavaPackage.SOURCE__GENERATION_MODE, JavaPackage.Literals.SOURCE__GENERATION_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerationMode(GenerationMode newGenerationMode) {
		eDynamicSet(JavaPackage.SOURCE__GENERATION_MODE, JavaPackage.Literals.SOURCE__GENERATION_MODE, newGenerationMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generate(Function<String, String> importManager, int indent) {
		switch (getGenerationMode()) {
		case COMPOSE: {
			String source = getSource();
			return generateContents(importManager, indent)
					.stream()
					.filter(Objects::nonNull)
					.filter(s -> !Util.isBlank(s.getSource()))
					.map(Source::getSource)
					.reduce(Util.isBlank(source) ? "" : source , (a,b) -> a + b);
		}
		case CONTENTS: {
			return generateContents(importManager, indent)
					.stream()
					.filter(Objects::nonNull)
					.filter(s -> !Util.isBlank(s.getSource()))
					.map(Source::getSource)
					.reduce("", (a,b) -> a + b);
		}
		case CONTENTS_IF_NO_SOURCE: {
			String source = getSource();
			if (Util.isBlank(source)) {
				return generateContents(importManager, indent)
						.stream()
						.filter(Objects::nonNull)
						.filter(s -> !Util.isBlank(s.getSource()))
						.map(Source::getSource)
						.reduce("", (a,b) -> a + b);
			}
			return source;
		}
		case SOURCE: {
			String source = getSource();
			return Util.isBlank(source) ? "" : source;
		}
		case MERGE: {
			String source = getSource();
			if (Util.isBlank(source)) {
				// Nothing to merge - return contents;
				return generateContents(importManager, indent)
						.stream()
						.filter(Objects::nonNull)
						.filter(s -> !Util.isBlank(s.getSource()))
						.map(Source::getSource)
						.reduce("", (a,b) -> a + b);
			}
			List<Source> contents = generateContents(importManager, indent);
			if (contents.isEmpty()) {
				// Nothing to merge - return source
				return Util.isBlank(source) ? "" : source;				
			}
			
			String[] lines = source.split("\\R");
			
			StringBuilder output = new StringBuilder();
			Position position = null;
			for (Source contentsElement: contents) {
				Position begin = contentsElement.getBegin();
				output.append(rangeText(position, begin, lines));
				if (begin != null) {
					position = decrement(begin, l -> lines[l].length());
				}
				output.append(contentsElement.getSource());
				Position end = contentsElement.getEnd();
				if (end != null) {
					position = end;
				}
			}
			output.append(rangeText(position, null, lines));
			return output.toString();			
		}
		default:
			throw new UnsupportedOperationException("Unsupported generation mode: " + getGenerationMode());		
		}		
	}
	
	/**
	 * Creates a string builder with a specified number of indent tabs.
	 * @param indent
	 * @return
	 */
	protected static StringBuilder indent(int indent) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < indent; ++i) {
			ret.append("\t");
		}
		return ret;
	}
	
	protected static String interpolate(String string, Function<String,String> importManager) {
		if (importManager == null || Util.isBlank(string)) {
			return string;
		}
		MutableContext context = new SimpleMutableContext();
		context.put("import", new PropertyComputer() {
			
			@SuppressWarnings("unchecked")
			@Override
			public <T> T compute(Context context, String key, String path, Class<T> type) {		
				return (T) importManager.apply(path);
			}
		});
		
		return context.interpolateToString(string);
	}
	
	private static Position decrement(Position position, Function<Integer, Integer> lineLengthProvider) {
		Position ret = EcoreUtil.copy(position);
		int column = ret.getColumn();
		int line = ret.getLine();
		if (column > 1) {
			ret.setColumn(column - 1);
		} else if (line > 1) {			
			ret.setColumn(lineLengthProvider.apply(line - 1));
			ret.setLine(line - 1);
		}
		return ret;
	}
	
	/**
	 * 
	 * @param start If null, then from the beginning. Exclusive.
	 * @param end If null, then to the end. Exclusive.
	 * @param lines
	 * @return
	 */
	protected String rangeText(Position start, Position end, String[] lines) {
		int startLine = start == null ? 1 : start.getLine();
		StringBuilder ret = new StringBuilder();
		int lastLine = end == null ? lines.length : end.getLine();
		for (int line = startLine; line <= lastLine; ++line) {
			String lineStr = lines[line - 1];
			if (line == startLine && line == lastLine) {
				int startColumn = start == null ? 1 : start.getColumn();
				int endColumn = end == null ? lineStr.length() : Math.min(lineStr.length(), end.getColumn());
				if (startColumn < endColumn) {
					ret.append(lineStr.substring(startColumn, endColumn - 1)); // Both exclusive
				}
			} else if (line == startLine) {
				int startColumn = start == null ? 1 : start.getColumn();
				if (startColumn < lineStr.length()) {
					ret.append(lineStr.substring(startColumn));
				}
			} else if (line == lastLine) {
				int endColumn = end == null ? lineStr.length() : end.getColumn();
				ret.append(lineStr.substring(0, endColumn - 1)); 				
			} else {
				ret.append(lineStr);
			}
		}
		return ret.toString();
	}
	
	/**
	 * For range sorting if needed
	 * @param a
	 * @param b
	 * @return
	 */
	protected static int compareRanges(Range a, Range b) {
		Position aBegin = a.getBegin();
		Position bBegin = a.getBegin();
		
		if (a.overlaps(b)) {
			throw new IllegalArgumentException("Overlapping ranges");
		}
		
		if (aBegin == null) {
			if (bBegin != null) {
				return 1;
			}
			return a.hashCode() - b.hashCode();
		} 
		
		if (bBegin == null) {
			return -1;
		}
		
		return aBegin.compareTo(bBegin);
	}
	
	/**
	 * Generates a list of sources from contents.
	 * When merging, source ranges are used to replace fragments in the original source.
	 * @param importManager
	 * @return
	 */
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
		return getChildren();
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.SOURCE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case JavaPackage.SOURCE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.SOURCE__SOURCE:
				return getSource();
			case JavaPackage.SOURCE__CHILDREN:
				return getChildren();
			case JavaPackage.SOURCE__COVERAGE:
				return getCoverage();
			case JavaPackage.SOURCE__REFERENCES:
				return getReferences();
			case JavaPackage.SOURCE__GENERATION_MODE:
				return getGenerationMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.SOURCE__SOURCE:
				setSource((String)newValue);
				return;
			case JavaPackage.SOURCE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Source>)newValue);
				return;
			case JavaPackage.SOURCE__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends Coverage>)newValue);
				return;
			case JavaPackage.SOURCE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case JavaPackage.SOURCE__GENERATION_MODE:
				setGenerationMode((GenerationMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.SOURCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case JavaPackage.SOURCE__CHILDREN:
				getChildren().clear();
				return;
			case JavaPackage.SOURCE__COVERAGE:
				getCoverage().clear();
				return;
			case JavaPackage.SOURCE__REFERENCES:
				getReferences().clear();
				return;
			case JavaPackage.SOURCE__GENERATION_MODE:
				setGenerationMode(GENERATION_MODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.SOURCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case JavaPackage.SOURCE__CHILDREN:
				return !getChildren().isEmpty();
			case JavaPackage.SOURCE__COVERAGE:
				return !getCoverage().isEmpty();
			case JavaPackage.SOURCE__REFERENCES:
				return !getReferences().isEmpty();
			case JavaPackage.SOURCE__GENERATION_MODE:
				return getGenerationMode() != GENERATION_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.SOURCE___GENERATE__FUNCTION_INT:
				return generate((Function<String, String>)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceImpl
