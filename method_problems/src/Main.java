public class Main {
    public static String[] problemOne = {"ysqundfruogaxcruaqhieie",
            "wurexc",
            "wiaytixcaigoiaernsi",
            "wdcyxcczoizfaieuoihi",
            "vsiwmbuuoeuizfd",
            "uzdexwiwy",
            "urjuuodceroyaeau",
            "toalhzemaepvidbufioleny",
            "oxfjxup",
            "oitolqwxdmpevzjexfmbise",
            "nlotjiodzrnzbr",
            "njwaaowewlisqmducwwwy",
            "lzxyryxmllshpkt",
            "lluaegmldkhemurk",
            "jifwagsigiokeool",
            "iueuaondjmhoiuxj",
            "ifbzmfmcnubeuidyjltyf",
            "foipguewboiahsem",
            "byxqkwjrqagtfdeqe",
            "aakreisoph",};
    public static int[] problemOneExpected = {10,
            2,
            10,
            9,
            7,
            3,
            10,
            10,
            2,
            7,
            3,
            6,
            0,
            5,
            8,
            9,
            5,
            8,
            3,
            5,
    };
    public static String[] problemTwo = {"ybovtobboboobcboobbobbbob",
            "xoboobobbobmmbobbb",
            "wpoabobbobobobobbbobbboobbkbobobbooboboobobsbobob",
            "obooobobobobolsyog",
            "obooobbobobtobobv",
            "oboboboobobofbnfbobbobbboobpcbobbobob",
            "geibobobbobb",
            "ebobbyobbbkbo",
            "cbobobobjlboobriobf",
            "cbobbdboobobn",
            "boobwbobobobbobbdbobpbvbobobobooboobbobb",
            "boobubovocobbobbojwox",
            "bobobobobobobobobobobobobobob",
            "bobbzobobooboboboobobobbobboboou",
            "bobbobobolbooboboboyzbk",
            "bicyfybobbkobrbobbbobobkbobbbobbbobbp",
            "bbobbooboojboobobbobobobbeto",
            "bbaboobobobbcboob",
            "aurjaoxjax",
            "aoboboboboobobbboboo",};
    public static int[] problemTwoExpected = {3,
            3,
            12,
            3,
            3,
            8,
            3,
            1,
            3,
            2,
            9,
            1,
            14,
            8,
            5,
            7,
            5,
            2,
            0,
            5,
    };
    public static String[] problemThree = {"ixysuoizvwwebyyhp",
            "zyxwvutsrqponmlkjihgfedcba",
            "ztapvefsnx",
            "zhmqbbea",
            "yqpnlilestyiwmmqsqpv",
            "usfuitmwigom",
            "unazbnhjzmjdihl",
            "tunivklq",
            "smpmqblmgaanxmlcvhw",
            "sgsndcjsptchiid",
            "pflvvhfqcmgjhgtrwmitab",
            "pagqqbqnufckbjtauacldroe",
            "opgrtupprfwbxsmwonswv",
            "nkdaqlfvkprute",
            "nhnwhowgjhhkj",
            "ncafxxrullo",
            "matnjjjh",
            "hrgtrpbwtxefzur",
            "dmegjmydadjwsdhckjjrydwj",
            "abcdefghijklmnopqrstuvwxyz"};
    public static String[] problemThreeExpected = {"ixy",
            "z",
            "apv",
            "hmq",
            "esty",
            "fu",
            "hjz",
            "klq",
            "aanx",
            "chii",
            "flvv",
            "agqq",
            "grtu",
            "kpru",
            "hnw",
            "afxx",
            "jjj",
            "efz",
            "egjmy",
            "abcdefghijklmnopqrstuvwxyz",

    };

    public static void main(String[] args) {
        int i = 0;
        for (String s:
                problemOne) {
            if (vowels(s) != problemOneExpected[i]) {
                System.out.println(i+": Wrong");
            }
            i++;
        }
        int j = 0;
        for (String s:
             problemTwo) {
            if (strings(s, "bob") != problemTwoExpected[j]) {
                System.out.println(j+": Wrong");
            }
            j++;
        }
        int k = 0;
        for (String s:
                problemThree) {
            if (!maxstr(s).equals(problemThreeExpected[k])) {
                System.out.println(k+": Wrong");
            }
            k++;
        }
    }

    public static int vowels(String s) {
        int num = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                num++;
            }
        }
        return num;
    }

    public static int strings(String s, String substring) {
        int num = 0;
        for (int i = 0; i <= s.length()-substring.length(); i++) {
            if (s.substring(i, i + substring.length()).equals(substring)) {
                num++;
            }
        }
        return num;
    }

    public static String maxstr(String s) {
        int maxlength = 0;
        String maxString = "";
        int[] stringNum = new int[s.length() + 1];
        stringNum[0] = 0;
        int index = 1;
        for (char c : s.toCharArray()) {
            stringNum[index] = c - 'a' + 1;
            if (stringNum[index] >= stringNum[index-1]) {
                maxlength++;
            } else {
                maxlength = 1;
            }
            if (maxlength > maxString.length()) {
                maxString = s.substring(index-maxlength, index);
            }
            index++;
        }
        return maxString;
    }
}
