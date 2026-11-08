-- products
create schema prod;
create table prod.products (
    id_prod int generated always as identity primary key,
    type_prod varchar(150),
    name_prod varchar(150) not null,
    date_created timestamp default current_timestamp,
    cost_price numeric(10,2) not null check (cost_price >= 0),
    selling_price numeric(10,2) not null check (selling_price >= 0)
);

-- employees
create schema emp;
create table emp.employees (
    id_emp int generated always as identity primary key,
    name_emp varchar(150) not null,
    date_created timestamp default current_timestamp,
    function_emp varchar(100)
);

-- sales
create schema sale;
create table sale.sales (
    id_sale int generated always as identity primary key,
    id_emp int references emp.employees(id_emp) not null,
    id_prod int references prod.products(id_prod) not null,
    date_sale timestamp default current_timestamp not null,
    sale_price numeric(10, 2) not null check (sale_price >= 0)
);