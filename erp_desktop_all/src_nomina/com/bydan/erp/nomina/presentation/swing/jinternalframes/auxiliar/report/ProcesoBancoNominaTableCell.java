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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.nomina.util.ProcesoBancoNominaConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoBancoNominaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoBancoNominaParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.report.ProcesoBancoNominaBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.report.ProcesoBancoNominaJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.report.ProcesoBancoNominaDetalleFormJInternalFrame;

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



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.nomina.util.*;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoBancoNominaTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelProcesoBancoNomina=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxProcesoBancoNomina=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<ProcesoBancoNomina> procesobanconominasForeignKey=new ArrayList<ProcesoBancoNomina>();
			protected List<ProcesoBancoNomina> procesobanconominasForeignKeyActual=new ArrayList<ProcesoBancoNomina>();
			protected Border borderResaltarProcesoBancoNomina=null;
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
			protected JButton jButtonProcesoBancoNomina;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public ProcesoBancoNominaTableCell() {
				super(new JCheckBoxMe());				
			}

			public ProcesoBancoNominaTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public ProcesoBancoNominaTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public ProcesoBancoNominaTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public ProcesoBancoNominaTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public ProcesoBancoNominaTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxProcesoBancoNomina=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public ProcesoBancoNominaTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public ProcesoBancoNominaTableCell(List<ProcesoBancoNomina> procesobanconominasForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.procesobanconominasForeignKey=procesobanconominasForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public ProcesoBancoNominaTableCell(List<ProcesoBancoNomina> procesobanconominasForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(procesobanconominasForeignKey,jInternalFrameBase,true);
			}
			
			public ProcesoBancoNominaTableCell(List<ProcesoBancoNomina> procesobanconominasForeignKey,Border borderResaltarProcesoBancoNomina,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.procesobanconominasForeignKey=procesobanconominasForeignKey;
				this.borderResaltarProcesoBancoNomina=borderResaltarProcesoBancoNomina;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public ProcesoBancoNominaTableCell(List<ProcesoBancoNomina> procesobanconominasForeignKey,Border borderResaltarProcesoBancoNomina,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.procesobanconominasForeignKey=procesobanconominasForeignKey;
				this.borderResaltarProcesoBancoNomina=borderResaltarProcesoBancoNomina;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public ProcesoBancoNominaTableCell(List<ProcesoBancoNomina> procesobanconominasForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(procesobanconominasForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public ProcesoBancoNominaTableCell(List<ProcesoBancoNomina> procesobanconominasForeignKey,Border borderResaltarProcesoBancoNomina,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.procesobanconominasForeignKey=procesobanconominasForeignKey;
				this.borderResaltarProcesoBancoNomina=borderResaltarProcesoBancoNomina;
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
	
					jLabelProcesoBancoNomina=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sProcesoBancoNominaDescripcion="";
	
					sProcesoBancoNominaDescripcion=jInternalFrameBase.getDescripcionFk("ProcesoBancoNomina",table,value,intSelectedRow);
					
					jLabelProcesoBancoNomina.setText(sProcesoBancoNominaDescripcion);						
					
					if(this.borderResaltarProcesoBancoNomina!=null) {
						jLabelProcesoBancoNomina.setBorder(this.borderResaltarProcesoBancoNomina);
					}
	
					jLabelProcesoBancoNomina.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelProcesoBancoNomina.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelProcesoBancoNomina.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelProcesoBancoNomina.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelProcesoBancoNomina.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelProcesoBancoNomina, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelProcesoBancoNomina;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxProcesoBancoNomina=new JComboBoxMe();

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
					
					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxProcesoBancoNomina.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(ProcesoBancoNomina procesobanconomina:this.procesobanconominasForeignKey) {
								this.jComboBoxProcesoBancoNomina.addItem(procesobanconomina);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(ProcesoBancoNomina procesobanconomina:this.procesobanconominasForeignKeyActual) {
									this.jComboBoxProcesoBancoNomina.addItem(procesobanconomina);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxProcesoBancoNomina.setSelectedItem(perfil.getProcesoBancoNomina());

					//setActualProcesoBancoNominaForeignKey((Long)value,false,"Formulario");

					ProcesoBancoNominaBeanSwingJInternalFrame.setActualComboBoxProcesoBancoNominaGenerico((Long)value,this.jComboBoxProcesoBancoNomina,this.procesobanconominasForeignKey);
					
					if(this.conHotKeys) {
						ProcesoBancoNominaBeanSwingJInternalFrame.setHotKeysComboBoxProcesoBancoNominaGenerico(this.jComboBoxProcesoBancoNomina,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualProcesoBancoNominaForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxProcesoBancoNomina.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxProcesoBancoNomina.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxProcesoBancoNomina, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxProcesoBancoNomina;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonProcesoBancoNomina =new JButtonMe((row+1)+"-Proceso Banco Nomina");

				jButtonProcesoBancoNomina.setToolTipText((row+1)+"-Proceso Banco Nomina");

				if(this.borderResaltarProcesoBancoNomina!=null) {
					jButtonProcesoBancoNomina.setBorder(this.borderResaltarProcesoBancoNomina);
				}

				jButtonProcesoBancoNomina.setOpaque(true);
				jButtonProcesoBancoNomina.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonProcesoBancoNomina.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonProcesoBancoNomina.setEnabled(this.conEnabled);
				
				return jButtonProcesoBancoNomina;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonProcesoBancoNomina=new JButtonMe((row+1)+"-Proceso Banco Nomina");
				jButtonProcesoBancoNomina.setToolTipText((row+1)+"-Proceso Banco Nomina");

				if(this.borderResaltarProcesoBancoNomina!=null) {
					jButtonProcesoBancoNomina.setBorder(this.borderResaltarProcesoBancoNomina);
				}
				
				/*
				jButtonProcesoBancoNomina.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonProcesoBancoNominaActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("ProcesoBancoNomina",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonProcesoBancoNomina.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","ProcesoBancoNomina",row));
				
				valor=value;

				this.jButtonProcesoBancoNomina.setEnabled(this.conEnabled);
				
				return jButtonProcesoBancoNomina;
			}
			
			public ProcesoBancoNominaTableCell(Border borderResaltarProcesoBancoNomina,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarProcesoBancoNomina=borderResaltarProcesoBancoNomina;
				this.sTipo="BOTON";
			}
			
			public ProcesoBancoNominaTableCell(Border borderResaltarProcesoBancoNomina,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarProcesoBancoNomina,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					ProcesoBancoNomina procesobanconomina=((ProcesoBancoNomina)this.jComboBoxProcesoBancoNomina.getSelectedItem());
					
					if(procesobanconomina!=null) {
						idActual=procesobanconomina.getId();
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
			public JComboBox getjComboBoxProcesoBancoNomina() {
				return this.jComboBoxProcesoBancoNomina;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxProcesoBancoNomina(JComboBox jComboBoxProcesoBancoNomina) {
				this.jComboBoxProcesoBancoNomina = jComboBoxProcesoBancoNomina;
			}
			
			public List<ProcesoBancoNomina> getprocesobanconominasForeignKey() {
				return this.procesobanconominasForeignKey;
			}
		
			public void setprocesobanconominasForeignKey(List<ProcesoBancoNomina> procesobanconominasForeignKey) {
				this.procesobanconominasForeignKey = procesobanconominasForeignKey;
			}
			
			public List<ProcesoBancoNomina> getprocesobanconominasForeignKeyActual() {
				return this.procesobanconominasForeignKeyActual;
			}
		
			public void setprocesobanconominasForeignKeyActual(List<ProcesoBancoNomina> procesobanconominasForeignKeyActual) {
				this.procesobanconominasForeignKeyActual = procesobanconominasForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarProcesoBancoNominasForeignKey() {			
				this.jComboBoxProcesoBancoNomina.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(ProcesoBancoNomina procesobanconomina:this.procesobanconominasForeignKey) {
						this.jComboBoxProcesoBancoNomina.addItem(procesobanconomina);
					}
				} else {
					for(ProcesoBancoNomina procesobanconomina:this.procesobanconominasForeignKeyActual) {
						this.jComboBoxProcesoBancoNomina.addItem(procesobanconomina);
					}
				}
			}
		}
