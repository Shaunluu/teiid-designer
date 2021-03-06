--
-- SAMPLE ORACLE STATEMENTS
--

ALTER CLUSTER language 
   DEALLOCATE UNUSED KEEP 30 K;

ALTER CLUSTER personnel
   SIZE 1024 CACHE;

ALTER DATABASE
  ADD LOGFILE GROUP 3 
    ('diska:log3.log' ,  
     'diskb:log3.log') SIZE 50K; 

ALTER DATABASE   
    RENAME FILE 'diskc:log3.log' TO 'diskb:log3.log'; 

ALTER DATABASE
    SET DEFAULT BIGFILE TABLESPACE;

ALTER DIMENSION customers_dim
   DROP ATTRIBUTE country;

ALTER DIMENSION customers_dim
   ADD LEVEL zone IS customers.cust_postal_code
   ADD ATTRIBUTE zone DETERMINES (cust_city);

ALTER DISKGROUP dgroup_01
  ADD DIRECTORY '+dgroup_01/alias_dir';

ALTER DISKGROUP dgroup_01
  ALTER TEMPLATE template_01
    ATTRIBUTES (FINE);

ALTER DISKGROUP dgroup_01
  RESIZE ALL
  SIZE 36G;

-- 10 Statements
  
ALTER DISKGROUP dgroup_01
  ADD DISK '$ORACLE_HOME/disks/d100';

ALTER FUNCTION oe.get_bal
   COMPILE; 

ALTER INDEX upper_ix RENAME TO upper_name_ix;

ALTER INDEX cost_ix MODIFY PARTITION p3
   STORAGE(MAXEXTENTS 30) LOGGING;

ALTER INDEX cost_ix
   DROP PARTITION p1;

ALTER INDEXTYPE position_indextype
   ADD lob_contains(CLOB, CLOB);

ALTER JAVA CLASS "Agent"
   RESOLVER (("/home/java.101/bin/*" pm)(* public))
   RESOLVE;

ALTER MATERIALIZED VIEW sales_by_month_by_state
   REFRESH NEXT SYSDATE+7;

ALTER MATERIALIZED VIEW order_data 
   REFRESH WITH PRIMARY KEY; 

ALTER MATERIALIZED VIEW LOG ON employees
   ADD (commission_pct)
   EXCLUDING NEW VALUES;
   
-- 20 Statements
   
ALTER OPERATOR eq_op COMPILE;

ALTER OUTLINE salaries REBUILD;

ALTER PACKAGE emp_mgmt
   COMPILE PACKAGE; 

ALTER PACKAGE hr.emp_mgmt 
   COMPILE BODY; 

ALTER PROCEDURE hr.remove_emp
   COMPILE; 

ALTER PROFILE new_profile 
   LIMIT PASSWORD_REUSE_TIME 90 
   PASSWORD_REUSE_MAX UNLIMITED;

ALTER PROFILE app_user LIMIT IDLE_TIME DEFAULT;

ALTER RESOURCE COST 
   CPU_PER_SESSION 100
   CONNECT_TIME      1; 

ALTER RESOURCE COST 
   LOGICAL_READS_PER_SESSION 2
   CONNECT_TIME 0; 

ALTER ROLLBACK SEGMENT rbs_one 
   STORAGE (NEXT 1000 MAXEXTENTS 20); 

-- 30 Statements
   
ALTER ROLLBACK SEGMENT rbs_one 
   SHRINK TO 100 M;

ALTER SEQUENCE customers_seq 
   MAXVALUE 1500;

ALTER SEQUENCE customers_seq 
   CYCLE
   CACHE 5; 

ALTER SESSION 
   SET NLS_DATE_FORMAT = 'YYYY MM DD HH24:MI:SS';

ALTER SESSION ENABLE PARALLEL DML;

ALTER SESSION
   SET NLS_LANGUAGE = FRENCH; 

ALTER SYSTEM SWITCH LOGFILE; 

ALTER SYSTEM 
   SET DISPATCHERS = 
      '(INDEX=0)(PROTOCOL=TCP)(DISPATCHERS=5)',
      '(INDEX=1)(PROTOCOL=ipc)(DISPATCHERS=10)'; 

ALTER SYSTEM
   DISABLE RESTRICTED SESSION;
   
ALTER TABLE staff 
   ADD (REF(dept) WITH ROWID);

-- 40 Statements

ALTER TABLE deptemps ADD (SCOPE FOR (column_value) IS emptab);

ALTER TABLE client_tab ADD UNIQUE (ssn);

ALTER TABLE employees ADD (skills varchar(255))
    NESTED TABLE skills STORE AS nested_skill_table;

ALTER TABLE employees MODIFY LOB (resume) (CACHE);

ALTER TABLE employees 
    DROP UNIQUE (email);

ALTER TABLE departments
    DROP CONSTRAINT pk_dept CASCADE; 

ALTER TABLE customers RENAME CONSTRAINT cust_fname_nn
   TO cust_firstname_nn;

ALTER TABLE customers RENAME COLUMN cust_fname_nn
   TO cust_firstname_nn;

ALTER TABLE product_information
   MODIFY (min_price DEFAULT NULL);

ALTER TABLE employees
  ALLOCATE EXTENT (SIZE 5K INSTANCE 4); 

-- 50 Statements
