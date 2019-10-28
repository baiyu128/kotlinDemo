package cn.baiyu.test.dao.impl

import cn.baiyu.test.dao.AuthorDao
import cn.baiyu.test.entity.Author
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

/**
@author baiyu
@data 2019-10-28 14:45
 */
@Repository
open class AuthorDaoImpl : AuthorDao {

    @Autowired
    private lateinit var jdbcTemplate: JdbcTemplate

    override fun add(author: Author): Int {
        return jdbcTemplate.update("insert into t_author(real_name, nick_name) values(?, ?)",
                author.realName, author.nickName)
    }

    override fun update(author: Author): Int {
        return jdbcTemplate.update("update t_author set real_name = ?, nick_name = ? where id = ?",
                *arrayOf(author.realName, author.nickName, author.id))
    }

    override fun delete(id: Long): Int {
        return jdbcTemplate.update("delete from t_author where id = ?", id)
    }

    override fun findAuthor(id: Long): Author? {
        val list = jdbcTemplate.query<Author>("select * from t_author where id = ?",
                arrayOf<Any>(id), BeanPropertyRowMapper(Author::class.java))
        return list?.get(0);
    }

    override fun findAuthorList(): List<Author> {
        return jdbcTemplate.query("select * from t_author", arrayOf(), BeanPropertyRowMapper(Author::class.java))
    }
}