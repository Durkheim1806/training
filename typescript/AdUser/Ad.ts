import {User} from "./User";

export class Ad {
    constructor(private title: string, private price: number, private user: User, private sold: boolean) {
    }

    private #sold: string;

    set sold(value: string) {
        this.#sold = value;
    }
}