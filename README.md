# DATASET
In order to test the many features of PCU Platform and run the Use Cases, we genrated a dataset representing the activity of a e-commerce site.

This dataset simulates the activity of a e-commerce site (visit, order, etc) over a period of one month and the repository of its products (categories and products).


## Dataset Descritpion
The dataset is composed of four files:
1. visits.json
2. customers.json
3. categories.json
4. product.json

All files are in JSON format and are structured in the same way, i. e. one JSON record per line. This means that from a strictly JSON point of view, the file is not valid. Indeed, no root element, encapsulating all the elements of the record list, is defined.
 
This bias comes from the fact that the files have large volumes (from several hundred megabytes to several gigabytes) and therefore potentially (certainly) impossible to load entirely if it were a single valid JSON.

To operate and use the dataset, the procedure consists in reading the files line by line and unmarshalling the JSON object represented by the line being processed.

The full dataset contains 3008783 JSON distributed as follows:

| File | Nb of JSON | Size |
| -------- | -------- | -------- |
| visits.json     | 2 716 969  | 1,8 Go     |
| customers.json     | 83 422   | 11,8 Mo     |
| categories.json     | 12 415   | 2,4 Mo     |
| products.json     | 195 977   |372 Mo     |


+ #### visits.json
  This file describes all the WEB pages viewed and visited by the various customers of the *e-commerce test site*. In the case of purchases, the detailed list of products purchased is present. Finally, when the customer is known, some information such as his date of birth and his address are also present.
  
  ##### JSON Schema
  ```
    root
     |-- category: struct (nullable = true)
     |    |-- id: long (nullable = true)
     |    |-- label: string (nullable = true)
     |    |-- path: string (nullable = true)
     |-- customer: struct (nullable = true)
     |    |-- address: struct (nullable = true)
     |    |    |-- city: string (nullable = true)
     |    |    |-- country: string (nullable = true)
     |    |    |-- postcode: string (nullable = true)
     |    |    |-- region: string (nullable = true)
     |    |-- dob: string (nullable = true)
     |    |-- gender: long (nullable = true)
     |    |-- id: long (nullable = true)
     |-- filters: array (nullable = true)
     |    |-- element: struct (containsNull = true)
     |    |    |-- filter: struct (nullable = true)
     |    |    |    |-- name: string (nullable = true)
     |    |    |    |-- values: string (nullable = true)
     |-- ip_address: string (nullable = true)
     |-- order: struct (nullable = true)
     |    |-- discount_total: double (nullable = true)
     |    |-- grand_total: double (nullable = true)
     |    |-- id: long (nullable = true)
     |    |-- items: array (nullable = true)
     |    |    |-- element: struct (containsNull = true)
     |    |    |    |-- item: struct (nullable = true)
     |    |    |    |    |-- id: long (nullable = true)
     |    |    |    |    |-- label: string (nullable = true)
     |    |    |    |    |-- price: double (nullable = true)
     |    |    |    |    |-- product_id: string (nullable = true)
     |    |    |    |    |-- qty: double (nullable = true)
     |    |    |    |    |-- row_total: double (nullable = true)
     |    |    |    |    |-- salesrules: string (nullable = true)
     |    |    |    |    |-- sku: string (nullable = true)
     |    |-- payment_method: string (nullable = true)
     |    |-- shipping_method: string (nullable = true)
     |    |-- shipping_total: double (nullable = true)
     |    |-- sub_total: double (nullable = true)
     |-- page: struct (nullable = true)
     |    |-- referrer_url: string (nullable = true)
     |    |-- timeStamp: string (nullable = true)
     |    |-- type_identifier: string (nullable = true)
     |    |-- type_label: string (nullable = true)
     |    |-- url: string (nullable = true)
     |-- pageList: struct (nullable = true)
     |    |-- current_page: long (nullable = true)
     |    |-- display_mode: string (nullable = true)
     |    |-- pages_count: long (nullable = true)
     |    |-- products_count: long (nullable = true)
     |    |-- sort_direction: string (nullable = true)
     |    |-- sort_order: string (nullable = true)
     |-- product: struct (nullable = true)
     |    |-- id: long (nullable = true)
     |    |-- label: string (nullable = true)
     |    |-- sku: string (nullable = true)
     |-- search: struct (nullable = true)
     |    |-- is_spellchecked: boolean (nullable = true)
     |    |-- query: string (nullable = true)
     |-- session: struct (nullable = true)
     |    |-- sessionUID: string (nullable = true)
     |    |-- visitorID: string (nullable = true)
  ```



