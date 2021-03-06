package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
     }
     this.name = name;
    
    
    // DONE validity checking for headcoach(check this later)
  //public Team(final String name, final String headcoach, final int funding) {
    if (headcoach == null) {
      throw new IllegalArgumentException("headcoach is null");
    }
    this.headcoach = headcoach;
    
    
    // DONE validity checking for funding(check this later)
  //public Team(final String name, final String headcoach, final int funding) {
    if (funding <= 0) {
      throw new IllegalArgumentException("funding cannot be 0");
    }
    // DONE complete this constructor(Done)
    this.funding = funding;
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // DONE complete this method(chech if it is correct)
    return this.headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // DONE complete this method
   
      return this.funding;
  }
}
