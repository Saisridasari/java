  String path = args[0];

  File mp3File = new File(path);
  try {
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(mp3File);
    AudioFormat format = audioStream.getFormat();
    DataLine.Info info = new DataLine.Info(Clip.class, format);
    Clip clip = (Clip) AudioSystem.getLine(info);
    clip.open(audioStream);
    clip.start();
    while (!clip.isRunning())
      Thread.sleep(10);
    while (clip.isRunning())
      Thread.sleep(10);
    clip.close();
  } catch (Exception e) {
    e.printStackTrace();
  }
}
  String path = args[0];

  File mp3File = new File(path);
  try {
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(mp3File);
    AudioFormat format = audioStream.getFormat();
    DataLine.Info info = new DataLine.Info(Clip.class, format);
    Clip clip = (Clip) AudioSystem.getLine(info);
    clip.open(audioStream);
    clip.start();
    while (!clip.isRunning())
      Thread.sleep(10);
    while (clip.isRunning())
      Thread.sleep(10);
    clip.close();
  } catch (Exception e) {
    e.printStackTrace();
  }
}
  String path = args[0];

  File mp3File = new File(path);
  try {
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(mp3File);
    AudioFormat format = audioStream.getFormat();
    DataLine.Info info = new DataLine.Info(Clip.class, format);
    Clip clip = (Clip) AudioSystem.getLine(info);
    clip.open(audioStream);
    clip.start();
    while (!clip.isRunning())
      Thread.sleep(10);
    while (clip.isRunning())
      Thread.sleep(10);
    clip.close();
  } catch (Exception e) {
    e.printStackTrace();
  }
}
  String path = args[0];

  File mp3File = new File(path);
  try {
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(mp3File);
    AudioFormat format = audioStream.getFormat();
    DataLine.Info info = new DataLine.Info(Clip.class, format);
    Clip clip = (Clip) AudioSystem.getLine(info);
    clip.open(audioStream);
    clip.start();
    while (!clip.isRunning())
      Thread.sleep(10);
    while (clip.isRunning())
      Thread.sleep(10);
    clip.close();
  } catch (Exception e) {
    e.printStackTrace();
  }
}
  String path = args[0];

  File mp3File = new File(path);
  try {
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(mp3File);
    AudioFormat format = audioStream.getFormat();
    DataLine.Info info = new DataLine.Info(Clip.class, format);
    Clip clip = (Clip) AudioSystem.getLine(info);
    clip.open(audioStream);
    clip.start();
    while (!clip.isRunning())
      Thread.sleep(10);
    while (clip.isRunning())
      Thread.sleep(10);
    clip.close();
  } catch (Exception e) {
    e.printStackTrace();
  }
}
