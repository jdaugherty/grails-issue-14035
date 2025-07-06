databaseChangeLog = {
    changeSet(author: 'example', id: 'example-1') {
        createTable(tableName: 'EXAMPLE') {
            column(autoIncrement: 'true', name: 'id', type: 'numeric(19, 0)') {
                constraints(primaryKey: 'true', primaryKeyName: 'PK__example')
            }

            column(name: 'version', type: 'numeric(19, 0)') {
                constraints(nullable: 'false')
            }

            column(name: 'name', type: 'varchar(255)') {
                constraints(nullable: 'false')
            }
        }
    }
}