package org.cwash.ex2groovy

/**
 * Exercise2Groovy Groovy class.
 */
class Exercise2Groovy {

    def List<String> mostPopularThreePageSequence(List<LogLine> logFileInput) {

        /* find unique users for partitions */
        def uniqueUsers = [] as TreeSet
        logFileInput.each { uniqueUsers.add(it.customerId) }

        /* partition the dataset by unique user */
        def usersToLogLinesMap = [:] as TreeMap
        uniqueUsers.each { user ->
            def logLinesForUser = logFileInput.findAll { it.customerId == user }
            usersToLogLinesMap[user] = logLinesForUser
        }

        def sequenceSize = 3;


        def linePermutationsToCount = [:] as Map<List<String>, Integer>

        /* generate permutations for all of the page sequences */
        uniqueUsers.each { user ->
            def logLinesForUser = usersToLogLinesMap.get(user)

            for (int i = 0; i < logLinesForUser.size(); i++) {
                def linePermutation = []
                for (int j = 0; j < sequenceSize; j++) {
                    if (i+j < logLinesForUser.size()) {
                        linePermutation.add(logLinesForUser.get(i+j).pageType)
                    } else {
                        break;
                    }
                }

                if (linePermutation.size() == sequenceSize)
                {
                    int lastCount = linePermutationsToCount[linePermutation];
                    if (lastCount == null) {
                        linePermutationsToCount[linePermutation] = 1;
                    } else {
                        int count = lastCount + 1
                        linePermutationsToCount[linePermutation] = count;
                    }
                }

            }


        }

        /* rank sequences by count and return most popular sequence */
        def mostPopularSequence = linePermutationsToCount.max { it.value }.key
        return mostPopularSequence;
    }
}
