package org.cwash.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Exercise 2 solution.
 *
 * @author Chris Wash <a href="mailto:chris.wash@gmail.com">chris.wash@gmail.com</a>
 */
public class Exercise2 {

    public List<String> mostPopularThreePageSequence(List<LogLine> logFileInput) {

        /* find unique users for partitions */
        SortedSet<String> users = findUniqueUsersFromLogFileInput(logFileInput);

        /* partition the dataset by unique user (MultiMap would be nice here...) */
        SortedMap<String, List<LogLine>> logLinesForUserMap = partitionDatasetByUniqueUser(logFileInput, users);

        /* generate permutations for all of the page sequences */
        Map<List<String>, MutableInt> logLinePermutations = generatePermutationsForPageSequences(users, logLinesForUserMap, 3);

        /* rank sequences by count and return most popular sequence */
        List<String> popularSequence = findMostPopularPageSequence(logLinePermutations);

        return popularSequence;
    }

    private List<String> findMostPopularPageSequence(Map<List<String>, MutableInt> logLinePermutations) {
        int maxCount = 0;
        List<String> popularSequence = null;
        for (Map.Entry<List<String>, MutableInt> entry : logLinePermutations.entrySet()) {
            if (entry.getValue().get() > maxCount)
            {
                maxCount = entry.getValue().get();
                popularSequence = entry.getKey();
            }
        }
        return popularSequence;
    }

    private Map<List<String>, MutableInt> generatePermutationsForPageSequences(SortedSet<String> users,
                                                                               SortedMap<String, List<LogLine>> logLinesForUserMap,
                                                                               int sequenceSize) {
        Map<List<String>, MutableInt> logLinePermutations = new HashMap<>();
        for (String user : users) {

            List<LogLine> logLinesForUser = logLinesForUserMap.get(user);

            for (int i = 0; i < logLinesForUser.size(); i++) {
                List<String> linePermuation = new ArrayList<>();
                for (int j = 0; j < sequenceSize; j++) {
                    if (i+j < logLinesForUser.size()) {
                        linePermuation.add(logLinesForUser.get(i+j).pageType);
                    } else {
                        break;
                    }
                }

                MutableInt count = logLinePermutations.get(linePermuation);
                if (count == null) {
                    logLinePermutations.put(linePermuation, new MutableInt());
                } else {
                    count.increment();
                }
            }

        }
        return logLinePermutations;
    }

    private SortedMap<String, List<LogLine>> partitionDatasetByUniqueUser(List<LogLine> logFileInput, SortedSet<String> users) {
        SortedMap<String, List<LogLine>> logLinesForUserMap = new TreeMap<>();
        for (String user : users) {

            List<LogLine> logLinesForUser = new ArrayList<>();
            for (LogLine logLine : logFileInput) {
                if (user.equals(logLine.customerId)) {
                    logLinesForUser.add(logLine);
                }
            }

            logLinesForUserMap.put(user, logLinesForUser);
        }
        return logLinesForUserMap;
    }

    private SortedSet<String> findUniqueUsersFromLogFileInput(List<LogLine> logFileInput) {
        SortedSet<String> users = new TreeSet<>();
        for (LogLine logLine : logFileInput) {
            users.add(logLine.customerId);
        }
        return users;
    }
}
