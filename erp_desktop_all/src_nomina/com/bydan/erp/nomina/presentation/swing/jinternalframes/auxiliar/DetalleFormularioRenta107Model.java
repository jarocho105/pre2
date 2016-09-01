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

import com.bydan.erp.nomina.util.DetalleFormularioRenta107ConstantesFunciones;
import com.bydan.erp.nomina.util.DetalleFormularioRenta107ParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DetalleFormularioRenta107ParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DetalleFormularioRenta107BeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DetalleFormularioRenta107JInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DetalleFormularioRenta107DetalleFormJInternalFrame;

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

public class DetalleFormularioRenta107Model extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_ID
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IDFORMULARIORENTA107
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_SUELDOS_301
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_SOBRESUELDOS_303
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_DECIMOTERCERO_305
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_DECIMOCUARTO_307
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_FONDORESERVA_309
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_UTILIDADES_311
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_DESAHUCIO_313
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IESSPERSONAL_315
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSVIVIENDA_317
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSSALUD_319
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSEDUCACION_321
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSALIMENTACION_323
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSVESTIMENTA_325
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_DESCUENTODISCAPACIDAD_327
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_DESCUENTOTERCERAEDAD_329
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_ASUMEEMPLEADOR_331
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_SUBEMPLEADOR_351
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_NUMEROMESESTRABAJADOS_353
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_INGRESOOTROSEMPLEADORES_401
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_DEDUCCIONGASTOSOTROSEMPLEADORES_403
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_REBAJASOTROSEMPLEADORES_405
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_BASEIMPONIBLEANUAL_407
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTOCAUSADO_409
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTORETENIDOEMPLEADOR_411
										,DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTORETENIDOOTROSEMPLEADORES_413
										};
	   
	    public List<DetalleFormularioRenta107> detalleformulariorenta107s;
	  	 
	    //NO SE UTILIZA
	    public DetalleFormularioRenta107Model(List<DetalleFormularioRenta107> detalleformulariorenta107s,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleformulariorenta107s=detalleformulariorenta107s;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleFormularioRenta107Model(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleformulariorenta107s=new ArrayList<DetalleFormularioRenta107>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleformulariorenta107s.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleformulariorenta107s.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleformulariorenta107s.get(rowIndex).getId();
				case 2: return this.detalleformulariorenta107s.get(rowIndex).getid_empresa();
				case 3: return this.detalleformulariorenta107s.get(rowIndex).getid_empleado();
				case 4: return this.detalleformulariorenta107s.get(rowIndex).getid_formulario_renta107();
				case 5: return this.detalleformulariorenta107s.get(rowIndex).getid_ejercicio();
				case 6: return this.detalleformulariorenta107s.get(rowIndex).getsueldos_301();
				case 7: return this.detalleformulariorenta107s.get(rowIndex).getsobre_sueldos_303();
				case 8: return this.detalleformulariorenta107s.get(rowIndex).getdecimo_tercero_305();
				case 9: return this.detalleformulariorenta107s.get(rowIndex).getdecimo_cuarto_307();
				case 10: return this.detalleformulariorenta107s.get(rowIndex).getfondo_reserva_309();
				case 11: return this.detalleformulariorenta107s.get(rowIndex).getutilidades_311();
				case 12: return this.detalleformulariorenta107s.get(rowIndex).getdesahucio_313();
				case 13: return this.detalleformulariorenta107s.get(rowIndex).getiess_personal_315();
				case 14: return this.detalleformulariorenta107s.get(rowIndex).getgastos_vivienda_317();
				case 15: return this.detalleformulariorenta107s.get(rowIndex).getgastos_salud_319();
				case 16: return this.detalleformulariorenta107s.get(rowIndex).getgastos_educacion_321();
				case 17: return this.detalleformulariorenta107s.get(rowIndex).getgastos_alimentacion_323();
				case 18: return this.detalleformulariorenta107s.get(rowIndex).getgastos_vestimenta_325();
				case 19: return this.detalleformulariorenta107s.get(rowIndex).getdescuento_discapacidad_327();
				case 20: return this.detalleformulariorenta107s.get(rowIndex).getdescuento_tercera_edad_329();
				case 21: return this.detalleformulariorenta107s.get(rowIndex).getasume_empleador_331();
				case 22: return this.detalleformulariorenta107s.get(rowIndex).getsub_empleador_351();
				case 23: return this.detalleformulariorenta107s.get(rowIndex).getnumero_meses_trabajados_353();
				case 24: return this.detalleformulariorenta107s.get(rowIndex).getingreso_otros_empleadores_401();
				case 25: return this.detalleformulariorenta107s.get(rowIndex).getdeduccion_gastos_otros_empleadores_403();
				case 26: return this.detalleformulariorenta107s.get(rowIndex).getrebajas_otros_empleadores_405();
				case 27: return this.detalleformulariorenta107s.get(rowIndex).getbase_imponible_anual_407();
				case 28: return this.detalleformulariorenta107s.get(rowIndex).getimpuesto_causado_409();
				case 29: return this.detalleformulariorenta107s.get(rowIndex).getimpuesto_retenido_empleador_411();
				case 30: return this.detalleformulariorenta107s.get(rowIndex).getimpuesto_retenido_otros_empleadores_413();	            
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
				case 6: return Double.class;
				case 7: return Double.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Integer.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;	            
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
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleFormularioRenta107 detalleformulariorenta107 = this.detalleformulariorenta107s.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleFormularioRenta107BeanSwingJInternalFrame detalleformulariorenta107BeanSwingJInternalFrame=(DetalleFormularioRenta107BeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleformulariorenta107.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleformulariorenta107.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleformulariorenta107.setid_empresa((Long) value);detalleformulariorenta107.setempresa_descripcion(detalleformulariorenta107BeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleformulariorenta107.setid_empleado((Long) value);detalleformulariorenta107.setempleado_descripcion(detalleformulariorenta107BeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleformulariorenta107.setid_formulario_renta107((Long) value);detalleformulariorenta107.setformulariorenta107_descripcion(detalleformulariorenta107BeanSwingJInternalFrame.getActualFormularioRenta107ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleformulariorenta107.setid_ejercicio((Long) value);detalleformulariorenta107.setejercicio_descripcion(detalleformulariorenta107BeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleformulariorenta107.setsueldos_301((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleformulariorenta107.setsobre_sueldos_303((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleformulariorenta107.setdecimo_tercero_305((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleformulariorenta107.setdecimo_cuarto_307((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleformulariorenta107.setfondo_reserva_309((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleformulariorenta107.setutilidades_311((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleformulariorenta107.setdesahucio_313((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleformulariorenta107.setiess_personal_315((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleformulariorenta107.setgastos_vivienda_317((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleformulariorenta107.setgastos_salud_319((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleformulariorenta107.setgastos_educacion_321((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleformulariorenta107.setgastos_alimentacion_323((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleformulariorenta107.setgastos_vestimenta_325((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleformulariorenta107.setdescuento_discapacidad_327((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleformulariorenta107.setdescuento_tercera_edad_329((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalleformulariorenta107.setasume_empleador_331((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalleformulariorenta107.setsub_empleador_351((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detalleformulariorenta107.setnumero_meses_trabajados_353((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detalleformulariorenta107.setingreso_otros_empleadores_401((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detalleformulariorenta107.setdeduccion_gastos_otros_empleadores_403((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detalleformulariorenta107.setrebajas_otros_empleadores_405((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detalleformulariorenta107.setbase_imponible_anual_407((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {detalleformulariorenta107.setimpuesto_causado_409((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {detalleformulariorenta107.setimpuesto_retenido_empleador_411((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {detalleformulariorenta107.setimpuesto_retenido_otros_empleadores_413((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleFormularioRenta107Model(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleFormularioRenta107DetalleFormJInternalFrame detalleformulariorenta107JInternalFrame=null;
		
		public DetalleFormularioRenta107Model(DetalleFormularioRenta107DetalleFormJInternalFrame detalleformulariorenta107JInternalFrame) {
			this.detalleformulariorenta107JInternalFrame=detalleformulariorenta107JInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonActualizarToolBarDetalleFormularioRenta107();
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.getjButtonActualizarToolBarDetalleFormularioRenta107())) {
				componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonEliminarToolBarDetalleFormularioRenta107();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.getjButtonEliminarToolBarDetalleFormularioRenta107())) {
				componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonCancelarToolBarDetalleFormularioRenta107();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.getjButtonCancelarToolBarDetalleFormularioRenta107())) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_empresaDetalleFormularioRenta107;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jButtonEliminarDetalleFormularioRenta107;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jButtonEliminarDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jButtonActualizarDetalleFormularioRenta107;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jButtonActualizarDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jButtonCancelarDetalleFormularioRenta107;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_empresaDetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_empleadoDetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_empleadoDetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_formulario_renta107DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_formulario_renta107DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_ejercicioDetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_ejercicioDetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldsueldos_301DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldsueldos_301DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldsobre_sueldos_303DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldsobre_sueldos_303DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_tercero_305DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_tercero_305DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_cuarto_307DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_cuarto_307DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldfondo_reserva_309DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldfondo_reserva_309DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldutilidades_311DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldutilidades_311DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddesahucio_313DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddesahucio_313DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldiess_personal_315DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldiess_personal_315DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vivienda_317DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vivienda_317DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_salud_319DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_salud_319DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_educacion_321DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_educacion_321DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_alimentacion_323DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_alimentacion_323DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vestimenta_325DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vestimenta_325DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_discapacidad_327DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_discapacidad_327DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldasume_empleador_331DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldasume_empleador_331DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldsub_empleador_351DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldsub_empleador_351DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldbase_imponible_anual_407DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldbase_imponible_anual_407DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_causado_409DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_causado_409DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonActualizarToolBarDetalleFormularioRenta107();
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.getjButtonEliminarToolBarDetalleFormularioRenta107())) {
				componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonActualizarToolBarDetalleFormularioRenta107();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.getjButtonCancelarToolBarDetalleFormularioRenta107())) {
				componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonEliminarToolBarDetalleFormularioRenta107();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_empresaDetalleFormularioRenta107)) {
				
				componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonCancelarToolBarDetalleFormularioRenta107();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jButtonEliminarDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jButtonActualizarDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jButtonEliminarDetalleFormularioRenta107;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jButtonCancelarDetalleFormularioRenta107)) {
				componentTab=this.detalleformulariorenta107JInternalFrame.jButtonActualizarDetalleFormularioRenta107;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_empleadoDetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_empresaDetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_formulario_renta107DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_empleadoDetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jComboBoxid_ejercicioDetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_formulario_renta107DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldsueldos_301DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jComboBoxid_ejercicioDetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldsobre_sueldos_303DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldsueldos_301DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_tercero_305DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldsobre_sueldos_303DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_cuarto_307DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_tercero_305DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldfondo_reserva_309DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddecimo_cuarto_307DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldutilidades_311DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldfondo_reserva_309DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddesahucio_313DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldutilidades_311DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldiess_personal_315DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddesahucio_313DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vivienda_317DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldiess_personal_315DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_salud_319DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vivienda_317DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_educacion_321DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_salud_319DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_alimentacion_323DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_educacion_321DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vestimenta_325DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_alimentacion_323DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_discapacidad_327DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldgastos_vestimenta_325DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_discapacidad_327DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldasume_empleador_331DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldsub_empleador_351DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldasume_empleador_331DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldsub_empleador_351DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldbase_imponible_anual_407DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_causado_409DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldbase_imponible_anual_407DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_causado_409DetalleFormularioRenta107;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107)) {
			componentTab=this.detalleformulariorenta107JInternalFrame.jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonActualizarToolBarDetalleFormularioRenta107();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonActualizarToolBarDetalleFormularioRenta107();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleformulariorenta107JInternalFrame.getjButtonCancelarToolBarDetalleFormularioRenta107();
			
			
			return componentTab;		
		}
		
		public DetalleFormularioRenta107DetalleFormJInternalFrame getdetalleformulariorenta107JInternalFrame() {
			return this.detalleformulariorenta107JInternalFrame;
		}
		
		public void setdetalleformulariorenta107JInternalFrame(DetalleFormularioRenta107DetalleFormJInternalFrame detalleformulariorenta107JInternalFrame) {
			this.detalleformulariorenta107JInternalFrame=detalleformulariorenta107JInternalFrame;
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
