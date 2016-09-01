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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TipoDetaNotaCreditoBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TipoDetaNotaCreditoJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TipoDetaNotaCreditoDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDetaNotaCreditoTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelTipoDetaNotaCredito=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxTipoDetaNotaCredito=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey=new ArrayList<TipoDetaNotaCredito>();
			protected List<TipoDetaNotaCredito> tipodetanotacreditosForeignKeyActual=new ArrayList<TipoDetaNotaCredito>();
			protected Border borderResaltarTipoDetaNotaCredito=null;
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
			protected JButton jButtonTipoDetaNotaCredito;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public TipoDetaNotaCreditoTableCell() {
				super(new JCheckBoxMe());				
			}

			public TipoDetaNotaCreditoTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public TipoDetaNotaCreditoTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public TipoDetaNotaCreditoTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public TipoDetaNotaCreditoTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public TipoDetaNotaCreditoTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxTipoDetaNotaCredito=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public TipoDetaNotaCreditoTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public TipoDetaNotaCreditoTableCell(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipodetanotacreditosForeignKey=tipodetanotacreditosForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public TipoDetaNotaCreditoTableCell(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(tipodetanotacreditosForeignKey,jInternalFrameBase,true);
			}
			
			public TipoDetaNotaCreditoTableCell(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey,Border borderResaltarTipoDetaNotaCredito,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipodetanotacreditosForeignKey=tipodetanotacreditosForeignKey;
				this.borderResaltarTipoDetaNotaCredito=borderResaltarTipoDetaNotaCredito;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public TipoDetaNotaCreditoTableCell(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey,Border borderResaltarTipoDetaNotaCredito,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipodetanotacreditosForeignKey=tipodetanotacreditosForeignKey;
				this.borderResaltarTipoDetaNotaCredito=borderResaltarTipoDetaNotaCredito;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public TipoDetaNotaCreditoTableCell(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(tipodetanotacreditosForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public TipoDetaNotaCreditoTableCell(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey,Border borderResaltarTipoDetaNotaCredito,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.tipodetanotacreditosForeignKey=tipodetanotacreditosForeignKey;
				this.borderResaltarTipoDetaNotaCredito=borderResaltarTipoDetaNotaCredito;
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
	
					jLabelTipoDetaNotaCredito=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sTipoDetaNotaCreditoDescripcion="";
	
					sTipoDetaNotaCreditoDescripcion=jInternalFrameBase.getDescripcionFk("TipoDetaNotaCredito",table,value,intSelectedRow);
					
					jLabelTipoDetaNotaCredito.setText(sTipoDetaNotaCreditoDescripcion);						
					
					if(this.borderResaltarTipoDetaNotaCredito!=null) {
						jLabelTipoDetaNotaCredito.setBorder(this.borderResaltarTipoDetaNotaCredito);
					}
	
					jLabelTipoDetaNotaCredito.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelTipoDetaNotaCredito.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelTipoDetaNotaCredito.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelTipoDetaNotaCredito.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelTipoDetaNotaCredito.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelTipoDetaNotaCredito, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelTipoDetaNotaCredito;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxTipoDetaNotaCredito=new JComboBoxMe();

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
					
					if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxTipoDetaNotaCredito.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(TipoDetaNotaCredito tipodetanotacredito:this.tipodetanotacreditosForeignKey) {
								this.jComboBoxTipoDetaNotaCredito.addItem(tipodetanotacredito);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(TipoDetaNotaCredito tipodetanotacredito:this.tipodetanotacreditosForeignKeyActual) {
									this.jComboBoxTipoDetaNotaCredito.addItem(tipodetanotacredito);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxTipoDetaNotaCredito.setSelectedItem(perfil.getTipoDetaNotaCredito());

					//setActualTipoDetaNotaCreditoForeignKey((Long)value,false,"Formulario");

					TipoDetaNotaCreditoBeanSwingJInternalFrame.setActualComboBoxTipoDetaNotaCreditoGenerico((Long)value,this.jComboBoxTipoDetaNotaCredito,this.tipodetanotacreditosForeignKey);
					
					if(this.conHotKeys) {
						TipoDetaNotaCreditoBeanSwingJInternalFrame.setHotKeysComboBoxTipoDetaNotaCreditoGenerico(this.jComboBoxTipoDetaNotaCredito,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualTipoDetaNotaCreditoForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxTipoDetaNotaCredito.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxTipoDetaNotaCredito.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxTipoDetaNotaCredito, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxTipoDetaNotaCredito;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonTipoDetaNotaCredito =new JButtonMe((row+1)+"-Tipo Detalle Nota Credito");

				jButtonTipoDetaNotaCredito.setToolTipText((row+1)+"-Tipo Detalle Nota Credito");

				if(this.borderResaltarTipoDetaNotaCredito!=null) {
					jButtonTipoDetaNotaCredito.setBorder(this.borderResaltarTipoDetaNotaCredito);
				}

				jButtonTipoDetaNotaCredito.setOpaque(true);
				jButtonTipoDetaNotaCredito.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonTipoDetaNotaCredito.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonTipoDetaNotaCredito.setEnabled(this.conEnabled);
				
				return jButtonTipoDetaNotaCredito;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonTipoDetaNotaCredito=new JButtonMe((row+1)+"-Tipo Detalle Nota Credito");
				jButtonTipoDetaNotaCredito.setToolTipText((row+1)+"-Tipo Detalle Nota Credito");

				if(this.borderResaltarTipoDetaNotaCredito!=null) {
					jButtonTipoDetaNotaCredito.setBorder(this.borderResaltarTipoDetaNotaCredito);
				}
				
				/*
				jButtonTipoDetaNotaCredito.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonTipoDetaNotaCreditoActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("TipoDetaNotaCredito",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","TipoDetaNotaCredito",row));
				
				valor=value;

				this.jButtonTipoDetaNotaCredito.setEnabled(this.conEnabled);
				
				return jButtonTipoDetaNotaCredito;
			}
			
			public TipoDetaNotaCreditoTableCell(Border borderResaltarTipoDetaNotaCredito,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarTipoDetaNotaCredito=borderResaltarTipoDetaNotaCredito;
				this.sTipo="BOTON";
			}
			
			public TipoDetaNotaCreditoTableCell(Border borderResaltarTipoDetaNotaCredito,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarTipoDetaNotaCredito,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					TipoDetaNotaCredito tipodetanotacredito=((TipoDetaNotaCredito)this.jComboBoxTipoDetaNotaCredito.getSelectedItem());
					
					if(tipodetanotacredito!=null) {
						idActual=tipodetanotacredito.getId();
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
			public JComboBox getjComboBoxTipoDetaNotaCredito() {
				return this.jComboBoxTipoDetaNotaCredito;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxTipoDetaNotaCredito(JComboBox jComboBoxTipoDetaNotaCredito) {
				this.jComboBoxTipoDetaNotaCredito = jComboBoxTipoDetaNotaCredito;
			}
			
			public List<TipoDetaNotaCredito> gettipodetanotacreditosForeignKey() {
				return this.tipodetanotacreditosForeignKey;
			}
		
			public void settipodetanotacreditosForeignKey(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKey) {
				this.tipodetanotacreditosForeignKey = tipodetanotacreditosForeignKey;
			}
			
			public List<TipoDetaNotaCredito> gettipodetanotacreditosForeignKeyActual() {
				return this.tipodetanotacreditosForeignKeyActual;
			}
		
			public void settipodetanotacreditosForeignKeyActual(List<TipoDetaNotaCredito> tipodetanotacreditosForeignKeyActual) {
				this.tipodetanotacreditosForeignKeyActual = tipodetanotacreditosForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarTipoDetaNotaCreditosForeignKey() {			
				this.jComboBoxTipoDetaNotaCredito.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(TipoDetaNotaCredito tipodetanotacredito:this.tipodetanotacreditosForeignKey) {
						this.jComboBoxTipoDetaNotaCredito.addItem(tipodetanotacredito);
					}
				} else {
					for(TipoDetaNotaCredito tipodetanotacredito:this.tipodetanotacreditosForeignKeyActual) {
						this.jComboBoxTipoDetaNotaCredito.addItem(tipodetanotacredito);
					}
				}
			}
		}
