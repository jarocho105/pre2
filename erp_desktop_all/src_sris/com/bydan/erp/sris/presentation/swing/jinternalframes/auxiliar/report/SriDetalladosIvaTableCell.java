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
package com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.sris.util.SriDetalladosIvaConstantesFunciones;
import com.bydan.erp.sris.util.report.SriDetalladosIvaParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriDetalladosIvaParameterGeneral;

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

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriDetalladosIvaBeanSwingJInternalFrame;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriDetalladosIvaJInternalFrame;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriDetalladosIvaDetalleFormJInternalFrame;

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



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SriDetalladosIvaTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelSriDetalladosIva=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxSriDetalladosIva=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<SriDetalladosIva> sridetalladosivasForeignKey=new ArrayList<SriDetalladosIva>();
			protected List<SriDetalladosIva> sridetalladosivasForeignKeyActual=new ArrayList<SriDetalladosIva>();
			protected Border borderResaltarSriDetalladosIva=null;
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
			protected JButton jButtonSriDetalladosIva;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public SriDetalladosIvaTableCell() {
				super(new JCheckBoxMe());				
			}

			public SriDetalladosIvaTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public SriDetalladosIvaTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public SriDetalladosIvaTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public SriDetalladosIvaTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public SriDetalladosIvaTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxSriDetalladosIva=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public SriDetalladosIvaTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public SriDetalladosIvaTableCell(List<SriDetalladosIva> sridetalladosivasForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.sridetalladosivasForeignKey=sridetalladosivasForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public SriDetalladosIvaTableCell(List<SriDetalladosIva> sridetalladosivasForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(sridetalladosivasForeignKey,jInternalFrameBase,true);
			}
			
			public SriDetalladosIvaTableCell(List<SriDetalladosIva> sridetalladosivasForeignKey,Border borderResaltarSriDetalladosIva,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.sridetalladosivasForeignKey=sridetalladosivasForeignKey;
				this.borderResaltarSriDetalladosIva=borderResaltarSriDetalladosIva;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public SriDetalladosIvaTableCell(List<SriDetalladosIva> sridetalladosivasForeignKey,Border borderResaltarSriDetalladosIva,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.sridetalladosivasForeignKey=sridetalladosivasForeignKey;
				this.borderResaltarSriDetalladosIva=borderResaltarSriDetalladosIva;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public SriDetalladosIvaTableCell(List<SriDetalladosIva> sridetalladosivasForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(sridetalladosivasForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public SriDetalladosIvaTableCell(List<SriDetalladosIva> sridetalladosivasForeignKey,Border borderResaltarSriDetalladosIva,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.sridetalladosivasForeignKey=sridetalladosivasForeignKey;
				this.borderResaltarSriDetalladosIva=borderResaltarSriDetalladosIva;
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
	
					jLabelSriDetalladosIva=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sSriDetalladosIvaDescripcion="";
	
					sSriDetalladosIvaDescripcion=jInternalFrameBase.getDescripcionFk("SriDetalladosIva",table,value,intSelectedRow);
					
					jLabelSriDetalladosIva.setText(sSriDetalladosIvaDescripcion);						
					
					if(this.borderResaltarSriDetalladosIva!=null) {
						jLabelSriDetalladosIva.setBorder(this.borderResaltarSriDetalladosIva);
					}
	
					jLabelSriDetalladosIva.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelSriDetalladosIva.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelSriDetalladosIva.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelSriDetalladosIva.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelSriDetalladosIva.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelSriDetalladosIva, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelSriDetalladosIva;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxSriDetalladosIva=new JComboBoxMe();

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
					
					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxSriDetalladosIva.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(SriDetalladosIva sridetalladosiva:this.sridetalladosivasForeignKey) {
								this.jComboBoxSriDetalladosIva.addItem(sridetalladosiva);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(SriDetalladosIva sridetalladosiva:this.sridetalladosivasForeignKeyActual) {
									this.jComboBoxSriDetalladosIva.addItem(sridetalladosiva);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxSriDetalladosIva.setSelectedItem(perfil.getSriDetalladosIva());

					//setActualSriDetalladosIvaForeignKey((Long)value,false,"Formulario");

					SriDetalladosIvaBeanSwingJInternalFrame.setActualComboBoxSriDetalladosIvaGenerico((Long)value,this.jComboBoxSriDetalladosIva,this.sridetalladosivasForeignKey);
					
					if(this.conHotKeys) {
						SriDetalladosIvaBeanSwingJInternalFrame.setHotKeysComboBoxSriDetalladosIvaGenerico(this.jComboBoxSriDetalladosIva,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualSriDetalladosIvaForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxSriDetalladosIva.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxSriDetalladosIva.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxSriDetalladosIva, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxSriDetalladosIva;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonSriDetalladosIva =new JButtonMe((row+1)+"-Sri Detallados Iva");

				jButtonSriDetalladosIva.setToolTipText((row+1)+"-Sri Detallados Iva");

				if(this.borderResaltarSriDetalladosIva!=null) {
					jButtonSriDetalladosIva.setBorder(this.borderResaltarSriDetalladosIva);
				}

				jButtonSriDetalladosIva.setOpaque(true);
				jButtonSriDetalladosIva.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonSriDetalladosIva.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonSriDetalladosIva.setEnabled(this.conEnabled);
				
				return jButtonSriDetalladosIva;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonSriDetalladosIva=new JButtonMe((row+1)+"-Sri Detallados Iva");
				jButtonSriDetalladosIva.setToolTipText((row+1)+"-Sri Detallados Iva");

				if(this.borderResaltarSriDetalladosIva!=null) {
					jButtonSriDetalladosIva.setBorder(this.borderResaltarSriDetalladosIva);
				}
				
				/*
				jButtonSriDetalladosIva.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonSriDetalladosIvaActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("SriDetalladosIva",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonSriDetalladosIva.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","SriDetalladosIva",row));
				
				valor=value;

				this.jButtonSriDetalladosIva.setEnabled(this.conEnabled);
				
				return jButtonSriDetalladosIva;
			}
			
			public SriDetalladosIvaTableCell(Border borderResaltarSriDetalladosIva,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarSriDetalladosIva=borderResaltarSriDetalladosIva;
				this.sTipo="BOTON";
			}
			
			public SriDetalladosIvaTableCell(Border borderResaltarSriDetalladosIva,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarSriDetalladosIva,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					SriDetalladosIva sridetalladosiva=((SriDetalladosIva)this.jComboBoxSriDetalladosIva.getSelectedItem());
					
					if(sridetalladosiva!=null) {
						idActual=sridetalladosiva.getId();
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
			public JComboBox getjComboBoxSriDetalladosIva() {
				return this.jComboBoxSriDetalladosIva;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxSriDetalladosIva(JComboBox jComboBoxSriDetalladosIva) {
				this.jComboBoxSriDetalladosIva = jComboBoxSriDetalladosIva;
			}
			
			public List<SriDetalladosIva> getsridetalladosivasForeignKey() {
				return this.sridetalladosivasForeignKey;
			}
		
			public void setsridetalladosivasForeignKey(List<SriDetalladosIva> sridetalladosivasForeignKey) {
				this.sridetalladosivasForeignKey = sridetalladosivasForeignKey;
			}
			
			public List<SriDetalladosIva> getsridetalladosivasForeignKeyActual() {
				return this.sridetalladosivasForeignKeyActual;
			}
		
			public void setsridetalladosivasForeignKeyActual(List<SriDetalladosIva> sridetalladosivasForeignKeyActual) {
				this.sridetalladosivasForeignKeyActual = sridetalladosivasForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarSriDetalladosIvasForeignKey() {			
				this.jComboBoxSriDetalladosIva.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(SriDetalladosIva sridetalladosiva:this.sridetalladosivasForeignKey) {
						this.jComboBoxSriDetalladosIva.addItem(sridetalladosiva);
					}
				} else {
					for(SriDetalladosIva sridetalladosiva:this.sridetalladosivasForeignKeyActual) {
						this.jComboBoxSriDetalladosIva.addItem(sridetalladosiva);
					}
				}
			}
		}
