# CricketScoreKeeper
A project for keeping cricket score for 2 teams.

### To Run the project.
  1. Open Android Studio
  2. VCS -> Checkout from version control -> Github
  3. Paste the clone URL of repo
  4. Press Enter
  5. Press <kbd>shift</kbd>+<kbd>F10</kbd> or Run -> Run 'app'

 <img src="../master/app/src/main/res/drawable/cricketscorekeeper.png" width="30%" alt="Cricket Score Keeper scrrenshot">
 
 ## Working
  - Current ball is represented by **Green Box**
  - Wickets are represented by **Red box** and letter **O**
  - **Boundary** scores (Fours and sixes) can be added on the go
  - **Over** represents the total number of thrown balls or overs passed
    1. 1 Over = 6 Balls
    2. A.B Over = (A X 6) + B Balls
    3. Hence when B = 6, one over is complete
  - **Increase** and **Decrease** button controls run on current ball
  - **ADD** button adds the runs scored (controlled by above '-' and '+' buttons)
  - **Wicket** button is used to declare **OUT**
  - **RESET** button resets every field in app to start a new match
 <img src="../master/app/src/main/res/drawable/cricketscorekeeper working.png" width="30%" alt="Cricket Score Keeper scrrenshot">
