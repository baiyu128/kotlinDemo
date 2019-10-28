package cn.baiyu.test.service.impl

import cn.baiyu.test.dao.AuthorDao
import cn.baiyu.test.entity.Author
import cn.baiyu.test.service.AuthorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
@author baiyu
@data 2019-10-28 14:46
 */
@Service("authorService")
open class AuthorServiceImpl : AuthorService {

    @Autowired
    private lateinit var authorDao: AuthorDao

    override fun update(author: Author): Int {
        return this.authorDao.update(author)
    }

    override fun add(author: Author): Int {
        return this.authorDao.add(author)
    }

    override fun delete(id: Long): Int {
        return this.authorDao.delete(id)
    }

    override fun findAuthor(id: Long): Author? {
        return this.authorDao.findAuthor(id)
    }

    override fun findAuthorList(): List<Author> {
        return this.authorDao.findAuthorList()
    }
}