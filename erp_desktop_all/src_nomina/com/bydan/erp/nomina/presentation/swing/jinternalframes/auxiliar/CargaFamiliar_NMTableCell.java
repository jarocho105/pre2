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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.nomina.util.CargaFamiliar_NMConstantesFunciones;
import com.bydan.erp.nomina.util.CargaFamiliar_NMParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CargaFamiliar_NMParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.CargaFamiliar_NMBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.CargaFamiliar_NMJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.CargaFamiliar_NMDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CargaFamiliar_NMTableCell extends DefaultCellEditor implements TableCellRenderer {
			private static final long serialVersionUID = 1L;
			
			//PARA TABLECELL_FK
			public JInternalFrameBase jInternalFrameBase;
			protected JLabel jLabelCargaFamiliar_NM=new JLabelMe();
			@SuppressWarnings("rawtypes")
			protected JComboBox jComboBoxCargaFamiliar_NM=new JComboBoxMe();
			protected Object valor=new Object();
			protected List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey=new ArrayList<CargaFamiliar_NM>();
			protected List<CargaFamiliar_NM> cargafamiliar_nmsForeignKeyActual=new ArrayList<CargaFamiliar_NM>();
			protected Border borderResaltarCargaFamiliar_NM=null;
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
			protected JButton jButtonCargaFamiliar_NM;
			//PARA TABLECELL FIN
			
			
			//PARA TABLECELL_FK
			public CargaFamiliar_NMTableCell() {
				super(new JCheckBoxMe());				
			}

			public CargaFamiliar_NMTableCell(JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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

			public CargaFamiliar_NMTableCell(JInternalFrameBase jInternalFrameBase) {
				this(jInternalFrameBase,true);
			}
			
			public CargaFamiliar_NMTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
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
			
			public CargaFamiliar_NMTableCell(JCheckBox checkBox,JInternalFrameBase jInternalFrameBase) {
				this(checkBox,jInternalFrameBase,true);
			}
			
			@SuppressWarnings("rawtypes")
			public CargaFamiliar_NMTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(jcComboBox);
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.jComboBoxCargaFamiliar_NM=jcComboBox;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			@SuppressWarnings("rawtypes")
			public CargaFamiliar_NMTableCell(JComboBox jcComboBox,JInternalFrameBase jInternalFrameBase) {
				this(jcComboBox,jInternalFrameBase,true);
			}
			
			public CargaFamiliar_NMTableCell(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cargafamiliar_nmsForeignKey=cargafamiliar_nmsForeignKey;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}

			public CargaFamiliar_NMTableCell(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey,JInternalFrameBase jInternalFrameBase) {
				this(cargafamiliar_nmsForeignKey,jInternalFrameBase,true);
			}
			
			public CargaFamiliar_NMTableCell(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey,Border borderResaltarCargaFamiliar_NM,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cargafamiliar_nmsForeignKey=cargafamiliar_nmsForeignKey;
				this.borderResaltarCargaFamiliar_NM=borderResaltarCargaFamiliar_NM;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public CargaFamiliar_NMTableCell(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey,Border borderResaltarCargaFamiliar_NM,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Integer iTotalRow) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=iTotalRow;
				this.conEnabled=conEnabled;
				this.conHotKeys=false;
				this.sNombreHotKeyAbstractAction="";
				this.sTipoBusqueda="NINGUNO";
				this.rowActual=-1;
				this.cargafamiliar_nmsForeignKey=cargafamiliar_nmsForeignKey;
				this.borderResaltarCargaFamiliar_NM=borderResaltarCargaFamiliar_NM;
				this.jInternalFrameBase=jInternalFrameBase;
				this.sTipo="FK";
			}
			
			public CargaFamiliar_NMTableCell(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey,Border borderResaltar,JInternalFrameBase jInternalFrameBase) {
				this(cargafamiliar_nmsForeignKey,borderResaltar,jInternalFrameBase,true);
			}
			
			public CargaFamiliar_NMTableCell(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey,Border borderResaltarCargaFamiliar_NM,JInternalFrameBase jInternalFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
				super(new JCheckBoxMe());
				
				this.iTotalRow=0;
				this.conEnabled=conEnabled;
				this.conHotKeys=conHotKeys;
				this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
				this.sTipoBusqueda=sTipoBusqueda;
				this.rowActual=-1;
				this.cargafamiliar_nmsForeignKey=cargafamiliar_nmsForeignKey;
				this.borderResaltarCargaFamiliar_NM=borderResaltarCargaFamiliar_NM;
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
	
					jLabelCargaFamiliar_NM=new JLabelMe();
	
					/*
					if(perfil.getIsChanged()) {
						perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
					}
					*/
					
					String sCargaFamiliar_NMDescripcion="";
	
					sCargaFamiliar_NMDescripcion=jInternalFrameBase.getDescripcionFk("CargaFamiliar_NM",table,value,intSelectedRow);
					
					jLabelCargaFamiliar_NM.setText(sCargaFamiliar_NMDescripcion);						
					
					if(this.borderResaltarCargaFamiliar_NM!=null) {
						jLabelCargaFamiliar_NM.setBorder(this.borderResaltarCargaFamiliar_NM);
					}
	
					jLabelCargaFamiliar_NM.setOpaque(true);
					
					//if(row!=(this.iTotalRow-1)) {
					if((this.jInternalFrameBase.conTotales && row != table.getRowCount()-1) || !this.jInternalFrameBase.conTotales) {
						jLabelCargaFamiliar_NM.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
					} else {
						jLabelCargaFamiliar_NM.setBackground(Funciones2.getColorFilaTablaTotales());
					}
					
	
					if(isSelected) {
						jLabelCargaFamiliar_NM.setForeground(FuncionesSwing.getColorSelectedForeground());
					}
	
				} catch(Exception e) {
					;
				}
	
				this.jLabelCargaFamiliar_NM.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldLabel(this.jLabelCargaFamiliar_NM, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jLabelCargaFamiliar_NM;
			}						

			@SuppressWarnings({"unchecked" })
			public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
				this.jComboBoxCargaFamiliar_NM=new JComboBoxMe();

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
					
					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						
					} else {
						this.jComboBoxCargaFamiliar_NM.removeAllItems();
						
						//SIEMPRE <0 , NO USADO POR EL MOMENTO
						//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
						if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
							for(CargaFamiliar_NM cargafamiliar_nm:this.cargafamiliar_nmsForeignKey) {
								this.jComboBoxCargaFamiliar_NM.addItem(cargafamiliar_nm);
							}
						} else {
							if(this.rowActual==row && row>=0) {
								for(CargaFamiliar_NM cargafamiliar_nm:this.cargafamiliar_nmsForeignKeyActual) {
									this.jComboBoxCargaFamiliar_NM.addItem(cargafamiliar_nm);
								}
							}
						}
					}
					
					
					
					//this.jComboBoxCargaFamiliar_NM.setSelectedItem(perfil.getCargaFamiliar_NM());

					//setActualCargaFamiliar_NMForeignKey((Long)value,false,"Formulario");

					CargaFamiliar_NMBeanSwingJInternalFrame.setActualComboBoxCargaFamiliar_NMGenerico((Long)value,this.jComboBoxCargaFamiliar_NM,this.cargafamiliar_nmsForeignKey);
					
					if(this.conHotKeys) {
						CargaFamiliar_NMBeanSwingJInternalFrame.setHotKeysComboBoxCargaFamiliar_NMGenerico(this.jComboBoxCargaFamiliar_NM,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
					}
					
					//NO_FUNCIONA_perfil.setsistema_descripcion(getActualCargaFamiliar_NMForeignKeyDescripcion((Long)value));

					valor=value;
					
					this.jComboBoxCargaFamiliar_NM.setOpaque(true);
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}

				this.jComboBoxCargaFamiliar_NM.setEnabled(this.conEnabled);
				
				FuncionesSwing.setBoldComboBox(this.jComboBoxCargaFamiliar_NM, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
				
				return this.jComboBoxCargaFamiliar_NM;
			}
			
			public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
				jButtonCargaFamiliar_NM =new JButtonMe((row+1)+"-Carga Familiar_ N M");

				jButtonCargaFamiliar_NM.setToolTipText((row+1)+"-Carga Familiar_ N M");

				if(this.borderResaltarCargaFamiliar_NM!=null) {
					jButtonCargaFamiliar_NM.setBorder(this.borderResaltarCargaFamiliar_NM);
				}

				jButtonCargaFamiliar_NM.setOpaque(true);
				jButtonCargaFamiliar_NM.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2());

				if(isSelected) {
					jButtonCargaFamiliar_NM.setForeground(FuncionesSwing.getColorSelectedForeground());
				}
				
				this.jButtonCargaFamiliar_NM.setEnabled(this.conEnabled);
				
				return jButtonCargaFamiliar_NM;
			}

			public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
				jButtonCargaFamiliar_NM=new JButtonMe((row+1)+"-Carga Familiar_ N M");
				jButtonCargaFamiliar_NM.setToolTipText((row+1)+"-Carga Familiar_ N M");

				if(this.borderResaltarCargaFamiliar_NM!=null) {
					jButtonCargaFamiliar_NM.setBorder(this.borderResaltarCargaFamiliar_NM);
				}
				
				/*
				jButtonCargaFamiliar_NM.addActionListener(
					new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							//jButtonCargaFamiliar_NMActionPerformed(evt,row,true,false);
							jInternalFrameBase.jButtonRelacionActionPerformed("CargaFamiliar_NM",evt,row,true,false);
						}
					}
				);
				*/
				
				this.jButtonCargaFamiliar_NM.addActionListener(new ButtonActionListener(this.jInternalFrameBase,"TableCell","CargaFamiliar_NM",row));
				
				valor=value;

				this.jButtonCargaFamiliar_NM.setEnabled(this.conEnabled);
				
				return jButtonCargaFamiliar_NM;
			}
			
			public CargaFamiliar_NMTableCell(Border borderResaltarCargaFamiliar_NM,JInternalFrameBase jInternalFrameBase,Boolean conEnabled) {
				super(new JCheckBoxMe());
				
				this.conEnabled=conEnabled;
				this.jInternalFrameBase=jInternalFrameBase;
				this.borderResaltarCargaFamiliar_NM=borderResaltarCargaFamiliar_NM;
				this.sTipo="BOTON";
			}
			
			public CargaFamiliar_NMTableCell(Border borderResaltarCargaFamiliar_NM,JInternalFrameBase jInternalFrameBase) {
				this(borderResaltarCargaFamiliar_NM,jInternalFrameBase,true);
			}						
			
			
			public Object getCellEditorValue() {
				Object value=new Object();
				Long idActual=0L;
				
				if(sTipo=="FK") {
					CargaFamiliar_NM cargafamiliar_nm=((CargaFamiliar_NM)this.jComboBoxCargaFamiliar_NM.getSelectedItem());
					
					if(cargafamiliar_nm!=null) {
						idActual=cargafamiliar_nm.getId();
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
			public JComboBox getjComboBoxCargaFamiliar_NM() {
				return this.jComboBoxCargaFamiliar_NM;
			}
		
			@SuppressWarnings("rawtypes")
			public void setjComboBoxCargaFamiliar_NM(JComboBox jComboBoxCargaFamiliar_NM) {
				this.jComboBoxCargaFamiliar_NM = jComboBoxCargaFamiliar_NM;
			}
			
			public List<CargaFamiliar_NM> getcargafamiliar_nmsForeignKey() {
				return this.cargafamiliar_nmsForeignKey;
			}
		
			public void setcargafamiliar_nmsForeignKey(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKey) {
				this.cargafamiliar_nmsForeignKey = cargafamiliar_nmsForeignKey;
			}
			
			public List<CargaFamiliar_NM> getcargafamiliar_nmsForeignKeyActual() {
				return this.cargafamiliar_nmsForeignKeyActual;
			}
		
			public void setcargafamiliar_nmsForeignKeyActual(List<CargaFamiliar_NM> cargafamiliar_nmsForeignKeyActual) {
				this.cargafamiliar_nmsForeignKeyActual = cargafamiliar_nmsForeignKeyActual;
			}
			
			@SuppressWarnings("unchecked")
			public void RecargarCargaFamiliar_NMsForeignKey() {			
				this.jComboBoxCargaFamiliar_NM.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0) {													
					for(CargaFamiliar_NM cargafamiliar_nm:this.cargafamiliar_nmsForeignKey) {
						this.jComboBoxCargaFamiliar_NM.addItem(cargafamiliar_nm);
					}
				} else {
					for(CargaFamiliar_NM cargafamiliar_nm:this.cargafamiliar_nmsForeignKeyActual) {
						this.jComboBoxCargaFamiliar_NM.addItem(cargafamiliar_nm);
					}
				}
			}
		}
