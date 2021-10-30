package it.unibo.oop.lab05.ex5;

import java.util.*;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> union = new HashSet<>();
        Iterator<? extends X> iteratorOnFirstSet = setA.iterator();
        while (iteratorOnFirstSet.hasNext()) {
        	union.add(iteratorOnFirstSet.next());
        }
        Iterator<? extends X> iteratorOnSecondSet = setB.iterator();
        while (iteratorOnSecondSet.hasNext()) {
        	union.add(iteratorOnSecondSet.next());
        }
        return union;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> union = new HashSet<>();
        Iterator<? extends X> iterator = setA.iterator();
        while (iterator.hasNext()) {
        	X nextElem = iterator.next();
        	if (setB.contains(nextElem)) {
        		union.add(nextElem);
        	}
        }
        return union;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> union = setUnion(setA, setB);
        Set<X> intersection = setIntersection(setA, setB);
        Iterator<X> iterator = union.iterator();
        while (iterator.hasNext()) {
        	X nextElem = iterator.next();
        	if (intersection.contains(nextElem)) {
        		iterator.remove();
        	}
        }
        return union;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        return null;
    }
}
