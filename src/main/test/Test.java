/**
 * @author wangfujie
 * @create 2017-07-03 17:34
 * @desc ${DESCRIPTION}
 **/
public class Test {
    public static void main(String[] args){
        String input = "<p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">某天夜里，群里冷不丁蹦出一句，“我屏蔽了我妈的朋友圈。”</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">然后就像炸开了锅，大家纷纷吐槽自己父母朋友圈没有最low只有更 low：</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">以“注意！太可怕了！紧急通知！”等开头的危言耸听的养生鸡汤，排版花哨，一看就是营销号；</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">各种匪夷所思，用脚趾头想想就逻辑不通的各类谣言，蛊惑人心的假新闻；</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">成功学鸡汤，励志箴言，大神的速效致富法宝，这种一般都要艾特自己的孩子。</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">起初你只是摇头，觉得好笑，他们真的是老了，听风就是雨，缺乏基本的独立判断力。</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">后来你不耐烦，他们不仅发到朋友圈，还逼着你点赞并发表观后感。你说句，“那都是骗人的，别信”，他们还会生气。</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">最后你学会了敷衍，反正他们也只是精神空虚，你附和着，随手点着赞，心里的那扇门却悄悄对他们关闭了。</p><p style=\"margin-top: 32px; margin-bottom: 0px; padding: 0px; border: 0px; text-indent: 2em; text-align: justify; font-stretch: normal; font-size: medium; line-height: 32px; font-family: &quot;Microsoft Yahei&quot;; color: rgb(64, 64, 64); white-space: normal;\">你得知有人屏蔽了父母的朋友圈，你心里最后一丝愧疚也烟消云散。看，大家都是这样的，父母的朋友圈太Low，怪我咯？</p><p><br/></p>";
        System.out.println(input);
        System.out.println(removeHTMLTag(input,input.length()));
    }

    public static String removeHTMLTag(String input, int length) {
        if (input == null || input.trim().equals("")) {
            return "";
        }
        // 去掉所有html元素
        String str = input.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "");
        str = str.replaceAll("[(/>)<]", "");
        int len = str.length();
        if (len <= length) {
            return str;
        } else {
            str = str.substring(0, length);
            str += "......";
        }
        return str;
    }
}
