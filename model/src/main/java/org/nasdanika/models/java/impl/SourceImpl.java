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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.GenerationMode;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Position;
import org.nasdanika.models.java.Range;
import org.nasdanika.models.java.Reference;
import org.nasdanika.models.java.Source;
import org.nasdanika.ncore.Marker;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getGenerationMode <em>Generation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends MinimalEObjectImpl.Container implements Source {
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
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(JavaPackage.SOURCE__MARKERS, NcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getBegin() {
		return (Position)eDynamicGet(JavaPackage.SOURCE__BEGIN, JavaPackage.Literals.RANGE__BEGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(Position newBegin, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBegin, JavaPackage.SOURCE__BEGIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(Position newBegin) {
		eDynamicSet(JavaPackage.SOURCE__BEGIN, JavaPackage.Literals.RANGE__BEGIN, newBegin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getEnd() {
		return (Position)eDynamicGet(JavaPackage.SOURCE__END, JavaPackage.Literals.RANGE__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Position newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, JavaPackage.SOURCE__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Position newEnd) {
		eDynamicSet(JavaPackage.SOURCE__END, JavaPackage.Literals.RANGE__END, newEnd);
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
	public String generate(Function<String, String> importManager) {
		switch (getGenerationMode()) {
		case COMPOSE: {
			String source = getSource();
			return generateContents(importManager)
					.stream()
					.filter(Objects::nonNull)
					.filter(s -> !Util.isBlank(s.getSource()))
					.map(Source::getSource)
					.reduce(Util.isBlank(source) ? "" : source , (a,b) -> a + b);
		}
		case CONTENTS: {
			return generateContents(importManager)
					.stream()
					.filter(Objects::nonNull)
					.filter(s -> !Util.isBlank(s.getSource()))
					.map(Source::getSource)
					.reduce("", (a,b) -> a + b);
		}
		case CONTENTS_IF_NO_SOURCE: {
			String source = getSource();
			if (Util.isBlank(source)) {
				return generateContents(importManager)
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
				return generateContents(importManager)
						.stream()
						.filter(Objects::nonNull)
						.filter(s -> !Util.isBlank(s.getSource()))
						.map(Source::getSource)
						.reduce("", (a,b) -> a + b);
			}
			List<Source> contents = generateContents(importManager);
			if (contents.isEmpty()) {
				// Nothing to merge - return source
				return Util.isBlank(source) ? "" : source;				
			}
			
			String[] lines = source.split("\\R");
			
			StringBuilder output = new StringBuilder();
			Position position = null;
			for (Source contentsElement: contents) {
				output.append(rangeText(position, contentsElement.getBegin(), lines));
				output.append(contentsElement.getSource());
				position = contentsElement.getEnd();
			}
			output.append(rangeText(position, null, lines));
			return output.toString();			
		}
		default:
			throw new UnsupportedOperationException("Unsupported generation mode: " + getGenerationMode());		
		}		
	}
	
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public Position before(Function<Integer, Integer> lineLengthProvider) {
//		Position ret = EcoreUtil.copy(this);
//		int column = ret.getColumn();
//		int line = ret.getLine();
//		if (column > 1) {
//			ret.setColumn(column - 1);
//		} else if (line > 1) {			
//			ret.setColumn(lineLengthProvider.apply(line - 1));
//			ret.setLine(line - 1);
//		}
//		return ret;
//	}
	
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
				int endColumn = end == null ? lineStr.length() : end.getColumn();
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
	protected List<Source> generateContents(Function<String, String> importManager) {
		return getChildren();
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean contains(Range range) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean contains(Position position) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean overlaps(Range range) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.SOURCE__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case JavaPackage.SOURCE__BEGIN:
				return basicSetBegin(null, msgs);
			case JavaPackage.SOURCE__END:
				return basicSetEnd(null, msgs);
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
			case JavaPackage.SOURCE__MARKERS:
				return getMarkers();
			case JavaPackage.SOURCE__BEGIN:
				return getBegin();
			case JavaPackage.SOURCE__END:
				return getEnd();
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
			case JavaPackage.SOURCE__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case JavaPackage.SOURCE__BEGIN:
				setBegin((Position)newValue);
				return;
			case JavaPackage.SOURCE__END:
				setEnd((Position)newValue);
				return;
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
			case JavaPackage.SOURCE__MARKERS:
				getMarkers().clear();
				return;
			case JavaPackage.SOURCE__BEGIN:
				setBegin((Position)null);
				return;
			case JavaPackage.SOURCE__END:
				setEnd((Position)null);
				return;
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
			case JavaPackage.SOURCE__MARKERS:
				return !getMarkers().isEmpty();
			case JavaPackage.SOURCE__BEGIN:
				return getBegin() != null;
			case JavaPackage.SOURCE__END:
				return getEnd() != null;
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Range.class) {
			switch (derivedFeatureID) {
				case JavaPackage.SOURCE__BEGIN: return JavaPackage.RANGE__BEGIN;
				case JavaPackage.SOURCE__END: return JavaPackage.RANGE__END;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Range.class) {
			switch (baseFeatureID) {
				case JavaPackage.RANGE__BEGIN: return JavaPackage.SOURCE__BEGIN;
				case JavaPackage.RANGE__END: return JavaPackage.SOURCE__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Range.class) {
			switch (baseOperationID) {
				case JavaPackage.RANGE___CONTAINS__RANGE: return JavaPackage.SOURCE___CONTAINS__RANGE;
				case JavaPackage.RANGE___CONTAINS__POSITION: return JavaPackage.SOURCE___CONTAINS__POSITION;
				case JavaPackage.RANGE___OVERLAPS__RANGE: return JavaPackage.SOURCE___OVERLAPS__RANGE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case JavaPackage.SOURCE___GENERATE__FUNCTION:
				return generate((Function<String, String>)arguments.get(0));
			case JavaPackage.SOURCE___CONTAINS__RANGE:
				return contains((Range)arguments.get(0));
			case JavaPackage.SOURCE___CONTAINS__POSITION:
				return contains((Position)arguments.get(0));
			case JavaPackage.SOURCE___OVERLAPS__RANGE:
				return overlaps((Range)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceImpl
