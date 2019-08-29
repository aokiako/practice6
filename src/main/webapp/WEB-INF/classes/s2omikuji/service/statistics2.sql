Select u.unsei_name,o.negaigoto,o.akinai,o.gakumon,r.fortune_day
From (unsei u inner join omikuji o on u.unsei_id = o.unsei_id)
Inner join result r on o.omikuji_id = r.omikuji_id
where r.fortune_day>= /*past*/
AND r.birthday= /*birthday*/
order by fortune_day desc
