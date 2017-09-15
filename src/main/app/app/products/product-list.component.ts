import { Component} from '@angular/core';
import { IProduct } from './product';

@Component({
	selector: 'pm-products',
	templateUrl: './product-list.component.html',
	styleUrls: ['./product-list.component.css']
})

export class ProductListComponent {
	pageTitle: string = 'Product List';
	imageWidth: number = 50;
	imageMargin: number = 2;
	showImage: boolean = false;
	//listFilter: string = 'cart';
	filteredProducts: IProduct[];
	_listFilter: string;
	get listFilter(): string {
		return this._listFilter;
	}
	set listFilter(value:string) {
		this._listFilter = value;
		this.filteredProducts = this.listFilter ? this.performFilter(this.listFilter) : this.products;
	}
	products: IProduct[] = [
		{
			"productId": 2,
			"productName": "Garden Cart",
			"productCode": "GDN-0023",
			"releaseDate": "March 18, 2016",
			"description": "15 Gallon capacity",
			"price": 32.99,
			"starRating": 3.5,
			"imageUrl": "https://openclipart.org/image/2400px/svg_to_png/58471/garden-cart.png"
		},
		{
			"productId": 2,
			"productName": "Hammer",
			"productCode": "TBX-0023",
			"releaseDate": "May 21, 2016",
			"description": "Curved steel claw",
			"price": 8.49,
			"starRating": 4.8,
			"imageUrl": "https://openclipart.org/image/2400px/svg_to_png/193438/freehammer.png"
		}

	];

	performFilter(filterBy: string): IProduct[] {
		filterBy = filterBy.toLocaleLowerCase();
		return this.products.filter((product: IProduct) =>
			product.productName.toLocaleLowerCase().indexOf(filterBy) !== -1);
	}

	toggleImage(): void {
		this.showImage = !this.showImage;
	}

	constructor() {
		this.filteredProducts = this.products;
		this.listFilter = 'cart';
	}
}
