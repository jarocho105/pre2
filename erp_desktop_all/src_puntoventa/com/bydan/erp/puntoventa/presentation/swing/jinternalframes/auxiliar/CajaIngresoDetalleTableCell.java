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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.puntoventa.util.CajaIngresoDetalleConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaIngresoDetalleParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaIngresoDetalleParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.CajaIngresoDetalleBeanSwingJInternalFrame;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.CajaIngresoDetalleJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.CajaIngresoDetalleDetalleFormJInternalFrame;

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



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajaIngresoDetalleTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelCajaIngresoDetalle=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxCajaIngresoDetalle=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<CajaIngresoDetalle> cajaingresodetallesForeignKey=new ArrayList<CajaIngresoDetalle>();
			protected List<CajaIngresoDetalle> cajaingresodetallesForeignKeyActual=new ArrayList<CajaIngresoDetalle>();
			protected Border borderResaltarCajaIngresoDetalle=null;
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
			protected JButton jButtonCajaIngresoDetalle;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public CajaIngresoDetalleTableCell() {
				super(new JCheckBoxMe());				
			}

			public CajaIngresoDetalleTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public CajaIngresoDetalleTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public CajaIngresoDetalleTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public CajaIngresoDetalleTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public CajaIngresoDetalleTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxCajaIngresoDetalle=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public CajaIngresoDetalleTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public CajaIngresoDetalleTableCell(List<CajaIngresoDetalle> cajaingresodetallesForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cajaingresodetallesForeignKey=cajaingresodetallesForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public CajaIngresoDetalleTableCell(List<CajaIngresoDetalle> cajaingresodetallesForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(cajaingresodetallesForeignKey,jInternalFrameBase,true);
			}
			
			public CajaIngresoDetalleTableCell(List<CajaIngresoDetalle> cajaingresodetallesForeignKey,Border borderResaltarCajaIngresoDetalle,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cajaingresodetallesForeignKey=cajaingresodetallesForeignKey;
				this.borderResaltarCajaIngresoDetalle=borderResaltarCajaIngresoDetalle;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public CajaIngresoDetalleTableCell(List<CajaIngresoDetalle> cajaingresodetallesForeignKey,Border borderResaltarCajaIngresoDetalle,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cajaingresodetallesForeignKey=cajaingresodetallesForeignKey;
				this.borderResaltarCajaIngresoDetalle=borderResaltarCajaIngresoDetalle;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public CajaIngresoDetalleTableCell(List<CajaIngresoDetalle> cajaingresodetallesForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(cajaingresodetallesForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public CajaIngresoDetalleTableCell(List<CajaIngresoDetalle> cajaingresodetallesForeignKey,Border borderResaltarCajaIngresoDetalle,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.cajaingresodetallesForeignKey=cajaingresodetallesForeignKey;
				this.borderResaltarCajaIngresoDetalle=borderResaltarCajaIngresoDetalle;
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
	
					jLabelCajaIngresoDetalle=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sCajaIngresoDetalleDescripcion="";
	
					sCajaIngresoDetalleDescripcion=jInternalFrameBase.getDescripcionFk("CajaIngresoDetalle",table,value,intSelectedRow);
					
					jLabelCajaIngresoDetalle.setText(sCajaIngresoDetalleDescripcion);						
					
					if(this.borderResaltarCajaIngresoDetalle!=null) {
						jLabelCajaIngresoDetalle.setBorder(this.borderResaltarCajaIngresoDetalle);
					}
	
					jLabelCajaIngresoDetalle.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelCajaIngresoDetalle.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelCajaIngresoDetalle.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelCajaIngresoDetalle.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelCajaIngresoDetalle.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelCajaIngresoDetalle, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelCajaIngresoDetalle;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxCajaIngresoDetalle=new JComboBoxMe();

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
					
					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxCajaIngresoDetalle.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(CajaIngresoDetalle cajaingresodetalle:this.cajaingresodetallesForeignKey) {
								this.jComboBoxCajaIngresoDetalle.addItem(cajaingresodetalle);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(CajaIngresoDetalle cajaingresodetalle:this.cajaingresodetallesForeignKeyActual) {
									this.jComboBoxCajaIngresoDetalle.addItem(cajaingresodetalle);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxCajaIngresoDetalle.setSelectedItem(perfil.getCajaIngresoDetalle());

					//setActualCajaIngresoDetalleForeignKey((Long)value,false,"Formulario");

					CajaIngresoDetalleBeanSwingJInternalFrame.setActualComboBoxCajaIngresoDetalleGenerico((Long)value,this.jComboBoxCajaIngresoDetalle,this.cajaingresodetallesForeignKey);
					
					if(this.conHotKeys) {
						CajaIngresoDetalleBeanSwingJInternalFrame.setHotKeysComboBoxCajaIngresoDetalleGenerico(this.jComboBoxCajaIngresoDetalle,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualCajaIngresoDetalleForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxCajaIngresoDetalle.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxCajaIngresoDetalle.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxCajaIngresoDetalle, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxCajaIngresoDetalle;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonCajaIngresoDetalle =new JButtonMe((row+1)+"-Caja Ingreso Detalle");

				jButtonCajaIngresoDetalle.setToolTipText((row+1)+"-Caja Ingreso Detalle");

				if(this.borderResaltarCajaIngresoDetalle!=null) {
					jButtonCajaIngresoDetalle.setBorder(this.borderResaltarCajaIngresoDetalle);
				}

				jButtonCajaIngresoDetalle.setOpaque(true);
				jButtonCajaIngresoDetalle.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonCajaIngresoDetalle.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonCajaIngresoDetalle.setEnabled(this.conEnabled);
				
				return jButtonCajaIngresoDetalle;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonCajaIngresoDetalle=new JButtonMe((row+1)+"-Caja Ingreso Detalle");
				jButtonCajaIngresoDetalle.setToolTipText((row+1)+"-Caja Ingreso Detalle");

				if(this.borderResaltarCajaIngresoDetalle!=null) {
					jButtonCajaIngresoDetalle.setBorder(this.borderResaltarCajaIngresoDetalle);
				}
				
				/*
				jButtonCajaIngresoDetalle.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonCajaIngresoDetalleActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("CajaIngresoDetalle",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonCajaIngresoDetalle.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","CajaIngresoDetalle",row));
				
				valor=value;

				this.jButtonCajaIngresoDetalle.setEnabled(this.conEnabled);
				
				return jButtonCajaIngresoDetalle;
			}
			
			public CajaIngresoDetalleTableCell(Border borderResaltarCajaIngresoDetalle,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarCajaIngresoDetalle=borderResaltarCajaIngresoDetalle;
				this.sTipo="BOTON";
			}
			
			public CajaIngresoDetalleTableCell(Border borderResaltarCajaIngresoDetalle,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarCajaIngresoDetalle,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					CajaIngresoDetalle cajaingresodetalle=((CajaIngresoDetalle)this.jComboBoxCajaIngresoDetalle.getSelectedItem());
					
					if(cajaingresodetalle!=null) {
						idActual=cajaingresodetalle.getId();
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
			public JComboBox getjComboBoxCajaIngresoDetalle() {
				return this.jComboBoxCajaIngresoDetalle;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxCajaIngresoDetalle(JComboBox jComboBoxCajaIngresoDetalle) {
				this.jComboBoxCajaIngresoDetalle = jComboBoxCajaIngresoDetalle;
			}
			
			public List<CajaIngresoDetalle> getcajaingresodetallesForeignKey() {
				return this.cajaingresodetallesForeignKey;
			}
		
			public void setcajaingresodetallesForeignKey(List<CajaIngresoDetalle> cajaingresodetallesForeignKey) {
				this.cajaingresodetallesForeignKey = cajaingresodetallesForeignKey;
			}
			
			public List<CajaIngresoDetalle> getcajaingresodetallesForeignKeyActual() {
				return this.cajaingresodetallesForeignKeyActual;
			}
		
			public void setcajaingresodetallesForeignKeyActual(List<CajaIngresoDetalle> cajaingresodetallesForeignKeyActual) {
				this.cajaingresodetallesForeignKeyActual = cajaingresodetallesForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarCajaIngresoDetallesForeignKey() {			
				this.jComboBoxCajaIngresoDetalle.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(CajaIngresoDetalle cajaingresodetalle:this.cajaingresodetallesForeignKey) {
						this.jComboBoxCajaIngresoDetalle.addItem(cajaingresodetalle);
					}
				} else {
					for(CajaIngresoDetalle cajaingresodetalle:this.cajaingresodetallesForeignKeyActual) {
						this.jComboBoxCajaIngresoDetalle.addItem(cajaingresodetalle);
					}
				}
			}
		}
