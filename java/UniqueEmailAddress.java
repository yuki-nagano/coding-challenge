class Solution {
    Set<String> set = new HashSet<>();
    public int numUniqueEmails(String[] emails) {
        int count = 0;
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].indexOf('@') != -1) {
                if (emails[i].indexOf(".com") != -1) {
                    int at = emails[i].indexOf('@');
                    String local = emails[i].substring(0, (at - 1));
                    String domain = emails[i].substring(at, emails[i].length());
                    System.out.println(local);
                    System.out.println(domain);
                    if (!set.contains(local)) {
                        set.add(local);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
/*
Note:
    It counts as 1, as long as..
        it has @, and .com
    If the local name has dots, it will be the same as no dot. (doesn't count as 1)

pseudo code:
    loop through emails
    check if
        domain name has @ and .com
        substring domain name
        substring local name
        if localname doesn't contains in set, add to set
            count++;
*/