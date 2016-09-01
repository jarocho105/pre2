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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

//import com.bydan.erp.facturacion.util.BuscarProductoFacturasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.BuscarProductoFacturasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.BuscarProductoFacturasParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.BuscarProductoFacturasBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;






import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.hibernate.collection.PersistentBag;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.BuscarProductoFacturasJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.BuscarProductoFacturasDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BuscarProductoFacturasTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelBuscarProductoFacturas=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxBuscarProductoFacturas=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<BuscarProductoFacturas> buscarproductofacturassForeignKey=new ArrayList<BuscarProductoFacturas>();
			protected List<BuscarProductoFacturas> buscarproductofacturassForeignKeyActual=new ArrayList<BuscarProductoFacturas>();
			protected Border borderResaltarBuscarProductoFacturas=null;
			protected Boolean conEnabled=true;
			protected Integer iTotalRow=0;
			protected Boolean conHotKeys=false;
			protected String sNombreHotKeyAbstractAction="";
			protected String sTipoBusqueda="NINGUNO";
			protected Integer rowActual=-1;
			protected ArrayList<Classe> classes;
			//PARA TABLECELL_FK_FIN
			
			//PARA TABLECELL
			public String sTipo="FK"; //"BOTON"
			protected JButton jButtonBuscarProductoFacturas;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public BuscarProductoFacturasTableCell() {
				super(new JCheckBoxMe());				
			}

			public BuscarProductoFacturasTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public BuscarProductoFacturasTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public BuscarProductoFacturasTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(checkBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jInternalFrameBase=jInternalFrameBase;	
				this.sTipo="FK";
			}
			
			public BuscarProductoFacturasTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public BuscarProductoFacturasTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxBuscarProductoFacturas=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public BuscarProductoFacturasTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public BuscarProductoFacturasTableCell(List<BuscarProductoFacturas> buscarproductofacturassForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.buscarproductofacturassForeignKey=buscarproductofacturassForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public BuscarProductoFacturasTableCell(List<BuscarProductoFacturas> buscarproductofacturassForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(buscarproductofacturassForeignKey,jInternalFrameBase,true);
			}
			
			public BuscarProductoFacturasTableCell(List<BuscarProductoFacturas> buscarproductofacturassForeignKey,Border borderResaltarBuscarProductoFacturas,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.buscarproductofacturassForeignKey=buscarproductofacturassForeignKey;
				this.borderResaltarBuscarProductoFacturas=borderResaltarBuscarProductoFacturas;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public BuscarProductoFacturasTableCell(List<BuscarProductoFacturas> buscarproductofacturassForeignKey,Border borderResaltarBuscarProductoFacturas,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.buscarproductofacturassForeignKey=buscarproductofacturassForeignKey;
				this.borderResaltarBuscarProductoFacturas=borderResaltarBuscarProductoFacturas;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public BuscarProductoFacturasTableCell(List<BuscarProductoFacturas> buscarproductofacturassForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(buscarproductofacturassForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public BuscarProductoFacturasTableCell(List<BuscarProductoFacturas> buscarproductofacturassForeignKey,Border borderResaltarBuscarProductoFacturas,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.buscarproductofacturassForeignKey=buscarproductofacturassForeignKey;
				this.borderResaltarBuscarProductoFacturas=borderResaltarBuscarProductoFacturas;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}						
			//PARA TABLECELL_FK_FIN
			
			public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				Component component=new JCheckBoxMe();
				
				if(sTipo=="FK") {
					component=this.getTableCellRendererComponentParaTableCellFk(table,value,isSelected,hasFocus,row,column);
					
				} else if(sTipo=="BOTON") {
					component=this.getTableCellRendererComponentParaTableCell(table,value,isSelected,hasFocus,row,column);
				}
				
				return component;
			}
			
			public Component getTableCellEditorComponent(JTable table,Object value,boolean isSelected,int row,int column) {
				Component component=new JCheckBoxMe();
				
				if(sTipo=="FK") {
					component=this.getTableCellEditorComponentParaTableCellFk(table,value,isSelected,row,column);
					
				} else if(sTipo=="BOTON") {
					component=this.getTableCellEditorComponentParaTableCell(table,value,isSelected,row,column);
				}
				
				return component;
			}
			
			public Component getTableCellRendererComponentParaTableCellFk(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				try{
					int intSelectedRow = row;
	
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfil =(Perfil) perfilLogic.getPerfils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						perfil =(Perfil) perfils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE
	
					jLabelBuscarProductoFacturas=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sBuscarProductoFacturasDescripcion="";
	
					sBuscarProductoFacturasDescripcion=jInternalFrameBase.getDescripcionFk("BuscarProductoFacturas",table,value,intSelectedRow);
					
					jLabelBuscarProductoFacturas.setText(sBuscarProductoFacturasDescripcion);						
					
					if(this.borderResaltarBuscarProductoFacturas!=null) {
						jLabelBuscarProductoFacturas.setBorder(this.borderResaltarBuscarProductoFacturas);
					}
	
					jLabelBuscarProductoFacturas.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelBuscarProductoFacturas.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelBuscarProductoFacturas.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelBuscarProductoFacturas.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelBuscarProductoFacturas.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelBuscarProductoFacturas, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelBuscarProductoFacturas;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxBuscarProductoFacturas=new JComboBoxMe();

				try{
					int intSelectedRow = row;

				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfil =(Perfil) perfilLogic.getPerfils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE) {
						perfil =(Perfil) perfils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE
					
					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxBuscarProductoFacturas.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(BuscarProductoFacturas buscarproductofacturas:this.buscarproductofacturassForeignKey) {
								this.jComboBoxBuscarProductoFacturas.addItem(buscarproductofacturas);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(BuscarProductoFacturas buscarproductofacturas:this.buscarproductofacturassForeignKeyActual) {
									this.jComboBoxBuscarProductoFacturas.addItem(buscarproductofacturas);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxBuscarProductoFacturas.setSelectedItem(perfil.getBuscarProductoFacturas());

					//setActualBuscarProductoFacturasForeignKey((Long)value,false,"Formulario");

					BuscarProductoFacturasBeanSwingJInternalFrame.setActualComboBoxBuscarProductoFacturasGenerico((Long)value,this.jComboBoxBuscarProductoFacturas,this.buscarproductofacturassForeignKey);
					
					if(this.conHotKeys) {
						BuscarProductoFacturasBeanSwingJInternalFrame.setHotKeysComboBoxBuscarProductoFacturasGenerico(this.jComboBoxBuscarProductoFacturas,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualBuscarProductoFacturasForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxBuscarProductoFacturas.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxBuscarProductoFacturas.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxBuscarProductoFacturas, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxBuscarProductoFacturas;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonBuscarProductoFacturas =new JButtonMe((row+1)+"-Buscar Producto Facturas");

				jButtonBuscarProductoFacturas.setToolTipText((row+1)+"-Buscar Producto Facturas");

				if(this.borderResaltarBuscarProductoFacturas!=null) {
					jButtonBuscarProductoFacturas.setBorder(this.borderResaltarBuscarProductoFacturas);
				}

				jButtonBuscarProductoFacturas.setOpaque(true);
				jButtonBuscarProductoFacturas.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonBuscarProductoFacturas.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonBuscarProductoFacturas.setEnabled(this.conEnabled);
				
				return jButtonBuscarProductoFacturas;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonBuscarProductoFacturas=new JButtonMe((row+1)+"-Buscar Producto Facturas");
				jButtonBuscarProductoFacturas.setToolTipText((row+1)+"-Buscar Producto Facturas");

				if(this.borderResaltarBuscarProductoFacturas!=null) {
					jButtonBuscarProductoFacturas.setBorder(this.borderResaltarBuscarProductoFacturas);
				}
				
				/*
				jButtonBuscarProductoFacturas.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonBuscarProductoFacturasActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("BuscarProductoFacturas",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonBuscarProductoFacturas.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","BuscarProductoFacturas",row));
				
				valor=value;

				this.jButtonBuscarProductoFacturas.setEnabled(this.conEnabled);
				
				return jButtonBuscarProductoFacturas;
			}
			
			public BuscarProductoFacturasTableCell(Border borderResaltarBuscarProductoFacturas,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarBuscarProductoFacturas=borderResaltarBuscarProductoFacturas;
				this.sTipo="BOTON";
			}
			
			public BuscarProductoFacturasTableCell(Border borderResaltarBuscarProductoFacturas,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarBuscarProductoFacturas,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					BuscarProductoFacturas buscarproductofacturas=((BuscarProductoFacturas)this.jComboBoxBuscarProductoFacturas.getSelectedItem());
					
					if(buscarproductofacturas!=null) {
						idActual=buscarproductofacturas.getId();
					}
					
					value=idActual;
					
				} else if(sTipo=="BOTON") {
					value=valor;
				}
				
				return value;
			}

			public boolean stopCellEditing() {
				fireEditingStopped();

				return true;
			}
			
			public Integer getRowActual() {
				return this.rowActual;
			}
		
			public void setRowActual(Integer rowActual) {
				this.rowActual = rowActual;
			}
			
			public Boolean getConEnabled() {
				return this.conEnabled;
			}
		
			public void setConEnabled(Boolean conEnabled) {
				this.conEnabled = conEnabled;
			}
			
			public Boolean getConHotKeys() {
				return this.conHotKeys;
			}
		
			public void setConHotKeys(Boolean conHotKeys) {
				this.conHotKeys = conHotKeys;
			}
			
			@SuppressWarnings("rawtypes")
			public JComboBox getjComboBoxBuscarProductoFacturas() {
				return this.jComboBoxBuscarProductoFacturas;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxBuscarProductoFacturas(JComboBox jComboBoxBuscarProductoFacturas) {
				this.jComboBoxBuscarProductoFacturas = jComboBoxBuscarProductoFacturas;
			}
			
			public List<BuscarProductoFacturas> getbuscarproductofacturassForeignKey() {
				return this.buscarproductofacturassForeignKey;
			}
		
			public void setbuscarproductofacturassForeignKey(List<BuscarProductoFacturas> buscarproductofacturassForeignKey) {
				this.buscarproductofacturassForeignKey = buscarproductofacturassForeignKey;
			}
			
			public List<BuscarProductoFacturas> getbuscarproductofacturassForeignKeyActual() {
				return this.buscarproductofacturassForeignKeyActual;
			}
		
			public void setbuscarproductofacturassForeignKeyActual(List<BuscarProductoFacturas> buscarproductofacturassForeignKeyActual) {
				this.buscarproductofacturassForeignKeyActual = buscarproductofacturassForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarBuscarProductoFacturassForeignKey() {			
				this.jComboBoxBuscarProductoFacturas.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(BuscarProductoFacturas buscarproductofacturas:this.buscarproductofacturassForeignKey) {
						this.jComboBoxBuscarProductoFacturas.addItem(buscarproductofacturas);
					}
				} else {
					for(BuscarProductoFacturas buscarproductofacturas:this.buscarproductofacturassForeignKeyActual) {
						this.jComboBoxBuscarProductoFacturas.addItem(buscarproductofacturas);
					}
				}
			}
		}
