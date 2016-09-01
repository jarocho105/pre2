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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.puntoventa.util.ProcesoCierreCajaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ProcesoCierreCajaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ProcesoCierreCajaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ProcesoCierreCajaBeanSwingJInternalFrame;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ProcesoCierreCajaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ProcesoCierreCajaDetalleFormJInternalFrame;

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
import com.bydan.erp.puntoventa.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.puntoventa.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCierreCajaTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelProcesoCierreCaja=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxProcesoCierreCaja=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<ProcesoCierreCaja> procesocierrecajasForeignKey=new ArrayList<ProcesoCierreCaja>();
			protected List<ProcesoCierreCaja> procesocierrecajasForeignKeyActual=new ArrayList<ProcesoCierreCaja>();
			protected Border borderResaltarProcesoCierreCaja=null;
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
			protected JButton jButtonProcesoCierreCaja;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public ProcesoCierreCajaTableCell() {
				super(new JCheckBoxMe());				
			}

			public ProcesoCierreCajaTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public ProcesoCierreCajaTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public ProcesoCierreCajaTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public ProcesoCierreCajaTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public ProcesoCierreCajaTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxProcesoCierreCaja=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public ProcesoCierreCajaTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public ProcesoCierreCajaTableCell(List<ProcesoCierreCaja> procesocierrecajasForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.procesocierrecajasForeignKey=procesocierrecajasForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public ProcesoCierreCajaTableCell(List<ProcesoCierreCaja> procesocierrecajasForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(procesocierrecajasForeignKey,jInternalFrameBase,true);
			}
			
			public ProcesoCierreCajaTableCell(List<ProcesoCierreCaja> procesocierrecajasForeignKey,Border borderResaltarProcesoCierreCaja,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.procesocierrecajasForeignKey=procesocierrecajasForeignKey;
				this.borderResaltarProcesoCierreCaja=borderResaltarProcesoCierreCaja;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public ProcesoCierreCajaTableCell(List<ProcesoCierreCaja> procesocierrecajasForeignKey,Border borderResaltarProcesoCierreCaja,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.procesocierrecajasForeignKey=procesocierrecajasForeignKey;
				this.borderResaltarProcesoCierreCaja=borderResaltarProcesoCierreCaja;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public ProcesoCierreCajaTableCell(List<ProcesoCierreCaja> procesocierrecajasForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(procesocierrecajasForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public ProcesoCierreCajaTableCell(List<ProcesoCierreCaja> procesocierrecajasForeignKey,Border borderResaltarProcesoCierreCaja,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.procesocierrecajasForeignKey=procesocierrecajasForeignKey;
				this.borderResaltarProcesoCierreCaja=borderResaltarProcesoCierreCaja;
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
	
					jLabelProcesoCierreCaja=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sProcesoCierreCajaDescripcion="";
	
					sProcesoCierreCajaDescripcion=jInternalFrameBase.getDescripcionFk("ProcesoCierreCaja",table,value,intSelectedRow);
					
					jLabelProcesoCierreCaja.setText(sProcesoCierreCajaDescripcion);						
					
					if(this.borderResaltarProcesoCierreCaja!=null) {
						jLabelProcesoCierreCaja.setBorder(this.borderResaltarProcesoCierreCaja);
					}
	
					jLabelProcesoCierreCaja.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelProcesoCierreCaja.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelProcesoCierreCaja.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelProcesoCierreCaja.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelProcesoCierreCaja.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelProcesoCierreCaja, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelProcesoCierreCaja;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxProcesoCierreCaja=new JComboBoxMe();

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
					
					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxProcesoCierreCaja.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(ProcesoCierreCaja procesocierrecaja:this.procesocierrecajasForeignKey) {
								this.jComboBoxProcesoCierreCaja.addItem(procesocierrecaja);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(ProcesoCierreCaja procesocierrecaja:this.procesocierrecajasForeignKeyActual) {
									this.jComboBoxProcesoCierreCaja.addItem(procesocierrecaja);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxProcesoCierreCaja.setSelectedItem(perfil.getProcesoCierreCaja());

					//setActualProcesoCierreCajaForeignKey((Long)value,false,"Formulario");

					ProcesoCierreCajaBeanSwingJInternalFrame.setActualComboBoxProcesoCierreCajaGenerico((Long)value,this.jComboBoxProcesoCierreCaja,this.procesocierrecajasForeignKey);
					
					if(this.conHotKeys) {
						ProcesoCierreCajaBeanSwingJInternalFrame.setHotKeysComboBoxProcesoCierreCajaGenerico(this.jComboBoxProcesoCierreCaja,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualProcesoCierreCajaForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxProcesoCierreCaja.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxProcesoCierreCaja.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxProcesoCierreCaja, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxProcesoCierreCaja;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonProcesoCierreCaja =new JButtonMe((row+1)+"-Proceso Cierre Caja");

				jButtonProcesoCierreCaja.setToolTipText((row+1)+"-Proceso Cierre Caja");

				if(this.borderResaltarProcesoCierreCaja!=null) {
					jButtonProcesoCierreCaja.setBorder(this.borderResaltarProcesoCierreCaja);
				}

				jButtonProcesoCierreCaja.setOpaque(true);
				jButtonProcesoCierreCaja.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonProcesoCierreCaja.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonProcesoCierreCaja.setEnabled(this.conEnabled);
				
				return jButtonProcesoCierreCaja;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonProcesoCierreCaja=new JButtonMe((row+1)+"-Proceso Cierre Caja");
				jButtonProcesoCierreCaja.setToolTipText((row+1)+"-Proceso Cierre Caja");

				if(this.borderResaltarProcesoCierreCaja!=null) {
					jButtonProcesoCierreCaja.setBorder(this.borderResaltarProcesoCierreCaja);
				}
				
				/*
				jButtonProcesoCierreCaja.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonProcesoCierreCajaActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("ProcesoCierreCaja",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonProcesoCierreCaja.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","ProcesoCierreCaja",row));
				
				valor=value;

				this.jButtonProcesoCierreCaja.setEnabled(this.conEnabled);
				
				return jButtonProcesoCierreCaja;
			}
			
			public ProcesoCierreCajaTableCell(Border borderResaltarProcesoCierreCaja,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarProcesoCierreCaja=borderResaltarProcesoCierreCaja;
				this.sTipo="BOTON";
			}
			
			public ProcesoCierreCajaTableCell(Border borderResaltarProcesoCierreCaja,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarProcesoCierreCaja,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					ProcesoCierreCaja procesocierrecaja=((ProcesoCierreCaja)this.jComboBoxProcesoCierreCaja.getSelectedItem());
					
					if(procesocierrecaja!=null) {
						idActual=procesocierrecaja.getId();
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
			public JComboBox getjComboBoxProcesoCierreCaja() {
				return this.jComboBoxProcesoCierreCaja;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxProcesoCierreCaja(JComboBox jComboBoxProcesoCierreCaja) {
				this.jComboBoxProcesoCierreCaja = jComboBoxProcesoCierreCaja;
			}
			
			public List<ProcesoCierreCaja> getprocesocierrecajasForeignKey() {
				return this.procesocierrecajasForeignKey;
			}
		
			public void setprocesocierrecajasForeignKey(List<ProcesoCierreCaja> procesocierrecajasForeignKey) {
				this.procesocierrecajasForeignKey = procesocierrecajasForeignKey;
			}
			
			public List<ProcesoCierreCaja> getprocesocierrecajasForeignKeyActual() {
				return this.procesocierrecajasForeignKeyActual;
			}
		
			public void setprocesocierrecajasForeignKeyActual(List<ProcesoCierreCaja> procesocierrecajasForeignKeyActual) {
				this.procesocierrecajasForeignKeyActual = procesocierrecajasForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarProcesoCierreCajasForeignKey() {			
				this.jComboBoxProcesoCierreCaja.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(ProcesoCierreCaja procesocierrecaja:this.procesocierrecajasForeignKey) {
						this.jComboBoxProcesoCierreCaja.addItem(procesocierrecaja);
					}
				} else {
					for(ProcesoCierreCaja procesocierrecaja:this.procesocierrecajasForeignKeyActual) {
						this.jComboBoxProcesoCierreCaja.addItem(procesocierrecaja);
					}
				}
			}
		}
