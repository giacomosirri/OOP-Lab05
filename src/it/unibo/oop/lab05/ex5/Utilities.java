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
		union.addAll(setA);
		for (final X thisElement : setB) {
			union.add(thisElement);
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
		Set<X> intersection = new HashSet<>();
		for (final X thisElement : setA) {
			if (setB.contains(thisElement)) {
				intersection.add(thisElement);
			}
		}
		return intersection;
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
		for (final X thisElement : intersection) {
			union.remove(thisElement);
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
		Random rand = new Random();
		// randomly generates a position in the collection
		int randValue = rand.nextInt() % coll.size();
		Iterator<X> iterator = coll.iterator();
		// iterates through the collection until the randValue position is reached
		for (int i = 0; i < randValue; i++) {
			iterator.next();
		}
		return iterator.next();
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
        return new Pair<X, Y>(getRandomElement(first), getRandomElement(second));
    }
}