+ #### customers.json
  This file lists all the customers of the *e-commerce test site*.
  It describes, for each customer, his or her civility (Mr or Mrs), date of   birth and list of visits.

  ##### JSON Schema:
  ```
    root
     |-- customer: struct (nullable = true)
     |    |-- civility: string (nullable = true)
     |    |-- customer_id: string (nullable = true)
     |    |-- dob: string (nullable = true)
     |    |-- session_vids: array (nullable = true)
     |    |    |-- element: struct (containsNull = true)
     |    |    |    |-- nbVisit: long (nullable = true)
     |    |    |    |-- session_vid: string (nullable = true)
  ```

+ #### categories.json
  This file describes all categories and sub categorie (parent, childs and relationships) of the *e-commerce test site* catalog.
  
  
  ##### JSON Schema:
  ```
    root
     |-- category: struct (nullable = true)
     |    |-- children_count: string (nullable = true)
     |    |-- id: string (nullable = true)
     |    |-- level: string (nullable = true)
     |    |-- name: string (nullable = true)
     |    |-- parentID: string (nullable = true)
     |    |-- path: string (nullable = true)
     |    |-- position: string (nullable = true)
     |    |-- short_description: string (nullable = true)
     |    |-- store_id: long (nullable = true)
     |    |-- url_path_fr: string (nullable = true)

  ```

+ #### products.json
  Catalogue of all active products, i.e. those "currently" offered and sold on the *e-commerce test site*.
  The JSON structure contains about 260 fields divided into two sub-systems:
  - Main fields (like: id, description, price, etc...)
  - Additional fields with product-specific attributes.
    Thus, for example, in the case of a book, we will find through these fields, the author of the book, his ISBN, his publisher, etc...

  For more clarity, only the main fields are listed

  ##### JSON Schema:
  ```
    root
     |-- availability: array (nullable = true)
     |    |-- element: string (containsNull = true)
     |-- availability_updated_at: string (nullable = true)
     |-- brand: array (nullable = true)
     |    |-- element: struct (containsNull = true)
     |    |    |-- id: string (nullable = true)
     |    |    |-- label: string (nullable = true)
     |-- categories: array (nullable = true)
     |    |-- element: long (containsNull = true)
     |-- category_name: array (nullable = true)
     |    |-- element: string (containsNull = true)
     |-- category_position: array (nullable = true)
     |    |-- element: struct (containsNull = true)
     |    |    |-- category_id: long (nullable = true)
     |    |    |-- position: long (nullable = true)
     |-- description: string (nullable = true)
     |-- has_discount_0: boolean (nullable = true)
     |-- has_discount_1: boolean (nullable = true)
     |-- id: long (nullable = true)
     |-- in_stock: boolean (nullable = true)
     |-- label: array (nullable = true)
     |    |-- element: struct (containsNull = true)
     |    |    |-- id: string (nullable = true)
     |    |    |-- label: string (nullable = true)
     |-- name: string (nullable = true)
     |-- price: double (nullable = true)
     |-- price_0: double (nullable = true)
     |-- price_1: double (nullable = true)
     |-- release_date: string (nullable = true)
     |-- short_description: string (nullable = true)
     |-- short_name: string (nullable = true)
     |-- show_in_categories: array (nullable = true)
     |    |-- element: long (containsNull = true)
     |-- tax_class: array (nullable = true)
     |    |-- element: struct (containsNull = true)
     |    |    |-- id: string (nullable = true)
     |    |    |-- label: string (nullable = true)

  ```
