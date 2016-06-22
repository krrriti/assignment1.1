package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
        	System.out.println("name - "+ items[i].name + "quantity - " + items[i].quality);
        	//decreases quality
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    		if(!items[i].name.equals("Sulfuras, New Product"))
                    		{
                    			System.out.println("not new");
                    			items[i].quality = items[i].quality - 1;
                    		}
                    		else if(items[i].name.equals("Sulfuras, New Product") && items[i].quality>10)
                    		{
                    			System.out.println("new and decreasing - "+items[i].quality);
                    			items[i].quality = items[i].quality - 1;
                    		}
                    		if(items[i].name.equals("Conjured Mana Cake"))
                    			items[i].quality = items[i].quality - 1;
                    }
                }
            } 
            // increases quality
            else {
            	//The Quality of an item is never more than 50
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                        	//The Quality of an item is never more than 50
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                        	//The Quality of an item is never more than 50
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }
            System.out.println("items[i].quality 2-"+ items[i].quality);
//decreases sellin
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }
            System.out.println("items[i].quality 1-"+ items[i].quality);
// adjusting quality post sellin : 
            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                        	//The Quality of an item is never negative
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros") && !items[i].name.equals("Sulfuras, New Product")) {
                            	System.out.println("not this");
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                    	
                    	//Once the sell by date has passed, Quality degrades twice as fast
                    	if( !items[i].name.equals("Sulfuras, New Product"))
                    	{
                    		System.out.println("not even this");
                    		items[i].quality = items[i].quality - items[i].quality;
                    	}
                    }
                } else {
                    if (items[i].quality < 50) {
                    	//The Quality of an item is never more than 50
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
            System.out.println("items[i].quality -"+ items[i].quality);
        }
       
    }
}
