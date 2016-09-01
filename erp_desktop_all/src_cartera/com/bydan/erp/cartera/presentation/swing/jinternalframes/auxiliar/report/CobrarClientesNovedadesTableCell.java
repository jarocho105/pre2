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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report;


import java.sql.Time;


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

//import com.bydan.erp.cartera.util.CobrarClientesNovedadesConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesNovedadesParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesNovedadesParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarClientesNovedadesBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarClientesNovedadesJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarClientesNovedadesDetalleFormJInternalFrame;

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
public class CobrarClientesNovedadesTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelCobrarClientesNovedades=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxCobrarClientesNovedades=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey=new ArrayList<CobrarClientesNovedades>();
			protected List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKeyActual=new ArrayList<CobrarClientesNovedades>();
			protected Border borderResaltarCobrarClientesNovedades=null;
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
			protected JButton jButtonCobrarClientesNovedades;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public CobrarClientesNovedadesTableCell() {
				super(new JCheckBoxMe());				
			}

			public CobrarClientesNovedadesTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public CobrarClientesNovedadesTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public CobrarClientesNovedadesTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public CobrarClientesNovedadesTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public CobrarClientesNovedadesTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxCobrarClientesNovedades=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public CobrarClientesNovedadesTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public CobrarClientesNovedadesTableCell(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cobrarclientesnovedadessForeignKey=cobrarclientesnovedadessForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public CobrarClientesNovedadesTableCell(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(cobrarclientesnovedadessForeignKey,jInternalFrameBase,true);
			}
			
			public CobrarClientesNovedadesTableCell(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey,Border borderResaltarCobrarClientesNovedades,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cobrarclientesnovedadessForeignKey=cobrarclientesnovedadessForeignKey;
				this.borderResaltarCobrarClientesNovedades=borderResaltarCobrarClientesNovedades;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public CobrarClientesNovedadesTableCell(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey,Border borderResaltarCobrarClientesNovedades,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cobrarclientesnovedadessForeignKey=cobrarclientesnovedadessForeignKey;
				this.borderResaltarCobrarClientesNovedades=borderResaltarCobrarClientesNovedades;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public CobrarClientesNovedadesTableCell(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(cobrarclientesnovedadessForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public CobrarClientesNovedadesTableCell(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey,Border borderResaltarCobrarClientesNovedades,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.cobrarclientesnovedadessForeignKey=cobrarclientesnovedadessForeignKey;
				this.borderResaltarCobrarClientesNovedades=borderResaltarCobrarClientesNovedades;
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
	
					jLabelCobrarClientesNovedades=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sCobrarClientesNovedadesDescripcion="";
	
					sCobrarClientesNovedadesDescripcion=jInternalFrameBase.getDescripcionFk("CobrarClientesNovedades",table,value,intSelectedRow);
					
					jLabelCobrarClientesNovedades.setText(sCobrarClientesNovedadesDescripcion);						
					
					if(this.borderResaltarCobrarClientesNovedades!=null) {
						jLabelCobrarClientesNovedades.setBorder(this.borderResaltarCobrarClientesNovedades);
					}
	
					jLabelCobrarClientesNovedades.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelCobrarClientesNovedades.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelCobrarClientesNovedades.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelCobrarClientesNovedades.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelCobrarClientesNovedades.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelCobrarClientesNovedades, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelCobrarClientesNovedades;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxCobrarClientesNovedades=new JComboBoxMe();

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
					
					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxCobrarClientesNovedades.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(CobrarClientesNovedades cobrarclientesnovedades:this.cobrarclientesnovedadessForeignKey) {
								this.jComboBoxCobrarClientesNovedades.addItem(cobrarclientesnovedades);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(CobrarClientesNovedades cobrarclientesnovedades:this.cobrarclientesnovedadessForeignKeyActual) {
									this.jComboBoxCobrarClientesNovedades.addItem(cobrarclientesnovedades);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxCobrarClientesNovedades.setSelectedItem(perfil.getCobrarClientesNovedades());

					//setActualCobrarClientesNovedadesForeignKey((Long)value,false,"Formulario");

					CobrarClientesNovedadesBeanSwingJInternalFrame.setActualComboBoxCobrarClientesNovedadesGenerico((Long)value,this.jComboBoxCobrarClientesNovedades,this.cobrarclientesnovedadessForeignKey);
					
					if(this.conHotKeys) {
						CobrarClientesNovedadesBeanSwingJInternalFrame.setHotKeysComboBoxCobrarClientesNovedadesGenerico(this.jComboBoxCobrarClientesNovedades,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualCobrarClientesNovedadesForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxCobrarClientesNovedades.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxCobrarClientesNovedades.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxCobrarClientesNovedades, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxCobrarClientesNovedades;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonCobrarClientesNovedades =new JButtonMe((row+1)+"-Cobrar Clientes Novedades");

				jButtonCobrarClientesNovedades.setToolTipText((row+1)+"-Cobrar Clientes Novedades");

				if(this.borderResaltarCobrarClientesNovedades!=null) {
					jButtonCobrarClientesNovedades.setBorder(this.borderResaltarCobrarClientesNovedades);
				}

				jButtonCobrarClientesNovedades.setOpaque(true);
				jButtonCobrarClientesNovedades.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonCobrarClientesNovedades.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonCobrarClientesNovedades.setEnabled(this.conEnabled);
				
				return jButtonCobrarClientesNovedades;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonCobrarClientesNovedades=new JButtonMe((row+1)+"-Cobrar Clientes Novedades");
				jButtonCobrarClientesNovedades.setToolTipText((row+1)+"-Cobrar Clientes Novedades");

				if(this.borderResaltarCobrarClientesNovedades!=null) {
					jButtonCobrarClientesNovedades.setBorder(this.borderResaltarCobrarClientesNovedades);
				}
				
				/*
				jButtonCobrarClientesNovedades.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonCobrarClientesNovedadesActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("CobrarClientesNovedades",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonCobrarClientesNovedades.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","CobrarClientesNovedades",row));
				
				valor=value;

				this.jButtonCobrarClientesNovedades.setEnabled(this.conEnabled);
				
				return jButtonCobrarClientesNovedades;
			}
			
			public CobrarClientesNovedadesTableCell(Border borderResaltarCobrarClientesNovedades,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarCobrarClientesNovedades=borderResaltarCobrarClientesNovedades;
				this.sTipo="BOTON";
			}
			
			public CobrarClientesNovedadesTableCell(Border borderResaltarCobrarClientesNovedades,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarCobrarClientesNovedades,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					CobrarClientesNovedades cobrarclientesnovedades=((CobrarClientesNovedades)this.jComboBoxCobrarClientesNovedades.getSelectedItem());
					
					if(cobrarclientesnovedades!=null) {
						idActual=cobrarclientesnovedades.getId();
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
			public JComboBox getjComboBoxCobrarClientesNovedades() {
				return this.jComboBoxCobrarClientesNovedades;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxCobrarClientesNovedades(JComboBox jComboBoxCobrarClientesNovedades) {
				this.jComboBoxCobrarClientesNovedades = jComboBoxCobrarClientesNovedades;
			}
			
			public List<CobrarClientesNovedades> getcobrarclientesnovedadessForeignKey() {
				return this.cobrarclientesnovedadessForeignKey;
			}
		
			public void setcobrarclientesnovedadessForeignKey(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKey) {
				this.cobrarclientesnovedadessForeignKey = cobrarclientesnovedadessForeignKey;
			}
			
			public List<CobrarClientesNovedades> getcobrarclientesnovedadessForeignKeyActual() {
				return this.cobrarclientesnovedadessForeignKeyActual;
			}
		
			public void setcobrarclientesnovedadessForeignKeyActual(List<CobrarClientesNovedades> cobrarclientesnovedadessForeignKeyActual) {
				this.cobrarclientesnovedadessForeignKeyActual = cobrarclientesnovedadessForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarCobrarClientesNovedadessForeignKey() {			
				this.jComboBoxCobrarClientesNovedades.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(CobrarClientesNovedades cobrarclientesnovedades:this.cobrarclientesnovedadessForeignKey) {
						this.jComboBoxCobrarClientesNovedades.addItem(cobrarclientesnovedades);
					}
				} else {
					for(CobrarClientesNovedades cobrarclientesnovedades:this.cobrarclientesnovedadessForeignKeyActual) {
						this.jComboBoxCobrarClientesNovedades.addItem(cobrarclientesnovedades);
					}
				}
			}
		}
