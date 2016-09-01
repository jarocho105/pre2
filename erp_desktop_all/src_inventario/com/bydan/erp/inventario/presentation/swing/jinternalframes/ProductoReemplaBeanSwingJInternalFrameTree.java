/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.inventario.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.inventario.util.ProductoReemplaConstantesFunciones;
import com.bydan.erp.inventario.business.entity.ProductoReempla;

import com.bydan.erp.inventario.business.logic.*;


//import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.*;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityReturnGeneral;


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class ProductoReemplaBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //ProductoReemplaBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeProductoReempla;
	public JScrollPane jScrollPaneDatosGeneralProductoReempla;
	public JScrollPane jScrollPaneTreeProductoReempla;
	private JTree treeProductoReempla;
	protected GridBagConstraints gridBagConstraintsProductoReempla;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<ProductoReempla> productoreemplas;	
	ProductoReemplaLogic productoreemplaLogic;
	ProductoReemplaLogicAdditional productoreemplaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  ProductoReemplaBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.productoreemplas= new ArrayList<ProductoReempla>();
			
			productoreemplaLogic=new ProductoReemplaLogic();
			productoreemplaLogicAdditional=new ProductoReemplaLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<ProductoReempla> getProductoReemplas() throws Exception {			
		return this.productoreemplas;
	}
	
	public void setProductoReemplas(List<ProductoReempla> newProductoReemplas) {
		this.productoreemplas = newProductoReemplas;
	}
	
	private void initialize() throws Exception {	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
		int iWidth=(screenSize.width-screenSize.width/3);
		int iHeight=(screenSize.height-screenSize.height/2);		
		
		this.setSize(iWidth,iHeight);
		
		this.setContentPane(this.getJContentPane(iWidth,iHeight));
	
		this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
	    this.iconable=true;
		
		this.setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
		
		if(Constantes.CON_VARIAS_VENTANAS) {
			openFrameCount++;
			
			if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
				openFrameCount=0;
			}
		}
	
	}
	
	public JScrollPane getJContentPane(int iWidth,int iHeight) throws Exception {	
		int iGridyPrincipal=0;
		
		this.defaultMutableTreeNode = new DefaultMutableTreeNode("ARBOL");
        //this.CargarTreeProductoReempla(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeProductoReempla = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeProductoReempla.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeProductoReempla.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeProductoReempla.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeProductoReempla.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeProductoReempla.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeProductoReempla = new JScrollPane(this.treeProductoReempla);
		
		this.jScrollPaneTreeProductoReempla.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeProductoReempla.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeProductoReempla.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeProductoReempla = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralProductoReempla = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeProductoReempla.setToolTipText("ARBOL");
        this.jPanelTreeProductoReempla.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalProductoReempla = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalProductoReempla);
		
		GridBagLayout gridaBagLayoutTreeProductoReempla= new GridBagLayout();
		this.jPanelTreeProductoReempla.setLayout(gridaBagLayoutTreeProductoReempla);
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = 0;		
		this.gridBagConstraintsProductoReempla.gridx =0;
		
		this.jPanelTreeProductoReempla.add(this.jScrollPaneTreeProductoReempla, this.gridBagConstraintsProductoReempla);
		
		
		this.gridBagConstraintsProductoReempla = new GridBagConstraints();
		this.gridBagConstraintsProductoReempla.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoReempla.gridx = 0;
		//this.gridBagConstraintsProductoReempla.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsProductoReempla.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeProductoReempla, this.gridBagConstraintsProductoReempla);
		
		
		this.jScrollPaneDatosGeneralProductoReempla=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Reemplazos"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralProductoReempla.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralProductoReempla.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralProductoReempla.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralProductoReempla.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralProductoReempla;
	}
		
	public void CargarTreeProductoReempla() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeProductoReempla(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeProductoReempla(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootProductoReempla = null;
        DefaultMutableTreeNode defaultMutableTreeNodeProductoReempla = null;
 
        defaultMutableTreeNodeRootProductoReempla = new DefaultMutableTreeNode("ReemplazoS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootProductoReempla);
		
		ArrayList<ProductoReempla> productoreemplasPrimerNivel=this.getPrimerNivelProductoReemplas();
		ArrayList<ProductoReempla> productoreemplasHijos=new ArrayList<ProductoReempla>();
		
		for(ProductoReempla productoreempla:productoreemplasPrimerNivel){//productoreemplas) {
			defaultMutableTreeNodeProductoReempla = new DefaultMutableTreeNode(productoreempla);
			
			productoreemplasHijos=this.getHijosProductoReempla(productoreempla);
			
			if(productoreemplasHijos.size()>0) {
				this.setHijosArbolProductoReempla(productoreemplasHijos,defaultMutableTreeNodeProductoReempla);
			}
			
			defaultMutableTreeNodeRootProductoReempla.add(defaultMutableTreeNodeProductoReempla);
		}
	}	
	
	public void setHijosArbolProductoReempla(ArrayList<ProductoReempla> productoreemplasAux,DefaultMutableTreeNode defaultMutableTreeNodeProductoReemplaPadre) {
		ArrayList<ProductoReempla> productoreemplasHijos=new ArrayList<ProductoReempla>();
		DefaultMutableTreeNode defaultMutableTreeNodeProductoReempla = null;
				 
		for(ProductoReempla productoreempla:productoreemplasAux) {
			defaultMutableTreeNodeProductoReempla = new DefaultMutableTreeNode(productoreempla);
			
			productoreemplasHijos=this.getHijosProductoReempla(productoreempla);
			
			if(productoreemplasHijos.size()>0) {
				this.setHijosArbolProductoReempla(productoreemplasHijos,defaultMutableTreeNodeProductoReempla);
			}
			
			defaultMutableTreeNodeProductoReemplaPadre.add(defaultMutableTreeNodeProductoReempla);
		}
	}
	
	public ArrayList<ProductoReempla> getHijosProductoReempla(ProductoReempla productoreemplaPadre) {
		ArrayList<ProductoReempla> productoreemplasAux=new ArrayList<ProductoReempla>();
		
		for(ProductoReempla productoreempla:productoreemplas) {
			if(productoreempla.getid_producto_reempla()!=null && productoreempla.getid_producto_reempla().equals(productoreemplaPadre.getId())) {
				productoreemplasAux.add(productoreempla);
			}
		}
		return productoreemplasAux;
	}
	
	public ArrayList<ProductoReempla> getPrimerNivelProductoReemplas() {
		ArrayList<ProductoReempla> productoreemplasAux=new ArrayList<ProductoReempla>();
		
		for(ProductoReempla productoreempla:productoreemplas) {
			if(productoreempla.getid_producto_reempla()==null || productoreempla.getid_producto_reempla()<=0) {
				productoreemplasAux.add(productoreempla);
			}
		}
		return productoreemplasAux;
	}
	
	public void CargarTreeProductoReemplaTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootProductoReempla = null;
        DefaultMutableTreeNode defaultMutableTreeNodeProductoReempla = null;
 
        defaultMutableTreeNodeRootProductoReempla = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootProductoReempla);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeProductoReempla = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootProductoReempla.add(defaultMutableTreeNodeProductoReempla);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeProductoReempla.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		ProductoReempla productoreempla = (ProductoReempla)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(productoreempla.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(productoreempla.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(productoreempla.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(productoreempla.getId(),this.sTipoBusqueda);			
			}
			
			//CERRAR VENTANA
			//this.jDesktopPane.add(this);			
	       	this.setVisible(false);
	        this.setSelected(false);			
			//this.dispose();
			//this=null;
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(userObject.toString());        
    }
	
	 public void clear() {
        this.defaultMutableTreeNode.removeAllChildren();
        this.defaultTreeModel.reload();
    }

	/** Remove the currently selected node. */
    public void removeCurrentNode() {
        TreePath currentSelection = this.treeProductoReempla.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                this.defaultTreeModel.removeNodeFromParent(currentNode);
                return;
            }
        } 

        // Either there was no selection, or the root was selected.
        //toolkit.beep();
    }

    /** Add child to the currently selected node. */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = this.treeProductoReempla.getSelectionPath();

        if (parentPath == null) {
            parentNode = this.defaultMutableTreeNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = this.defaultMutableTreeNode;
        }
	
	//It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        this.defaultTreeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        //Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            this.treeProductoReempla.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
	
	 public void treeNodesChanged(TreeModelEvent e) {
            DefaultMutableTreeNode node;
            node = (DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());

            /*
             * If the event lists children, then the changed
             * node is the child of the node we've already
             * gotten.  Otherwise, the changed node and the
             * specified node are the same.
             */

                int index = e.getChildIndices()[0];
                node = (DefaultMutableTreeNode)(node.getChildAt(index));

            System.out.println("The user has finished editing the node.");
            System.out.println("New value: " + node.getUserObject());
        }
        public void treeNodesInserted(TreeModelEvent e) {
        }
        public void treeNodesRemoved(TreeModelEvent e) {
        }
        public void treeStructureChanged(TreeModelEvent e) {
        }
		
	//CONTROL_FUNCION2
}

