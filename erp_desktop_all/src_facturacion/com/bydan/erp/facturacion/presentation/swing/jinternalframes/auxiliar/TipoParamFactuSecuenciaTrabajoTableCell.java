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

import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;








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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TipoParamFactuSecuenciaTrabajoJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame;

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









@SuppressWarnings("unused")
public class TipoParamFactuSecuenciaTrabajoTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelTipoParamFactuSecuenciaTrabajo=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxTipoParamFactuSecuenciaTrabajo=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			protected List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKeyActual=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			protected Border borderResaltarTipoParamFactuSecuenciaTrabajo=null;
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
			protected JButton jButtonTipoParamFactuSecuenciaTrabajo;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public TipoParamFactuSecuenciaTrabajoTableCell() {
				super(new JCheckBoxMe());				
			}

			public TipoParamFactuSecuenciaTrabajoTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public TipoParamFactuSecuenciaTrabajoTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public TipoParamFactuSecuenciaTrabajoTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public TipoParamFactuSecuenciaTrabajoTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxTipoParamFactuSecuenciaTrabajo=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public TipoParamFactuSecuenciaTrabajoTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipoparamfactusecuenciatrabajosForeignKey=tipoparamfactusecuenciatrabajosForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public TipoParamFactuSecuenciaTrabajoTableCell(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(tipoparamfactusecuenciatrabajosForeignKey,jInternalFrameBase,true);
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey,Border borderResaltarTipoParamFactuSecuenciaTrabajo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipoparamfactusecuenciatrabajosForeignKey=tipoparamfactusecuenciatrabajosForeignKey;
				this.borderResaltarTipoParamFactuSecuenciaTrabajo=borderResaltarTipoParamFactuSecuenciaTrabajo;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey,Border borderResaltarTipoParamFactuSecuenciaTrabajo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipoparamfactusecuenciatrabajosForeignKey=tipoparamfactusecuenciatrabajosForeignKey;
				this.borderResaltarTipoParamFactuSecuenciaTrabajo=borderResaltarTipoParamFactuSecuenciaTrabajo;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(tipoparamfactusecuenciatrabajosForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey,Border borderResaltarTipoParamFactuSecuenciaTrabajo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.tipoparamfactusecuenciatrabajosForeignKey=tipoparamfactusecuenciatrabajosForeignKey;
				this.borderResaltarTipoParamFactuSecuenciaTrabajo=borderResaltarTipoParamFactuSecuenciaTrabajo;
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
	
					jLabelTipoParamFactuSecuenciaTrabajo=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sTipoParamFactuSecuenciaTrabajoDescripcion="";
	
					sTipoParamFactuSecuenciaTrabajoDescripcion=jInternalFrameBase.getDescripcionFk("TipoParamFactuSecuenciaTrabajo",table,value,intSelectedRow);
					
					jLabelTipoParamFactuSecuenciaTrabajo.setText(sTipoParamFactuSecuenciaTrabajoDescripcion);						
					
					if(this.borderResaltarTipoParamFactuSecuenciaTrabajo!=null) {
						jLabelTipoParamFactuSecuenciaTrabajo.setBorder(this.borderResaltarTipoParamFactuSecuenciaTrabajo);
					}
	
					jLabelTipoParamFactuSecuenciaTrabajo.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelTipoParamFactuSecuenciaTrabajo.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelTipoParamFactuSecuenciaTrabajo.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelTipoParamFactuSecuenciaTrabajo.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelTipoParamFactuSecuenciaTrabajo.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelTipoParamFactuSecuenciaTrabajo, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelTipoParamFactuSecuenciaTrabajo;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxTipoParamFactuSecuenciaTrabajo=new JComboBoxMe();

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
					
					if(!TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxTipoParamFactuSecuenciaTrabajo.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:this.tipoparamfactusecuenciatrabajosForeignKey) {
								this.jComboBoxTipoParamFactuSecuenciaTrabajo.addItem(tipoparamfactusecuenciatrabajo);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:this.tipoparamfactusecuenciatrabajosForeignKeyActual) {
									this.jComboBoxTipoParamFactuSecuenciaTrabajo.addItem(tipoparamfactusecuenciatrabajo);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxTipoParamFactuSecuenciaTrabajo.setSelectedItem(perfil.getTipoParamFactuSecuenciaTrabajo());

					//setActualTipoParamFactuSecuenciaTrabajoForeignKey((Long)value,false,"Formulario");

					TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame.setActualComboBoxTipoParamFactuSecuenciaTrabajoGenerico((Long)value,this.jComboBoxTipoParamFactuSecuenciaTrabajo,this.tipoparamfactusecuenciatrabajosForeignKey);
					
					if(this.conHotKeys) {
						TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame.setHotKeysComboBoxTipoParamFactuSecuenciaTrabajoGenerico(this.jComboBoxTipoParamFactuSecuenciaTrabajo,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualTipoParamFactuSecuenciaTrabajoForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxTipoParamFactuSecuenciaTrabajo.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxTipoParamFactuSecuenciaTrabajo.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxTipoParamFactuSecuenciaTrabajo, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxTipoParamFactuSecuenciaTrabajo;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonTipoParamFactuSecuenciaTrabajo =new JButtonMe((row+1)+"-Tipo Secuencia Trabajo");

				jButtonTipoParamFactuSecuenciaTrabajo.setToolTipText((row+1)+"-Tipo Secuencia Trabajo");

				if(this.borderResaltarTipoParamFactuSecuenciaTrabajo!=null) {
					jButtonTipoParamFactuSecuenciaTrabajo.setBorder(this.borderResaltarTipoParamFactuSecuenciaTrabajo);
				}

				jButtonTipoParamFactuSecuenciaTrabajo.setOpaque(true);
				jButtonTipoParamFactuSecuenciaTrabajo.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonTipoParamFactuSecuenciaTrabajo.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonTipoParamFactuSecuenciaTrabajo.setEnabled(this.conEnabled);
				
				return jButtonTipoParamFactuSecuenciaTrabajo;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonTipoParamFactuSecuenciaTrabajo=new JButtonMe((row+1)+"-Tipo Secuencia Trabajo");
				jButtonTipoParamFactuSecuenciaTrabajo.setToolTipText((row+1)+"-Tipo Secuencia Trabajo");

				if(this.borderResaltarTipoParamFactuSecuenciaTrabajo!=null) {
					jButtonTipoParamFactuSecuenciaTrabajo.setBorder(this.borderResaltarTipoParamFactuSecuenciaTrabajo);
				}
				
				/*
				jButtonTipoParamFactuSecuenciaTrabajo.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonTipoParamFactuSecuenciaTrabajoActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("TipoParamFactuSecuenciaTrabajo",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","TipoParamFactuSecuenciaTrabajo",row));
				
				valor=value;

				this.jButtonTipoParamFactuSecuenciaTrabajo.setEnabled(this.conEnabled);
				
				return jButtonTipoParamFactuSecuenciaTrabajo;
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(Border borderResaltarTipoParamFactuSecuenciaTrabajo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarTipoParamFactuSecuenciaTrabajo=borderResaltarTipoParamFactuSecuenciaTrabajo;
				this.sTipo="BOTON";
			}
			
			public TipoParamFactuSecuenciaTrabajoTableCell(Border borderResaltarTipoParamFactuSecuenciaTrabajo,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarTipoParamFactuSecuenciaTrabajo,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo=((TipoParamFactuSecuenciaTrabajo)this.jComboBoxTipoParamFactuSecuenciaTrabajo.getSelectedItem());
					
					if(tipoparamfactusecuenciatrabajo!=null) {
						idActual=tipoparamfactusecuenciatrabajo.getId();
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
			public JComboBox getjComboBoxTipoParamFactuSecuenciaTrabajo() {
				return this.jComboBoxTipoParamFactuSecuenciaTrabajo;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxTipoParamFactuSecuenciaTrabajo(JComboBox jComboBoxTipoParamFactuSecuenciaTrabajo) {
				this.jComboBoxTipoParamFactuSecuenciaTrabajo = jComboBoxTipoParamFactuSecuenciaTrabajo;
			}
			
			public List<TipoParamFactuSecuenciaTrabajo> gettipoparamfactusecuenciatrabajosForeignKey() {
				return this.tipoparamfactusecuenciatrabajosForeignKey;
			}
		
			public void settipoparamfactusecuenciatrabajosForeignKey(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKey) {
				this.tipoparamfactusecuenciatrabajosForeignKey = tipoparamfactusecuenciatrabajosForeignKey;
			}
			
			public List<TipoParamFactuSecuenciaTrabajo> gettipoparamfactusecuenciatrabajosForeignKeyActual() {
				return this.tipoparamfactusecuenciatrabajosForeignKeyActual;
			}
		
			public void settipoparamfactusecuenciatrabajosForeignKeyActual(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosForeignKeyActual) {
				this.tipoparamfactusecuenciatrabajosForeignKeyActual = tipoparamfactusecuenciatrabajosForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarTipoParamFactuSecuenciaTrabajosForeignKey() {			
				this.jComboBoxTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:this.tipoparamfactusecuenciatrabajosForeignKey) {
						this.jComboBoxTipoParamFactuSecuenciaTrabajo.addItem(tipoparamfactusecuenciatrabajo);
					}
				} else {
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:this.tipoparamfactusecuenciatrabajosForeignKeyActual) {
						this.jComboBoxTipoParamFactuSecuenciaTrabajo.addItem(tipoparamfactusecuenciatrabajo);
					}
				}
			}
		}
