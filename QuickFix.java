public class QuickFix {
    public static void main(String[] args) throws Exception {
      String num = "";
      if (args.length > 0) num = args[0];
  
      runcmd("git add .");
      runcmd("git commit -m \"fix bug " + num + "\"");
      runcmd("git push");
    }

    static void runcmd(String cmd) throws Exception {
      new ProcessBuilder("bash", "-c", cmd)
        .inheritIO()
        .start()
        .waitFor();
    }
  }
  