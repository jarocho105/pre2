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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.ReferenciaComercialConstantesFunciones;
import com.bydan.erp.cartera.util.ReferenciaComercialParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ReferenciaComercialParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ReferenciaComercialBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ReferenciaComercialJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ReferenciaComercialDetalleFormJInternalFrame;

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

public class ReferenciaComercialModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ReferenciaComercialConstantesFunciones.LABEL_ID
										,ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA
										,ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE
										,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO
										,ReferenciaComercialConstantesFunciones.LABEL_IDPAIS
										,ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD
										,ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA
										,ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE
										,ReferenciaComercialConstantesFunciones.LABEL_CONTACTO
										,ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA
										,ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS
										,ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES
										,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION
										,ReferenciaComercialConstantesFunciones.LABEL_DIRECCION
										,ReferenciaComercialConstantesFunciones.LABEL_TELEFONO
										,ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL
										,ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA
										,ReferenciaComercialConstantesFunciones.LABEL_EMAIL
										,ReferenciaComercialConstantesFunciones.LABEL_MONTO
										,ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO
										};
	   
	    public List<ReferenciaComercial> referenciacomercials;
	  	 
	    //NO SE UTILIZA
	    public ReferenciaComercialModel(List<ReferenciaComercial> referenciacomercials,JInternalFrameBase jInternalFrameBase) {
	    	this.referenciacomercials=referenciacomercials;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ReferenciaComercialModel(JInternalFrameBase jInternalFrameBase) {
	    	this.referenciacomercials=new ArrayList<ReferenciaComercial>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.referenciacomercials.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.referenciacomercials.get(rowIndex).getIsSelected();
	            
				case 1: return this.referenciacomercials.get(rowIndex).getId();
				case 2: return this.referenciacomercials.get(rowIndex).getid_empresa();
				case 3: return this.referenciacomercials.get(rowIndex).getidcliente();
				case 4: return this.referenciacomercials.get(rowIndex).getidvalorclientesectoreconomico();
				case 5: return this.referenciacomercials.get(rowIndex).getid_pais();
				case 6: return this.referenciacomercials.get(rowIndex).getidciudad();
				case 7: return this.referenciacomercials.get(rowIndex).getnombreempresa();
				case 8: return this.referenciacomercials.get(rowIndex).getcodigo_cliente();
				case 9: return this.referenciacomercials.get(rowIndex).getcontacto();
				case 10: return this.referenciacomercials.get(rowIndex).getarticulo_compra();
				case 11: return this.referenciacomercials.get(rowIndex).getnumero_anios();
				case 12: return this.referenciacomercials.get(rowIndex).getnumero_meses();
				case 13: return this.referenciacomercials.get(rowIndex).getid_tipo_valoracion();
				case 14: return this.referenciacomercials.get(rowIndex).getdireccion();
				case 15: return this.referenciacomercials.get(rowIndex).gettelefono();
				case 16: return this.referenciacomercials.get(rowIndex).gettelefonomovil();
				case 17: return this.referenciacomercials.get(rowIndex).gettelefonocodigoarea();
				case 18: return this.referenciacomercials.get(rowIndex).getemail();
				case 19: return this.referenciacomercials.get(rowIndex).getmonto();
				case 20: return this.referenciacomercials.get(rowIndex).getesactivo();	            
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
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Integer.class;
				case 12: return Integer.class;
				case 13: return Long.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return Double.class;
				case 20: return Boolean.class;	            
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
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ReferenciaComercial referenciacomercial = this.referenciacomercials.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame=(ReferenciaComercialBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {referenciacomercial.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {referenciacomercial.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {referenciacomercial.setid_empresa((Long) value);referenciacomercial.setempresa_descripcion(referenciacomercialBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {referenciacomercial.setidcliente((Long) value);referenciacomercial.setcliente_descripcion(referenciacomercialBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {referenciacomercial.setidvalorclientesectoreconomico((Long) value);referenciacomercial.settiposectorecono_descripcion(referenciacomercialBeanSwingJInternalFrame.getActualTipoSectorEconoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {referenciacomercial.setid_pais((Long) value);referenciacomercial.setpais_descripcion(referenciacomercialBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {referenciacomercial.setidciudad((Long) value);referenciacomercial.setciudad_descripcion(referenciacomercialBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {referenciacomercial.setnombreempresa((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {referenciacomercial.setcodigo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {referenciacomercial.setcontacto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {referenciacomercial.setarticulo_compra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {referenciacomercial.setnumero_anios((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {referenciacomercial.setnumero_meses((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {referenciacomercial.setid_tipo_valoracion((Long) value);referenciacomercial.settipovaloracion_descripcion(referenciacomercialBeanSwingJInternalFrame.getActualTipoValoracionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {referenciacomercial.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {referenciacomercial.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {referenciacomercial.settelefonomovil((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {referenciacomercial.settelefonocodigoarea((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {referenciacomercial.setemail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {referenciacomercial.setmonto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {referenciacomercial.setesactivo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ReferenciaComercialModel(JInternalFrameBase jInternalFrameBase) {
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
		private ReferenciaComercialDetalleFormJInternalFrame referenciacomercialJInternalFrame=null;
		
		public ReferenciaComercialModel(ReferenciaComercialDetalleFormJInternalFrame referenciacomercialJInternalFrame) {
			this.referenciacomercialJInternalFrame=referenciacomercialJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.referenciacomercialJInternalFrame.getjButtonActualizarToolBarReferenciaComercial();
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.getjButtonActualizarToolBarReferenciaComercial())) {
				componentTab=this.referenciacomercialJInternalFrame.getjButtonEliminarToolBarReferenciaComercial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.getjButtonEliminarToolBarReferenciaComercial())) {
				componentTab=this.referenciacomercialJInternalFrame.getjButtonCancelarToolBarReferenciaComercial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.getjButtonCancelarToolBarReferenciaComercial())) {
				componentTab=this.referenciacomercialJInternalFrame.jComboBoxid_empresaReferenciaComercial;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jCheckBoxesactivoReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jComboBoxTiposAccionesFormularioReferenciaComercial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxTiposAccionesFormularioReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jButtonEliminarReferenciaComercial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jButtonEliminarReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jButtonActualizarReferenciaComercial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jButtonActualizarReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jButtonCancelarReferenciaComercial;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxid_empresaReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxidclienteReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxidclienteReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxidvalorclientesectoreconomicoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxidvalorclientesectoreconomicoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxid_paisReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxid_paisReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxidciudadReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxidciudadReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreanombreempresaReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreanombreempresaReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldcodigo_clienteReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldcodigo_clienteReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreacontactoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreacontactoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreaarticulo_compraReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreaarticulo_compraReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldnumero_aniosReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldnumero_aniosReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldnumero_mesesReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldnumero_mesesReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxid_tipo_valoracionReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxid_tipo_valoracionReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreadireccionReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreadireccionReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreatelefonoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreatelefonoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreatelefonomovilReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreatelefonomovilReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldtelefonocodigoareaReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldtelefonocodigoareaReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreaemailReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreaemailReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldmontoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldmontoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jCheckBoxesactivoReferenciaComercial;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.referenciacomercialJInternalFrame.getjButtonActualizarToolBarReferenciaComercial();
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.getjButtonEliminarToolBarReferenciaComercial())) {
				componentTab=this.referenciacomercialJInternalFrame.getjButtonActualizarToolBarReferenciaComercial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.getjButtonCancelarToolBarReferenciaComercial())) {
				componentTab=this.referenciacomercialJInternalFrame.getjButtonEliminarToolBarReferenciaComercial();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxid_empresaReferenciaComercial)) {
				
				componentTab=this.referenciacomercialJInternalFrame.getjButtonCancelarToolBarReferenciaComercial();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxTiposAccionesFormularioReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jCheckBoxesactivoReferenciaComercial;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jButtonEliminarReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jComboBoxTiposAccionesFormularioReferenciaComercial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jButtonActualizarReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jButtonEliminarReferenciaComercial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jButtonCancelarReferenciaComercial)) {
				componentTab=this.referenciacomercialJInternalFrame.jButtonActualizarReferenciaComercial;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxidclienteReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxid_empresaReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxidvalorclientesectoreconomicoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxidclienteReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxid_paisReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxidvalorclientesectoreconomicoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxidciudadReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxid_paisReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreanombreempresaReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxidciudadReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldcodigo_clienteReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreanombreempresaReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreacontactoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldcodigo_clienteReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreaarticulo_compraReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreacontactoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldnumero_aniosReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreaarticulo_compraReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldnumero_mesesReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldnumero_aniosReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jComboBoxid_tipo_valoracionReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldnumero_mesesReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreadireccionReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jComboBoxid_tipo_valoracionReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreatelefonoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreadireccionReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreatelefonomovilReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreatelefonoReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldtelefonocodigoareaReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreatelefonomovilReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextAreaemailReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldtelefonocodigoareaReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jTextFieldmontoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextAreaemailReferenciaComercial;
			return componentTab;
		}

		if(component!=null && component.equals(this.referenciacomercialJInternalFrame.jCheckBoxesactivoReferenciaComercial)) {
			componentTab=this.referenciacomercialJInternalFrame.jTextFieldmontoReferenciaComercial;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.referenciacomercialJInternalFrame.getjButtonActualizarToolBarReferenciaComercial();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.referenciacomercialJInternalFrame.getjButtonActualizarToolBarReferenciaComercial();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.referenciacomercialJInternalFrame.getjButtonCancelarToolBarReferenciaComercial();
			
			
			return componentTab;		
		}
		
		public ReferenciaComercialDetalleFormJInternalFrame getreferenciacomercialJInternalFrame() {
			return this.referenciacomercialJInternalFrame;
		}
		
		public void setreferenciacomercialJInternalFrame(ReferenciaComercialDetalleFormJInternalFrame referenciacomercialJInternalFrame) {
			this.referenciacomercialJInternalFrame=referenciacomercialJInternalFrame;
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
