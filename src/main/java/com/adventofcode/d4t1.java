package com.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d4t1 {


    public static void main(String[] args) {


        String data = "iyr:2010 ecl:gry hgt:181cm\n" +
                "pid:591597745 byr:1920 hcl:#6b5442 eyr:2029 cid:123\n" +
                "\n" +
                "cid:223 byr:1927\n" +
                "hgt:177cm hcl:#602927 iyr:2016 pid:404183620\n" +
                "ecl:amb\n" +
                "eyr:2020\n" +
                "\n" +
                "byr:1998\n" +
                "ecl:hzl\n" +
                "cid:178 hcl:#a97842 iyr:2014 hgt:166cm pid:594143498 eyr:2030\n" +
                "\n" +
                "ecl:hzl\n" +
                "pid:795349208 iyr:2018\n" +
                "eyr:2024 hcl:#de745c hgt:157cm\n" +
                "\n" +
                "hgt:159cm pid:364060467 eyr:2025 byr:1978 iyr:2018 cid:117\n" +
                "ecl:hzl\n" +
                "hcl:#18171d\n" +
                "\n" +
                "hcl:#cfa07d\n" +
                "ecl:amb iyr:2012\n" +
                "hgt:182cm cid:338\n" +
                "eyr:2020\n" +
                "pid:374679609 byr:1925\n" +
                "\n" +
                "eyr:2021 byr:1981\n" +
                "hcl:#623a2f cid:195 iyr:2010\n" +
                "pid:579769934 ecl:grn hgt:192cm\n" +
                "\n" +
                "byr:1970\n" +
                "ecl:oth\n" +
                "eyr:2025\n" +
                "pid:409994798 iyr:2018 hgt:189cm\n" +
                "\n" +
                "hgt:153cm pid:817651329 iyr:2019\n" +
                "eyr:2029\n" +
                "hcl:#623a2f byr:1920\n" +
                "ecl:gry\n" +
                "\n" +
                "iyr:2011 ecl:amb hcl:#a97842 byr:1965 pid:648375525 eyr:2028 hgt:177cm cid:287\n" +
                "\n" +
                "iyr:2012 pid:369979235 hcl:#c0946f\n" +
                "ecl:amb hgt:178cm\n" +
                "\n" +
                "byr:1927 ecl:brn hgt:178cm eyr:2026 hcl:#efcc98\n" +
                "iyr:2011 pid:770851101\n" +
                "\n" +
                "eyr:2028\n" +
                "ecl:oth cid:298\n" +
                "byr:1943\n" +
                "hgt:168cm iyr:2018 hcl:#ceb3a1 pid:116783406\n" +
                "\n" +
                "eyr:2027 hgt:175cm hcl:#733820\n" +
                "ecl:gry cid:349 iyr:2017 byr:1960\n" +
                "pid:257797292\n" +
                "\n" +
                "cid:66 ecl:amb\n" +
                "eyr:2030\n" +
                "iyr:2026 byr:2024\n" +
                "hcl:a22966 hgt:179cm pid:155cm\n" +
                "\n" +
                "eyr:2023 hcl:#c0946f pid:081232570 ecl:hzl\n" +
                "iyr:2010 hgt:158cm byr:1969\n" +
                "\n" +
                "byr:1958\n" +
                "ecl:grn hcl:#ceb3a1\n" +
                "hgt:173cm\n" +
                "pid:600039004\n" +
                "cid:107 iyr:2012 eyr:2027\n" +
                "\n" +
                "ecl:amb pid:021066381\n" +
                "hcl:#ceb3a1 byr:1982 iyr:2017\n" +
                "hgt:167cm eyr:2025 cid:61\n" +
                "\n" +
                "hcl:#341e13\n" +
                "cid:268\n" +
                "pid:358390884 hgt:188cm byr:1961 iyr:2014 eyr:2027 ecl:blu\n" +
                "\n" +
                "ecl:brn eyr:2020\n" +
                "pid:607203641\n" +
                "hcl:#fffffd iyr:2011\n" +
                "byr:1962\n" +
                "hgt:156cm\n" +
                "\n" +
                "iyr:2018\n" +
                "hcl:#b6652a\n" +
                "byr:1942 ecl:blu eyr:2029 hgt:154cm pid:649263319\n" +
                "\n" +
                "ecl:oth hgt:73in iyr:2012 hcl:#888785 eyr:2020\n" +
                "pid:147939289\n" +
                "byr:1961\n" +
                "\n" +
                "ecl:oth iyr:2015\n" +
                "hgt:189cm hcl:#341e13 pid:686943691 eyr:2023 byr:1987\n" +
                "\n" +
                "pid:568844323\n" +
                "eyr:2023 byr:1921 hgt:167cm cid:154 hcl:#b6652a\n" +
                "ecl:gry iyr:2020\n" +
                "\n" +
                "eyr:2023 byr:1994\n" +
                "iyr:1937 hgt:177cm hcl:#c0946f pid:686240814 cid:231 ecl:#a8ba32\n" +
                "\n" +
                "hcl:#b6652a\n" +
                "byr:1946 pid:543383899 iyr:2013 hgt:153cm ecl:hzl cid:238 eyr:2023\n" +
                "\n" +
                "eyr:2028 ecl:blu\n" +
                "hgt:154cm cid:252\n" +
                "pid:196374590\n" +
                "byr:1987 iyr:2011\n" +
                "hcl:#7d3b0c\n" +
                "\n" +
                "iyr:2013\n" +
                "ecl:amb cid:187\n" +
                "hgt:187cm pid:593027548 byr:1963\n" +
                "eyr:2024 hcl:#fffffd\n" +
                "\n" +
                "pid:588211492 hgt:156cm\n" +
                "iyr:2021 eyr:2021 ecl:gry hcl:z byr:1928\n" +
                "\n" +
                "ecl:amb hcl:#888785 hgt:180cm eyr:2022 byr:1923 pid:490291639 cid:173 iyr:2015\n" +
                "\n" +
                "iyr:2014 cid:211 pid:404157420 hcl:#602927\n" +
                "ecl:oth byr:1946 eyr:2030 hgt:175cm\n" +
                "\n" +
                "hcl:z byr:2026\n" +
                "pid:61805448\n" +
                "hgt:125 iyr:2025\n" +
                "\n" +
                "eyr:2028\n" +
                "hgt:156cm\n" +
                "hcl:#341e13 cid:103 ecl:amb iyr:2017 byr:1937 pid:320691739\n" +
                "\n" +
                "hgt:185cm\n" +
                "pid:440489464 byr:1929 ecl:amb iyr:2011 eyr:2021 cid:327 hcl:#341e13\n" +
                "\n" +
                "byr:1988 ecl:grn\n" +
                "pid:062728732 iyr:2013\n" +
                "hgt:181cm\n" +
                "hcl:#18171d\n" +
                "eyr:2026\n" +
                "\n" +
                "pid:000647617\n" +
                "eyr:2029 byr:1937\n" +
                "ecl:gry hcl:#e8eff3 hgt:164cm cid:151\n" +
                "iyr:2016\n" +
                "\n" +
                "hgt:179cm\n" +
                "byr:1949\n" +
                "eyr:2029 pid:459190453\n" +
                "ecl:grn iyr:2020 hcl:#c0946f\n" +
                "\n" +
                "hgt:160cm pid:476613532 cid:190 iyr:2016 hcl:#4657e5\n" +
                "byr:1929\n" +
                "eyr:2028\n" +
                "\n" +
                "ecl:grn\n" +
                "eyr:2027 byr:1982\n" +
                "hcl:#18171d\n" +
                "pid:630408328\n" +
                "cid:65 iyr:2020\n" +
                "hgt:161cm\n" +
                "\n" +
                "pid:752776254\n" +
                "hcl:#888785\n" +
                "hgt:189cm\n" +
                "eyr:2027 iyr:2020 ecl:hzl\n" +
                "cid:194 byr:1934\n" +
                "\n" +
                "iyr:2015 hgt:167cm byr:1977\n" +
                "eyr:2021 hcl:#14564f pid:504471386 ecl:oth\n" +
                "\n" +
                "hgt:84 pid:168cm\n" +
                "hcl:8532fb eyr:2023\n" +
                "iyr:2012 ecl:xry byr:2008 cid:288\n" +
                "\n" +
                "cid:323 eyr:2024\n" +
                "iyr:2019\n" +
                "pid:495737304 byr:1966 hcl:#7d3b0c ecl:hzl\n" +
                "hgt:73in\n" +
                "\n" +
                "iyr:2020 byr:1953 ecl:hzl hcl:#efcc98 hgt:174cm eyr:2026 pid:546906638\n" +
                "\n" +
                "pid:839249028\n" +
                "hcl:z byr:2024\n" +
                "hgt:145 eyr:2034 iyr:2021 ecl:#891c47\n" +
                "\n" +
                "eyr:2036\n" +
                "ecl:#89d2ae\n" +
                "cid:183 byr:2014\n" +
                "hcl:b3af0f\n" +
                "pid:12086913 iyr:1981\n" +
                "hgt:61cm\n" +
                "\n" +
                "ecl:brn eyr:2030 pid:083487445 byr:1929 hcl:z iyr:2021\n" +
                "hgt:182 cid:318\n" +
                "\n" +
                "eyr:2020\n" +
                "pid:188609216 hcl:#341e13\n" +
                "iyr:2012 hgt:179cm\n" +
                "\n" +
                "eyr:2029\n" +
                "hcl:#888785 pid:704026565 hgt:173cm iyr:2020 ecl:blu byr:1950 cid:237\n" +
                "\n" +
                "ecl:grn\n" +
                "eyr:2030\n" +
                "byr:1961 pid:695808266\n" +
                "iyr:2012 cid:56\n" +
                "hgt:155cm\n" +
                "\n" +
                "iyr:2011 ecl:amb\n" +
                "byr:1986 pid:243061330 hgt:163cm eyr:2021\n" +
                "\n" +
                "eyr:2030 hcl:#623a2f hgt:170cm ecl:hzl\n" +
                "pid:694575319 iyr:2011\n" +
                "byr:1939\n" +
                "\n" +
                "iyr:2014 pid:184152121\n" +
                "hcl:#c0946f hgt:163cm\n" +
                "eyr:2028 byr:1992 cid:114\n" +
                "\n" +
                "ecl:hzl\n" +
                "hgt:75in cid:233\n" +
                "hcl:#866857 pid:269157261 iyr:2020\n" +
                "byr:1973 eyr:2029\n" +
                "\n" +
                "hgt:174cm\n" +
                "hcl:#f86751 iyr:2016\n" +
                "pid:904779190\n" +
                "ecl:brn eyr:2024 byr:1950\n" +
                "\n" +
                "cid:123 iyr:2019\n" +
                "eyr:2030 pid:402585706\n" +
                "ecl:brn byr:1995 hcl:#4ff7fa\n" +
                "hgt:65in\n" +
                "\n" +
                "ecl:grn eyr:2029\n" +
                "pid:083364259 iyr:2013 cid:50 byr:1938 hgt:187cm\n" +
                "hcl:#a97842\n" +
                "\n" +
                "hcl:#6b5442 cid:101 iyr:2011\n" +
                "ecl:amb eyr:2029 byr:1963 pid:664573740\n" +
                "\n" +
                "eyr:2025 hcl:#602927\n" +
                "hgt:188cm\n" +
                "iyr:2019\n" +
                "pid:521514539 byr:1940 ecl:gry\n" +
                "\n" +
                "hcl:dc0449 eyr:1981 pid:188cm\n" +
                "cid:151 iyr:1979 hgt:61cm ecl:dne\n" +
                "byr:2028\n" +
                "\n" +
                "iyr:2017 byr:1924\n" +
                "hgt:163cm eyr:2024 hcl:#ceb3a1 pid:424127124\n" +
                "ecl:amb\n" +
                "\n" +
                "eyr:2039 pid:7837217107 hcl:z byr:2005\n" +
                "iyr:1989 ecl:#d95f4d hgt:190in\n" +
                "\n" +
                "ecl:#329eb1 cid:178 hgt:192\n" +
                "eyr:2020 iyr:2012\n" +
                "hcl:#602927\n" +
                "byr:2028 pid:7175349420\n" +
                "\n" +
                "ecl:gry byr:1931\n" +
                "hgt:162cm iyr:2014\n" +
                "eyr:2030 cid:50\n" +
                "hcl:#cfa07d pid:653585396\n" +
                "\n" +
                "eyr:2025 hgt:177cm\n" +
                "ecl:gry hcl:#efcc98\n" +
                "iyr:2015\n" +
                "byr:1942\n" +
                "pid:388475446\n" +
                "\n" +
                "hcl:#efcc98 ecl:grn\n" +
                "hgt:185cm\n" +
                "byr:1921 pid:253592171\n" +
                "eyr:2031 cid:220 iyr:2024\n" +
                "\n" +
                "byr:1950\n" +
                "hgt:158cm ecl:gry iyr:2015 hcl:#18171d\n" +
                "eyr:2023\n" +
                "pid:151cm\n" +
                "\n" +
                "byr:1957\n" +
                "hcl:z\n" +
                "eyr:2026\n" +
                "ecl:grn\n" +
                "iyr:1971 hgt:192in pid:5479810865\n" +
                "\n" +
                "hgt:161cm pid:473851111 iyr:2018\n" +
                "ecl:brn byr:1982\n" +
                "eyr:2029\n" +
                "\n" +
                "pid:136216608 byr:1958\n" +
                "cid:226 eyr:2023 hcl:#866857 iyr:2017 ecl:hzl hgt:159cm\n" +
                "\n" +
                "byr:1993 hcl:#866857 hgt:169cm pid:488392920\n" +
                "cid:109 iyr:2017 ecl:oth eyr:2029\n" +
                "\n" +
                "cid:248 ecl:amb eyr:2025 iyr:2017 byr:1951 hcl:#ceb3a1 pid:731763175 hgt:162cm\n" +
                "\n" +
                "hcl:#835e79\n" +
                "eyr:2021\n" +
                "ecl:oth pid:617055193 byr:1997 iyr:2010\n" +
                "hgt:173cm\n" +
                "\n" +
                "eyr:2024 pid:257895944\n" +
                "hcl:#ceb3a1\n" +
                "hgt:165cm\n" +
                "ecl:oth iyr:2020\n" +
                "byr:1958\n" +
                "\n" +
                "pid:438580092\n" +
                "ecl:grt byr:2025\n" +
                "hcl:z iyr:2000 eyr:1952\n" +
                "cid:271 hgt:170in\n" +
                "\n" +
                "iyr:2010 hcl:#6b5442 hgt:156cm\n" +
                "eyr:2026 ecl:grn pid:409793041 byr:1941\n" +
                "\n" +
                "pid:076486440\n" +
                "hgt:177cm hcl:#888785 ecl:blu iyr:2017 eyr:2029\n" +
                "\n" +
                "eyr:2028 ecl:amb hgt:186cm hcl:#1d5836 pid:563307670 iyr:2019 byr:1950\n" +
                "\n" +
                "byr:1939 ecl:hzl hgt:193cm pid:329759796\n" +
                "hcl:#cfa07d eyr:2025 iyr:2011 cid:73\n" +
                "\n" +
                "byr:1995\n" +
                "hgt:188cm eyr:2028\n" +
                "ecl:blu\n" +
                "iyr:2016 hcl:#888785 pid:459613739 cid:115\n" +
                "\n" +
                "hcl:#623a2f\n" +
                "eyr:2021 cid:197 hgt:187cm ecl:oth\n" +
                "byr:1969\n" +
                "iyr:2010 pid:385660251\n" +
                "\n" +
                "hgt:192cm cid:143 byr:1995 hcl:#fffffd\n" +
                "iyr:2017 ecl:oth\n" +
                "eyr:2020 pid:087661720\n" +
                "\n" +
                "ecl:oth\n" +
                "byr:1994 hgt:183cm\n" +
                "eyr:2020 iyr:2020 pid:448389966 cid:92 hcl:#866857\n" +
                "\n" +
                "pid:088166852 hgt:155cm cid:307 byr:1940\n" +
                "hcl:#7d3b0c\n" +
                "ecl:#af542f eyr:2023 iyr:2014\n" +
                "\n" +
                "byr:2026 eyr:2039 hcl:5449b3\n" +
                "ecl:hzl hgt:176in\n" +
                "iyr:1962 pid:177cm\n" +
                "\n" +
                "iyr:2020 ecl:amb hgt:164cm hcl:#c0946f\n" +
                "pid:931543453 eyr:2024 byr:2001\n" +
                "\n" +
                "iyr:2010 eyr:2023 hgt:188cm\n" +
                "hcl:#866857 ecl:hzl pid:866631112 byr:1997\n" +
                "\n" +
                "byr:1958 hgt:184cm\n" +
                "cid:117 hcl:#7d3b0c iyr:2019 pid:615734013 eyr:2028 ecl:gry\n" +
                "\n" +
                "hgt:86 iyr:1935 ecl:grt pid:#af8e67 eyr:2031\n" +
                "byr:2018 hcl:6a2940\n" +
                "\n" +
                "hgt:73in eyr:2022 pid:580461358 byr:1962\n" +
                "cid:129 iyr:2015 hcl:#7d3b0c\n" +
                "\n" +
                "iyr:2019 hcl:#b6652a hgt:172cm ecl:blu pid:077121198 eyr:2021\n" +
                "byr:1995\n" +
                "\n" +
                "hcl:#ceb3a1 cid:253\n" +
                "iyr:2015 hgt:177cm byr:1973\n" +
                "ecl:hzl pid:311289324 eyr:2025\n" +
                "\n" +
                "iyr:2017 hcl:#efcc98\n" +
                "cid:57 byr:1940 ecl:blu\n" +
                "eyr:2025 hgt:157cm pid:827480048\n" +
                "\n" +
                "eyr:2028 hgt:189cm\n" +
                "iyr:2016 byr:1978 ecl:hzl pid:127497651 cid:87\n" +
                "hcl:#623a2f\n" +
                "\n" +
                "hcl:#341e13 byr:2015\n" +
                "ecl:brn hgt:187in\n" +
                "pid:82075551\n" +
                "eyr:1936\n" +
                "cid:200\n" +
                "iyr:1939\n" +
                "\n" +
                "ecl:grn byr:1962\n" +
                "iyr:2011 hgt:169cm\n" +
                "pid:661559147\n" +
                "hcl:#623a2f eyr:2023\n" +
                "\n" +
                "ecl:gry\n" +
                "hcl:#efcc98 eyr:2009 byr:2028\n" +
                "hgt:170in\n" +
                "cid:129 pid:161cm iyr:2018\n" +
                "\n" +
                "pid:098090405 hcl:#623a2f byr:1943 ecl:hzl\n" +
                "hgt:152cm iyr:2013 eyr:2029\n" +
                "\n" +
                "pid:495271053 iyr:2011 ecl:gry hcl:#623a2f cid:285\n" +
                "byr:1925 eyr:2024 hgt:187cm\n" +
                "\n" +
                "cid:306\n" +
                "hgt:73in\n" +
                "iyr:2010 hcl:#448fd7\n" +
                "byr:1946\n" +
                "ecl:grn pid:137146932 eyr:2021\n" +
                "\n" +
                "eyr:2020 hgt:159cm cid:90 iyr:2010 ecl:brn hcl:#341e13 byr:1955\n" +
                "\n" +
                "hcl:#18171d iyr:2017 ecl:amb\n" +
                "pid:168517472\n" +
                "eyr:2021 hgt:181cm byr:1942\n" +
                "\n" +
                "cid:325 eyr:2022 pid:947158470 byr:1994 iyr:2019 ecl:grn hgt:172cm hcl:#ec63ce\n" +
                "\n" +
                "iyr:2011\n" +
                "pid:243339529\n" +
                "ecl:amb\n" +
                "hgt:169cm\n" +
                "byr:1967\n" +
                "eyr:2025 hcl:#b6652a\n" +
                "\n" +
                "pid:664966826 eyr:2036 iyr:2015 byr:1972 hgt:68in\n" +
                "hcl:z\n" +
                "ecl:#038105\n" +
                "\n" +
                "eyr:2021 pid:236054221\n" +
                "hgt:179cm\n" +
                "hcl:#b6652a iyr:2020 ecl:blu\n" +
                "\n" +
                "ecl:grn\n" +
                "iyr:2010\n" +
                "pid:870519416 byr:1945 hcl:#a97842\n" +
                "hgt:176cm eyr:2030\n" +
                "\n" +
                "hcl:#3318db eyr:2022\n" +
                "byr:1966\n" +
                "ecl:grn iyr:2013\n" +
                "cid:349\n" +
                "hgt:168cm pid:827688488\n" +
                "\n" +
                "pid:124116963\n" +
                "hcl:#866857 eyr:2026\n" +
                "iyr:2013 ecl:grn byr:1983 hgt:183cm\n" +
                "\n" +
                "iyr:2017 byr:1993\n" +
                "hcl:#18171d ecl:utc hgt:68in cid:168 eyr:2030 pid:#2fd9f2\n" +
                "\n" +
                "ecl:blu cid:134 eyr:2025 pid:588957573\n" +
                "iyr:2017\n" +
                "hgt:151cm byr:1942 hcl:#4280c1\n" +
                "\n" +
                "hcl:#51b593\n" +
                "iyr:2013\n" +
                "ecl:amb pid:668244584\n" +
                "cid:282\n" +
                "byr:1936\n" +
                "eyr:1985 hgt:161cm\n" +
                "\n" +
                "pid:494051052\n" +
                "hgt:185cm byr:1996 eyr:2028 iyr:2018\n" +
                "ecl:amb\n" +
                "hcl:#efcc98\n" +
                "\n" +
                "ecl:brn\n" +
                "eyr:2025\n" +
                "iyr:2011\n" +
                "hgt:163cm hcl:#a97842\n" +
                "byr:1989 pid:557549000\n" +
                "\n" +
                "pid:828235468 cid:55\n" +
                "iyr:2010 byr:1926 eyr:2029 hgt:153cm hcl:#cfa07d\n" +
                "ecl:blu\n" +
                "\n" +
                "hgt:158cm iyr:2015 pid:957913612 ecl:grn eyr:2020 byr:1984 cid:76 hcl:#6b5442\n" +
                "\n" +
                "ecl:amb eyr:2020 pid:596116320\n" +
                "byr:1936\n" +
                "hcl:#cfa07d\n" +
                "hgt:165cm cid:86 iyr:2014\n" +
                "\n" +
                "iyr:2012\n" +
                "cid:278 hcl:#602927\n" +
                "eyr:2020 ecl:hzl\n" +
                "hgt:176cm byr:1987 pid:594817909\n" +
                "\n" +
                "iyr:2011 byr:1929 pid:073211525 eyr:2022\n" +
                "hgt:188cm\n" +
                "ecl:blu\n" +
                "hcl:#733820\n" +
                "\n" +
                "hcl:#602927 hgt:187cm\n" +
                "pid:706155322 cid:203\n" +
                "ecl:brn byr:1952 iyr:2017 eyr:2020\n" +
                "\n" +
                "hcl:bcb5f7\n" +
                "byr:2002 eyr:2029 pid:850069752 iyr:2019 ecl:hzl\n" +
                "hgt:167cm\n" +
                "\n" +
                "hcl:#b6652a hgt:72in iyr:2013\n" +
                "ecl:grn eyr:2024 byr:1920 cid:114\n" +
                "pid:983486664\n" +
                "\n" +
                "byr:1931 iyr:2020 pid:182737852 hgt:162cm\n" +
                "ecl:grn hcl:#888785 eyr:2028\n" +
                "\n" +
                "eyr:2035\n" +
                "byr:1962 iyr:2012 cid:120\n" +
                "ecl:xry\n" +
                "hgt:61cm hcl:ce89a8 pid:335540582\n" +
                "\n" +
                "pid:#05153d iyr:1990\n" +
                "eyr:1927 hgt:71cm\n" +
                "byr:2019 cid:346 ecl:#e38688\n" +
                "hcl:c6abd9\n" +
                "\n" +
                "ecl:#cd58d8 pid:166cm iyr:2012\n" +
                "hcl:0d1b02 hgt:68\n" +
                "eyr:1958\n" +
                "\n" +
                "pid:976419172 byr:1922 cid:345 hcl:#6b5442 iyr:2010 eyr:2026\n" +
                "ecl:grn hgt:155cm\n" +
                "\n" +
                "ecl:gry hcl:#1bbadc hgt:168cm\n" +
                "eyr:2028\n" +
                "byr:1984 cid:179 iyr:2013 pid:706186218\n" +
                "\n" +
                "ecl:blu hgt:188cm\n" +
                "pid:764775319 byr:1936 hcl:#7d3b0c iyr:2020\n" +
                "\n" +
                "hcl:#623a2f\n" +
                "iyr:2012\n" +
                "pid:382832140 ecl:gry\n" +
                "eyr:2026\n" +
                "cid:350\n" +
                "hgt:165cm byr:1968\n" +
                "\n" +
                "hcl:0b87a1 byr:2020 pid:4365879329\n" +
                "cid:110 ecl:grn\n" +
                "eyr:2032 hgt:155cm\n" +
                "iyr:2018\n" +
                "\n" +
                "hgt:193cm eyr:2029 hcl:#733820 pid:081071142 byr:1929 ecl:oth\n" +
                "\n" +
                "ecl:brn\n" +
                "eyr:2023 pid:876924536 cid:165\n" +
                "hcl:#efcc98 hgt:151cm byr:1972\n" +
                "iyr:2020\n" +
                "\n" +
                "hgt:186cm eyr:2022\n" +
                "ecl:grn\n" +
                "byr:1972 pid:997639611 hcl:#ceb3a1 iyr:2013\n" +
                "\n" +
                "byr:1926\n" +
                "pid:808460262\n" +
                "iyr:2012 eyr:2031 hcl:#a97842 ecl:amb\n" +
                "hgt:190cm\n" +
                "\n" +
                "hgt:163cm\n" +
                "hcl:#ceb3a1 eyr:2028\n" +
                "ecl:grn\n" +
                "byr:1944 pid:381144425 iyr:2012\n" +
                "\n" +
                "hcl:#95a232 pid:015229624 byr:1947 iyr:2013 hgt:66cm ecl:gry eyr:2027\n" +
                "\n" +
                "hcl:z byr:1965 iyr:2013 hgt:157cm ecl:#8b12fb cid:246 pid:283039791 eyr:2023\n" +
                "\n" +
                "ecl:gry byr:1950\n" +
                "hcl:#623a2f cid:276 iyr:2013 eyr:2030 pid:798610943 hgt:189in\n" +
                "\n" +
                "eyr:2030 cid:52 hcl:#fffffd pid:041625574 ecl:amb iyr:2016 byr:1944\n" +
                "hgt:191cm\n" +
                "\n" +
                "byr:1995\n" +
                "iyr:2015 cid:221 pid:279080024\n" +
                "eyr:2022\n" +
                "hgt:181cm ecl:brn hcl:#888785\n" +
                "\n" +
                "hcl:z\n" +
                "ecl:blu\n" +
                "iyr:1970\n" +
                "eyr:2022\n" +
                "hgt:193cm pid:#540e31 cid:95 byr:1952\n" +
                "\n" +
                "hcl:z eyr:2024 ecl:hzl\n" +
                "byr:2028\n" +
                "cid:323 pid:1949331457\n" +
                "hgt:69\n" +
                "\n" +
                "eyr:2030 hcl:#866857\n" +
                "cid:173 iyr:2017\n" +
                "hgt:190cm byr:1941\n" +
                "ecl:blu\n" +
                "pid:269015932\n" +
                "\n" +
                "hcl:#b6652a\n" +
                "iyr:2018\n" +
                "eyr:2022 ecl:brn hgt:185cm pid:456195468\n" +
                "\n" +
                "hcl:#6b5442 hgt:188cm\n" +
                "iyr:2019 byr:1966 cid:298\n" +
                "pid:050653473\n" +
                "ecl:gry eyr:2028\n" +
                "\n" +
                "cid:208\n" +
                "ecl:amb eyr:2023 hgt:176cm byr:1971 hcl:#7d3b0c pid:650190272 iyr:2018\n" +
                "\n" +
                "hgt:68in pid:615309584\n" +
                "iyr:2011 byr:1950\n" +
                "hcl:#efcc98 ecl:oth\n" +
                "eyr:2024\n" +
                "\n" +
                "eyr:2022 iyr:2011 hcl:#623a2f ecl:amb byr:1955\n" +
                "hgt:190cm\n" +
                "pid:244918527\n" +
                "\n" +
                "iyr:2013 hcl:#ceb3a1 eyr:2029 hgt:164cm\n" +
                "ecl:oth\n" +
                "byr:1928 pid:337615663\n" +
                "\n" +
                "hcl:#ceb3a1 pid:#ae7eea byr:2027\n" +
                "cid:254\n" +
                "hgt:125\n" +
                "iyr:1940\n" +
                "ecl:zzz\n" +
                "\n" +
                "pid:033663619 iyr:2012 byr:1989 eyr:2030 ecl:hzl\n" +
                "hcl:#b6652a hgt:154cm\n" +
                "\n" +
                "hgt:175cm byr:1929 pid:100788192\n" +
                "ecl:#92b14c\n" +
                "iyr:1940 hcl:#ceb3a1 eyr:2033\n" +
                "\n" +
                "eyr:2029\n" +
                "pid:357835141 ecl:oth iyr:2019 hcl:#866857 hgt:154cm byr:1954\n" +
                "\n" +
                "pid:895992818 byr:1965 iyr:2017 hcl:#efcc98 ecl:amb hgt:153cm eyr:2025\n" +
                "\n" +
                "byr:1928 ecl:amb hgt:168cm pid:346938111 eyr:2025 iyr:2014\n" +
                "hcl:#cfa07d\n" +
                "\n" +
                "hcl:#b6652a pid:825661608 eyr:2020 iyr:2019 byr:1974\n" +
                "hgt:180cm ecl:amb\n" +
                "\n" +
                "byr:1970 hgt:159cm hcl:#733820 pid:101838832 iyr:2015 eyr:2027 ecl:blu\n" +
                "\n" +
                "byr:1941 ecl:amb\n" +
                "eyr:2024 pid:015890498\n" +
                "hgt:175cm\n" +
                "iyr:2018 hcl:#cfa07d\n" +
                "\n" +
                "hgt:67in\n" +
                "pid:404983369 eyr:2023 iyr:2018 byr:1974 hcl:#602927\n" +
                "ecl:blu\n" +
                "\n" +
                "byr:1957\n" +
                "hcl:#fcc940 pid:615831236\n" +
                "iyr:2018 eyr:2020 ecl:brn hgt:181cm cid:218\n" +
                "\n" +
                "hcl:#fffffd ecl:grn pid:271614109\n" +
                "eyr:2028 hgt:184cm byr:1974 iyr:2015\n" +
                "\n" +
                "ecl:#e45ee0 pid:151cm cid:127 iyr:2014 byr:2022 hcl:973bc1 eyr:2033 hgt:181in\n" +
                "\n" +
                "hcl:#6b5442 pid:502739402 eyr:2020 byr:1926 ecl:brn\n" +
                "iyr:2010\n" +
                "\n" +
                "ecl:xry hgt:169cm byr:2023\n" +
                "iyr:1973 pid:4137668\n" +
                "eyr:2037 hcl:z\n" +
                "\n" +
                "ecl:#3a8c46 hcl:43730a pid:57210146 eyr:2031 cid:117 iyr:2013 byr:2010\n" +
                "\n" +
                "hcl:#341e13 cid:237 hgt:150cm iyr:2016 byr:1967 ecl:blu\n" +
                "pid:674080319 eyr:2024\n" +
                "\n" +
                "iyr:2011 hcl:#866857 pid:111247018\n" +
                "byr:1920 hgt:192in ecl:#8bf268 eyr:2021\n" +
                "\n" +
                "iyr:2022 hcl:z ecl:gry\n" +
                "hgt:159cm\n" +
                "pid:#88e8df\n" +
                "byr:2026 eyr:2032 cid:221\n" +
                "\n" +
                "hgt:156cm eyr:2026\n" +
                "ecl:blu\n" +
                "hcl:#192dea cid:280 pid:788808021 byr:1980\n" +
                "iyr:2013\n" +
                "\n" +
                "hgt:156in\n" +
                "byr:2024 hcl:4e4dd6\n" +
                "eyr:2030\n" +
                "iyr:2028 pid:35683378\n" +
                "ecl:#3a9fba\n" +
                "\n" +
                "pid:081236370 cid:150 hcl:d15b43 byr:2029 hgt:118 iyr:2026 eyr:2038\n" +
                "ecl:grt\n" +
                "\n" +
                "eyr:2034 pid:186cm\n" +
                "ecl:utc cid:300 iyr:2009 byr:2018 hcl:163913 hgt:74cm\n" +
                "\n" +
                "ecl:hzl\n" +
                "pid:249858519 byr:1936 hgt:182cm\n" +
                "cid:343 iyr:2013 eyr:2030 hcl:#7d3b0c\n" +
                "\n" +
                "cid:168\n" +
                "ecl:hzl\n" +
                "hgt:174cm iyr:2020\n" +
                "pid:446135799 hcl:#888785\n" +
                "eyr:2024 byr:1998\n" +
                "\n" +
                "pid:545342162\n" +
                "hcl:#5cd3bd cid:126\n" +
                "eyr:2024\n" +
                "iyr:2012 ecl:grn\n" +
                "\n" +
                "pid:104835585\n" +
                "byr:1989 hcl:#733820 ecl:oth eyr:2024 iyr:2017\n" +
                "hgt:180cm\n" +
                "\n" +
                "hgt:184cm byr:2001 pid:199216567 ecl:gry\n" +
                "eyr:2022\n" +
                "cid:185 hcl:#7d3b0c\n" +
                "iyr:2019\n" +
                "\n" +
                "byr:1996 eyr:2022 pid:503963080 ecl:grn iyr:2010 hcl:#fffffd\n" +
                "\n" +
                "eyr:2030 iyr:2017\n" +
                "pid:472300557 hcl:#a97842\n" +
                "ecl:grn hgt:190cm\n" +
                "byr:1994\n" +
                "\n" +
                "ecl:#2a8a59\n" +
                "eyr:2027\n" +
                "iyr:2015 byr:2021 hgt:158cm pid:365979521 hcl:z cid:242\n" +
                "\n" +
                "ecl:gry\n" +
                "iyr:2020 hcl:#866857\n" +
                "pid:363851353 cid:319 hgt:154cm eyr:2027\n" +
                "byr:1953\n" +
                "\n" +
                "ecl:grn hgt:165cm eyr:2026\n" +
                "pid:443722683 hcl:#341e13\n" +
                "iyr:2018 byr:1923\n" +
                "\n" +
                "byr:1920 ecl:blu\n" +
                "cid:193 hgt:153cm hcl:#341e13 iyr:2010 pid:934896568\n" +
                "eyr:2021\n" +
                "\n" +
                "eyr:2025\n" +
                "pid:524699651 cid:92\n" +
                "hcl:#602927 byr:1999\n" +
                "iyr:2011 ecl:brn hgt:164cm\n" +
                "\n" +
                "eyr:2030 pid:739947771 iyr:2018\n" +
                "byr:1990\n" +
                "hgt:185cm hcl:#602927 ecl:gry\n" +
                "\n" +
                "byr:1967 ecl:amb iyr:2020 hcl:#341e13\n" +
                "hgt:165cm\n" +
                "pid:681478012 eyr:2028\n" +
                "\n" +
                "pid:807715479 ecl:blu byr:1955 eyr:1972 iyr:2018 hcl:#a97842 hgt:151\n" +
                "\n" +
                "pid:635008585 cid:97\n" +
                "hgt:186cm hcl:#b6652a iyr:2015 eyr:2020 ecl:gry byr:1959\n" +
                "\n" +
                "iyr:2017\n" +
                "cid:155 byr:1999 pid:550276277\n" +
                "hcl:#18171d\n" +
                "eyr:2020 hgt:164cm ecl:amb\n" +
                "\n" +
                "byr:1977 hcl:#6b5442 ecl:grn iyr:2012 hgt:156cm\n" +
                "eyr:2028 pid:125635376\n" +
                "\n" +
                "hgt:65in pid:042700658 byr:1962 iyr:2020\n" +
                "hcl:#888785 eyr:2021 ecl:gry\n" +
                "\n" +
                "ecl:blu iyr:2017 hcl:#efcc98 pid:447451869 hgt:176cm\n" +
                "byr:1958\n" +
                "eyr:2024\n" +
                "\n" +
                "ecl:amb hgt:155cm eyr:2022 hcl:#efcc98\n" +
                "pid:614496034 byr:1957\n" +
                "iyr:2016\n" +
                "\n" +
                "cid:99\n" +
                "eyr:2020\n" +
                "ecl:amb iyr:2017\n" +
                "hgt:163cm pid:128207503 byr:1977\n" +
                "hcl:#866857\n" +
                "\n" +
                "ecl:amb cid:342 eyr:2026 hgt:172cm pid:317675262\n" +
                "byr:1942 hcl:#a97842 iyr:2010\n" +
                "\n" +
                "ecl:grn pid:077163993\n" +
                "hgt:187cm hcl:#341e13 iyr:2012 byr:1934 eyr:2024\n" +
                "\n" +
                "pid:423538706 hgt:156cm\n" +
                "ecl:oth hcl:#341e13 iyr:2016 eyr:2028\n" +
                "\n" +
                "iyr:2030 ecl:#faff64\n" +
                "byr:2012\n" +
                "pid:734434105 hgt:164in hcl:z eyr:2023\n" +
                "\n" +
                "hgt:150in iyr:2016 pid:173cm hcl:db675a cid:219 eyr:2032 byr:1958\n" +
                "ecl:xry\n" +
                "\n" +
                "pid:087437383\n" +
                "eyr:2025 hgt:178cm ecl:gry byr:1954\n" +
                "cid:227 hcl:#fffffd\n" +
                "iyr:2018\n" +
                "\n" +
                "pid:152cm\n" +
                "iyr:2030 eyr:2030\n" +
                "byr:2010 hcl:z\n" +
                "hgt:155cm\n" +
                "ecl:amb\n" +
                "\n" +
                "byr:1934\n" +
                "hcl:#341e13 hgt:167cm\n" +
                "pid:#7356dd ecl:amb\n" +
                "iyr:2011\n" +
                "eyr:2030\n" +
                "cid:123\n" +
                "\n" +
                "eyr:2027\n" +
                "byr:2005\n" +
                "hgt:173cm cid:174 hcl:#ceb3a1 iyr:2018 ecl:amb pid:179cm\n" +
                "\n" +
                "iyr:2019 ecl:grn eyr:2023\n" +
                "hgt:162cm\n" +
                "pid:649681621 hcl:#4ee6d2 byr:1955\n" +
                "\n" +
                "hgt:165cm byr:1929 ecl:blu pid:839016251 iyr:2017 hcl:#c0946f\n" +
                "eyr:2020\n" +
                "\n" +
                "eyr:2020\n" +
                "iyr:2017 hcl:#c7ed42 ecl:blu byr:1928\n" +
                "hgt:74in pid:112604496\n" +
                "\n" +
                "eyr:2026 hgt:184 cid:113\n" +
                "byr:1933\n" +
                "pid:952646285\n" +
                "iyr:2019 hcl:#fffffd ecl:gry\n" +
                "\n" +
                "pid:455008820 byr:1982 eyr:2030 ecl:gry iyr:2020 cid:103 hcl:#733820 hgt:184cm\n" +
                "\n" +
                "hcl:#733820 iyr:2020 hgt:182cm ecl:grn\n" +
                "cid:226 pid:081011361 eyr:2022 byr:1995\n" +
                "\n" +
                "iyr:1999\n" +
                "hcl:#18171d pid:9252198900\n" +
                "ecl:amb byr:1999 hgt:175cm eyr:2021\n" +
                "\n" +
                "iyr:2020 hgt:165cm\n" +
                "ecl:blu\n" +
                "eyr:2023 pid:760213482\n" +
                "byr:1968\n" +
                "hcl:#c0946f\n" +
                "\n" +
                "pid:242381670 ecl:amb\n" +
                "hgt:172cm byr:1980 eyr:2020 iyr:2014 hcl:#866857\n" +
                "\n" +
                "byr:2021 pid:#a94a22 hcl:#cfa07d iyr:1969 eyr:2030 ecl:zzz\n" +
                "hgt:76cm\n" +
                "\n" +
                "ecl:oth cid:168\n" +
                "byr:1954 pid:079481919 eyr:2025 hcl:#c0946f hgt:172cm\n" +
                "\n" +
                "hgt:171cm\n" +
                "eyr:2030\n" +
                "byr:1969 cid:170\n" +
                "pid:164128658 ecl:amb\n" +
                "hcl:#c2265e iyr:2019\n" +
                "\n" +
                "byr:1983\n" +
                "cid:163\n" +
                "eyr:2020 pid:232659795 iyr:2013 hcl:#888785 hgt:162cm\n" +
                "ecl:blu\n" +
                "\n" +
                "ecl:gry hcl:#7d3b0c\n" +
                "pid:001171231 eyr:2020\n" +
                "byr:1935 hgt:160cm\n" +
                "iyr:2011\n" +
                "\n" +
                "iyr:2012 hcl:#a97842\n" +
                "eyr:2029 pid:809880438 hgt:164cm cid:83 byr:1961 ecl:hzl\n" +
                "\n" +
                "cid:288 eyr:2027\n" +
                "hgt:181cm byr:1955\n" +
                "iyr:2020\n" +
                "ecl:oth pid:754135833 hcl:#c0946f\n" +
                "\n" +
                "iyr:2012 pid:053980893\n" +
                "cid:54 byr:1961 ecl:gry hcl:#602927 eyr:2020 hgt:167cm\n" +
                "\n" +
                "iyr:2013\n" +
                "eyr:2025\n" +
                "hgt:176cm pid:169006156 cid:270 ecl:oth byr:2001\n" +
                "\n" +
                "cid:244 pid:914067457\n" +
                "iyr:2017 byr:1926 hcl:#733820 ecl:brn hgt:187cm\n" +
                "eyr:2030\n" +
                "\n" +
                "ecl:oth byr:1942\n" +
                "hgt:176cm iyr:2020 eyr:2027\n" +
                "hcl:#efcc98\n" +
                "pid:688816242\n" +
                "\n" +
                "hgt:177cm hcl:#efcc98 eyr:2030 pid:888703414\n" +
                "iyr:2010 byr:1973 ecl:gry\n" +
                "\n" +
                "cid:257 eyr:2030\n" +
                "ecl:brn\n" +
                "pid:359774824\n" +
                "byr:1988 hcl:#6b5442 iyr:2013 hgt:187cm\n" +
                "\n" +
                "iyr:2011 hgt:173cm cid:290 byr:2000 ecl:gry\n" +
                "hcl:#7d3b0c\n" +
                "pid:743371399 eyr:2029\n" +
                "\n" +
                "cid:162\n" +
                "eyr:1920 byr:2010 pid:#69d6ba hgt:74 hcl:z ecl:#d256f3 iyr:1933\n" +
                "\n" +
                "pid:435518624 byr:1938 eyr:2027 iyr:2016 hcl:#18171d\n" +
                "hgt:161cm\n" +
                "ecl:gry\n" +
                "\n" +
                "ecl:gry eyr:2027 hcl:#7d3b0c hgt:170cm\n" +
                "pid:928345976 iyr:2020\n" +
                "\n" +
                "hcl:#5f4023 ecl:blu\n" +
                "pid:024527693\n" +
                "eyr:1932 iyr:2023 hgt:154cm byr:1948\n" +
                "\n" +
                "cid:284 iyr:2011 byr:1920 eyr:2024 ecl:blu hgt:153cm\n" +
                "hcl:#602927 pid:005741906\n" +
                "\n" +
                "iyr:2029 hgt:108 byr:2029 hcl:c8b25d\n" +
                "pid:522512400 eyr:2038 ecl:zzz cid:163\n" +
                "\n" +
                "pid:371295649\n" +
                "eyr:2022 ecl:hzl\n" +
                "iyr:2019 hgt:153cm byr:1961\n" +
                "hcl:z\n" +
                "\n" +
                "eyr:2027 iyr:2020 pid:619653661 byr:1968 hcl:#b6652a cid:62 ecl:hzl\n" +
                "hgt:186cm\n" +
                "\n" +
                "iyr:1931\n" +
                "pid:565552342 ecl:#af97bb hcl:c92cd6 eyr:1931 byr:2025 hgt:184in\n" +
                "\n" +
                "hgt:187cm\n" +
                "ecl:grn\n" +
                "byr:1954 cid:145\n" +
                "iyr:2016\n" +
                "hcl:#efcc98 eyr:2030 pid:202254357\n" +
                "\n" +
                "cid:177\n" +
                "iyr:2013 byr:1926 hcl:#efcc98\n" +
                "pid:298693475 hgt:181cm eyr:2023 ecl:dne\n" +
                "\n" +
                "byr:2014\n" +
                "cid:255\n" +
                "iyr:1951 hgt:72in\n" +
                "hcl:#efcc98 eyr:2039 pid:135688013\n" +
                "ecl:grn\n" +
                "\n" +
                "byr:2019 eyr:1971 pid:#a95cb4\n" +
                "hcl:#ceb3a1 ecl:#6f919c\n" +
                "hgt:193cm iyr:2012\n" +
                "\n" +
                "pid:497726268\n" +
                "ecl:grn\n" +
                "eyr:2025 hcl:#efcc98 iyr:2019 hgt:170cm byr:1970\n" +
                "\n" +
                "byr:1939 hcl:#18171d cid:250\n" +
                "iyr:2011 ecl:blu pid:216607711\n" +
                "hgt:158cm eyr:2029\n" +
                "\n" +
                "byr:1937\n" +
                "eyr:1931\n" +
                "hcl:#5ee898\n" +
                "pid:#876b1a hgt:190cm\n" +
                "cid:277 ecl:#5f0f80 iyr:2013\n" +
                "\n" +
                "ecl:oth hgt:191cm eyr:2025 byr:1978 pid:271136754 hcl:#888785\n" +
                "iyr:2012\n" +
                "\n" +
                "hcl:#6b5442\n" +
                "iyr:2015 byr:1958 pid:510020331 hgt:158cm eyr:2024 ecl:blu\n" +
                "\n" +
                "byr:1998 cid:142 eyr:2026 iyr:2015 hcl:#733820\n" +
                "pid:671943334 hgt:186cm ecl:oth\n" +
                "\n" +
                "eyr:2025 ecl:brn hcl:#7d3b0c pid:000803215\n" +
                "byr:1947\n" +
                "iyr:2017 hgt:168cm cid:230\n" +
                "\n" +
                "pid:612432109 hgt:186cm byr:1963 ecl:hzl iyr:2019 eyr:2027\n" +
                "hcl:#efcc98\n" +
                "cid:148\n" +
                "\n" +
                "hcl:#c0946f pid:846986027 eyr:2025 byr:1941\n" +
                "cid:154 hgt:158cm iyr:2012\n" +
                "ecl:brn\n" +
                "\n" +
                "ecl:gry hgt:186cm\n" +
                "iyr:2015 hcl:#602927 byr:1923 eyr:2023\n" +
                "pid:48544569\n" +
                "\n" +
                "pid:857428120 hgt:158cm hcl:#e4a267 iyr:2014 eyr:2020 byr:1975 ecl:blu\n" +
                "\n" +
                "ecl:blu pid:559783197 byr:1935 cid:119 iyr:2017 hgt:157cm hcl:#6b5442 eyr:2020\n" +
                "\n" +
                "ecl:oth pid:724332293 hcl:#602927\n" +
                "cid:77 iyr:2019\n" +
                "byr:2001 hgt:192cm eyr:2024\n" +
                "\n" +
                "ecl:hzl eyr:2031\n" +
                "hcl:#efcc98 byr:2011 cid:280 iyr:2017\n" +
                "pid:377875085\n" +
                "hgt:172cm\n" +
                "\n" +
                "byr:1947 hgt:174cm ecl:amb iyr:2018 cid:94 hcl:#a97842 eyr:2026 pid:286225332\n" +
                "\n" +
                "hgt:85 ecl:xry eyr:2033 iyr:1952 pid:92902290\n" +
                "hcl:a6f86d\n" +
                "byr:2013\n" +
                "\n" +
                "byr:1935 hcl:#c0946f pid:368741489 ecl:blu\n" +
                "eyr:2020 hgt:164cm\n" +
                "iyr:2018\n" +
                "cid:196\n" +
                "\n" +
                "pid:718568707\n" +
                "ecl:oth byr:2003 hcl:#a97842 iyr:2010 hgt:168cm eyr:2025 cid:261\n" +
                "\n" +
                "hcl:#6b5442\n" +
                "pid:675429853\n" +
                "hgt:62in ecl:grn iyr:2016\n" +
                "eyr:2027 byr:1932\n" +
                "\n" +
                "byr:1978\n" +
                "pid:080846464 hcl:#ceb3a1 ecl:gry iyr:2015 hgt:190cm eyr:2029\n" +
                "\n" +
                "pid:1756319674\n" +
                "iyr:2010 byr:1998 hcl:#866857 cid:259\n" +
                "eyr:2025 hgt:73in ecl:hzl\n" +
                "\n" +
                "eyr:2035\n" +
                "hcl:z hgt:61cm\n" +
                "pid:3267812127\n" +
                "cid:230\n" +
                "byr:2029 iyr:2028 ecl:lzr\n" +
                "\n" +
                "hgt:161cm ecl:hzl byr:1934 iyr:2011 eyr:2025 hcl:#cfa07d pid:354474868\n" +
                "\n" +
                "pid:727482965\n" +
                "hcl:#623a2f iyr:2010 hgt:156cm eyr:2020 cid:68 ecl:grn byr:1950\n" +
                "\n" +
                "pid:040800697 hgt:186cm\n" +
                "hcl:#341e13 iyr:2030 ecl:hzl\n" +
                "byr:1937 eyr:2020\n" +
                "\n" +
                "iyr:2013 byr:1928 pid:752644096 eyr:2030 hgt:191cm ecl:hzl\n" +
                "cid:93 hcl:#a97842\n" +
                "\n" +
                "pid:022267155 hcl:#cfa07d eyr:2026\n" +
                "ecl:hzl\n" +
                "hgt:187cm iyr:2014 cid:347\n" +
                "\n" +
                "hgt:73in\n" +
                "eyr:2021 pid:054367702 ecl:amb hcl:#18171d byr:1965\n" +
                "iyr:2020 cid:267\n" +
                "\n" +
                "eyr:2022\n" +
                "cid:140 pid:189859171 byr:1984 iyr:2020 ecl:brn hgt:166cm hcl:#623a2f\n" +
                "\n" +
                "byr:1971 iyr:2015\n" +
                "hgt:168cm\n" +
                "eyr:2020 pid:650970816 hcl:#341e13\n" +
                "ecl:grn\n" +
                "cid:168\n" +
                "\n" +
                "hcl:#c0946f byr:1948 hgt:189cm\n" +
                "pid:868785851\n" +
                "cid:194 ecl:amb eyr:2024 iyr:2011\n" +
                "\n" +
                "eyr:2040\n" +
                "byr:2030 hcl:afde59\n" +
                "hgt:172cm pid:72468598 iyr:1990 cid:165 ecl:#896a8e\n" +
                "\n" +
                "iyr:2009 hcl:#6b5442\n" +
                "eyr:2028\n" +
                "cid:53 ecl:hzl\n" +
                "hgt:165cm byr:1999 pid:844037301\n" +
                "\n" +
                "cid:281 eyr:2022\n" +
                "iyr:2020 byr:1976 hgt:176cm hcl:#6b5442 ecl:amb pid:755280305\n" +
                "\n" +
                "hgt:154cm iyr:2013\n" +
                "pid:059284139 byr:1992\n" +
                "cid:215 ecl:blu eyr:2025 hcl:#b6652a\n" +
                "\n" +
                "ecl:grn\n" +
                "cid:308\n" +
                "hgt:187cm pid:009080324 eyr:2027\n" +
                "iyr:2012 byr:1955\n" +
                "\n" +
                "pid:083241291 hcl:#7c1810 eyr:2030 iyr:2019 byr:1950 ecl:brn hgt:72in\n" +
                "\n" +
                "cid:148 byr:1953 hcl:#623a2f\n" +
                "pid:076848285 hgt:175cm iyr:2017\n" +
                "eyr:2022\n" +
                "ecl:oth\n" +
                "\n" +
                "iyr:2020\n" +
                "hgt:160cm\n" +
                "eyr:2028 cid:312 ecl:brn hcl:#888785 pid:681067688 byr:1986\n" +
                "\n" +
                "iyr:1972 cid:170 eyr:2023\n" +
                "pid:21811501 ecl:#17c6e8\n" +
                "hgt:158in byr:2015 hcl:5b7956\n" +
                "\n" +
                "pid:720571739 cid:304 byr:1951 hgt:191cm\n" +
                "eyr:2025 hcl:#341e13\n" +
                "iyr:2011\n" +
                "\n" +
                "eyr:2020 ecl:blu hcl:#cfa07d pid:097863725\n" +
                "hgt:150cm\n" +
                "byr:1951\n" +
                "cid:143 iyr:2013\n" +
                "\n" +
                "eyr:2027 iyr:2019 ecl:#a0eeca hcl:#c0946f pid:724783488 byr:1943 cid:282 hgt:124\n" +
                "\n" +
                "byr:2012\n" +
                "iyr:2013 eyr:2036 hcl:z hgt:97\n" +
                "pid:#677847 ecl:dne\n" +
                "\n" +
                "pid:341708492 hgt:190cm\n" +
                "byr:1988 hcl:#888785\n" +
                "ecl:hzl\n" +
                "iyr:2015 eyr:2029\n" +
                "\n" +
                "iyr:2020 byr:1968\n" +
                "ecl:gry\n" +
                "eyr:2030 hcl:#1976b0\n" +
                "cid:127 pid:701862616\n" +
                "hgt:161cm";

        List<String> passports = Arrays.asList(data.split("\\n\\n"));

        System.out.println(validChecker(passports));

        }

        public static int validChecker(List<String> passportsToCheck) {

        List<String> expectedFields = new ArrayList<>();
        expectedFields.add("byr");
        expectedFields.add("iyr");
        expectedFields.add("eyr");
        expectedFields.add("hgt");
        expectedFields.add("hcl");
        expectedFields.add("ecl");
        expectedFields.add("pid");

        int counter = 0;

            for (String passport: passportsToCheck) {
                List<String> passList = Arrays.asList(passport.split("[ :\\n]"));
                if (passList.containsAll(expectedFields)) {
                    counter++;
                }
            }
            return counter;
    }
}
