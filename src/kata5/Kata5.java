package kata5;

public class Kata5 {

    public static void main(String[] args) {
        MailLoader loader = new MockMailLoader();
        HistogramBuilder<Mail> builder = new HistogramBuilder<>();
        HistogramViewer<Mail> viewer = new HistogramViewer<>();
        viewer.show(builder.build(loader.load()));
    }
}
