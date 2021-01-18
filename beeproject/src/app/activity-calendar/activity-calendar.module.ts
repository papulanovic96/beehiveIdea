export class ActivityCalendarModule { 
  constructor(
    public turnus: number,
    public day: string,
    public hour: number,
    public dayNumber: number,
    public activity: string,
    public beekeeperInAC: number
  ){}
}
