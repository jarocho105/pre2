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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoParameterGeneral;

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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.TipoEstadoActivoFijoBeanSwingJInternalFrame;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.TipoEstadoActivoFijoJInternalFrame;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.TipoEstadoActivoFijoDetalleFormJInternalFrame;

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
public class TipoEstadoActivoFijoTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelTipoEstadoActivoFijo=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxTipoEstadoActivoFijo=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey=new ArrayList<TipoEstadoActivoFijo>();
			protected List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKeyActual=new ArrayList<TipoEstadoActivoFijo>();
			protected Border borderResaltarTipoEstadoActivoFijo=null;
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
			protected JButton jButtonTipoEstadoActivoFijo;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public TipoEstadoActivoFijoTableCell() {
				super(new JCheckBoxMe());				
			}

			public TipoEstadoActivoFijoTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public TipoEstadoActivoFijoTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public TipoEstadoActivoFijoTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public TipoEstadoActivoFijoTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public TipoEstadoActivoFijoTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxTipoEstadoActivoFijo=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public TipoEstadoActivoFijoTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public TipoEstadoActivoFijoTableCell(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipoestadoactivofijosForeignKey=tipoestadoactivofijosForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public TipoEstadoActivoFijoTableCell(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(tipoestadoactivofijosForeignKey,jInternalFrameBase,true);
			}
			
			public TipoEstadoActivoFijoTableCell(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey,Border borderResaltarTipoEstadoActivoFijo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipoestadoactivofijosForeignKey=tipoestadoactivofijosForeignKey;
				this.borderResaltarTipoEstadoActivoFijo=borderResaltarTipoEstadoActivoFijo;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public TipoEstadoActivoFijoTableCell(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey,Border borderResaltarTipoEstadoActivoFijo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.tipoestadoactivofijosForeignKey=tipoestadoactivofijosForeignKey;
				this.borderResaltarTipoEstadoActivoFijo=borderResaltarTipoEstadoActivoFijo;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public TipoEstadoActivoFijoTableCell(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(tipoestadoactivofijosForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public TipoEstadoActivoFijoTableCell(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey,Border borderResaltarTipoEstadoActivoFijo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.tipoestadoactivofijosForeignKey=tipoestadoactivofijosForeignKey;
				this.borderResaltarTipoEstadoActivoFijo=borderResaltarTipoEstadoActivoFijo;
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
	
					jLabelTipoEstadoActivoFijo=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sTipoEstadoActivoFijoDescripcion="";
	
					sTipoEstadoActivoFijoDescripcion=jInternalFrameBase.getDescripcionFk("TipoEstadoActivoFijo",table,value,intSelectedRow);
					
					jLabelTipoEstadoActivoFijo.setText(sTipoEstadoActivoFijoDescripcion);						
					
					if(this.borderResaltarTipoEstadoActivoFijo!=null) {
						jLabelTipoEstadoActivoFijo.setBorder(this.borderResaltarTipoEstadoActivoFijo);
					}
	
					jLabelTipoEstadoActivoFijo.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelTipoEstadoActivoFijo.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelTipoEstadoActivoFijo.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelTipoEstadoActivoFijo.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelTipoEstadoActivoFijo.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelTipoEstadoActivoFijo, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelTipoEstadoActivoFijo;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxTipoEstadoActivoFijo=new JComboBoxMe();

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
					
					if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxTipoEstadoActivoFijo.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(TipoEstadoActivoFijo tipoestadoactivofijo:this.tipoestadoactivofijosForeignKey) {
								this.jComboBoxTipoEstadoActivoFijo.addItem(tipoestadoactivofijo);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(TipoEstadoActivoFijo tipoestadoactivofijo:this.tipoestadoactivofijosForeignKeyActual) {
									this.jComboBoxTipoEstadoActivoFijo.addItem(tipoestadoactivofijo);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxTipoEstadoActivoFijo.setSelectedItem(perfil.getTipoEstadoActivoFijo());

					//setActualTipoEstadoActivoFijoForeignKey((Long)value,false,"Formulario");

					TipoEstadoActivoFijoBeanSwingJInternalFrame.setActualComboBoxTipoEstadoActivoFijoGenerico((Long)value,this.jComboBoxTipoEstadoActivoFijo,this.tipoestadoactivofijosForeignKey);
					
					if(this.conHotKeys) {
						TipoEstadoActivoFijoBeanSwingJInternalFrame.setHotKeysComboBoxTipoEstadoActivoFijoGenerico(this.jComboBoxTipoEstadoActivoFijo,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualTipoEstadoActivoFijoForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxTipoEstadoActivoFijo.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxTipoEstadoActivoFijo.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxTipoEstadoActivoFijo, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxTipoEstadoActivoFijo;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonTipoEstadoActivoFijo =new JButtonMe((row+1)+"-Tipo Estado Activo Fijo");

				jButtonTipoEstadoActivoFijo.setToolTipText((row+1)+"-Tipo Estado Activo Fijo");

				if(this.borderResaltarTipoEstadoActivoFijo!=null) {
					jButtonTipoEstadoActivoFijo.setBorder(this.borderResaltarTipoEstadoActivoFijo);
				}

				jButtonTipoEstadoActivoFijo.setOpaque(true);
				jButtonTipoEstadoActivoFijo.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonTipoEstadoActivoFijo.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonTipoEstadoActivoFijo.setEnabled(this.conEnabled);
				
				return jButtonTipoEstadoActivoFijo;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonTipoEstadoActivoFijo=new JButtonMe((row+1)+"-Tipo Estado Activo Fijo");
				jButtonTipoEstadoActivoFijo.setToolTipText((row+1)+"-Tipo Estado Activo Fijo");

				if(this.borderResaltarTipoEstadoActivoFijo!=null) {
					jButtonTipoEstadoActivoFijo.setBorder(this.borderResaltarTipoEstadoActivoFijo);
				}
				
				/*
				jButtonTipoEstadoActivoFijo.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonTipoEstadoActivoFijoActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("TipoEstadoActivoFijo",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","TipoEstadoActivoFijo",row));
				
				valor=value;

				this.jButtonTipoEstadoActivoFijo.setEnabled(this.conEnabled);
				
				return jButtonTipoEstadoActivoFijo;
			}
			
			public TipoEstadoActivoFijoTableCell(Border borderResaltarTipoEstadoActivoFijo,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarTipoEstadoActivoFijo=borderResaltarTipoEstadoActivoFijo;
				this.sTipo="BOTON";
			}
			
			public TipoEstadoActivoFijoTableCell(Border borderResaltarTipoEstadoActivoFijo,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarTipoEstadoActivoFijo,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					TipoEstadoActivoFijo tipoestadoactivofijo=((TipoEstadoActivoFijo)this.jComboBoxTipoEstadoActivoFijo.getSelectedItem());
					
					if(tipoestadoactivofijo!=null) {
						idActual=tipoestadoactivofijo.getId();
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
			public JComboBox getjComboBoxTipoEstadoActivoFijo() {
				return this.jComboBoxTipoEstadoActivoFijo;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxTipoEstadoActivoFijo(JComboBox jComboBoxTipoEstadoActivoFijo) {
				this.jComboBoxTipoEstadoActivoFijo = jComboBoxTipoEstadoActivoFijo;
			}
			
			public List<TipoEstadoActivoFijo> gettipoestadoactivofijosForeignKey() {
				return this.tipoestadoactivofijosForeignKey;
			}
		
			public void settipoestadoactivofijosForeignKey(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKey) {
				this.tipoestadoactivofijosForeignKey = tipoestadoactivofijosForeignKey;
			}
			
			public List<TipoEstadoActivoFijo> gettipoestadoactivofijosForeignKeyActual() {
				return this.tipoestadoactivofijosForeignKeyActual;
			}
		
			public void settipoestadoactivofijosForeignKeyActual(List<TipoEstadoActivoFijo> tipoestadoactivofijosForeignKeyActual) {
				this.tipoestadoactivofijosForeignKeyActual = tipoestadoactivofijosForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarTipoEstadoActivoFijosForeignKey() {			
				this.jComboBoxTipoEstadoActivoFijo.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(TipoEstadoActivoFijo tipoestadoactivofijo:this.tipoestadoactivofijosForeignKey) {
						this.jComboBoxTipoEstadoActivoFijo.addItem(tipoestadoactivofijo);
					}
				} else {
					for(TipoEstadoActivoFijo tipoestadoactivofijo:this.tipoestadoactivofijosForeignKeyActual) {
						this.jComboBoxTipoEstadoActivoFijo.addItem(tipoestadoactivofijo);
					}
				}
			}
		}
