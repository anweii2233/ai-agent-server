drop table if exists market_phone;
create table market_phone (
  phone_id          bigint(20)      not null auto_increment comment '商品ID',
  name              varchar(100)    not null comment '商品名称',
  brand             varchar(30)     not null comment '品牌',
  model             varchar(60)     not null comment '型号',
  category          varchar(30)     not null default '推荐' comment '分类',
  condition_level   varchar(20)     not null comment '成色',
  battery_health    int(3)          not null comment '电池健康度',
  price             decimal(10,2)   not null comment '销售价格',
  image_url         varchar(255)    default null comment '后台上传后的商品图片路径',
  color             varchar(30)     default null comment '颜色',
  storage           varchar(20)     default null comment '存储容量',
  network_type      varchar(20)     default null comment '网络制式',
  memory_size       varchar(20)     default null comment '机身内存',
  warranty_status   varchar(10)     not null default '在保' comment '保修状态',
  sales_count       int(11)         not null default 0 comment '已售数量',
  inspection_tags   varchar(200)    default null comment '检测标签，逗号分隔',
  status            char(1)         not null default '0' comment '状态（0上架 1下架）',
  create_time       datetime        default current_timestamp comment '创建时间',
  primary key (phone_id),
  key idx_market_phone_filter (brand, category, condition_level, price),
  key idx_market_phone_sales (sales_count)
) engine=innodb auto_increment=1001 default charset=utf8mb4 comment='二手手机商品表';

insert into market_phone
(name, brand, model, category, condition_level, battery_health, price, image_url, color, storage, network_type, memory_size, warranty_status, sales_count, inspection_tags)
values
('iPhone 17 Pro Max 256G 深空黑色', 'iPhone', 'iPhone 17 Pro Max', '推荐', '99新', 100, 7299.00, null, '黑色', '256G', '5G', '256G', '在保', 3217, '无拆修,无进水,功能正常'),
('iPhone 17 512G 白色', 'iPhone', 'iPhone 17', 'iPhone', '准新机', 100, 6599.00, null, '白色', '512G', '5G', '512G', '在保', 1846, '无拆修,无进水,功能正常'),
('iPhone 16 Pro 256G 钛金属蓝色', 'iPhone', 'iPhone 16 Pro', 'iPhone', '95新', 95, 5299.00, null, '蓝色', '256G', '5G', '256G', '在保', 4632, '无拆修,轻微使用,功能正常'),
('华为 Mate 60 Pro 12G+512G 雅川青', '华为', 'Mate 60 Pro', '安卓', '95新', 98, 4699.00, null, '绿色', '512G', '5G', '512G', '在保', 2958, '无拆修,无进水,功能正常'),
('小米 14 Ultra 16G+512G 白色', '小米', '小米 14 Ultra', '安卓', '99新', 100, 4299.00, null, '白色', '512G', '5G', '512G', '在保', 2184, '无拆修,无进水,功能正常'),
('OPPO Find X7 16G+512G 海阔天空', 'OPPO', 'OPPO Find X7', '安卓', '95新', 96, 3399.00, null, '蓝色', '512G', '5G', '512G', '过保', 1537, '官方验机,轻微使用,功能正常'),
('vivo X100 Pro 16G+512G 辰夜黑', 'vivo', 'vivo X100 Pro', '安卓', '9成新', 91, 2999.00, null, '黑色', '512G', '5G', '512G', '过保', 987, '无主板维修,电池良好,功能正常'),
('荣耀 Magic6 Pro 12G+256G 祁连雪', '荣耀', '荣耀 Magic6 Pro', '安卓', '95新', 95, 2899.00, null, '白色', '256G', '5G', '256G', '在保', 1264, '官方验机,无进水,功能正常');
