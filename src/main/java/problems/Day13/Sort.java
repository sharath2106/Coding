//int small[26];
//
//        // Stores frequency of
//        // uppercase characters
//        int caps[26];
//
//        memset(small, 0, sizeof(small));
//        memset(caps, 0, sizeof(caps));
//
//        // Count frequency of characters
//        for (int i = 0; i < s.length(); i++) {
//
//        if (s[i] >= 65 && s[i] <= 90)
//        caps[s[i] - 'A']++;
//        else
//        small[s[i] - 'a']++;
//        }
//
//        // Mark those characters which
//        // are not present in both
//        // lowercase and uppercase
//        unordered_map<char, int> mp;
//        for (int i = 0; i < 26; i++) {
//
//        if (small[i] && !caps[i])
//        mp[char(i + 'a')] = 1;
//
//        else if (caps[i] && !small[i])
//        mp[char(i + 'A')] = 1;
//        }
//
//        // Initialize the frequencies
//        // back to 0
//        memset(small, 0, sizeof(small));
//        memset(caps, 0, sizeof(caps));
//
//        // Marks the start and
//        // end of current substring
//        int i = 0, st = 0;
//
//        // Marks the start and end
//        // of required substring
//        int start = -1, end = -1;
//
//        // Stores the length of
//        // smallest balanced substring
//        int minm = INT_MAX;
//
//        while (i < s.length()) {
//        if (mp[s[i]]) {
//
//        // Remove all characters
//        // obtained so far
//        while (st < i) {
//
//        if (s[st] >= 65 && s[st] <= 90)
//        caps[s[st] - 'A']--;
//        else
//        small[s[st] - 'a']--;
//
//        st++;
//        }
//        i += 1;
//        st = i;
//        }
//        else {
//
//        if (s[i] >= 65 && s[i] <= 90)
//        caps[s[i] - 'A']++;
//        else
//        small[s[i] - 'a']++;
//
//        // Remove extra characters from
//        // front of the current substring
//        while (1) {
//
//        if (s[st] >= 65 && s[st] <= 90
//        && caps[s[st] - 'A'] > 1) {
//        caps[s[st] - 'A']--;
//        st++;
//        }
//        else if (s[st] >= 97 && s[st] <= 122
//        && small[s[st] - 'a'] > 1) {
//        small[s[st] - 'a']--;
//        st++;
//        }
//        else
//        break;
//        }
//
//        // If substring (st, i) is balanced
//        if (balanced(small, caps)) {
//
//        if (minm > (i - st + 1)) {
//
//        minm = i - st + 1;
//        start = st;
//        end = i;
//        }
//        }
//        i += 1;
//        }
//        }
//
//        // No balanced substring
//        if (start == -1 || end == -1)
//        cout << -1 << endl;
//
//        // Store answer string
//        else {
//
//        string ans = "";
//        for (int i = start; i <= end; i++)
//        ans += s[i];
//        cout << ans << endl;
//        }