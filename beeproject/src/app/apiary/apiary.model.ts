export class Apiary {
    constructor(
        public id: number,
        public beehiveNumber: number,
        public state: boolean,
        public beehivesDTO: number[],
        public monthlyMDTO: number[]
    ) {}
}