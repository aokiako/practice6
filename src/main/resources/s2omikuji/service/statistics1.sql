select u.unsei_name,cnt_res.cnt
	from unsei u left outer join (select o.unsei_id,count(*) as cnt

	From omikuji o inner join result r
	On  o.omikuji_id= r.omikuji_id

	where r.fortune_day>= /*fortuneday*/

	group by unsei_id) cnt_res on u.unsei_id = cnt_res.unsei_id

	order by u.unsei_id