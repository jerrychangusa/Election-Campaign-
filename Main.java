
// EDIT THIS FILE ONLY

class Main {

  public static final int MAX_ADS = 1000 * 1000;

  public static void main(String[] args) {
    System.out.println("Starting Election Campaign");
    System.out.println("--------------------------");

    // For testing ONLY. Remove this when starting part 1.
    runExampleCampaign();
    
    // Part 1
    //runSimpleCampaign();

    // Part 2
    // runEpsilonFirstCampaign();

    // Part 3
    // runEpsilonGreedyCampaign();
  }

  public static void runExampleCampaign() {
    // Starts the ad campaign.
    Campaign.start();

    // Runs each of the ad types once.
    int facebookVotesReceived = 0;
    int tiktokVotesReceived = 0;
    int youtubeVotesReceived = 0;
    int televisionVotesReceived = 0;
    int instagramVotesReceived = 0;

    facebookVotesReceived += Campaign.runAd(Ads.FACEBOOK_AD);
    tiktokVotesReceived += Campaign.runAd(Ads.TIKTOK_AD);
    youtubeVotesReceived += Campaign.runAd(Ads.YOUTUBE_AD);
    televisionVotesReceived += Campaign.runAd(Ads.TV_AD);
    instagramVotesReceived += Campaign.runAd(Ads.INSTAGRAM_AD);

    System.out.println("Facebook Votes: " + facebookVotesReceived);
    System.out.println("TikTok Votes: " + tiktokVotesReceived);
    System.out.println("YouTube Votes: " + youtubeVotesReceived);
    System.out.println("TV Votes: " + televisionVotesReceived);
    System.out.println("Instagram Votes: " + instagramVotesReceived);

    // Ends the ad campaign and displays the results.
    System.out.println();
    Campaign.end();
  }


  // Part 1
  public static void runSimpleCampaign() {    
    // Starts the ad campaign.
    Campaign.start();

    // Run ads for part 1 below.

    // Ends the ad campaign and displays the results.
    System.out.println();
    Campaign.end();
  }

  // Part 2
  public static void runEpsilonFirstCampaign() {
    // Starts the ad campaign.
    Campaign.start();

    // Run ads for part 2 below.

    // Ends the ad campaign and displays the results.
    System.out.println();
    Campaign.end();
  }

  // Part 3
  public static void runEpsilonGreedyCampaign() {
    // Starts the ad campaign.
    Campaign.start();

    // Run ads for part 3 below.

    // Ends the ad campaign and displays the results.
    System.out.println();
    Campaign.end();
  }

}