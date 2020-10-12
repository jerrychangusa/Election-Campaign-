[![Run on Repl.it](https://repl.it/badge/github/jerrychangusa/Election-Campaign-)](https://repl.it/github/jerrychangusa/Election-Campaign-)

# Election Campaign Challenge

You have been tasked with running the advertising strategy for an election campaign. Your mission, should you choose to accept it, is to use your advertising budget to generate the most votes toward your campaign.

## Background

Your campaign can run up to **1,000,000 total ads** from the following ad types:
- Facebook Ad
- TikTok Ad
- YouTube Ad
- T.V. Ad
- Instagram Ad

Each ad type may have a different likelihood of generating a vote. For example, Facebook Ads might have a 10% chance of generating a vote or YouTube Ads might have a 90% chance of generating a vote.

When the election campaign begins, you are not yet sure which ad type will be the most effective. The effectiveness of each ad type will change every time you start a new campaign.

Your goal is to come up with an advertising strategy that can generate the most number of votes by running different types of ads.

## Running a Campaign
Every campaign consists of running a series of ads to generate votes. You can run an ad by calling the Campaign.runAd method with the ad type as an argument.

** Start a Campaign **
To start a campaign, call the Campaign.start() method. When a campaign starts, an ad budget of 1,000,000 ads can be run.

```java
Campaign.start();
```

**Run Ads**

To run an ad, call Campaign.runAd with the ad type as the input argument. Campaign.runAd will return the number of votes received from running the input ad type (typically zero or one).

```java
int facebookVoteReceived = Campaign.runAd(Ads.FACEBOOK_AD);
int tiktokVoteReceived = Campaign.runAd(Ads.TIKTOK_AD);
int youtubeVoteReceived = Campaign.runAd(Ads.YOUTUBE_AD);
int televisionVoteReceived = Campaign.runAd(Ads.TV_AD);
int instagramVoteReceived = Campaign.runAd(Ads.INSTAGRAM_AD);
```

The above code runs five ads (one of each type). Since you have an ad budget of 1,000,000 ads you can call runAd 1,000,000 times in order to generate votes.

** End a Campaign **
To end a campaign, call the Campaign.end() method. Ending a campaign will display the total number of votes that were earned as well as the total number of ads that were run during the campaign.

```java
Campaign.end();
```

**Go to the Main.java file and hit run to see an example of running an election campaign**

## Part 1: Simple Strategy

For part one, implement a simple campaign strategy where an equal number of ads are run for each ad type. 

Your code should be written in the runSimpleCampaign() method in the *Main.java* file.

Test your simple campaign strategy by running it multiple times in the main method. Observe the number of votes you can win using this simple strategy.

## Part 2: Epsilon-First Strategy

For part two, implement an advanced campaign strategy where you first try to discover the most effective ad type using some of your ad buget. The rest of your ad budget will be used on the most effective ad type.

Your code should be written in the runEpsilonFirstCampaign() method in the *Main.java* file.

To apply this strategy, implement the following steps:

1. Choose a small value for epsilon such as 0.1. The value of epsilon will correspond to the proportion of your ad budget that is used to discover the best ad type.

2. Multiply the value of epsilon by your total ad budget to determine the number ads that will be used for learning. Round this value to the nearest int.

3. Repeat the following by the number of times calculated in step 2:
- Pick a random ad type and run that ad. 
- Update the count of the number of votes received for that ad type and the number of ads run for that ad type.

4. Use the rest of your ad budget (i.e. 1,000,000 - ads used in step 3) on the ad type that generated the largest ratio of votes to ads run from step 3. A higher ratio of votes to ads run indicates a more effective ad type.

Test this Epsilon-First campaign strategy by running it multiple times in the main method. Try changing the value of epsilon to increase the number of received votes. 

Compare the results of running the Epsilon-First campaign strategy vs the results from running the previous simple strategy. Which strategy has a greater likelihood of generating the most votes?

## Part 3: Epsilon-Greedy Strategy
For part 3, you will implement a more advanced strategy that uses the Epsilon-Greedy algorithm. This algorithm tries to find the right balance between learning which ad type is more effective and running the ad type that has the best results so far.

Your code should be written in the runEpsilonGreedyCampaign() method in the *Main.java* file.

To apply this strategy, implement the following steps:

1. Choose a small value for epsilon such as 0.1. The value of epsilon will correspond to the proportion of our ad budget that is used to explore better ad types.

2. For each ad type, keep track of the number of votes won and the number of ads that were run for that ad type. A higher ratio of number of votes won to the number of ads run corresponds to a more effective ad type.

3. Repeat the following 1,000,000 times:
- Generate a random double between 0 and 1. 
- If the random number is less than epsilon, randomly select an ad type and run that ad. Update the count of the number of votes won and number of ads run for the chosen ad type.
- If the random number is greater or equal to epsilon, pick the ad type that currently has the highest ratio of votes won to the number of ads run. If there is a tie, randomly select an ad from the top ad types. Update the count of number of votes won and number of ads run for the selected ad type. 

Test this Epsilon-Greedy campaign strategy by running it multiple times in the main method. Try changing the value of epsilon to increase the number of received votes. 

Compare the results of running the Epsilon-Greedy strategy vs the results from running the previous two strategies.

## Part 4: Variable Max Payoff

Update the MAX_PAYOFF variable in *Campaign.java* to 10. This will allow each ad to generate a random payoff between 1 and 10. 

Try running the above strategies again and determine which strategy is most effective.