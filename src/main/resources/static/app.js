Vue.component('product-review', {
    template: `
        <form class="review-form" @submit.prevent="onSubmit">
         <p v-if="errors.length">
      <b>Please correct the following error(s):</b>
      <ul>
        <li v-for="error in errors">{{ error }}</li>
      </ul>
        </p>
            <p>
                <label for="name">Name: </label>
                <input id="name" v-model="name" required>
            </p>
            <p>
                <label for="review">Review: </label>
                <input id="review" v-model="review" required>
            </p>
            <p>
                <label for="rating">Rating: </label>
                <select id="rating" v-model="rating">
                   <option>5</option>
                   <option>4</option>
                   <option>3</option>
                   <option>2</option>
                   <option>1</option>           
                </select>
            </p>
            
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>
    `,
    data() {
        return {
            name: null,
            review: null,
            rating: null,
            errors: []
        }
    },
    methods: {

    onSubmit() {
        if (this.name && this.review && this.rating) {
            let productReview = {
                name: this.name,
                review: this.review,
                rating: this.rating
            }
            this.$emit('review-submitted', productReview)
            this.name = null
            this.review = null
            this.rating = null
        } else {
            if (!this.name) this.errors.push("Name required.")
            if (!this.review) this.errors.push("Review required.")
            if (!this.rating) this.errors.push("Rating required.")
        }
    }
    }
})

Vue.component(
    'product', {
        props: {
            premium: {
                type: Boolean,
                required: true,
                default: true
            }
        },
        template: `
<div class="product">
        <div class="product-image">
    <img :src="image" />
  </div>

  <div class="product-info">
    <h1>{{ title }}</h1>
    <p v-if="inStock">In stock</p>
    <p v-else :class="{outOfStock : !ínStock}">Out of stock</p>
    <p> User is premium: {{premium}}</p>
    <p> Shipping: {{shipping}}</p>
    <p>{{ description }}</p>

    <ul>
      <li v-for="detail in details">{{detail}}</li>
    </ul>

    <div v-for="(variant,index) in variants" :key="variant.variantId"
    class="color-box" :style="{backgroundColor: variant.variantColor}"
    @mouseover="updateProduct(index)">
    {{variant.variantColor}}
    </div>
  </div>

  <button v-on:click="addToCart" :disabled="!inStock"
  :class="{disabledButton : !inStock}"
  >Add to cart</button>
  
  <button v-on:click="removeItem">Remove Item</button>
  
  <product-review @review-submitted="addReview">
  
  </product-review>
  
  </div>
        `,
        data() {
            return {
                brand: 'Vue Mastery',
                product: 'Socks',
                description: 'A pair of warm fuzzy socks',
                selectedVariant: 0,
                onSale: true,
                details: [
                    '80% cotton', '20% polyester', 'gender-neutral'
                ],
                variants: [
                    {
                        variantId: 1,
                        variantColor: 'red',
                        variantImage: 'assets/images/red.jpg',
                        variantQuantity: 10
                    },
                    {
                        variantId: 2,
                        variantColor: 'grey',
                        variantImage: 'assets/images/sock.jpg',
                        variantQuantity: 0
                    }
                ],
                cart: 0
            }

        }
        ,
        methods: {
            addToCart() {
                this.$emit('add-to-cart',
                    this.variants[this.selectedVariant].variantImage)
            },
            updateProduct(index) {
                this.selectedVariant = index
            },
            removeItem() {
                this.$emit('remove-item',
                    this.variants[this.selectedVariant].variantId)
            }
        },
        computed: {
            title() {
                return this.brand + ' ' + this.product
            },
            image() {
                return this.variants[this.selectedVariant].variantImage
            },
            inStock() {
                return this.variants[this.selectedVariant].variantQuantity
            },
            shipping() {
                if (this.premium) {
                    return 0.00
                } else {
                    return 2.99
                }
            }
        }
    }
)

const app = new Vue({
    el: '#app',
    data: {
        premium: false,
        cart: [],
        reviews: []
    },
    methods: {
        updateCart(id) {
            this.cart.push(id)
        },
        removeItem(id) {
            this.cart.splice(id, 1)
        },
        addReview(productReview){
            this.reviews.push(productReview)
        }
    }

});

