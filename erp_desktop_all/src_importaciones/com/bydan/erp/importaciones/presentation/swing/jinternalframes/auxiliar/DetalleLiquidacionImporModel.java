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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.importaciones.util.DetalleLiquidacionImporConstantesFunciones;
import com.bydan.erp.importaciones.util.DetalleLiquidacionImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.DetalleLiquidacionImporParameterGeneral;

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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.DetalleLiquidacionImporBeanSwingJInternalFrame;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.DetalleLiquidacionImporJInternalFrame;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.DetalleLiquidacionImporDetalleFormJInternalFrame;

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
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleLiquidacionImporModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleLiquidacionImporConstantesFunciones.LABEL_ID
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR
										,DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR
										,DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA
										,DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4
										,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5
										};
	   
	    public List<DetalleLiquidacionImpor> detalleliquidacionimpors;
	  	 
	    //NO SE UTILIZA
	    public DetalleLiquidacionImporModel(List<DetalleLiquidacionImpor> detalleliquidacionimpors,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleliquidacionimpors=detalleliquidacionimpors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleLiquidacionImporModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleliquidacionimpors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleliquidacionimpors.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleliquidacionimpors.get(rowIndex).getId();
				case 2: return this.detalleliquidacionimpors.get(rowIndex).getid_liquidacion_impor();
				case 3: return this.detalleliquidacionimpors.get(rowIndex).getid_empresa();
				case 4: return this.detalleliquidacionimpors.get(rowIndex).getid_sucursal();
				case 5: return this.detalleliquidacionimpors.get(rowIndex).getid_usuario();
				case 6: return this.detalleliquidacionimpors.get(rowIndex).getid_centro_costo();
				case 7: return this.detalleliquidacionimpors.get(rowIndex).getid_costo_gasto_impor();
				case 8: return this.detalleliquidacionimpors.get(rowIndex).getvalor();
				case 9: return this.detalleliquidacionimpors.get(rowIndex).getfecha();
				case 10: return this.detalleliquidacionimpors.get(rowIndex).getreferencia();
				case 11: return this.detalleliquidacionimpors.get(rowIndex).getimpuesto();
				case 12: return this.detalleliquidacionimpors.get(rowIndex).getimpuesto2();
				case 13: return this.detalleliquidacionimpors.get(rowIndex).getimpuesto3();
				case 14: return this.detalleliquidacionimpors.get(rowIndex).getimpuesto4();
				case 15: return this.detalleliquidacionimpors.get(rowIndex).getimpuesto5();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Double.class;
				case 9: return Date.class;
				case 10: return String.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleLiquidacionImpor detalleliquidacionimpor = this.detalleliquidacionimpors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=(DetalleLiquidacionImporBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleliquidacionimpor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleliquidacionimpor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleliquidacionimpor.setid_liquidacion_impor((Long) value);detalleliquidacionimpor.setliquidacionimpor_descripcion(detalleliquidacionimporBeanSwingJInternalFrame.getActualLiquidacionImporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleliquidacionimpor.setid_empresa((Long) value);detalleliquidacionimpor.setempresa_descripcion(detalleliquidacionimporBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleliquidacionimpor.setid_sucursal((Long) value);detalleliquidacionimpor.setsucursal_descripcion(detalleliquidacionimporBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleliquidacionimpor.setid_usuario((Long) value);detalleliquidacionimpor.setusuario_descripcion(detalleliquidacionimporBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleliquidacionimpor.setid_centro_costo((Long) value);detalleliquidacionimpor.setcentrocosto_descripcion(detalleliquidacionimporBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleliquidacionimpor.setid_costo_gasto_impor((Long) value);detalleliquidacionimpor.setcostogastoimpor_descripcion(detalleliquidacionimporBeanSwingJInternalFrame.getActualCostoGastoImporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleliquidacionimpor.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleliquidacionimpor.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleliquidacionimpor.setreferencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleliquidacionimpor.setimpuesto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleliquidacionimpor.setimpuesto2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleliquidacionimpor.setimpuesto3((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleliquidacionimpor.setimpuesto4((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleliquidacionimpor.setimpuesto5((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleLiquidacionImporModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private DetalleLiquidacionImporDetalleFormJInternalFrame detalleliquidacionimporJInternalFrame=null;
		
		public DetalleLiquidacionImporModel(DetalleLiquidacionImporDetalleFormJInternalFrame detalleliquidacionimporJInternalFrame) {
			this.detalleliquidacionimporJInternalFrame=detalleliquidacionimporJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonActualizarToolBarDetalleLiquidacionImpor();
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.getjButtonActualizarToolBarDetalleLiquidacionImpor())) {
				componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonEliminarToolBarDetalleLiquidacionImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.getjButtonEliminarToolBarDetalleLiquidacionImpor())) {
				componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonCancelarToolBarDetalleLiquidacionImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.getjButtonCancelarToolBarDetalleLiquidacionImpor())) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto5DetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jButtonEliminarDetalleLiquidacionImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jButtonEliminarDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jButtonActualizarDetalleLiquidacionImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jButtonActualizarDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jButtonCancelarDetalleLiquidacionImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_empresaDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_empresaDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_sucursalDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_sucursalDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_usuarioDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_usuarioDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_centro_costoDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_centro_costoDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldvalorDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldvalorDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jDateChooserfechaDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jDateChooserfechaDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldreferenciaDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldreferenciaDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuestoDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuestoDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto2DetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto2DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto3DetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto3DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto4DetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto4DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto5DetalleLiquidacionImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonActualizarToolBarDetalleLiquidacionImpor();
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.getjButtonEliminarToolBarDetalleLiquidacionImpor())) {
				componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonActualizarToolBarDetalleLiquidacionImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.getjButtonCancelarToolBarDetalleLiquidacionImpor())) {
				componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonEliminarToolBarDetalleLiquidacionImpor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor)) {
				
				componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonCancelarToolBarDetalleLiquidacionImpor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto5DetalleLiquidacionImpor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jButtonEliminarDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jButtonActualizarDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jButtonEliminarDetalleLiquidacionImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jButtonCancelarDetalleLiquidacionImpor)) {
				componentTab=this.detalleliquidacionimporJInternalFrame.jButtonActualizarDetalleLiquidacionImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_empresaDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_sucursalDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_empresaDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_usuarioDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_sucursalDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_centro_costoDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_usuarioDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_centro_costoDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldvalorDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jDateChooserfechaDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldvalorDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldreferenciaDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jDateChooserfechaDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuestoDetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldreferenciaDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto2DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuestoDetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto3DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto2DetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto4DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto3DetalleLiquidacionImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto5DetalleLiquidacionImpor)) {
			componentTab=this.detalleliquidacionimporJInternalFrame.jTextFieldimpuesto4DetalleLiquidacionImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonActualizarToolBarDetalleLiquidacionImpor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonActualizarToolBarDetalleLiquidacionImpor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleliquidacionimporJInternalFrame.getjButtonCancelarToolBarDetalleLiquidacionImpor();
			
			
			return componentTab;		
		}
		
		public DetalleLiquidacionImporDetalleFormJInternalFrame getdetalleliquidacionimporJInternalFrame() {
			return this.detalleliquidacionimporJInternalFrame;
		}
		
		public void setdetalleliquidacionimporJInternalFrame(DetalleLiquidacionImporDetalleFormJInternalFrame detalleliquidacionimporJInternalFrame) {
			this.detalleliquidacionimporJInternalFrame=detalleliquidacionimporJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
