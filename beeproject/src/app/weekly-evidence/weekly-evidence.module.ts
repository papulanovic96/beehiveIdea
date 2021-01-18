export class WeeklyEvidenceModule { 
  constructor(
    public id: number,
    public reviewDate: string,
    public reviewType: string,
    public beehiveInWR: number,
    public beekeeperInWR: number
  ){}
}