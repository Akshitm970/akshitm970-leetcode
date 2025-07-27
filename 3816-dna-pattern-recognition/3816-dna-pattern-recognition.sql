SELECT s1.*,
  (SELECT COUNT(*)
   FROM samples s2
   WHERE s2.sample_id = s1.sample_id AND s2.dna_sequence LIKE 'ATG%') AS has_start,
   
   (SELECT COUNT(*)
   FROM samples s2
   WHERE s2.sample_id = s1.sample_id AND (s2.dna_sequence LIKE '%TAA' or s2.dna_sequence like '%TAG' or s2.dna_sequence like '%TGA') )AS has_stop,
   (select count(*) from samples s2 WHERE  s2.sample_id = s1.sample_id AND (s2.dna_sequence LIKE '%ATAT%') ) as has_atat,

   (select count(*) 
   from samples s2
   where s2.sample_id = s1.sample_id AND dna_sequence LIKE ('%GGG%'))
   AS has_ggg
FROM samples s1;
