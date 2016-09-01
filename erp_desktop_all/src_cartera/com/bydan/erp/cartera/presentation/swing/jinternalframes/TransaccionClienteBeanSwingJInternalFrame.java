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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.TransaccionClienteConstantesFunciones;
import com.bydan.erp.cartera.util.TransaccionClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TransaccionClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TransaccionClienteBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
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
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
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
import java.util.Collections;
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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
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

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransaccionClienteBeanSwingJInternalFrame extends TransaccionClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransaccionClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TransaccionCliente> transaccionclienteValidator = new ClassValidator<TransaccionCliente>(TransaccionCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TransaccionCliente transaccioncliente;	
	public TransaccionCliente transaccionclienteAux;
	public TransaccionCliente transaccionclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TransaccionCliente transaccionclienteTotales;
	public Long idTransaccionClienteActual;
	public Long iIdNuevoTransaccionCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTransaccion1="";

	public List<Transaccion> transaccion1sForeignKey;

	public List<Transaccion> gettransaccion1sForeignKey() {
		return transaccion1sForeignKey;
	}

	public void settransaccion1sForeignKey(List<Transaccion> transaccion1sForeignKey) {
		this.transaccion1sForeignKey = transaccion1sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccion1ForeignKey;

	public Transaccion gettransaccion1ForeignKey() {
		return transaccion1ForeignKey;
	}

	public void settransaccion1ForeignKey(Transaccion transaccion1ForeignKey) {
		this.transaccion1ForeignKey = transaccion1ForeignKey;
	}

	public String sFinalQueryComboTransaccion2="";

	public List<Transaccion> transaccion2sForeignKey;

	public List<Transaccion> gettransaccion2sForeignKey() {
		return transaccion2sForeignKey;
	}

	public void settransaccion2sForeignKey(List<Transaccion> transaccion2sForeignKey) {
		this.transaccion2sForeignKey = transaccion2sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccion2ForeignKey;

	public Transaccion gettransaccion2ForeignKey() {
		return transaccion2ForeignKey;
	}

	public void settransaccion2ForeignKey(Transaccion transaccion2ForeignKey) {
		this.transaccion2ForeignKey = transaccion2ForeignKey;
	}

	public String sFinalQueryComboTransaccion3="";

	public List<Transaccion> transaccion3sForeignKey;

	public List<Transaccion> gettransaccion3sForeignKey() {
		return transaccion3sForeignKey;
	}

	public void settransaccion3sForeignKey(List<Transaccion> transaccion3sForeignKey) {
		this.transaccion3sForeignKey = transaccion3sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccion3ForeignKey;

	public Transaccion gettransaccion3ForeignKey() {
		return transaccion3ForeignKey;
	}

	public void settransaccion3ForeignKey(Transaccion transaccion3ForeignKey) {
		this.transaccion3ForeignKey = transaccion3ForeignKey;
	}

	public String sFinalQueryComboTransaccion4="";

	public List<Transaccion> transaccion4sForeignKey;

	public List<Transaccion> gettransaccion4sForeignKey() {
		return transaccion4sForeignKey;
	}

	public void settransaccion4sForeignKey(List<Transaccion> transaccion4sForeignKey) {
		this.transaccion4sForeignKey = transaccion4sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccion4ForeignKey;

	public Transaccion gettransaccion4ForeignKey() {
		return transaccion4ForeignKey;
	}

	public void settransaccion4ForeignKey(Transaccion transaccion4ForeignKey) {
		this.transaccion4ForeignKey = transaccion4ForeignKey;
	}

	public String sFinalQueryComboTransaccion5="";

	public List<Transaccion> transaccion5sForeignKey;

	public List<Transaccion> gettransaccion5sForeignKey() {
		return transaccion5sForeignKey;
	}

	public void settransaccion5sForeignKey(List<Transaccion> transaccion5sForeignKey) {
		this.transaccion5sForeignKey = transaccion5sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccion5ForeignKey;

	public Transaccion gettransaccion5ForeignKey() {
		return transaccion5ForeignKey;
	}

	public void settransaccion5ForeignKey(Transaccion transaccion5ForeignKey) {
		this.transaccion5ForeignKey = transaccion5ForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTransaccionCliente;
	public Boolean isPermisoNuevoTransaccionCliente;
	public Boolean isPermisoActualizarTransaccionCliente;
	public Boolean isPermisoActualizarOriginalTransaccionCliente;
	public Boolean isPermisoEliminarTransaccionCliente;
	public Boolean isPermisoGuardarCambiosTransaccionCliente;
	public Boolean isPermisoConsultaTransaccionCliente;
	public Boolean isPermisoBusquedaTransaccionCliente;
	public Boolean isPermisoReporteTransaccionCliente;
	public Boolean isPermisoPaginacionMedioTransaccionCliente;
	public Boolean isPermisoPaginacionAltoTransaccionCliente;
	public Boolean isPermisoPaginacionTodoTransaccionCliente;
	public Boolean isPermisoCopiarTransaccionCliente;
	public Boolean isPermisoVerFormTransaccionCliente;
	public Boolean isPermisoDuplicarTransaccionCliente;
	public Boolean isPermisoOrdenTransaccionCliente;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TransaccionClienteParameterReturnGeneral transaccionclienteReturnGeneral;
	public TransaccionClienteParameterReturnGeneral transaccionclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransaccionCliente=false;
	public Boolean esParaAccionDesdeFormularioTransaccionCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransaccionClienteSessionBeanAdditional transaccionclienteSessionBeanAdditional=null;
	
	public TransaccionClienteSessionBeanAdditional getTransaccionClienteSessionBeanAdditional() {
		return this.transaccionclienteSessionBeanAdditional;
	}
	
	public void setTransaccionClienteSessionBeanAdditional(TransaccionClienteSessionBeanAdditional transaccionclienteSessionBeanAdditional) {
		try {
			this.transaccionclienteSessionBeanAdditional=transaccionclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransaccionClienteBeanSwingJInternalFrameAdditional transaccionclienteBeanSwingJInternalFrameAdditional=null;
	//public class TransaccionClienteBeanSwingJInternalFrame
	
	public TransaccionClienteBeanSwingJInternalFrameAdditional getTransaccionClienteBeanSwingJInternalFrameAdditional() {
		return this.transaccionclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransaccionClienteBeanSwingJInternalFrameAdditional(TransaccionClienteBeanSwingJInternalFrameAdditional transaccionclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.transaccionclienteBeanSwingJInternalFrameAdditional=transaccionclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransaccionClienteLogic transaccionclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TransaccionCliente transaccionclienteBean;
	public TransaccionClienteConstantesFunciones transaccionclienteConstantesFunciones;
	//public TransaccionClienteParameterReturnGeneral transaccionclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TransaccionLogic transaccion1Logic;
	public TransaccionLogic transaccion2Logic;
	public TransaccionLogic transaccion3Logic;
	public TransaccionLogic transaccion4Logic;
	public TransaccionLogic transaccion5Logic;
	
	//PARAMETROS
	
	
	//public List<TransaccionCliente> transaccionclientes;	
	//public List<TransaccionCliente> transaccionclientesEliminados;
	//public List<TransaccionCliente> transaccionclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransaccionCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTransaccionCliente=true;
	public Boolean isVisibilidadCeldaCopiarTransaccionCliente=true;
	public Boolean isVisibilidadCeldaVerFormTransaccionCliente=true;
	public Boolean isVisibilidadCeldaOrdenTransaccionCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
	public Boolean isVisibilidadCeldaModificarTransaccionCliente=false;
	public Boolean isVisibilidadCeldaActualizarTransaccionCliente=false;
	public Boolean isVisibilidadCeldaEliminarTransaccionCliente=false;
	public Boolean isVisibilidadCeldaCancelarTransaccionCliente=false;
	public Boolean isVisibilidadCeldaGuardarTransaccionCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTransaccion1=false;
	public Boolean isVisibilidadFK_IdTransaccion2=false;
	public Boolean isVisibilidadFK_IdTransaccion3=false;
	public Boolean isVisibilidadFK_IdTransaccion4=false;
	public Boolean isVisibilidadFK_IdTransaccion5=false;
	
	public Long getiIdNuevoTransaccionCliente() {
		return this.iIdNuevoTransaccionCliente;
	}

	public void setiIdNuevoTransaccionCliente(Long iIdNuevoTransaccionCliente) {
		this.iIdNuevoTransaccionCliente = iIdNuevoTransaccionCliente;
	}
	
	public Long getidTransaccionClienteActual() {
		return this.idTransaccionClienteActual;
	}

	public void setidTransaccionClienteActual(Long idTransaccionClienteActual) {
		this.idTransaccionClienteActual = idTransaccionClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TransaccionCliente gettransaccioncliente() {
		return this.transaccioncliente;
	}

	public void settransaccioncliente(TransaccionCliente transaccioncliente) {
		this.transaccioncliente = transaccioncliente;
	}
	
	public TransaccionCliente gettransaccionclienteAux() {
		return this.transaccionclienteAux;
	}

	public void settransaccionclienteAux(TransaccionCliente transaccionclienteAux) {
		this.transaccionclienteAux = transaccionclienteAux;
	}				
	
	public TransaccionCliente gettransaccionclienteAnterior() {
		return this.transaccionclienteAnterior;
	}

	public void settransaccionclienteAnterior(TransaccionCliente transaccionclienteAnterior) {
		this.transaccionclienteAnterior = transaccionclienteAnterior;
	}	
	
	public TransaccionCliente gettransaccionclienteTotales() {
		return this.transaccionclienteTotales;
	}

	public void settransaccionclienteTotales(TransaccionCliente transaccionclienteTotales) {
		this.transaccionclienteTotales = transaccionclienteTotales;
	}	
	
	public TransaccionCliente gettransaccionclienteBean() {
		return this.transaccionclienteBean;
	}

	public void settransaccionclienteBean(TransaccionCliente transaccionclienteBean) {
		this.transaccionclienteBean = transaccionclienteBean;
	}	
	
	public TransaccionClienteParameterReturnGeneral gettransaccionclienteReturnGeneral() {
		return this.transaccionclienteReturnGeneral;
	}

	public void settransaccionclienteReturnGeneral(TransaccionClienteParameterReturnGeneral transaccionclienteReturnGeneral) {
		this.transaccionclienteReturnGeneral = transaccionclienteReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_transaccion1FK_IdTransaccion1=-1L;

	public Long getid_transaccion1FK_IdTransaccion1() {
		return this.id_transaccion1FK_IdTransaccion1;
	}

	public void setid_transaccion1FK_IdTransaccion1(Long id_transaccion1FK_IdTransaccion1) {
		this.id_transaccion1FK_IdTransaccion1 = id_transaccion1FK_IdTransaccion1;
	}

	public Long id_transaccion2FK_IdTransaccion2=null;

	public Long getid_transaccion2FK_IdTransaccion2() {
		return this.id_transaccion2FK_IdTransaccion2;
	}

	public void setid_transaccion2FK_IdTransaccion2(Long id_transaccion2FK_IdTransaccion2) {
		this.id_transaccion2FK_IdTransaccion2 = id_transaccion2FK_IdTransaccion2;
	}

	public Long id_transaccion3FK_IdTransaccion3=null;

	public Long getid_transaccion3FK_IdTransaccion3() {
		return this.id_transaccion3FK_IdTransaccion3;
	}

	public void setid_transaccion3FK_IdTransaccion3(Long id_transaccion3FK_IdTransaccion3) {
		this.id_transaccion3FK_IdTransaccion3 = id_transaccion3FK_IdTransaccion3;
	}

	public Long id_transaccion4FK_IdTransaccion4=null;

	public Long getid_transaccion4FK_IdTransaccion4() {
		return this.id_transaccion4FK_IdTransaccion4;
	}

	public void setid_transaccion4FK_IdTransaccion4(Long id_transaccion4FK_IdTransaccion4) {
		this.id_transaccion4FK_IdTransaccion4 = id_transaccion4FK_IdTransaccion4;
	}

	public Long id_transaccion5FK_IdTransaccion5=null;

	public Long getid_transaccion5FK_IdTransaccion5() {
		return this.id_transaccion5FK_IdTransaccion5;
	}

	public void setid_transaccion5FK_IdTransaccion5(Long id_transaccion5FK_IdTransaccion5) {
		this.id_transaccion5FK_IdTransaccion5 = id_transaccion5FK_IdTransaccion5;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransaccionClienteLogic getTransaccionClienteLogic()	{		
		return transaccionclienteLogic;
	}

	public void setTransaccionClienteLogic(TransaccionClienteLogic transaccionclienteLogic) {
		this.transaccionclienteLogic = transaccionclienteLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTransaccionCliente() {
		return isEsNuevoTransaccionCliente;
	}

	public void setIsEsNuevoTransaccionCliente(Boolean isEsNuevoTransaccionCliente) {
		this.isEsNuevoTransaccionCliente = isEsNuevoTransaccionCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTransaccionCliente() {
		return esParaAccionDesdeFormularioTransaccionCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTransaccionCliente(Boolean esParaAccionDesdeFormularioTransaccionCliente) {
		this.esParaAccionDesdeFormularioTransaccionCliente = esParaAccionDesdeFormularioTransaccionCliente;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccion1sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccion1sForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion1()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccion1Logic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccion1sForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion1(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidTransaccion1Actual());
					this.transaccion1sForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccion2sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccion2sForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Transaccion transaccion2Nulo = new Transaccion();

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion2()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccion2Logic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccion2sForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.transaccion2sForeignKey.add(0, transaccion2Nulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion2(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidTransaccion2Actual());
					this.transaccion2sForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccion3sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccion3sForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Transaccion transaccion3Nulo = new Transaccion();

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion3()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccion3Logic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccion3sForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.transaccion3sForeignKey.add(0, transaccion3Nulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion3(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidTransaccion3Actual());
					this.transaccion3sForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccion4sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccion4sForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Transaccion transaccion4Nulo = new Transaccion();

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion4()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccion4Logic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccion4sForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.transaccion4sForeignKey.add(0, transaccion4Nulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion4(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidTransaccion4Actual());
					this.transaccion4sForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccion5sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccion5sForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Transaccion transaccion5Nulo = new Transaccion();

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion5()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccion5Logic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccion5sForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.transaccion5sForeignKey.add(0, transaccion5Nulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion5(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transaccionclienteSessionBean.getlidTransaccion5Actual());
					this.transaccion5sForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransaccionCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransaccionClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTransaccionClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransaccionClienteGenerico!=null && jComboBoxid_empresaTransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTransaccionCliente.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTransaccionClienteGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTransaccionClienteGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTransaccionClienteGenerico!=null && jComboBoxid_moduloTransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_moduloTransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccion1ForeignKey(Long idTransaccion1Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccion1Temp=null;

			for(Transaccion transaccion1Aux:transaccion1sForeignKey) {
				if(transaccion1Aux.getId()!=null && transaccion1Aux.getId().equals(idTransaccion1Seleccionado)) {
					transaccion1Temp=transaccion1Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccion1Temp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setTransaccion1(transaccion1Temp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setSelectedItem(transaccion1Temp);
					}
				} else {
					//jComboBoxid_transaccion1TransaccionCliente.setSelectedItem(transaccion1Temp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccion1ForeignKeyDescripcion(Long idTransaccion1Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccion1Temp=null;

			for(Transaccion transaccion1Aux:transaccion1sForeignKey) {
				if(transaccion1Aux.getId()!=null && transaccion1Aux.getId().equals(idTransaccion1Seleccionado)) {
					transaccion1Temp=transaccion1Aux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion1Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccion1ForeignKeyGenerico(Long idTransaccion1Seleccionado,JComboBox jComboBoxid_transaccion1TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccion1Temp=null;

			for(Transaccion transaccion1Aux:transaccion1sForeignKey) {
				if(transaccion1Aux.getId()!=null && transaccion1Aux.getId().equals(idTransaccion1Seleccionado)) {
					transaccion1Temp=transaccion1Aux;
					break;
				}
			}

			if(transaccion1Temp!=null) {
				jComboBoxid_transaccion1TransaccionClienteGenerico.setSelectedItem(transaccion1Temp);
			} else {
				if(jComboBoxid_transaccion1TransaccionClienteGenerico!=null && jComboBoxid_transaccion1TransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_transaccion1TransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccion2ForeignKey(Long idTransaccion2Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccion2Temp=null;

			for(Transaccion transaccion2Aux:transaccion2sForeignKey) {
				if(transaccion2Aux.getId()!=null && transaccion2Aux.getId().equals(idTransaccion2Seleccionado)) {
					transaccion2Temp=transaccion2Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccion2Temp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setTransaccion2(transaccion2Temp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setSelectedItem(transaccion2Temp);
					}
				} else {
					//jComboBoxid_transaccion2TransaccionCliente.setSelectedItem(transaccion2Temp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccion2ForeignKeyDescripcion(Long idTransaccion2Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccion2Temp=null;

			for(Transaccion transaccion2Aux:transaccion2sForeignKey) {
				if(transaccion2Aux.getId()!=null && transaccion2Aux.getId().equals(idTransaccion2Seleccionado)) {
					transaccion2Temp=transaccion2Aux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion2Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccion2ForeignKeyGenerico(Long idTransaccion2Seleccionado,JComboBox jComboBoxid_transaccion2TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccion2Temp=null;

			for(Transaccion transaccion2Aux:transaccion2sForeignKey) {
				if(transaccion2Aux.getId()!=null && transaccion2Aux.getId().equals(idTransaccion2Seleccionado)) {
					transaccion2Temp=transaccion2Aux;
					break;
				}
			}

			if(transaccion2Temp!=null) {
				jComboBoxid_transaccion2TransaccionClienteGenerico.setSelectedItem(transaccion2Temp);
			} else {
				if(jComboBoxid_transaccion2TransaccionClienteGenerico!=null && jComboBoxid_transaccion2TransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_transaccion2TransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccion3ForeignKey(Long idTransaccion3Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccion3Temp=null;

			for(Transaccion transaccion3Aux:transaccion3sForeignKey) {
				if(transaccion3Aux.getId()!=null && transaccion3Aux.getId().equals(idTransaccion3Seleccionado)) {
					transaccion3Temp=transaccion3Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccion3Temp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setTransaccion3(transaccion3Temp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setSelectedItem(transaccion3Temp);
					}
				} else {
					//jComboBoxid_transaccion3TransaccionCliente.setSelectedItem(transaccion3Temp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccion3ForeignKeyDescripcion(Long idTransaccion3Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccion3Temp=null;

			for(Transaccion transaccion3Aux:transaccion3sForeignKey) {
				if(transaccion3Aux.getId()!=null && transaccion3Aux.getId().equals(idTransaccion3Seleccionado)) {
					transaccion3Temp=transaccion3Aux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion3Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccion3ForeignKeyGenerico(Long idTransaccion3Seleccionado,JComboBox jComboBoxid_transaccion3TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccion3Temp=null;

			for(Transaccion transaccion3Aux:transaccion3sForeignKey) {
				if(transaccion3Aux.getId()!=null && transaccion3Aux.getId().equals(idTransaccion3Seleccionado)) {
					transaccion3Temp=transaccion3Aux;
					break;
				}
			}

			if(transaccion3Temp!=null) {
				jComboBoxid_transaccion3TransaccionClienteGenerico.setSelectedItem(transaccion3Temp);
			} else {
				if(jComboBoxid_transaccion3TransaccionClienteGenerico!=null && jComboBoxid_transaccion3TransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_transaccion3TransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccion4ForeignKey(Long idTransaccion4Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccion4Temp=null;

			for(Transaccion transaccion4Aux:transaccion4sForeignKey) {
				if(transaccion4Aux.getId()!=null && transaccion4Aux.getId().equals(idTransaccion4Seleccionado)) {
					transaccion4Temp=transaccion4Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccion4Temp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setTransaccion4(transaccion4Temp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setSelectedItem(transaccion4Temp);
					}
				} else {
					//jComboBoxid_transaccion4TransaccionCliente.setSelectedItem(transaccion4Temp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccion4ForeignKeyDescripcion(Long idTransaccion4Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccion4Temp=null;

			for(Transaccion transaccion4Aux:transaccion4sForeignKey) {
				if(transaccion4Aux.getId()!=null && transaccion4Aux.getId().equals(idTransaccion4Seleccionado)) {
					transaccion4Temp=transaccion4Aux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion4Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccion4ForeignKeyGenerico(Long idTransaccion4Seleccionado,JComboBox jComboBoxid_transaccion4TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccion4Temp=null;

			for(Transaccion transaccion4Aux:transaccion4sForeignKey) {
				if(transaccion4Aux.getId()!=null && transaccion4Aux.getId().equals(idTransaccion4Seleccionado)) {
					transaccion4Temp=transaccion4Aux;
					break;
				}
			}

			if(transaccion4Temp!=null) {
				jComboBoxid_transaccion4TransaccionClienteGenerico.setSelectedItem(transaccion4Temp);
			} else {
				if(jComboBoxid_transaccion4TransaccionClienteGenerico!=null && jComboBoxid_transaccion4TransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_transaccion4TransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccion5ForeignKey(Long idTransaccion5Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccion5Temp=null;

			for(Transaccion transaccion5Aux:transaccion5sForeignKey) {
				if(transaccion5Aux.getId()!=null && transaccion5Aux.getId().equals(idTransaccion5Seleccionado)) {
					transaccion5Temp=transaccion5Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccion5Temp!=null) {

					if(this.transaccioncliente!=null) {
						this.transaccioncliente.setTransaccion5(transaccion5Temp);
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setSelectedItem(transaccion5Temp);
					}
				} else {
					//jComboBoxid_transaccion5TransaccionCliente.setSelectedItem(transaccion5Temp);
					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
						if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccion5ForeignKeyDescripcion(Long idTransaccion5Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccion5Temp=null;

			for(Transaccion transaccion5Aux:transaccion5sForeignKey) {
				if(transaccion5Aux.getId()!=null && transaccion5Aux.getId().equals(idTransaccion5Seleccionado)) {
					transaccion5Temp=transaccion5Aux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion5Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccion5ForeignKeyGenerico(Long idTransaccion5Seleccionado,JComboBox jComboBoxid_transaccion5TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccion5Temp=null;

			for(Transaccion transaccion5Aux:transaccion5sForeignKey) {
				if(transaccion5Aux.getId()!=null && transaccion5Aux.getId().equals(idTransaccion5Seleccionado)) {
					transaccion5Temp=transaccion5Aux;
					break;
				}
			}

			if(transaccion5Temp!=null) {
				jComboBoxid_transaccion5TransaccionClienteGenerico.setSelectedItem(transaccion5Temp);
			} else {
				if(jComboBoxid_transaccion5TransaccionClienteGenerico!=null && jComboBoxid_transaccion5TransaccionClienteGenerico.getItemCount()>0) {
					jComboBoxid_transaccion5TransaccionClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_empresaTransaccionClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransaccionClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransaccionClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transaccioncliente.setid_empresa(empresaAux.getId());
				transaccioncliente.setempresa_descripcion(TransaccionClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transaccioncliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_moduloTransaccionClienteGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTransaccionClienteGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTransaccionClienteGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				transaccioncliente.setid_modulo(moduloAux.getId());
				transaccioncliente.setmodulo_descripcion(TransaccionClienteConstantesFunciones.getModuloDescripcion(moduloAux));
				transaccioncliente.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccion1ForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_transaccion1TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion1TransaccionClienteGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion1TransaccionClienteGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				transaccioncliente.setid_transaccion1(transaccionAux.getId());
				transaccioncliente.settransaccion1_descripcion(TransaccionClienteConstantesFunciones.getTransaccion1Descripcion(transaccionAux));
				transaccioncliente.setTransaccion1(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccion2ForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_transaccion2TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion2TransaccionClienteGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion2TransaccionClienteGenerico.getSelectedItem();
			}

			if(transaccionAux!=null) {
				transaccioncliente.setid_transaccion2(transaccionAux.getId());
				transaccioncliente.settransaccion2_descripcion(TransaccionClienteConstantesFunciones.getTransaccion2Descripcion(transaccionAux));
				transaccioncliente.setTransaccion2(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccion3ForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_transaccion3TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion3TransaccionClienteGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion3TransaccionClienteGenerico.getSelectedItem();
			}

			if(transaccionAux!=null) {
				transaccioncliente.setid_transaccion3(transaccionAux.getId());
				transaccioncliente.settransaccion3_descripcion(TransaccionClienteConstantesFunciones.getTransaccion3Descripcion(transaccionAux));
				transaccioncliente.setTransaccion3(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccion4ForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_transaccion4TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion4TransaccionClienteGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion4TransaccionClienteGenerico.getSelectedItem();
			}

			if(transaccionAux!=null) {
				transaccioncliente.setid_transaccion4(transaccionAux.getId());
				transaccioncliente.settransaccion4_descripcion(TransaccionClienteConstantesFunciones.getTransaccion4Descripcion(transaccionAux));
				transaccioncliente.setTransaccion4(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccion5ForeignKey(TransaccionCliente transaccioncliente,JComboBox jComboBoxid_transaccion5TransaccionClienteGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion5TransaccionClienteGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion5TransaccionClienteGenerico.getSelectedItem();
			}

			if(transaccionAux!=null) {
				transaccioncliente.setid_transaccion5(transaccionAux.getId());
				transaccioncliente.settransaccion5_descripcion(TransaccionClienteConstantesFunciones.getTransaccion5Descripcion(transaccionAux));
				transaccioncliente.setTransaccion5(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccion1sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.removeAllItems();

							for(Transaccion transaccion1:this.transaccion1sForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.addItem(transaccion1);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccion2sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.removeAllItems();

							for(Transaccion transaccion2:this.transaccion2sForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.addItem(transaccion2);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccion3sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.removeAllItems();

							for(Transaccion transaccion3:this.transaccion3sForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.addItem(transaccion3);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccion4sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.removeAllItems();

							for(Transaccion transaccion4:this.transaccion4sForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.addItem(transaccion4);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccion5sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.removeAllItems();

							for(Transaccion transaccion5:this.transaccion5sForeignKey) {
								this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.addItem(transaccion5);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { 
					}

					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccion1ForeignKey(Transaccion transaccion1,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setSelectedItem(transaccion1);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccion2ForeignKey(Transaccion transaccion2,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setSelectedItem(transaccion2);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccion3ForeignKey(Transaccion transaccion3,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setSelectedItem(transaccion3);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccion4ForeignKey(Transaccion transaccion4,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setSelectedItem(transaccion4);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccion5ForeignKey(Transaccion transaccion5,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setSelectedItem(transaccion5);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransaccionCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TransaccionClienteConstantesFunciones.refrescarForeignKeysDescripcionesTransaccionCliente(this.transaccionclienteLogic.getTransaccionClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TransaccionClienteConstantesFunciones.refrescarForeignKeysDescripcionesTransaccionCliente(this.transaccionclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(Transaccion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//transaccionclienteLogic.setTransaccionClientes(this.transaccionclientes);
			transaccionclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TransaccionClienteParameterReturnGeneral getTransaccionClienteParameterGeneral() {
		return this.transaccionclienteParameterGeneral;
	}
	
	public void setTransaccionClienteParameterGeneral(TransaccionClienteParameterReturnGeneral transaccionclienteParameterGeneral) {
		this.transaccionclienteParameterGeneral = transaccionclienteParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTransaccionCliente() {
		return isPermisoTodoTransaccionCliente;
	}

	public void setIsPermisoTodoTransaccionCliente(Boolean isPermisoTodoTransaccionCliente) {
		this.isPermisoTodoTransaccionCliente = isPermisoTodoTransaccionCliente;
	}

	public Boolean getIsPermisoNuevoTransaccionCliente() {
		return isPermisoNuevoTransaccionCliente;
	}

	public void setIsPermisoNuevoTransaccionCliente(Boolean isPermisoNuevoTransaccionCliente) {
		this.isPermisoNuevoTransaccionCliente = isPermisoNuevoTransaccionCliente;
	}

	public Boolean getIsPermisoActualizarTransaccionCliente() {
		return isPermisoActualizarTransaccionCliente;
	}

	public void setIsPermisoActualizarTransaccionCliente(Boolean isPermisoActualizarTransaccionCliente) {
		this.isPermisoActualizarTransaccionCliente = isPermisoActualizarTransaccionCliente;
	}

	public Boolean getIsPermisoEliminarTransaccionCliente() {
		return isPermisoEliminarTransaccionCliente;
	}

	public void setIsPermisoEliminarTransaccionCliente(Boolean isPermisoEliminarTransaccionCliente) {
		this.isPermisoEliminarTransaccionCliente = isPermisoEliminarTransaccionCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTransaccionCliente() {
		return isPermisoGuardarCambiosTransaccionCliente;
	}

	public void setIsPermisoGuardarCambiosTransaccionCliente(Boolean isPermisoGuardarCambiosTransaccionCliente) {
		this.isPermisoGuardarCambiosTransaccionCliente = isPermisoGuardarCambiosTransaccionCliente;
	}
	
	public Boolean getIsPermisoConsultaTransaccionCliente() {
		return isPermisoConsultaTransaccionCliente;
	}

	public void setIsPermisoConsultaTransaccionCliente(Boolean isPermisoConsultaTransaccionCliente) {
		this.isPermisoConsultaTransaccionCliente = isPermisoConsultaTransaccionCliente;
	}

	public Boolean getIsPermisoBusquedaTransaccionCliente() {
		return isPermisoBusquedaTransaccionCliente;
	}

	public void setIsPermisoBusquedaTransaccionCliente(Boolean isPermisoBusquedaTransaccionCliente) {
		this.isPermisoBusquedaTransaccionCliente = isPermisoBusquedaTransaccionCliente;
	}

	public Boolean getIsPermisoReporteTransaccionCliente() {
		return isPermisoReporteTransaccionCliente;
	}

	public void setIsPermisoReporteTransaccionCliente(Boolean isPermisoReporteTransaccionCliente) {
		this.isPermisoReporteTransaccionCliente = isPermisoReporteTransaccionCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransaccionCliente() {
		return isPermisoPaginacionMedioTransaccionCliente;
	}

	public void setIsPermisoPaginacionMedioTransaccionCliente(Boolean isPermisoPaginacionMedioTransaccionCliente) {
		this.isPermisoPaginacionMedioTransaccionCliente = isPermisoPaginacionMedioTransaccionCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransaccionCliente() {
		return isPermisoPaginacionTodoTransaccionCliente;
	}

	public void setIsPermisoPaginacionTodoTransaccionCliente(Boolean isPermisoPaginacionTodoTransaccionCliente) {
		this.isPermisoPaginacionTodoTransaccionCliente = isPermisoPaginacionTodoTransaccionCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransaccionCliente() {
		return isPermisoPaginacionAltoTransaccionCliente;
	}

	public void setIsPermisoPaginacionAltoTransaccionCliente(Boolean isPermisoPaginacionAltoTransaccionCliente) {
		this.isPermisoPaginacionAltoTransaccionCliente = isPermisoPaginacionAltoTransaccionCliente;
	}
	
	public Boolean getIsPermisoCopiarTransaccionCliente() {
		return isPermisoCopiarTransaccionCliente;
	}

	public void setIsPermisoCopiarTransaccionCliente(Boolean isPermisoCopiarTransaccionCliente) {
		this.isPermisoCopiarTransaccionCliente = isPermisoCopiarTransaccionCliente;
	}
	
	public Boolean getIsPermisoVerFormTransaccionCliente() {
		return isPermisoVerFormTransaccionCliente;
	}

	public void setIsPermisoVerFormTransaccionCliente(Boolean isPermisoVerFormTransaccionCliente) {
		this.isPermisoVerFormTransaccionCliente = isPermisoVerFormTransaccionCliente;
	}
	
	public Boolean getIsPermisoDuplicarTransaccionCliente() {
		return isPermisoDuplicarTransaccionCliente;
	}

	public void setIsPermisoDuplicarTransaccionCliente(Boolean isPermisoDuplicarTransaccionCliente) {
		this.isPermisoDuplicarTransaccionCliente = isPermisoDuplicarTransaccionCliente;
	}
	
	public Boolean getIsPermisoOrdenTransaccionCliente() {
		return isPermisoOrdenTransaccionCliente;
	}

	public void setIsPermisoOrdenTransaccionCliente(Boolean isPermisoOrdenTransaccionCliente) {
		this.isPermisoOrdenTransaccionCliente = isPermisoOrdenTransaccionCliente;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTransaccionCliente() {
		return isVisibilidadCeldaNuevoTransaccionCliente;
	}

	public void setIsVisibilidadCeldaNuevoTransaccionCliente(Boolean isVisibilidadCeldaNuevoTransaccionCliente) {
		this.isVisibilidadCeldaNuevoTransaccionCliente = isVisibilidadCeldaNuevoTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransaccionCliente() {
		return isVisibilidadCeldaDuplicarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTransaccionCliente(Boolean isVisibilidadCeldaDuplicarTransaccionCliente) {
		this.isVisibilidadCeldaDuplicarTransaccionCliente = isVisibilidadCeldaDuplicarTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransaccionCliente() {
		return isVisibilidadCeldaCopiarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaCopiarTransaccionCliente(Boolean isVisibilidadCeldaCopiarTransaccionCliente) {
		this.isVisibilidadCeldaCopiarTransaccionCliente = isVisibilidadCeldaCopiarTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransaccionCliente() {
		return isVisibilidadCeldaVerFormTransaccionCliente;
	}

	public void setIsVisibilidadCeldaVerFormTransaccionCliente(Boolean isVisibilidadCeldaVerFormTransaccionCliente) {
		this.isVisibilidadCeldaVerFormTransaccionCliente = isVisibilidadCeldaVerFormTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransaccionCliente() {
		return isVisibilidadCeldaOrdenTransaccionCliente;
	}

	public void setIsVisibilidadCeldaOrdenTransaccionCliente(Boolean isVisibilidadCeldaOrdenTransaccionCliente) {
		this.isVisibilidadCeldaOrdenTransaccionCliente = isVisibilidadCeldaOrdenTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransaccionCliente() {
		return isVisibilidadCeldaNuevoRelacionesTransaccionCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransaccionCliente(Boolean isVisibilidadCeldaNuevoRelacionesTransaccionCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente = isVisibilidadCeldaNuevoRelacionesTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransaccionCliente() {
		return isVisibilidadCeldaModificarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaModificarTransaccionCliente(Boolean isVisibilidadCeldaModificarTransaccionCliente) {
		this.isVisibilidadCeldaModificarTransaccionCliente = isVisibilidadCeldaModificarTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransaccionCliente() {
		return isVisibilidadCeldaActualizarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaActualizarTransaccionCliente(Boolean isVisibilidadCeldaActualizarTransaccionCliente) {
		this.isVisibilidadCeldaActualizarTransaccionCliente = isVisibilidadCeldaActualizarTransaccionCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransaccionCliente() {
		return isVisibilidadCeldaEliminarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaEliminarTransaccionCliente(Boolean isVisibilidadCeldaEliminarTransaccionCliente) {
		this.isVisibilidadCeldaEliminarTransaccionCliente = isVisibilidadCeldaEliminarTransaccionCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransaccionCliente() {
		return isVisibilidadCeldaCancelarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaCancelarTransaccionCliente(Boolean isVisibilidadCeldaCancelarTransaccionCliente) {
		this.isVisibilidadCeldaCancelarTransaccionCliente = isVisibilidadCeldaCancelarTransaccionCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransaccionCliente() {
		return isVisibilidadCeldaGuardarTransaccionCliente;
	}

	public void setIsVisibilidadCeldaGuardarTransaccionCliente(Boolean isVisibilidadCeldaGuardarTransaccionCliente) {
		this.isVisibilidadCeldaGuardarTransaccionCliente = isVisibilidadCeldaGuardarTransaccionCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransaccionCliente() {
		return isVisibilidadCeldaGuardarCambiosTransaccionCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransaccionCliente(Boolean isVisibilidadCeldaGuardarCambiosTransaccionCliente) {
		this.isVisibilidadCeldaGuardarCambiosTransaccionCliente = isVisibilidadCeldaGuardarCambiosTransaccionCliente;
	}
		
	public TransaccionClienteSessionBean gettransaccionclienteSessionBean() {
		return this.transaccionclienteSessionBean;
	}
	
	public void settransaccionclienteSessionBean(TransaccionClienteSessionBean transaccionclienteSessionBean) {
		this.transaccionclienteSessionBean=transaccionclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdTransaccion1() {
		return this.isVisibilidadFK_IdTransaccion1;
	}

	public void setisVisibilidadFK_IdTransaccion1(Boolean isVisibilidadFK_IdTransaccion1) {
		this.isVisibilidadFK_IdTransaccion1=isVisibilidadFK_IdTransaccion1;
	}

	public Boolean getisVisibilidadFK_IdTransaccion2() {
		return this.isVisibilidadFK_IdTransaccion2;
	}

	public void setisVisibilidadFK_IdTransaccion2(Boolean isVisibilidadFK_IdTransaccion2) {
		this.isVisibilidadFK_IdTransaccion2=isVisibilidadFK_IdTransaccion2;
	}

	public Boolean getisVisibilidadFK_IdTransaccion3() {
		return this.isVisibilidadFK_IdTransaccion3;
	}

	public void setisVisibilidadFK_IdTransaccion3(Boolean isVisibilidadFK_IdTransaccion3) {
		this.isVisibilidadFK_IdTransaccion3=isVisibilidadFK_IdTransaccion3;
	}

	public Boolean getisVisibilidadFK_IdTransaccion4() {
		return this.isVisibilidadFK_IdTransaccion4;
	}

	public void setisVisibilidadFK_IdTransaccion4(Boolean isVisibilidadFK_IdTransaccion4) {
		this.isVisibilidadFK_IdTransaccion4=isVisibilidadFK_IdTransaccion4;
	}

	public Boolean getisVisibilidadFK_IdTransaccion5() {
		return this.isVisibilidadFK_IdTransaccion5;
	}

	public void setisVisibilidadFK_IdTransaccion5(Boolean isVisibilidadFK_IdTransaccion5) {
		this.isVisibilidadFK_IdTransaccion5=isVisibilidadFK_IdTransaccion5;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(TransaccionCliente transaccioncliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transaccioncliente,null);
				this.setActualParaGuardarModuloForeignKey(transaccioncliente,null);
				this.setActualParaGuardarTransaccion1ForeignKey(transaccioncliente,null);
				this.setActualParaGuardarTransaccion2ForeignKey(transaccioncliente,null);
				this.setActualParaGuardarTransaccion3ForeignKey(transaccioncliente,null);
				this.setActualParaGuardarTransaccion4ForeignKey(transaccioncliente,null);
				this.setActualParaGuardarTransaccion5ForeignKey(transaccioncliente,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(TransaccionCliente transaccioncliente,TransaccionCliente transaccionclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransaccionCliente(transaccioncliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transaccionclienteAux.setId(transaccioncliente.getId());
		transaccionclienteAux.setVersionRow(transaccioncliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTransaccionCliente();
		
			int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = transaccionclienteValidator.getInvalidValues(this.transaccioncliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			transaccionclienteLogic.setDatosCliente(datosCliente);
			transaccionclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				transaccionclienteAux=new  TransaccionCliente();
				
				transaccionclienteAux.setIsNew(true);
				transaccionclienteAux.setIsChanged(true);
				
				transaccionclienteAux.setTransaccionClienteOriginal(this.transaccioncliente);
				
				transaccionclienteAux.setId(this.transaccioncliente.getId());	
				transaccionclienteAux.setVersionRow(this.transaccioncliente.getVersionRow());	
				transaccionclienteAux.setid_empresa(this.transaccioncliente.getid_empresa());	
				transaccionclienteAux.setid_modulo(this.transaccioncliente.getid_modulo());	
				transaccionclienteAux.setnombre(this.transaccioncliente.getnombre());	
				transaccionclienteAux.setid_transaccion1(this.transaccioncliente.getid_transaccion1());	
				
				if(this.transaccioncliente.getid_transaccion2()!=null && this.transaccioncliente.getid_transaccion2()>0L) {
					transaccionclienteAux.setid_transaccion2(this.transaccioncliente.getid_transaccion2());
				} else {
					transaccionclienteAux.setid_transaccion2(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion3()!=null && this.transaccioncliente.getid_transaccion3()>0L) {
					transaccionclienteAux.setid_transaccion3(this.transaccioncliente.getid_transaccion3());
				} else {
					transaccionclienteAux.setid_transaccion3(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion4()!=null && this.transaccioncliente.getid_transaccion4()>0L) {
					transaccionclienteAux.setid_transaccion4(this.transaccioncliente.getid_transaccion4());
				} else {
					transaccionclienteAux.setid_transaccion4(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion5()!=null && this.transaccioncliente.getid_transaccion5()>0L) {
					transaccionclienteAux.setid_transaccion5(this.transaccioncliente.getid_transaccion5());
				} else {
					transaccionclienteAux.setid_transaccion5(null);
				}	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(transaccionclienteAux,transaccionclienteLogic.getTransaccionClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionclienteAux,transaccionclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteLogic.saveTransaccionClientes();//WithConnection
						//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccioncliente,transaccionclienteAux);
					
					this.refrescarForeignKeysDescripcionesTransaccionCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccionclienteLogic.saveTransaccionClienteRelaciones(transaccionclienteAux);//WithConnection
								//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.transaccioncliente,transaccionclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(transaccionclienteAux,transaccionclienteLogic.getTransaccionClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(transaccionclienteAux,transaccionclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.transaccioncliente,transaccionclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				transaccionclienteAux=new  TransaccionCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.transaccionclienteSessionBean.getEsGuardarRelacionado() && this.transaccioncliente.getId()>=0)) {
						
					transaccionclienteAux.setIsNew(false);
				}
				
				transaccionclienteAux.setIsDeleted(false);
			
				transaccionclienteAux.setId(this.transaccioncliente.getId());	
				transaccionclienteAux.setVersionRow(this.transaccioncliente.getVersionRow());	
				transaccionclienteAux.setid_empresa(this.transaccioncliente.getid_empresa());	
				transaccionclienteAux.setid_modulo(this.transaccioncliente.getid_modulo());	
				transaccionclienteAux.setnombre(this.transaccioncliente.getnombre());	
				transaccionclienteAux.setid_transaccion1(this.transaccioncliente.getid_transaccion1());	
				
				if(this.transaccioncliente.getid_transaccion2()!=null && this.transaccioncliente.getid_transaccion2()>0L) {
					transaccionclienteAux.setid_transaccion2(this.transaccioncliente.getid_transaccion2());
				} else {
					transaccionclienteAux.setid_transaccion2(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion3()!=null && this.transaccioncliente.getid_transaccion3()>0L) {
					transaccionclienteAux.setid_transaccion3(this.transaccioncliente.getid_transaccion3());
				} else {
					transaccionclienteAux.setid_transaccion3(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion4()!=null && this.transaccioncliente.getid_transaccion4()>0L) {
					transaccionclienteAux.setid_transaccion4(this.transaccioncliente.getid_transaccion4());
				} else {
					transaccionclienteAux.setid_transaccion4(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion5()!=null && this.transaccioncliente.getid_transaccion5()>0L) {
					transaccionclienteAux.setid_transaccion5(this.transaccioncliente.getid_transaccion5());
				} else {
					transaccionclienteAux.setid_transaccion5(null);
				}	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccionclienteAux,transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionclienteAux,transaccionclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteLogic.saveTransaccionClientes();//WithConnection
						//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccioncliente,transaccionclienteAux);
					
					this.refrescarForeignKeysDescripcionesTransaccionCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccionclienteLogic.saveTransaccionClienteRelaciones(transaccionclienteAux);//WithConnection
								//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.transaccioncliente,transaccionclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(transaccionclienteAux,transaccionclienteLogic.getTransaccionClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(transaccionclienteAux,transaccionclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.transaccioncliente,transaccionclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				transaccionclienteAux=new  TransaccionCliente();
				
				transaccionclienteAux.setIsNew(false);
				transaccionclienteAux.setIsChanged(false);
				
				transaccionclienteAux.setIsDeleted(true);
				
				transaccionclienteAux.setId(this.transaccioncliente.getId());	
				transaccionclienteAux.setVersionRow(this.transaccioncliente.getVersionRow());	
				transaccionclienteAux.setid_empresa(this.transaccioncliente.getid_empresa());	
				transaccionclienteAux.setid_modulo(this.transaccioncliente.getid_modulo());	
				transaccionclienteAux.setnombre(this.transaccioncliente.getnombre());	
				transaccionclienteAux.setid_transaccion1(this.transaccioncliente.getid_transaccion1());	
				
				if(this.transaccioncliente.getid_transaccion2()!=null && this.transaccioncliente.getid_transaccion2()>0L) {
					transaccionclienteAux.setid_transaccion2(this.transaccioncliente.getid_transaccion2());
				} else {
					transaccionclienteAux.setid_transaccion2(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion3()!=null && this.transaccioncliente.getid_transaccion3()>0L) {
					transaccionclienteAux.setid_transaccion3(this.transaccioncliente.getid_transaccion3());
				} else {
					transaccionclienteAux.setid_transaccion3(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion4()!=null && this.transaccioncliente.getid_transaccion4()>0L) {
					transaccionclienteAux.setid_transaccion4(this.transaccioncliente.getid_transaccion4());
				} else {
					transaccionclienteAux.setid_transaccion4(null);
				}	
				
				if(this.transaccioncliente.getid_transaccion5()!=null && this.transaccioncliente.getid_transaccion5()>0L) {
					transaccionclienteAux.setid_transaccion5(this.transaccioncliente.getid_transaccion5());
				} else {
					transaccionclienteAux.setid_transaccion5(null);
				}	
				
				if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.transaccionclienteAux.getId()>=0) {	
						this.transaccionclientesEliminados.add(transaccionclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(transaccionclienteAux,transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionclienteAux,transaccionclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteLogic.saveTransaccionClientes();//WithConnection
						//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccionclienteLogic.saveTransaccionClienteRelaciones(transaccionclienteAux);//WithConnection
								//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(transaccionclienteAux,transaccionclienteLogic.getTransaccionClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(transaccionclienteAux,transaccionclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getTransaccionClientes().addAll(this.transaccionclientesEliminados);
					
					transaccionclienteLogic.saveTransaccionClientes();//WithConnection
					//transaccionclienteLogic.getSetVersionRowTransaccionClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTransaccionCliente();
				
				this.transaccionclientesEliminados= new ArrayList<TransaccionCliente>();		
			}
			
			if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Analisis Transaccion Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.transaccioncliente=transaccionclienteAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTransaccionCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TransaccionCliente transaccionclienteLocal) throws Exception {
		
		if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TransaccionCliente transaccionclienteLocal) throws Exception {	
		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transaccionclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				transaccionclienteLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccion1BeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccion1BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccion1BeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccion1BeanSwingJInternalFrameLocal.actualizarLista(transaccion1BeanSwingJInternalFrameLocal.transaccion,this.transaccion1sForeignKey);

				transaccion1BeanSwingJInternalFrameLocal.actualizarRelaciones(transaccion1BeanSwingJInternalFrameLocal.transaccion);

				transaccionclienteLocal.setTransaccion1(transaccion1BeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion1();
				this.cargarCombosFrameTransaccion1sForeignKey("Formulario");
				this.setActualTransaccion1ForeignKey(transaccion1BeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccion2BeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccion2BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccion2BeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccion2BeanSwingJInternalFrameLocal.actualizarLista(transaccion2BeanSwingJInternalFrameLocal.transaccion,this.transaccion2sForeignKey);

				transaccion2BeanSwingJInternalFrameLocal.actualizarRelaciones(transaccion2BeanSwingJInternalFrameLocal.transaccion);

				transaccionclienteLocal.setTransaccion2(transaccion2BeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion2();
				this.cargarCombosFrameTransaccion2sForeignKey("Formulario");
				this.setActualTransaccion2ForeignKey(transaccion2BeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccion3BeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccion3BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccion3BeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccion3BeanSwingJInternalFrameLocal.actualizarLista(transaccion3BeanSwingJInternalFrameLocal.transaccion,this.transaccion3sForeignKey);

				transaccion3BeanSwingJInternalFrameLocal.actualizarRelaciones(transaccion3BeanSwingJInternalFrameLocal.transaccion);

				transaccionclienteLocal.setTransaccion3(transaccion3BeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion3();
				this.cargarCombosFrameTransaccion3sForeignKey("Formulario");
				this.setActualTransaccion3ForeignKey(transaccion3BeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccion4BeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccion4BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccion4BeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccion4BeanSwingJInternalFrameLocal.actualizarLista(transaccion4BeanSwingJInternalFrameLocal.transaccion,this.transaccion4sForeignKey);

				transaccion4BeanSwingJInternalFrameLocal.actualizarRelaciones(transaccion4BeanSwingJInternalFrameLocal.transaccion);

				transaccionclienteLocal.setTransaccion4(transaccion4BeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion4();
				this.cargarCombosFrameTransaccion4sForeignKey("Formulario");
				this.setActualTransaccion4ForeignKey(transaccion4BeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccion5BeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccion5BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccion5BeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccion5BeanSwingJInternalFrameLocal.actualizarLista(transaccion5BeanSwingJInternalFrameLocal.transaccion,this.transaccion5sForeignKey);

				transaccion5BeanSwingJInternalFrameLocal.actualizarRelaciones(transaccion5BeanSwingJInternalFrameLocal.transaccion);

				transaccionclienteLocal.setTransaccion5(transaccion5BeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion5();
				this.cargarCombosFrameTransaccion5sForeignKey("Formulario");
				this.setActualTransaccion5ForeignKey(transaccion5BeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransaccionClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transaccionclienteValidator.getInvalidValues(this.transaccioncliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TransaccionCliente transaccioncliente,List<TransaccionCliente> transaccionclientes) throws Exception {
		try	{		
			TransaccionClienteConstantesFunciones.actualizarLista(transaccioncliente,transaccionclientes,this.transaccionclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TransaccionCliente transaccioncliente,List<TransaccionCliente> transaccionclientes) throws Exception {
		try	{			
			TransaccionClienteConstantesFunciones.actualizarSelectedLista(transaccioncliente,transaccionclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TransaccionCliente> transaccionclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transaccionclientesLocal=this.transaccionclienteLogic.getTransaccionClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transaccionclientesLocal=this.transaccionclientes;
			}
			//ARCHITECTURE
		
			for(TransaccionCliente transaccionclienteLocal:transaccionclientesLocal) {
				if(this.permiteMantenimiento(transaccionclienteLocal) && transaccionclienteLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TransaccionClienteConstantesFunciones.getTransaccionClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_empresaTransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_moduloTransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelnombreTransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDTRANSACCION1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion1TransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDTRANSACCION2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion2TransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDTRANSACCION3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion3TransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDTRANSACCION4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion4TransaccionCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionClienteConstantesFunciones.IDTRANSACCION5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion5TransaccionCliente,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_empresaTransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_moduloTransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelnombreTransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion1TransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion2TransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion3TransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion4TransaccionCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionCliente.jLabelid_transaccion5TransaccionCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTransaccionCliente--;	
		
		
		this.transaccionclienteAux=new TransaccionCliente();
		
		this.transaccionclienteAux.setId(this.iIdNuevoTransaccionCliente);
		this.transaccionclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccionclienteLogic.getTransaccionClientes().add(this.transaccionclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transaccionclientes.add(this.transaccionclienteAux);
		}
		//ARCHITECTURE
		
		this.transaccioncliente=this.transaccionclienteAux;
		
		if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransaccionCliente(this.transaccioncliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionCliente(this.transaccioncliente);
		}
				
		//this.setDefaultControlesTransaccionCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransaccionCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransaccionCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionCliente(this.transaccionclienteBean,this.transaccioncliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TransaccionClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
			classes=TransaccionClienteConstantesFunciones.getClassesRelationshipsOfTransaccionCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.transaccionclienteReturnGeneral=transaccionclienteLogic.procesarEventosTransaccionClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccionclienteLogic.getTransaccionClientes(),this.transaccioncliente,this.transaccionclienteParameterGeneral,this.isEsNuevoTransaccionCliente,classes);//this.transaccionclienteLogic.getTransaccionCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransaccionCliente(this.transaccionclienteReturnGeneral,this.transaccionclienteBean,false);
		
		if(this.transaccionclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente());
		}
		
		if(this.transaccionclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente(),classes);//this.transaccionclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransaccionCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransaccionCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.RecargarFormTransaccionCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransaccionCliente(false);
						
			if(transaccionclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionCliente();
			}
			
			this.actualizarVisualTableDatosTransaccionCliente();
			
			this.jTableDatosTransaccionCliente.setRowSelectionInterval(this.getIndiceNuevoTransaccionCliente(), this.getIndiceNuevoTransaccionCliente());
			
			this.seleccionarFilaTablaTransaccionClienteActual();
						
			this.actualizarEstadoCeldasBotonesTransaccionCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransaccionCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarnombreTransaccionCliente);	
		//
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_empresaTransaccionCliente);//
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_moduloTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_transaccion1TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_transaccion2TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_transaccion3TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_transaccion4TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setEnabled(isHabilitar && this.transaccionclienteConstantesFunciones.activarid_transaccion5TransaccionCliente);
	};
	
	public void setDefaultControlesTransaccionCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransaccionCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transaccionclienteSessionBean.setConGuardarRelaciones(true);			
			this.transaccionclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.setVisible(true);
			
					
		} else {
			//this.transaccionclienteSessionBean.setConGuardarRelaciones(false);			
			this.transaccionclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransaccionCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
				if(transaccionclienteAux.getId().equals(this.iIdNuevoTransaccionCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionCliente transaccionclienteAux:this.transaccionclientes) {
				if(transaccionclienteAux.getId().equals(this.iIdNuevoTransaccionCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTransaccionCliente(TransaccionCliente transaccioncliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
				if(transaccionclienteAux.getId().equals(transaccioncliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionCliente transaccionclienteAux:this.transaccionclientes) {
				if(transaccionclienteAux.getId().equals(transaccioncliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTransaccionCliente(TransaccionCliente transaccionclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
				if(transaccionclienteAux.getTransaccionClienteOriginal().getId().equals(transaccionclienteOriginal.getId())) {
					existe=true;
					transaccionclienteOriginal.setId(transaccionclienteAux.getId());
					transaccionclienteOriginal.setVersionRow(transaccionclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionCliente transaccionclienteAux:this.transaccionclientes) {
				if(transaccionclienteAux.getTransaccionClienteOriginal().getId().equals(transaccionclienteOriginal.getId())) {
					existe=true;
					transaccionclienteOriginal.setId(transaccionclienteAux.getId());
					transaccionclienteOriginal.setVersionRow(transaccionclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransaccionCliente(Boolean esParaCancelar) throws Exception {
		transaccionclientesAux=new ArrayList<TransaccionCliente>();
		transaccionclienteAux=new TransaccionCliente();
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
					if(transaccionclienteAux.getId()<0) {
						transaccionclientesAux.add(transaccionclienteAux);
					}		
				}
				this.iIdNuevoTransaccionCliente=0L;
				this.transaccionclienteLogic.getTransaccionClientes().removeAll(transaccionclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionCliente transaccionclienteAux:this.transaccionclientes) {
					if(transaccionclienteAux.getId()<0) {
						transaccionclientesAux.add(transaccionclienteAux);
					}		
				}
				this.iIdNuevoTransaccionCliente=0L;
				this.transaccionclientes.removeAll(transaccionclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransaccionCliente 
					&& this.transaccionclienteLogic.getTransaccionClientes().size()>0
					) {
					transaccionclienteAux=this.transaccionclienteLogic.getTransaccionClientes().get(this.transaccionclienteLogic.getTransaccionClientes().size() - 1);
				
					if(transaccionclienteAux.getId()<0) {
						this.transaccionclienteLogic.getTransaccionClientes().remove(transaccionclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransaccionCliente && this.transaccionclientes.size()>0) {
					transaccionclienteAux=this.transaccionclientes.get(this.transaccionclientes.size() - 1);
				
					if(transaccionclienteAux.getId()<0) {
						this.transaccionclientes.remove(transaccionclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransaccionCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transaccioncliente.getId()<0) {
				this.transaccionclienteLogic.getTransaccionClientes().remove(this.transaccioncliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transaccioncliente.getId()<0) {
				this.transaccionclientes.remove(this.transaccioncliente);
			}
		}			
	}
	
	public void setEstadosInicialesTransaccionCliente(List<TransaccionCliente> transaccionclientesAux) throws Exception {
		TransaccionClienteConstantesFunciones.setEstadosInicialesTransaccionCliente(transaccionclientesAux);
	}
	
	public void setEstadosInicialesTransaccionCliente(TransaccionCliente transaccionclienteAux) throws Exception {
		TransaccionClienteConstantesFunciones.setEstadosInicialesTransaccionCliente(transaccionclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransaccionClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransaccionCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransaccionClienteActual()) {
				if(!this.isEsNuevoTransaccionCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransaccionCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransaccionCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransaccionClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Analisis Transaccion Cliente ?", "MANTENIMIENTO DE Analisis Transaccion Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransaccionCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TransaccionCliente transaccioncliente) throws Exception {
		TransaccionClienteConstantesFunciones.seleccionarAsignar(this.transaccioncliente,transaccioncliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransaccionCliente=this.isPermisoActualizarOriginalTransaccionCliente;
			
			
			this.seleccionarAsignar(transaccioncliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionClienteConstantesFunciones.quitarEspaciosTransaccionCliente(this.transaccioncliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTransaccionCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transaccionclienteSessionBean.setsFuncionBusquedaRapida(this.transaccionclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransaccionCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransaccionCliente(esParaCancelar);				
				this.cancelarNuevoTransaccionCliente(esParaCancelar);								
			}
			
			this.transaccioncliente=new TransaccionCliente();
			
			this.inicializarTransaccionCliente();
			
			this.actualizarEstadoCeldasBotonesTransaccionCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransaccionCliente() throws Exception {
		try {
			TransaccionClienteConstantesFunciones.inicializarTransaccionCliente(this.transaccioncliente);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transaccionclienteLogic.getTransaccionClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransaccionClientes(String sAccionBusqueda,List<TransaccionCliente> transaccionclientesParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="TransaccionCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransaccionClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransaccionClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TransaccionCliente"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Analisis Transaccion Clientes");		
		parameters.put("busquedapor", TransaccionClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransaccionCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransaccionClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransaccionClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransaccionCliente=new JRBeanArrayDataSource(TransaccionClienteJInternalFrame.TraerTransaccionClienteBeans(transaccionclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransaccionCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransaccionClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransaccionClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransaccionClienteBean.TraerTransaccionClienteBeans(transaccionclientesParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTransaccionClientes(sAccionBusqueda,sTipoArchivoReporte,transaccionclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransaccionClientes(sAccionBusqueda,sTipoArchivoReporte,transaccionclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransaccionClienteActionPerformed(null);
					//this.generarExcelReporteTransaccionClientes(sAccionBusqueda,sTipoArchivoReporte,transaccionclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransaccionClientes(sAccionBusqueda,sTipoArchivoReporte,transaccionclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransaccionClientes(sAccionBusqueda,sTipoArchivoReporte,transaccionclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransaccionClientes(sAccionBusqueda,sTipoArchivoReporte,transaccionclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransaccionClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionCliente> transaccionclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TransaccionCliente transaccioncliente : transaccionclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransaccionClienteConstantesFunciones.generarExcelReporteDataTransaccionCliente("NORMAL",row,workbook,transaccioncliente,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransaccionCliente(String sTipo,Row row,Workbook workbook) {
		
		TransaccionClienteConstantesFunciones.generarExcelReporteHeaderTransaccionCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransaccionClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionCliente> transaccionclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TransaccionCliente transaccioncliente : transaccionclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransaccionClienteConstantesFunciones.getTransaccionClienteDescripcion(transaccioncliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.gettransaccion1_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.gettransaccion2_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.gettransaccion3_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.gettransaccion4_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioncliente.gettransaccion5_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransaccionClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionCliente> transaccionclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TransaccionCliente> transaccionclientesRespaldo=null;
		
		classes=TransaccionClienteConstantesFunciones.getClassesRelationshipsOfTransaccionCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transaccionclienteLogic.setDatosCliente(this.datosCliente);
		this.transaccionclienteLogic.setDatosDeep(this.datosDeep);
		this.transaccionclienteLogic.setIsConDeep(true);
		
		transaccionclientesRespaldo=this.transaccionclienteLogic.getTransaccionClientes();
		
		this.transaccionclienteLogic.setTransaccionClientes(transaccionclientesParaReportes);	
		this.transaccionclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transaccionclientesParaReportes=this.transaccionclienteLogic.getTransaccionClientes();
		this.transaccionclienteLogic.setTransaccionClientes(transaccionclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TransaccionCliente transaccioncliente : transaccionclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransaccionCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransaccionClienteConstantesFunciones.generarExcelReporteDataTransaccionCliente("NORMAL",row,workbook,transaccioncliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransaccionClienteConstantesFunciones.getTransaccionClienteDescripcion(transaccioncliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransaccionCliente() throws Exception {		
		this.startProcessTransaccionCliente(true);
	}
	
	public void startProcessTransaccionCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransaccionCliente ,this.jPanelParametrosReportesTransaccionCliente, this.jScrollPanelDatosTransaccionCliente,this.jPanelPaginacionTransaccionCliente, this.jScrollPanelDatosEdicionTransaccionCliente, this.jPanelAccionesTransaccionCliente,this.jPanelAccionesFormularioTransaccionCliente,this.jmenuBarTransaccionCliente,this.jmenuBarDetalleTransaccionCliente,this.jTtoolBarTransaccionCliente,this.jTtoolBarDetalleTransaccionCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionCliente=this.jTabbedPaneBusquedasTransaccionCliente; 
		
		final JPanel jPanelParametrosReportesTransaccionCliente=this.jPanelParametrosReportesTransaccionCliente;
		//final JScrollPane jScrollPanelDatosTransaccionCliente=this.jScrollPanelDatosTransaccionCliente;
		final JTable jTableDatosTransaccionCliente=this.jTableDatosTransaccionCliente;		
		final JPanel jPanelPaginacionTransaccionCliente=this.jPanelPaginacionTransaccionCliente;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionCliente=this.jScrollPanelDatosEdicionTransaccionCliente;
		final JPanel jPanelAccionesTransaccionCliente=this.jPanelAccionesTransaccionCliente;
		
		JPanel jPanelCamposAuxiliarTransaccionCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			jPanelCamposAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jPanelCamposTransaccionCliente;
			jPanelAccionesFormularioAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jPanelAccionesFormularioTransaccionCliente;
		}
		
		final JPanel jPanelCamposTransaccionCliente=jPanelCamposAuxiliarTransaccionCliente;
		final JPanel jPanelAccionesFormularioTransaccionCliente=jPanelAccionesFormularioAuxiliarTransaccionCliente;
		
		
		final JMenuBar jmenuBarTransaccionCliente=this.jmenuBarTransaccionCliente;
		final JToolBar jTtoolBarTransaccionCliente=this.jTtoolBarTransaccionCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransaccionCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			jmenuBarDetalleAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jmenuBarDetalleTransaccionCliente;
			jTtoolBarDetalleAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jTtoolBarDetalleTransaccionCliente;
		}
		
		final JMenuBar jmenuBarDetalleTransaccionCliente=jmenuBarDetalleAuxiliarTransaccionCliente;
		final JToolBar jTtoolBarDetalleTransaccionCliente=jTtoolBarDetalleAuxiliarTransaccionCliente;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionCliente;
			processRunnable.jTableDatos=jTableDatosTransaccionCliente;
			processRunnable.jPanelCampos=jPanelCamposTransaccionCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionCliente;
			processRunnable.jTtoolBar=jTtoolBarTransaccionCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionCliente ,jPanelParametrosReportesTransaccionCliente,jTableDatosTransaccionCliente, /*jScrollPanelDatosTransaccionCliente,*/jPanelCamposTransaccionCliente,jPanelPaginacionTransaccionCliente, /*jScrollPanelDatosEdicionTransaccionCliente,*/ jPanelAccionesTransaccionCliente,jPanelAccionesFormularioTransaccionCliente,jmenuBarTransaccionCliente,jmenuBarDetalleTransaccionCliente,jTtoolBarTransaccionCliente,jTtoolBarDetalleTransaccionCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionCliente ,jPanelParametrosReportesTransaccionCliente, jScrollPanelDatosTransaccionCliente,jPanelPaginacionTransaccionCliente, jScrollPanelDatosEdicionTransaccionCliente, jPanelAccionesTransaccionCliente,jPanelAccionesFormularioTransaccionCliente,jmenuBarTransaccionCliente,jmenuBarDetalleTransaccionCliente,jTtoolBarTransaccionCliente,jTtoolBarDetalleTransaccionCliente);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTransaccionCliente() {// throws Exception 
		this.finishProcessTransaccionCliente(true);
	}
	
	public void finishProcessTransaccionCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransaccionCliente ,this.jPanelParametrosReportesTransaccionCliente, this.jScrollPanelDatosTransaccionCliente,this.jPanelPaginacionTransaccionCliente, this.jScrollPanelDatosEdicionTransaccionCliente, this.jPanelAccionesTransaccionCliente,this.jPanelAccionesFormularioTransaccionCliente,this.jmenuBarTransaccionCliente,this.jmenuBarDetalleTransaccionCliente,this.jTtoolBarTransaccionCliente,this.jTtoolBarDetalleTransaccionCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionCliente=this.jTabbedPaneBusquedasTransaccionCliente; 
		
		final JPanel jPanelParametrosReportesTransaccionCliente=this.jPanelParametrosReportesTransaccionCliente;
		//final JScrollPane jScrollPanelDatosTransaccionCliente=this.jScrollPanelDatosTransaccionCliente;
		final JTable jTableDatosTransaccionCliente=this.jTableDatosTransaccionCliente;		
		final JPanel jPanelPaginacionTransaccionCliente=this.jPanelPaginacionTransaccionCliente;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionCliente=this.jScrollPanelDatosEdicionTransaccionCliente;
		final JPanel jPanelAccionesTransaccionCliente=this.jPanelAccionesTransaccionCliente;
		
		JPanel jPanelCamposAuxiliarTransaccionCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			jPanelCamposAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jPanelCamposTransaccionCliente;
			jPanelAccionesFormularioAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jPanelAccionesFormularioTransaccionCliente;
		}
		
		final JPanel jPanelCamposTransaccionCliente=jPanelCamposAuxiliarTransaccionCliente;
		final JPanel jPanelAccionesFormularioTransaccionCliente=jPanelAccionesFormularioAuxiliarTransaccionCliente;
		
		
		final JMenuBar jmenuBarTransaccionCliente=this.jmenuBarTransaccionCliente;		
		final JToolBar jTtoolBarTransaccionCliente=this.jTtoolBarTransaccionCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTransaccionCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			jmenuBarDetalleAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jmenuBarDetalleTransaccionCliente;
			jTtoolBarDetalleAuxiliarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jTtoolBarDetalleTransaccionCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTransaccionCliente=jmenuBarDetalleAuxiliarTransaccionCliente;
		final JToolBar jTtoolBarDetalleTransaccionCliente=jTtoolBarDetalleAuxiliarTransaccionCliente;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionCliente;
			processRunnable.jTableDatos=jTableDatosTransaccionCliente;
			processRunnable.jPanelCampos=jPanelCamposTransaccionCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionCliente;
			processRunnable.jTtoolBar=jTtoolBarTransaccionCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransaccionCliente ,jPanelParametrosReportesTransaccionCliente, jTableDatosTransaccionCliente,/*jScrollPanelDatosTransaccionCliente,*/jPanelCamposTransaccionCliente,jPanelPaginacionTransaccionCliente, /*jScrollPanelDatosEdicionTransaccionCliente,*/ jPanelAccionesTransaccionCliente,jPanelAccionesFormularioTransaccionCliente,jmenuBarTransaccionCliente,jmenuBarDetalleTransaccionCliente,jTtoolBarTransaccionCliente,jTtoolBarDetalleTransaccionCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransaccionCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransaccionCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransaccionCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransaccionCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransaccionCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransaccionCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransaccionCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransaccionCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransaccionCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transaccionclienteConstantesFunciones.getsFinalQueryTransaccionCliente();
		String  finalQueryPaginacionTodos=this.transaccionclienteConstantesFunciones.getsFinalQueryTransaccionCliente();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TransaccionClienteConstantesFunciones.getArrayColumnasGlobalesNoTransaccionCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransaccionClienteConstantesFunciones.getArrayColumnasGlobalesTransaccionCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransaccionClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transaccionclientesEliminados= new ArrayList<TransaccionCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransaccionCliente();
		
				///*TransaccionClienteSessionBean*/this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			
			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TransaccionClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransaccionClienteConstantesFunciones.getClassesForeignKeysOfTransaccionCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transaccioncliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transaccionclientesAux= new ArrayList<TransaccionCliente>();
			
				
			transaccionclienteLogic.setDatosCliente(this.datosCliente);
			transaccionclienteLogic.setDatosDeep(this.datosDeep);
			transaccionclienteLogic.setIsConDeep(true);
			
			
			transaccionclienteLogic.getTransaccionClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					transaccionclienteLogic.getTodosTransaccionClientes(finalQueryGlobal,pagination);
					
					//transaccionclienteLogic.getTodosTransaccionClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(transaccionclienteLogic.getTransaccionClientes()==null|| transaccionclienteLogic.getTransaccionClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccionclientesAux= new ArrayList<TransaccionCliente>();
							transaccionclientesAux.addAll(transaccionclienteLogic.getTransaccionClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientesAux= new ArrayList<TransaccionCliente>();
							transaccionclientesAux.addAll(transaccionclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccionclienteLogic.getTodosTransaccionClientes(finalQueryGlobal+"",this.pagination);												
							
							//transaccionclienteLogic.getTodosTransaccionClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTransaccionClientes("Todos",transaccionclienteLogic.getTransaccionClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccionclienteLogic.setTransaccionClientes(new ArrayList<TransaccionCliente>());					
							transaccionclienteLogic.getTransaccionClientes().addAll(transaccionclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientes=new ArrayList<TransaccionCliente>();
							transaccionclientes.addAll(transaccionclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTransaccionCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTransaccionCliente=this.idActual;
				
				} else if(this.idTransaccionClienteActual!=null && this.idTransaccionClienteActual!=0L) {
					idTransaccionCliente=idTransaccionClienteActual;
				}
				
					
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndicePorId(idTransaccionCliente);
				
				this.transaccionclientes=new ArrayList<TransaccionCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					transaccionclienteLogic.getEntity(idTransaccionCliente);
					
					//transaccionclienteLogic.getEntityWithConnection(idTransaccionCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.setTransaccionClientes(new ArrayList<TransaccionCliente>());
					transaccionclienteLogic.getTransaccionClientes().add(transaccionclienteLogic.getTransaccionCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccionclientes=new ArrayList<TransaccionCliente>();
					this.transaccionclientes.add(transaccioncliente);
				}
				
				if(transaccionclienteLogic.getTransaccionCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionclienteLogic.getTransaccionClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionclienteLogic.getTransaccionClientes()==null||transaccionclienteLogic.getTransaccionClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccionclientes==null|| transaccionclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclientesAux=new ArrayList<TransaccionCliente>();
						transaccionclientesAux.addAll(transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientesAux=new ArrayList<TransaccionCliente>();
							transaccionclientesAux.addAll(transaccionclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionclienteLogic.getTransaccionClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionClientes("BusquedaPorNombre",transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionClientes("BusquedaPorNombre",transaccionclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteLogic.setTransaccionClientes(new ArrayList<TransaccionCliente>());
						transaccionclienteLogic.getTransaccionClientes().addAll(transaccionclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientes=new ArrayList<TransaccionCliente>();
							transaccionclientes.addAll(transaccionclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionclienteLogic.getTransaccionClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionclienteLogic.getTransaccionClientes()==null||transaccionclienteLogic.getTransaccionClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccionclientes==null|| transaccionclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclientesAux=new ArrayList<TransaccionCliente>();
						transaccionclientesAux.addAll(transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientesAux=new ArrayList<TransaccionCliente>();
							transaccionclientesAux.addAll(transaccionclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionclienteLogic.getTransaccionClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionClientes("FK_IdEmpresa",transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionClientes("FK_IdEmpresa",transaccionclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteLogic.setTransaccionClientes(new ArrayList<TransaccionCliente>());
						transaccionclienteLogic.getTransaccionClientes().addAll(transaccionclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientes=new ArrayList<TransaccionCliente>();
							transaccionclientes.addAll(transaccionclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionclienteLogic.getTransaccionClientesFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionclienteLogic.getTransaccionClientes()==null||transaccionclienteLogic.getTransaccionClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccionclientes==null|| transaccionclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclientesAux=new ArrayList<TransaccionCliente>();
						transaccionclientesAux.addAll(transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientesAux=new ArrayList<TransaccionCliente>();
							transaccionclientesAux.addAll(transaccionclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionclienteLogic.getTransaccionClientesFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionClienteConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionClientes("FK_IdModulo",transaccionclienteLogic.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionClientes("FK_IdModulo",transaccionclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteLogic.setTransaccionClientes(new ArrayList<TransaccionCliente>());
						transaccionclienteLogic.getTransaccionClientes().addAll(transaccionclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclientes=new ArrayList<TransaccionCliente>();
							transaccionclientes.addAll(transaccionclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransaccionCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransaccionCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccionclienteLogic.getTransaccionClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccionclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccionclienteLogic.getTransaccionClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccionclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TransaccionCliente transaccioncliente) {
		Boolean permite=true;
		
		if(this.transaccioncliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransaccionClienteConstantesFunciones.getOrderByListaTransaccionCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransaccionClienteConstantesFunciones.getOrderByListaTransaccionCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionCliente transaccioncliente:transaccionclienteLogic.getTransaccionClientes()) {
				if(transaccioncliente.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionclienteTotales=transaccioncliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionCliente transaccioncliente:this.transaccionclientes) {
				if(transaccioncliente.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionclienteTotales=transaccioncliente;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.transaccionclienteAux=new TransaccionCliente();
			this.transaccionclienteAux.setsType(Constantes2.S_TOTALES);
			this.transaccionclienteAux.setIsNew(false);
			this.transaccionclienteAux.setIsChanged(false);
			this.transaccionclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TransaccionClienteConstantesFunciones.TotalizarValoresFilaTransaccionCliente(this.transaccionclienteLogic.getTransaccionClientes(),this.transaccionclienteAux);
				
				this.transaccionclienteLogic.getTransaccionClientes().add(this.transaccionclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransaccionClienteConstantesFunciones.TotalizarValoresFilaTransaccionCliente(this.transaccionclientes,this.transaccionclienteAux);
				
				this.transaccionclientes.add(this.transaccionclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transaccionclienteTotales=new TransaccionCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccionclienteLogic.getTransaccionClientes().remove(transaccionclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccionclientes.remove(transaccionclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transaccionclienteTotales=new TransaccionCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionCliente transaccioncliente:transaccionclienteLogic.getTransaccionClientes()) {
				if(transaccioncliente.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionclienteTotales=transaccioncliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionClienteConstantesFunciones.TotalizarValoresFilaTransaccionCliente(this.transaccionclienteLogic.getTransaccionClientes(),transaccionclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionCliente transaccioncliente:this.transaccionclientes) {
				if(transaccioncliente.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionclienteTotales=transaccioncliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionClienteConstantesFunciones.TotalizarValoresFilaTransaccionCliente(this.transaccionclientes,transaccionclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransaccionClientesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdTransaccion1()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion1";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdTransaccion2()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion2";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdTransaccion3()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion3";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdTransaccion4()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion4";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionClientesFK_IdTransaccion5()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion5";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransaccionClientesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdTransaccion1(String sFinalQuery,Long id_transaccion1)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdTransaccion1(sFinalQuery,this.pagination,id_transaccion1);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdTransaccion2(String sFinalQuery,Long id_transaccion2)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdTransaccion2(sFinalQuery,this.pagination,id_transaccion2);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdTransaccion3(String sFinalQuery,Long id_transaccion3)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdTransaccion3(sFinalQuery,this.pagination,id_transaccion3);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdTransaccion4(String sFinalQuery,Long id_transaccion4)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdTransaccion4(sFinalQuery,this.pagination,id_transaccion4);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionClientesFK_IdTransaccion5(String sFinalQuery,Long id_transaccion5)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLogic.getTransaccionClientesFK_IdTransaccion5(sFinalQuery,this.pagination,id_transaccion5);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTransaccionCliente() {
		this.isPermisoTodoTransaccionCliente=false;
		this.isPermisoNuevoTransaccionCliente=false;
		this.isPermisoActualizarTransaccionCliente=false;
		this.isPermisoActualizarOriginalTransaccionCliente=false;
		this.isPermisoEliminarTransaccionCliente=false;
		this.isPermisoGuardarCambiosTransaccionCliente=false;
		this.isPermisoConsultaTransaccionCliente=false;
		this.isPermisoBusquedaTransaccionCliente=false;
		this.isPermisoReporteTransaccionCliente=false;		
		this.isPermisoOrdenTransaccionCliente=false;		
		this.isPermisoPaginacionMedioTransaccionCliente=false;		
		this.isPermisoPaginacionAltoTransaccionCliente=false;
		this.isPermisoPaginacionTodoTransaccionCliente=false;
		this.isPermisoCopiarTransaccionCliente=false;		
		this.isPermisoVerFormTransaccionCliente=false;		
		this.isPermisoDuplicarTransaccionCliente=false;		
		this.isPermisoOrdenTransaccionCliente=false;		
	}
	
	public void setPermisosUsuarioTransaccionCliente(Boolean isPermiso) {
		this.isPermisoTodoTransaccionCliente=isPermiso;
		this.isPermisoNuevoTransaccionCliente=isPermiso;
		this.isPermisoActualizarTransaccionCliente=isPermiso;
		this.isPermisoActualizarOriginalTransaccionCliente=isPermiso;
		this.isPermisoEliminarTransaccionCliente=isPermiso;
		this.isPermisoGuardarCambiosTransaccionCliente=isPermiso;
		this.isPermisoConsultaTransaccionCliente=isPermiso;
		this.isPermisoBusquedaTransaccionCliente=isPermiso;
		this.isPermisoReporteTransaccionCliente=isPermiso;
		this.isPermisoOrdenTransaccionCliente=isPermiso;		
		this.isPermisoPaginacionMedioTransaccionCliente=isPermiso;		
		this.isPermisoPaginacionAltoTransaccionCliente=isPermiso;		
		this.isPermisoPaginacionTodoTransaccionCliente=isPermiso;		
		this.isPermisoCopiarTransaccionCliente=isPermiso;		
		this.isPermisoVerFormTransaccionCliente=isPermiso;		
		this.isPermisoDuplicarTransaccionCliente=isPermiso;
		this.isPermisoOrdenTransaccionCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransaccionCliente(Boolean isPermiso) {
		//this.isPermisoTodoTransaccionCliente=isPermiso;
		this.isPermisoNuevoTransaccionCliente=isPermiso;
		this.isPermisoActualizarTransaccionCliente=isPermiso;
		this.isPermisoActualizarOriginalTransaccionCliente=isPermiso;
		this.isPermisoEliminarTransaccionCliente=isPermiso;
		this.isPermisoGuardarCambiosTransaccionCliente=isPermiso;
		//this.isPermisoConsultaTransaccionCliente=isPermiso;
		//this.isPermisoBusquedaTransaccionCliente=isPermiso;
		//this.isPermisoReporteTransaccionCliente=isPermiso;
		//this.isPermisoOrdenTransaccionCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTransaccionCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTransaccionCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTransaccionCliente=isPermiso;		
		//this.isPermisoCopiarTransaccionCliente=isPermiso;		
		//this.isPermisoDuplicarTransaccionCliente=isPermiso;
		//this.isPermisoOrdenTransaccionCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransaccionClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransaccionCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransaccionClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransaccionClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransaccionClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransaccionCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransaccionClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransaccionClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransaccionCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransaccionCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransaccionCliente=this.isPermisoActualizarTransaccionCliente;
			this.isPermisoEliminarTransaccionCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransaccionCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransaccionCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransaccionCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransaccionCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransaccionCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransaccionCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransaccionCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransaccionCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransaccionCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransaccionCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransaccionCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransaccionCliente.setToolTipText(this.jTableDatosTransaccionCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransaccionCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransaccionCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransaccionClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TransaccionClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTransaccionCliente() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTransaccionClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.transaccion1sForeignKey=new ArrayList();
				this.transaccion2sForeignKey=new ArrayList();
				this.transaccion3sForeignKey=new ArrayList();
				this.transaccion4sForeignKey=new ArrayList();
				this.transaccion5sForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransaccionClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransaccionClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTransaccionClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccion1Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccion2Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccion3Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccion4Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccion5Listas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion1Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccion1sForeignKey==null||this.transaccion1sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccion1sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion2Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccion2sForeignKey==null||this.transaccion2sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccion2sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion3Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccion3sForeignKey==null||this.transaccion3sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccion3sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion4Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccion4sForeignKey==null||this.transaccion4sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccion4sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion5Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccion5sForeignKey==null||this.transaccion5sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccion5sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTransaccionClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TransaccionClienteParameterReturnGeneral transaccionclienteReturnGeneral=new TransaccionClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_empresaTransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_empresaTransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_moduloTransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_moduloTransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTransaccion1="";

				if(((this.transaccion1sForeignKey==null||this.transaccion1sForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_transaccion1TransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_transaccion1TransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion1()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion1=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion1=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion1, "");
						finalQueryGlobalTransaccion1+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccion1sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion1=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidTransaccion1Actual();
					}
				} else {
					finalQueryGlobalTransaccion1="NONE";
				}


				String finalQueryGlobalTransaccion2="";

				if(((this.transaccion2sForeignKey==null||this.transaccion2sForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_transaccion2TransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_transaccion2TransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion2()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion2=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion2=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion2, "");
						finalQueryGlobalTransaccion2+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccion2sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion2=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidTransaccion2Actual();
					}
				} else {
					finalQueryGlobalTransaccion2="NONE";
				}


				String finalQueryGlobalTransaccion3="";

				if(((this.transaccion3sForeignKey==null||this.transaccion3sForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_transaccion3TransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_transaccion3TransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion3()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion3=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion3=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion3, "");
						finalQueryGlobalTransaccion3+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccion3sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion3=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidTransaccion3Actual();
					}
				} else {
					finalQueryGlobalTransaccion3="NONE";
				}


				String finalQueryGlobalTransaccion4="";

				if(((this.transaccion4sForeignKey==null||this.transaccion4sForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_transaccion4TransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_transaccion4TransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion4()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion4=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion4=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion4, "");
						finalQueryGlobalTransaccion4+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccion4sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion4=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidTransaccion4Actual();
					}
				} else {
					finalQueryGlobalTransaccion4="NONE";
				}


				String finalQueryGlobalTransaccion5="";

				if(((this.transaccion5sForeignKey==null||this.transaccion5sForeignKey.size()<=0) && this.transaccionclienteConstantesFunciones.cargarid_transaccion5TransaccionCliente)
					 || (this.esRecargarFks && this.transaccionclienteConstantesFunciones.cargarid_transaccion5TransaccionCliente)) {

					if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion5()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion5=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion5=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion5, "");
						finalQueryGlobalTransaccion5+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccion5sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion5=" WHERE " + ConstantesSql.ID + "="+transaccionclienteSessionBean.getlidTransaccion5Actual();
					}
				} else {
					finalQueryGlobalTransaccion5="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				transaccionclienteReturnGeneral=transaccionclienteLogic.cargarCombosLoteForeignKeyTransaccionCliente(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalTransaccion1,finalQueryGlobalTransaccion2,finalQueryGlobalTransaccion3,finalQueryGlobalTransaccion4,finalQueryGlobalTransaccion5);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=transaccionclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=transaccionclienteReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTransaccion1.equals("NONE")) {
				this.transaccion1sForeignKey=transaccionclienteReturnGeneral.gettransaccion1sForeignKey();
			}

			if(!finalQueryGlobalTransaccion2.equals("NONE")) {
				this.transaccion2sForeignKey=transaccionclienteReturnGeneral.gettransaccion2sForeignKey();
			}

			if(!finalQueryGlobalTransaccion3.equals("NONE")) {
				this.transaccion3sForeignKey=transaccionclienteReturnGeneral.gettransaccion3sForeignKey();
			}

			if(!finalQueryGlobalTransaccion4.equals("NONE")) {
				this.transaccion4sForeignKey=transaccionclienteReturnGeneral.gettransaccion4sForeignKey();
			}

			if(!finalQueryGlobalTransaccion5.equals("NONE")) {
				this.transaccion5sForeignKey=transaccionclienteReturnGeneral.gettransaccion5sForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTransaccionCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTransaccion1();
			this.addItemDefectoCombosForeignKeyTransaccion2();
			this.addItemDefectoCombosForeignKeyTransaccion3();
			this.addItemDefectoCombosForeignKeyTransaccion4();
			this.addItemDefectoCombosForeignKeyTransaccion5();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transaccionclienteSessionBean==null) {
				this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
			}

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion1()throws Exception {
		try {

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion1()) {
				Transaccion transaccion1=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion1,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion1.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccion1sForeignKey,transaccion1,true)) {

					this.transaccion1sForeignKey.add(0,transaccion1);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion2()throws Exception {
		try {

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion2()) {
				Transaccion transaccion2=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion2,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion2.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccion2sForeignKey,transaccion2,true)) {

					this.transaccion2sForeignKey.add(0,transaccion2);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion3()throws Exception {
		try {

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion3()) {
				Transaccion transaccion3=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion3,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion3.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccion3sForeignKey,transaccion3,true)) {

					this.transaccion3sForeignKey.add(0,transaccion3);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion4()throws Exception {
		try {

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion4()) {
				Transaccion transaccion4=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion4,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion4.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccion4sForeignKey,transaccion4,true)) {

					this.transaccion4sForeignKey.add(0,transaccion4);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion5()throws Exception {
		try {

			if(!this.transaccionclienteSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion5()) {
				Transaccion transaccion5=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion5,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion5.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccion5sForeignKey,transaccion5,true)) {

					this.transaccion5sForeignKey.add(0,transaccion5);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransaccionCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransaccionCliente(TransaccionCliente transaccioncliente)throws Exception {	
		try {
			
			this.setActualTransaccion1ForeignKey(transaccioncliente.getid_transaccion1(),false,"Formulario");
			this.setActualTransaccion2ForeignKey(transaccioncliente.getid_transaccion2(),false,"Formulario");
			this.setActualTransaccion3ForeignKey(transaccioncliente.getid_transaccion3(),false,"Formulario");
			this.setActualTransaccion4ForeignKey(transaccioncliente.getid_transaccion4(),false,"Formulario");
			this.setActualTransaccion5ForeignKey(transaccioncliente.getid_transaccion5(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransaccionCliente(TransaccionCliente transaccioncliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransaccionCliente()throws Exception {	
		try {
			
			this.setActualTransaccion1ForeignKey(this.transaccionclienteConstantesFunciones.getid_transaccion1(),false,"Formulario");
			this.setActualTransaccion2ForeignKey(this.transaccionclienteConstantesFunciones.getid_transaccion2(),false,"Formulario");
			this.setActualTransaccion3ForeignKey(this.transaccionclienteConstantesFunciones.getid_transaccion3(),false,"Formulario");
			this.setActualTransaccion4ForeignKey(this.transaccionclienteConstantesFunciones.getid_transaccion4(),false,"Formulario");
			this.setActualTransaccion5ForeignKey(this.transaccionclienteConstantesFunciones.getid_transaccion5(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransaccionCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransaccionCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransaccionCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransaccionCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTransaccion1sForeignKey("Todos");
			this.cargarCombosFrameTransaccion2sForeignKey("Todos");
			this.cargarCombosFrameTransaccion3sForeignKey("Todos");
			this.cargarCombosFrameTransaccion4sForeignKey("Todos");
			this.cargarCombosFrameTransaccion5sForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransaccionCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccion1sForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccion2sForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccion3sForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccion4sForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccion5sForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransaccionCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public TransaccionClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransaccionClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransaccionClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transaccionclienteSessionBean=new TransaccionClienteSessionBean(); 
		this.transaccionclienteConstantesFunciones=new TransaccionClienteConstantesFunciones(); 
		this.transaccionclienteBean=new TransaccionCliente();//(this.transaccionclienteConstantesFunciones); 		
		this.transaccionclienteReturnGeneral=new TransaccionClienteParameterReturnGeneral(); 
		
		this.transaccionclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransaccionClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransaccionClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransaccionClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransaccionCliente(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.transaccionclienteConstantesFunciones=new TransaccionClienteConstantesFunciones(); 
			this.transaccionclienteBean=new TransaccionCliente();//this.transaccionclienteConstantesFunciones); 			
			this.transaccionclienteReturnGeneral=new TransaccionClienteParameterReturnGeneral(); 
		
			TransaccionClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Analisis Transaccion Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.transaccioncliente=new TransaccionCliente();
			this.transaccionclientes = new ArrayList<TransaccionCliente>();
			this.transaccionclientesAux = new ArrayList<TransaccionCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic=new TransaccionClienteLogic();
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.transaccionclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transaccionclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransaccionCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionCliente);	
					}
					
					if(this.jInternalFrameImportacionTransaccionCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransaccionCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransaccionCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionCliente);
				this.jInternalFrameDetalleFormTransaccionCliente.setVisible(false);
				this.jInternalFrameDetalleFormTransaccionCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionCliente);
					this.jInternalFrameReporteDinamicoTransaccionCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTransaccionCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransaccionCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionCliente);
					this.jInternalFrameImportacionTransaccionCliente.setVisible(false);
					this.jInternalFrameImportacionTransaccionCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransaccionCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionCliente);
					this.jInternalFrameOrderByTransaccionCliente.setVisible(false);
					this.jInternalFrameOrderByTransaccionCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransaccionClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransaccionClienteConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.transaccionclienteReturnGeneral=new TransaccionClienteParameterReturnGeneral();
			
			this.transaccionclienteParameterGeneral=new TransaccionClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transaccionclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TransaccionClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccionclienteSessionBean.getEsGuardarRelacionado(),this.transaccionclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccionclienteSessionBean.getEsGuardarRelacionado(),this.transaccionclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaDuplicarTransaccionCliente=true;
			this.isVisibilidadCeldaCopiarTransaccionCliente=true;
			this.isVisibilidadCeldaVerFormTransaccionCliente=true;
			this.isVisibilidadCeldaOrdenTransaccionCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
			this.isVisibilidadCeldaModificarTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=false;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTransaccion1=true;
			this.isVisibilidadFK_IdTransaccion2=true;
			this.isVisibilidadFK_IdTransaccion3=true;
			this.isVisibilidadFK_IdTransaccion4=true;
			this.isVisibilidadFK_IdTransaccion5=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransaccionCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransaccionCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransaccionCliente(false);
			
			this.setPermisosUsuarioTransaccionCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.transaccionclienteSessionBean.getEsGuardarRelacionado() && this.transaccionclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransaccionClienteClasesRelacionadas();
			}
			
			if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransaccionClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransaccionCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransaccionCliente();
			}
			
			if(!this.isPermisoBusquedaTransaccionCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTransaccionCliente,this.isPermisoPaginacionMedioTransaccionCliente,this.isPermisoPaginacionTodoTransaccionCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransaccionClienteConstantesFunciones.getTiposSeleccionarTransaccionCliente());
				
				this.tiposColumnasSelect=TransaccionClienteConstantesFunciones.getTiposSeleccionarTransaccionCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransaccionCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTransaccionCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTransaccionCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionCliente() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.moduloLogic=new ModuloLogic();
			this.transaccion1Logic=new TransaccionLogic();
			this.transaccion2Logic=new TransaccionLogic();
			this.transaccion3Logic=new TransaccionLogic();
			this.transaccion4Logic=new TransaccionLogic();
			this.transaccion5Logic=new TransaccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transaccionclienteImplementable= (TransaccionClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transaccionclienteImplementableHome= (TransaccionClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transaccionclientes= new ArrayList<TransaccionCliente>();
			this.transaccionclientesEliminados= new ArrayList<TransaccionCliente>();
						
			this.isEsNuevoTransaccionCliente=false;
			this.esParaAccionDesdeFormularioTransaccionCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.transaccion1sForeignKey=new ArrayList<Transaccion>() ;
			this.transaccion2sForeignKey=new ArrayList<Transaccion>() ;
			this.transaccion3sForeignKey=new ArrayList<Transaccion>() ;
			this.transaccion4sForeignKey=new ArrayList<Transaccion>() ;
			this.transaccion5sForeignKey=new ArrayList<Transaccion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransaccionCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransaccionCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransaccionClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransaccionClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransaccionCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransaccionCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransaccionCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransaccionCliente();
			}
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransaccionCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransaccionCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransaccionCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransaccionCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TransaccionCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransaccionCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransaccionCliente")) {
				iIndex=this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransaccionCliente();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyTransaccionCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransaccionCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransaccionCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransaccionClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransaccionCliente();
		
		this.cargarCombosFrameForeignKeyTransaccionCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransaccionCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransaccionCliente();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccion1(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccion1Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion1();
				this.cargarCombosFrameTransaccion1sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion1(this.transaccion1sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion2(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccion2Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion2();
				this.cargarCombosFrameTransaccion2sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion2(this.transaccion2sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion3(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccion3Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion3();
				this.cargarCombosFrameTransaccion3sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion3(this.transaccion3sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion4(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccion4Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion4();
				this.cargarCombosFrameTransaccion4sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion4(this.transaccion4sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion5(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccion5Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion5();
				this.cargarCombosFrameTransaccion5sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion5(this.transaccion5sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTransaccionClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			
			if(jTableDatosTransaccionCliente.getRowCount()>=1) {
				jTableDatosTransaccionCliente.removeRowSelectionInterval(0, jTableDatosTransaccionCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTransaccionCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransaccionCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransaccionCliente(true);			
			//this.transaccioncliente=new TransaccionCliente();
			//this.transaccioncliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionCliente() ;
			
			if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transaccioncliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);				
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TransaccionCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransaccionClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransaccionCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransaccionCliente.getSelectedRows().length;			
			}
			
			transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransaccionCliente--;			
				//TransaccionCliente transaccionclienteAux= new TransaccionCliente();			
				//transaccionclienteAux.setId(this.iIdNuevoTransaccionCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TransaccionCliente transaccionclienteOrigen=new TransaccionCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TransaccionCliente transaccionclienteOrigen : transaccionclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transaccionclienteOrigen =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionclienteOrigen =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransaccionCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transaccioncliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransaccionCliente(transaccionclienteOrigen,this.transaccioncliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccionclienteLogic.getTransaccionClientes().add(this.transaccionclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccionclientes.add(this.transaccionclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
				
				this.jTableDatosTransaccionCliente.setRowSelectionInterval(this.getIndiceNuevoTransaccionCliente(), this.getIndiceNuevoTransaccionCliente());
				
				int iLastRow =  this.jTableDatosTransaccionCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();									
		
			TransaccionCliente transaccionclienteOrigen=new TransaccionCliente();
			TransaccionCliente transaccionclienteDestino=new TransaccionCliente();
				
			transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransaccionCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transaccionclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransaccionCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteOrigen =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccionclienteOrigen =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionclienteDestino =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccionclienteDestino =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transaccionclienteOrigen =transaccionclientesSeleccionados.get(0);
				transaccionclienteDestino =transaccionclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransaccionCliente(transaccionclienteOrigen,transaccionclienteDestino,true,false);
				
				transaccionclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccionclienteDestino,transaccionclienteLogic.getTransaccionClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionclienteDestino,transaccionclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
				
				//this.jTableDatosTransaccionCliente.setRowSelectionInterval(this.getIndiceNuevoTransaccionCliente(), this.getIndiceNuevoTransaccionCliente());
				
				int iLastRow =  this.jTableDatosTransaccionCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransaccionCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransaccionCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransaccionCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransaccionCliente.setVisible(!isVisible);
			this.jPanelPaginacionTransaccionCliente.setVisible(!isVisible);
			this.jPanelAccionesTransaccionCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransaccionCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransaccionCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransaccionCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransaccionCliente();
			
			this.abrirFrameOrderByTransaccionCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransaccionCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransaccionCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransaccionCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTransaccionCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransaccionCliente.setSize(this.jInternalFrameDetalleFormTransaccionCliente.iWidthFormulario,this.jInternalFrameDetalleFormTransaccionCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransaccionCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransaccionCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransaccionCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTransaccionCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransaccionCliente.jContentPaneDetalleTransaccionCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionCliente.jContentPaneDetalleTransaccionCliente.getWidth(),TransaccionClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionCliente.jContentPaneDetalleTransaccionCliente.getWidth(),TransaccionClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransaccionCliente.jContentPaneDetalleTransaccionCliente.getWidth(),TransaccionClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransaccionCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTransaccionCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransaccionCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransaccionCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransaccionCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionCliente,false,this);
				} else {
					this.jInternalFrameOrderByTransaccionCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionCliente);
				this.jInternalFrameOrderByTransaccionCliente.setVisible(false);
				this.jInternalFrameOrderByTransaccionCliente.setSelected(false);
				
				this.jInternalFrameOrderByTransaccionCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTransaccionCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransaccionCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransaccionCliente==null) {
				
				this.jInternalFrameImportacionTransaccionCliente=new ImportacionJInternalFrame(TransaccionClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionCliente);
				this.jInternalFrameImportacionTransaccionCliente.setVisible(false);
				this.jInternalFrameImportacionTransaccionCliente.setSelected(false);


				this.jInternalFrameImportacionTransaccionCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionCliente"));
				this.jInternalFrameImportacionTransaccionCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionCliente"));
				this.jInternalFrameImportacionTransaccionCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransaccionCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransaccionCliente==null) {
				this.jInternalFrameReporteDinamicoTransaccionCliente=new ReporteDinamicoJInternalFrame(TransaccionClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionCliente);
				this.jInternalFrameReporteDinamicoTransaccionCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTransaccionCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionCliente"));
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionCliente"));
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTransaccionCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionCliente);
			
	       	this.jInternalFrameDetalleFormTransaccionCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTransaccionCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransaccionCliente.dispose();
			//this.jInternalFrameDetalleFormTransaccionCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransaccionCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransaccionCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransaccionCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransaccionCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransaccionCliente.setVisible(true);
	        this.jInternalFrameImportacionTransaccionCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransaccionCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransaccionCliente.setVisible(true);
	        this.jInternalFrameOrderByTransaccionCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransaccionCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransaccionCliente.setVisible(false);
	        this.jInternalFrameOrderByTransaccionCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransaccionCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransaccionCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransaccionCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransaccionCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransaccionCliente.setVisible(false);
	        this.jInternalFrameImportacionTransaccionCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransaccionCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransaccionCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransaccionCliente(true);
			//this.isEsNuevoTransaccionCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransaccionCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionCliente(false) ;
			
			if(transaccionclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransaccionClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransaccionCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransaccionCliente(true);
			//this.isEsNuevoTransaccionCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transaccioncliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransaccionCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransaccionCliente(false) ;
			
			if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTransaccion1(List<Transaccion> transaccion1sForeignKey)throws Exception{
		TableColumn tableColumnTransaccion1=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1));
		TableCellEditor tableCellEditorTransaccion1 =tableColumnTransaccion1.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion1;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccion1sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccion1sForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion2(List<Transaccion> transaccion2sForeignKey)throws Exception{
		TableColumn tableColumnTransaccion2=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2));
		TableCellEditor tableCellEditorTransaccion2 =tableColumnTransaccion2.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion2;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccion2sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccion2sForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion3(List<Transaccion> transaccion3sForeignKey)throws Exception{
		TableColumn tableColumnTransaccion3=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3));
		TableCellEditor tableCellEditorTransaccion3 =tableColumnTransaccion3.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion3;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccion3sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccion3sForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion4(List<Transaccion> transaccion4sForeignKey)throws Exception{
		TableColumn tableColumnTransaccion4=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4));
		TableCellEditor tableCellEditorTransaccion4 =tableColumnTransaccion4.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion4;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccion4sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccion4sForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion5(List<Transaccion> transaccion5sForeignKey)throws Exception{
		TableColumn tableColumnTransaccion5=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5));
		TableCellEditor tableCellEditorTransaccion5 =tableColumnTransaccion5.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion5;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccion5sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccion5sForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransaccionCliente(false);
			
			//if(!this.isEsNuevoTransaccionCliente) {								
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				
			}
			
			if(this.permiteMantenimiento(this.transaccioncliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransaccionCliente=true;
					this.inicializarActualizarBindingTablaTransaccionCliente(false);
					this.isEsNuevoTransaccionCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransaccionCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransaccionCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionCliente(false);
				
				this.habilitarDeshabilitarControlesTransaccionCliente(false);
			
												
				
				if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransaccionCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransaccionClienteActionPerformed(evt,transaccionclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransaccionCliente(this.transaccioncliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transaccionclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transaccioncliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				this.transaccioncliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				this.transaccioncliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transaccioncliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransaccionClienteModel) this.jTableDatosTransaccionCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransaccionCliente=true;
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
				this.isEsNuevoTransaccionCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionCliente(false);
				
				this.habilitarDeshabilitarControlesTransaccionCliente(false);
				
				
				
				if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransaccionCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransaccionCliente.getRowCount()>=1) {
				jTableDatosTransaccionCliente.removeRowSelectionInterval(0, jTableDatosTransaccionCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransaccionCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransaccionCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionCliente(false) ;
			
			this.isEsNuevoTransaccionCliente=false;
			
			if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransaccionCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransaccionCliente(false);
				
				//SI ES MANUAL
				if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransaccionCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransaccionCliente--;			
			//TransaccionCliente transaccionclienteAux= new TransaccionCliente();			
			//transaccionclienteAux.setId(this.iIdNuevoTransaccionCliente);
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransaccionCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
			
			this.transaccioncliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transaccionclienteLogic.getTransaccionClientes().add(this.transaccionclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transaccionclientes.add(this.transaccionclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransaccionCliente(false);
			
			this.jTableDatosTransaccionCliente.setRowSelectionInterval(this.getIndiceNuevoTransaccionCliente(), this.getIndiceNuevoTransaccionCliente());
			
			int iLastRow =  this.jTableDatosTransaccionCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransaccionCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransaccionCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransaccionCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionCliente(false);
			
			//SI ES MANUAL
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionCliente();
			}
			
			//this.abrirFrameTreeTransaccionCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Analisis Transaccion ClienteS ?", "MANTENIMIENTO DE Analisis Transaccion Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTransaccionCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTransaccionCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.transaccionclienteReturnGeneral=transaccionclienteLogic.procesarImportacionTransaccionClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.transaccionclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTransaccionClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransaccionCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransaccionCliente.setFileImportacion(this.jInternalFrameImportacionTransaccionCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransaccionCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransaccionCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransaccionCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransaccionCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		

		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransaccionClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransaccionClienteBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTransaccionCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1:
					sNombreCampoCategoria="id_transaccion1";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2:
					sNombreCampoCategoria="id_transaccion2";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3:
					sNombreCampoCategoria="id_transaccion3";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4:
					sNombreCampoCategoria="id_transaccion4";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5:
					sNombreCampoCategoria="id_transaccion5";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1:
					sNombreCampoCategoriaValor="id_transaccion1";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2:
					sNombreCampoCategoriaValor="id_transaccion2";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3:
					sNombreCampoCategoriaValor="id_transaccion3";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4:
					sNombreCampoCategoriaValor="id_transaccion4";
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5:
					sNombreCampoCategoriaValor="id_transaccion5";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion1");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion2");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion3");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion4");
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion5");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("TransaccionClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.gettransaccion1_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.gettransaccion2_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.gettransaccion3_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.gettransaccion4_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5);
					iRow++;

					for(TransaccionCliente transaccioncliente:transaccionclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioncliente.gettransaccion5_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTransaccionCliente(row);				
			//	iRow++;
			//}				
			
			//for(TransaccionCliente transaccionclienteAux:transaccionclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransaccionCliente(transaccionclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionCliente(false);
			
			//SI ES MANUAL
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionCliente(false);
			
			//SI ES MANUAL
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionCliente(false);
			
			//SI ES MANUAL
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransaccionCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransaccionCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransaccionCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransaccionCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransaccionCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransaccionCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransaccionCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransaccionCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransaccionCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransaccionCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransaccionCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransaccionCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransaccionCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransaccionCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransaccionCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransaccionCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransaccionCliente();
		
		this.inicializarActualizarBindingBotonesManualTransaccionCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransaccionCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransaccionCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransaccionCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransaccionCliente.jCheckBoxPostAccionNuevoTransaccionCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransaccionCliente.jCheckBoxPostAccionSinCerrarTransaccionCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransaccionCliente.jCheckBoxPostAccionSinMensajeTransaccionCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransaccionCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransaccionCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransaccionCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
				this.jInternalFrameDetalleFormTransaccionCliente.jCheckBoxPostAccionNuevoTransaccionCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransaccionCliente.jCheckBoxPostAccionSinCerrarTransaccionCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransaccionCliente.jCheckBoxPostAccionSinMensajeTransaccionCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransaccionCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransaccionCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransaccionCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransaccionCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransaccionCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransaccionCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransaccionCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransaccionCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransaccionCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransaccionCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionCliente() throws Exception {
		try	{
			if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransaccionCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransaccionCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransaccionCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransaccionCliente.addItem(reporte);
			}
			
			
			if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransaccionCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransaccionCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransaccionCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransaccionCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransaccionCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransaccionCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransaccionCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransaccionCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransaccionCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTransaccionCliente.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransaccionCliente(Boolean esInicializar) throws Exception {				
		if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransaccionCliente() throws Exception {
		this.inicializarActualizarBindingTablaTransaccionCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransaccionCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransaccionClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransaccionCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transaccionclienteLogic.getTransaccionClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transaccionclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransaccionCliente.setModel(new TransaccionClienteModel(this.transaccionclienteLogic.getTransaccionClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransaccionCliente.setModel(new TransaccionClienteModel(this.transaccionclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransaccionCliente!=null && this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransaccionCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO,transaccionclienteConstantesFunciones.resaltarSeleccionarTransaccionCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO,transaccionclienteConstantesFunciones.resaltarSeleccionarTransaccionCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_ID));

		if(this.transaccionclienteConstantesFunciones.mostraridTransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccionclienteConstantesFunciones.resaltaridTransaccionCliente,this.transaccionclienteConstantesFunciones.activaridTransaccionCliente,this,true,"idTransaccionCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccionclienteConstantesFunciones.resaltaridTransaccionCliente,this.transaccionclienteConstantesFunciones.activaridTransaccionCliente,this,true,"idTransaccionCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.transaccionclienteConstantesFunciones.mostrarid_empresaTransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_empresaTransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_empresaTransaccionCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_empresaTransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_empresaTransaccionCliente,false,"id_empresaTransaccionCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDMODULO));

		if(this.transaccionclienteConstantesFunciones.mostrarid_moduloTransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_moduloTransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_moduloTransaccionCliente));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_moduloTransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_moduloTransaccionCliente,false,"id_moduloTransaccionCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.transaccionclienteConstantesFunciones.mostrarnombreTransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccionclienteConstantesFunciones.resaltarnombreTransaccionCliente,this.transaccionclienteConstantesFunciones.activarnombreTransaccionCliente,this,true,"nombreTransaccionCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccionclienteConstantesFunciones.resaltarnombreTransaccionCliente,this.transaccionclienteConstantesFunciones.activarnombreTransaccionCliente,this,true,"nombreTransaccionCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1));

		if(this.transaccionclienteConstantesFunciones.mostrarid_transaccion1TransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccion1sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion1TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion1TransaccionCliente));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccion1sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion1TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion1TransaccionCliente,true,"id_transaccion1TransaccionCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2));

		if(this.transaccionclienteConstantesFunciones.mostrarid_transaccion2TransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccion2sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion2TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion2TransaccionCliente));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccion2sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion2TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion2TransaccionCliente,true,"id_transaccion2TransaccionCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3));

		if(this.transaccionclienteConstantesFunciones.mostrarid_transaccion3TransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccion3sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion3TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion3TransaccionCliente));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccion3sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion3TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion3TransaccionCliente,true,"id_transaccion3TransaccionCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4));

		if(this.transaccionclienteConstantesFunciones.mostrarid_transaccion4TransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccion4sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion4TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion4TransaccionCliente));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccion4sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion4TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion4TransaccionCliente,true,"id_transaccion4TransaccionCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5));

		if(this.transaccionclienteConstantesFunciones.mostrarid_transaccion5TransaccionCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccion5sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion5TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion5TransaccionCliente));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccion5sForeignKey,this.transaccionclienteConstantesFunciones.resaltarid_transaccion5TransaccionCliente,this,this.transaccionclienteConstantesFunciones.activarid_transaccion5TransaccionCliente,true,"id_transaccion5TransaccionCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccionclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccionclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccionclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccionclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transaccionclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transaccionclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransaccionCliente.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTransaccionCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransaccionCliente.moveColumn(this.jTableDatosTransaccionCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransaccionCliente.moveColumn(this.jTableDatosTransaccionCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransaccionCliente.moveColumn(this.jTableDatosTransaccionCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransaccionCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransaccionCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransaccionCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransaccionCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransaccionCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransaccionCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransaccionCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransaccionCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=transaccionclienteLogic.getTransaccionClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transaccionclientes.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTransaccionCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransaccionCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransaccionCliente();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTransaccionCliente=false;
					
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
				if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransaccionCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transaccioncliente.getsType().equals("DUPLICADO")
				   || this.transaccioncliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransaccionCliente=true;
				
				} else {
					this.isEsNuevoTransaccionCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.transaccioncliente.getId()>=0 && !this.transaccioncliente.getIsNew()) {						
						this.isEsNuevoTransaccionCliente=false;
						
					} else {
						this.isEsNuevoTransaccionCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransaccionCliente(esRelaciones);						
				
				this.seleccionarTransaccionCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transaccioncliente.getId()<0) {
					this.isEsNuevoTransaccionCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransaccionCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransaccionCliente(evt,rowIndex);
				}	
				
				if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TransaccionCliente: " + this.dDif); 
					}
				}								
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransaccionCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transaccioncliente)) {
					if(this.transaccioncliente.getId()>0) {
						this.transaccioncliente.setIsDeleted(true);
						
						this.transaccionclientesEliminados.add(this.transaccioncliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccionclienteLogic.getTransaccionClientes().remove(this.transaccioncliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccionclientes.remove(this.transaccioncliente);				
					}
					
					
					((TransaccionClienteModel) this.jTableDatosTransaccionCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransaccionCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransaccionCliente) {
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransaccionCliente(this.transaccioncliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.transaccionclienteConstantesFunciones.cargarid_empresaTransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_empresaTransaccionCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.transaccioncliente.getid_empresa());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(transaccioncliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(transaccioncliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.transaccioncliente.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.transaccionclienteConstantesFunciones.cargarid_moduloTransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_moduloTransaccionCliente) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.transaccioncliente.getid_modulo());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(transaccioncliente.getModulo()!=null) {
							this.modulosForeignKey.add(transaccioncliente.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.transaccioncliente.getid_modulo(),false,"Formulario");

					//Transaccion1
					if(!this.transaccionclienteConstantesFunciones.cargarid_transaccion1TransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_transaccion1TransaccionCliente) {
						//this.cargarCombosTransaccion1sForeignKeyLista(" where id="+this.transaccioncliente.getid_transaccion1());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.transaccion1sForeignKey=new ArrayList<Transaccion>();

						if(transaccioncliente.getTransaccion1()!=null) {
							this.transaccion1sForeignKey.add(transaccioncliente.getTransaccion1());
						}

						this.addItemDefectoCombosForeignKeyTransaccion1();
						this.cargarCombosFrameTransaccion1sForeignKey("Todos");
					}
					this.setActualTransaccion1ForeignKey(this.transaccioncliente.getid_transaccion1(),false,"Formulario");

					//Transaccion2
					if(!this.transaccionclienteConstantesFunciones.cargarid_transaccion2TransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_transaccion2TransaccionCliente) {
						//this.cargarCombosTransaccion2sForeignKeyLista(" where id="+this.transaccioncliente.getid_transaccion2());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.transaccion2sForeignKey=new ArrayList<Transaccion>();

						if(transaccioncliente.getTransaccion2()!=null) {
							this.transaccion2sForeignKey.add(transaccioncliente.getTransaccion2());
						}

						this.addItemDefectoCombosForeignKeyTransaccion2();
						this.cargarCombosFrameTransaccion2sForeignKey("Todos");
					}
					this.setActualTransaccion2ForeignKey(this.transaccioncliente.getid_transaccion2(),false,"Formulario");

					//Transaccion3
					if(!this.transaccionclienteConstantesFunciones.cargarid_transaccion3TransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_transaccion3TransaccionCliente) {
						//this.cargarCombosTransaccion3sForeignKeyLista(" where id="+this.transaccioncliente.getid_transaccion3());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.transaccion3sForeignKey=new ArrayList<Transaccion>();

						if(transaccioncliente.getTransaccion3()!=null) {
							this.transaccion3sForeignKey.add(transaccioncliente.getTransaccion3());
						}

						this.addItemDefectoCombosForeignKeyTransaccion3();
						this.cargarCombosFrameTransaccion3sForeignKey("Todos");
					}
					this.setActualTransaccion3ForeignKey(this.transaccioncliente.getid_transaccion3(),false,"Formulario");

					//Transaccion4
					if(!this.transaccionclienteConstantesFunciones.cargarid_transaccion4TransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_transaccion4TransaccionCliente) {
						//this.cargarCombosTransaccion4sForeignKeyLista(" where id="+this.transaccioncliente.getid_transaccion4());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.transaccion4sForeignKey=new ArrayList<Transaccion>();

						if(transaccioncliente.getTransaccion4()!=null) {
							this.transaccion4sForeignKey.add(transaccioncliente.getTransaccion4());
						}

						this.addItemDefectoCombosForeignKeyTransaccion4();
						this.cargarCombosFrameTransaccion4sForeignKey("Todos");
					}
					this.setActualTransaccion4ForeignKey(this.transaccioncliente.getid_transaccion4(),false,"Formulario");

					//Transaccion5
					if(!this.transaccionclienteConstantesFunciones.cargarid_transaccion5TransaccionCliente || this.transaccionclienteConstantesFunciones.event_dependid_transaccion5TransaccionCliente) {
						//this.cargarCombosTransaccion5sForeignKeyLista(" where id="+this.transaccioncliente.getid_transaccion5());
									//this.inicializarActualizarBindingTransaccionCliente(false,false);
						this.transaccion5sForeignKey=new ArrayList<Transaccion>();

						if(transaccioncliente.getTransaccion5()!=null) {
							this.transaccion5sForeignKey.add(transaccioncliente.getTransaccion5());
						}

						this.addItemDefectoCombosForeignKeyTransaccion5();
						this.cargarCombosFrameTransaccion5sForeignKey("Todos");
					}
					this.setActualTransaccion5ForeignKey(this.transaccioncliente.getid_transaccion5(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransaccionCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransaccionCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionCliente(TransaccionCliente transaccioncliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransaccionCliente(transaccioncliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionCliente(TransaccionCliente transaccioncliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransaccionCliente(transaccioncliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransaccionCliente(transaccioncliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransaccionCliente(transaccioncliente);
	}
	
	public void setVariablesObjetoActualToFormularioTransaccionCliente(TransaccionCliente transaccioncliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setText(transaccioncliente.getId().toString());
			this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setText(transaccioncliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TransaccionCliente transaccionclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transaccionclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TransaccionCliente transaccionclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transaccionclienteLocal=this.transaccioncliente;
			} else {
				transaccionclienteLocal=this.transaccionclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transaccionclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransaccionCliente(transaccionclienteLocal,true);
					
					if(transaccionclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transaccionclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transaccionclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransaccionCliente(TransaccionCliente transaccioncliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionCliente(transaccioncliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(transaccioncliente);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionCliente(TransaccionCliente transaccioncliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionCliente(transaccioncliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionCliente(TransaccionCliente transaccioncliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.getText()==null || this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.getText()=="" || this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setText("0");
			}

			if(conColumnasBase) {transaccioncliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelIdTransaccionCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioncliente.setnombre(this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionCliente.jLabelnombreTransaccionCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionCliente(TransaccionCliente transaccionclienteBean,TransaccionCliente transaccioncliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && transaccionclienteBean.getid_transaccion1()!=null && !transaccionclienteBean.getid_transaccion1().equals(-1L))) {transaccioncliente.setid_transaccion1(transaccionclienteBean.getid_transaccion1());}
			if(conDefault || (!conDefault && transaccionclienteBean.getid_transaccion2()!=null && !transaccionclienteBean.getid_transaccion2().equals(null))) {transaccioncliente.setid_transaccion2(transaccionclienteBean.getid_transaccion2());}
			if(conDefault || (!conDefault && transaccionclienteBean.getid_transaccion3()!=null && !transaccionclienteBean.getid_transaccion3().equals(null))) {transaccioncliente.setid_transaccion3(transaccionclienteBean.getid_transaccion3());}
			if(conDefault || (!conDefault && transaccionclienteBean.getid_transaccion4()!=null && !transaccionclienteBean.getid_transaccion4().equals(null))) {transaccioncliente.setid_transaccion4(transaccionclienteBean.getid_transaccion4());}
			if(conDefault || (!conDefault && transaccionclienteBean.getid_transaccion5()!=null && !transaccionclienteBean.getid_transaccion5().equals(null))) {transaccioncliente.setid_transaccion5(transaccionclienteBean.getid_transaccion5());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransaccionCliente(TransaccionCliente transaccionclienteOrigen,TransaccionCliente transaccioncliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccionclienteOrigen.getId()!=null && !transaccionclienteOrigen.getId().equals(0L))) {transaccioncliente.setId(transaccionclienteOrigen.getId());}}
			if(conDefault || (!conDefault && transaccionclienteOrigen.getnombre()!=null && !transaccionclienteOrigen.getnombre().equals(""))) {transaccioncliente.setnombre(transaccionclienteOrigen.getnombre());}
			if(conDefault || (!conDefault && transaccionclienteOrigen.getid_transaccion1()!=null && !transaccionclienteOrigen.getid_transaccion1().equals(-1L))) {transaccioncliente.setid_transaccion1(transaccionclienteOrigen.getid_transaccion1());}
			if(conDefault || (!conDefault && transaccionclienteOrigen.getid_transaccion2()!=null && !transaccionclienteOrigen.getid_transaccion2().equals(null))) {transaccioncliente.setid_transaccion2(transaccionclienteOrigen.getid_transaccion2());}
			if(conDefault || (!conDefault && transaccionclienteOrigen.getid_transaccion3()!=null && !transaccionclienteOrigen.getid_transaccion3().equals(null))) {transaccioncliente.setid_transaccion3(transaccionclienteOrigen.getid_transaccion3());}
			if(conDefault || (!conDefault && transaccionclienteOrigen.getid_transaccion4()!=null && !transaccionclienteOrigen.getid_transaccion4().equals(null))) {transaccioncliente.setid_transaccion4(transaccionclienteOrigen.getid_transaccion4());}
			if(conDefault || (!conDefault && transaccionclienteOrigen.getid_transaccion5()!=null && !transaccionclienteOrigen.getid_transaccion5().equals(null))) {transaccioncliente.setid_transaccion5(transaccionclienteOrigen.getid_transaccion5());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionCliente(TransaccionCliente transaccioncliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setText(transaccioncliente.getId().toString());
			this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setText(transaccioncliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionCliente(TransaccionClienteBean transaccionclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setText(transaccionclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setText(transaccionclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransaccionCliente(TransaccionClienteParameterReturnGeneral transaccionclienteReturnGeneral,TransaccionClienteBean transaccionclienteBean,Boolean conDefault) throws Exception { 
		try {
			TransaccionCliente transaccionclienteLocal=new TransaccionCliente();
			
			transaccionclienteLocal=transaccionclienteReturnGeneral.getTransaccionCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccionclienteLocal.getId()!=null && !transaccionclienteLocal.getId().equals(0L))) {transaccionclienteBean.setId(transaccionclienteLocal.getId());}}
			if(conDefault || (!conDefault && transaccionclienteLocal.getnombre()!=null && !transaccionclienteLocal.getnombre().equals(""))) {transaccionclienteBean.setnombre(transaccionclienteLocal.getnombre());}
			if(conDefault || (!conDefault && transaccionclienteLocal.getid_transaccion1()!=null && !transaccionclienteLocal.getid_transaccion1().equals(-1L))) {transaccionclienteBean.setid_transaccion1(transaccionclienteLocal.getid_transaccion1());}
			if(conDefault || (!conDefault && transaccionclienteLocal.getid_transaccion2()!=null && !transaccionclienteLocal.getid_transaccion2().equals(null))) {transaccionclienteBean.setid_transaccion2(transaccionclienteLocal.getid_transaccion2());}
			if(conDefault || (!conDefault && transaccionclienteLocal.getid_transaccion3()!=null && !transaccionclienteLocal.getid_transaccion3().equals(null))) {transaccionclienteBean.setid_transaccion3(transaccionclienteLocal.getid_transaccion3());}
			if(conDefault || (!conDefault && transaccionclienteLocal.getid_transaccion4()!=null && !transaccionclienteLocal.getid_transaccion4().equals(null))) {transaccionclienteBean.setid_transaccion4(transaccionclienteLocal.getid_transaccion4());}
			if(conDefault || (!conDefault && transaccionclienteLocal.getid_transaccion5()!=null && !transaccionclienteLocal.getid_transaccion5().equals(null))) {transaccionclienteBean.setid_transaccion5(transaccionclienteLocal.getid_transaccion5());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransaccionClienteGenerico(Long idTransaccionClienteSeleccionado,JComboBox jComboBoxTransaccionCliente,List<TransaccionCliente> transaccionclientesLocal)throws Exception {
		try {
			TransaccionCliente  transaccionclienteTemp=null;

			for(TransaccionCliente transaccionclienteAux:transaccionclientesLocal) {
				if(transaccionclienteAux.getId()!=null && transaccionclienteAux.getId().equals(idTransaccionClienteSeleccionado)) {
					transaccionclienteTemp=transaccionclienteAux;
					break;
				}
			}

			jComboBoxTransaccionCliente.setSelectedItem(transaccionclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransaccionClienteGenerico(JComboBox jComboBoxTransaccionCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransaccionCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransaccionCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioncliente=(TransaccionCliente) transaccionclienteLogic.getTransaccionClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioncliente =(TransaccionCliente) transaccionclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("Transaccion1")) {
			//sDescripcion=this.getActualTransaccion1ForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.gettransaccion1_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccion1ForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.gettransaccion1_descripcion();
			}
		}

		if(sTipo.equals("Transaccion2")) {
			//sDescripcion=this.getActualTransaccion2ForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.gettransaccion2_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccion2ForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.gettransaccion2_descripcion();
			}
		}

		if(sTipo.equals("Transaccion3")) {
			//sDescripcion=this.getActualTransaccion3ForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.gettransaccion3_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccion3ForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.gettransaccion3_descripcion();
			}
		}

		if(sTipo.equals("Transaccion4")) {
			//sDescripcion=this.getActualTransaccion4ForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.gettransaccion4_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccion4ForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.gettransaccion4_descripcion();
			}
		}

		if(sTipo.equals("Transaccion5")) {
			//sDescripcion=this.getActualTransaccion5ForeignKeyDescripcion((Long)value);
			if(!transaccioncliente.getIsNew() && !transaccioncliente.getIsChanged() && !transaccioncliente.getIsDeleted()) {
				sDescripcion=transaccioncliente.gettransaccion5_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccion5ForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioncliente.gettransaccion5_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TransaccionCliente transaccionclienteRow=new TransaccionCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccionclienteRow=(TransaccionCliente) transaccionclienteLogic.getTransaccionClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccionclienteRow=(TransaccionCliente) transaccionclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransaccionCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoTransaccionCliente && this.isPermisoNuevoTransaccionCliente));			
			this.jButtonDuplicarTransaccionCliente.setVisible((this.isVisibilidadCeldaDuplicarTransaccionCliente && this.isPermisoDuplicarTransaccionCliente));			
			this.jButtonCopiarTransaccionCliente.setVisible((this.isVisibilidadCeldaCopiarTransaccionCliente && this.isPermisoCopiarTransaccionCliente));
			this.jButtonVerFormTransaccionCliente.setVisible((this.isVisibilidadCeldaVerFormTransaccionCliente && this.isPermisoVerFormTransaccionCliente));
			
			this.jButtonAbrirOrderByTransaccionCliente.setVisible((this.isVisibilidadCeldaOrdenTransaccionCliente && this.isPermisoOrdenTransaccionCliente));			
			
			this.jButtonNuevoRelacionesTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente && this.isPermisoNuevoTransaccionCliente));			
			this.jButtonNuevoGuardarCambiosTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoTransaccionCliente && this.isPermisoNuevoTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarTransaccionCliente.setVisible((this.isVisibilidadCeldaModificarTransaccionCliente && this.isPermisoActualizarTransaccionCliente));	
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarTransaccionCliente.setVisible((this.isVisibilidadCeldaActualizarTransaccionCliente && this.isPermisoActualizarTransaccionCliente));	
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarTransaccionCliente.setVisible((this.isVisibilidadCeldaEliminarTransaccionCliente && this.isPermisoEliminarTransaccionCliente));
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarTransaccionCliente.setVisible(this.isVisibilidadCeldaCancelarTransaccionCliente);							
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoTransaccionCliente && this.isPermisoNuevoTransaccionCliente));						
			this.jButtonDuplicarToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaDuplicarTransaccionCliente && this.isPermisoDuplicarTransaccionCliente));						
			this.jButtonCopiarToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaCopiarTransaccionCliente && this.isPermisoCopiarTransaccionCliente));			
			this.jButtonVerFormToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaVerFormTransaccionCliente && this.isPermisoVerFormTransaccionCliente));			
			this.jButtonAbrirOrderByToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaOrdenTransaccionCliente && this.isPermisoOrdenTransaccionCliente));
			this.jButtonNuevoRelacionesToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente && this.isPermisoNuevoTransaccionCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoTransaccionCliente && this.isPermisoNuevoTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));			
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaModificarTransaccionCliente && this.isPermisoActualizarTransaccionCliente));	
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaActualizarTransaccionCliente  && this.isPermisoActualizarTransaccionCliente));	
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaEliminarTransaccionCliente && this.isPermisoEliminarTransaccionCliente));
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarToolBarTransaccionCliente.setVisible(this.isVisibilidadCeldaCancelarTransaccionCliente);				
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoTransaccionCliente && this.isPermisoNuevoTransaccionCliente));			
			this.jMenuItemDuplicarTransaccionCliente.setVisible((this.isVisibilidadCeldaDuplicarTransaccionCliente && this.isPermisoDuplicarTransaccionCliente));			
			this.jMenuItemCopiarTransaccionCliente.setVisible((this.isVisibilidadCeldaCopiarTransaccionCliente && this.isPermisoCopiarTransaccionCliente));			
			this.jMenuItemVerFormTransaccionCliente.setVisible((this.isVisibilidadCeldaVerFormTransaccionCliente && this.isPermisoVerFormTransaccionCliente));			
			this.jMenuItemAbrirOrderByTransaccionCliente.setVisible((this.isVisibilidadCeldaOrdenTransaccionCliente && this.isPermisoOrdenTransaccionCliente));			
			//this.jMenuItemMostrarOcultarTransaccionCliente.setVisible((this.isVisibilidadCeldaOrdenTransaccionCliente && this.isPermisoOrdenTransaccionCliente));
			this.jMenuItemDetalleAbrirOrderByTransaccionCliente.setVisible((this.isVisibilidadCeldaOrdenTransaccionCliente && this.isPermisoOrdenTransaccionCliente));			
			//this.jMenuItemDetalleMostrarOcultarTransaccionCliente.setVisible((this.isVisibilidadCeldaOrdenTransaccionCliente && this.isPermisoOrdenTransaccionCliente));			
			this.jMenuItemNuevoRelacionesTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente && this.isPermisoNuevoTransaccionCliente));			
			this.jMenuItemNuevoGuardarCambiosTransaccionCliente.setVisible((this.isVisibilidadCeldaNuevoTransaccionCliente && this.isPermisoNuevoTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));									
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemModificarTransaccionCliente.setVisible((this.isVisibilidadCeldaModificarTransaccionCliente && this.isPermisoActualizarTransaccionCliente));	
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemActualizarTransaccionCliente.setVisible((this.isVisibilidadCeldaActualizarTransaccionCliente && this.isPermisoActualizarTransaccionCliente));	
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemEliminarTransaccionCliente.setVisible((this.isVisibilidadCeldaEliminarTransaccionCliente && this.isPermisoEliminarTransaccionCliente));
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemCancelarTransaccionCliente.setVisible(this.isVisibilidadCeldaCancelarTransaccionCliente);				
			}
			
			this.jMenuItemGuardarCambiosTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));						
			this.jMenuItemGuardarCambiosTablaTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransaccionCliente=this.jButtonNuevoTransaccionCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTransaccionCliente=this.jButtonDuplicarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaCopiarTransaccionCliente=this.jButtonCopiarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaVerFormTransaccionCliente=this.jButtonVerFormTransaccionCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTransaccionCliente=this.jButtonAbrirOrderByTransaccionCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=this.jButtonNuevoRelacionesTransaccionCliente.isVisible();
			this.isVisibilidadCeldaModificarTransaccionCliente=this.jButtonModificarTransaccionCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.isVisibilidadCeldaActualizarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaGuardarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=this.jButtonGuardarCambiosTablaTransaccionCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransaccionCliente=this.jButtonNuevoToolBarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=this.jButtonNuevoRelacionesToolBarTransaccionCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.isVisibilidadCeldaModificarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarToolBarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarToolBarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarToolBarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarToolBarTransaccionCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionCliente=this.jButtonGuardarCambiosToolBarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=this.jButtonGuardarCambiosTablaToolBarTransaccionCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransaccionCliente=this.jMenuItemNuevoTransaccionCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=this.jMenuItemNuevoRelacionesTransaccionCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.isVisibilidadCeldaModificarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemModificarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemActualizarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemEliminarTransaccionCliente.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionCliente=this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemCancelarTransaccionCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionCliente=this.jMenuItemGuardarCambiosTransaccionCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=this.jMenuItemGuardarCambiosTablaTransaccionCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransaccionCliente(Boolean esInicializar) {
		if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTransaccionCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransaccionCliente() {
		this.jButtonNuevoTransaccionCliente.setVisible(this.isPermisoNuevoTransaccionCliente);			
		this.jButtonDuplicarTransaccionCliente.setVisible(this.isPermisoDuplicarTransaccionCliente);			
		this.jButtonCopiarTransaccionCliente.setVisible(this.isPermisoCopiarTransaccionCliente);			
		this.jButtonVerFormTransaccionCliente.setVisible(this.isPermisoVerFormTransaccionCliente);			
		
		this.jButtonAbrirOrderByTransaccionCliente.setVisible(this.isPermisoOrdenTransaccionCliente);					
		
		this.jButtonNuevoRelacionesTransaccionCliente.setVisible(this.isPermisoNuevoTransaccionCliente);			
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarTransaccionCliente.setVisible(this.isPermisoActualizarTransaccionCliente);	
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarTransaccionCliente.setVisible(this.isPermisoActualizarTransaccionCliente);	
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarTransaccionCliente.setVisible(this.isPermisoEliminarTransaccionCliente);
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarTransaccionCliente.setVisible(this.isVisibilidadCeldaCancelarTransaccionCliente);						
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.setVisible(this.isPermisoGuardarCambiosTransaccionCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.setVisible(this.isPermisoActualizarTransaccionCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionCliente() {
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarTransaccionCliente.setVisible(this.isPermisoActualizarTransaccionCliente);	
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarTransaccionCliente.setVisible(this.isPermisoActualizarTransaccionCliente);	
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarTransaccionCliente.setVisible(this.isPermisoEliminarTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarTransaccionCliente.setVisible(this.isVisibilidadCeldaCancelarTransaccionCliente);							
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.setVisible((this.isVisibilidadCeldaGuardarTransaccionCliente && this.isPermisoGuardarCambiosTransaccionCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransaccionCliente() {
		if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransaccionCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransaccionCliente() {
	}
	
	public void jTableDatosTransaccionClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransaccionCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transaccioncliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transaccioncliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.transaccioncliente.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.transaccioncliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion1TransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion1=true;

			idTienePermisotransaccion1=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion1) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.transaccion1BeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccion1BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccion1BeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_transaccion1()!=null) {
					this.transaccion1BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccion1BeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_transaccion1());
					this.transaccion1BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccion1BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccion1BeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccion1BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBordertransaccion1=(TitledBorder)this.transaccion1BeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion1.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion1TransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_transaccion1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion1 = "+this.transaccioncliente.getid_transaccion1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion2TransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion2=true;

			idTienePermisotransaccion2=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion2) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.transaccion2BeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccion2BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccion2BeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_transaccion2()!=null) {
					this.transaccion2BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccion2BeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_transaccion2());
					this.transaccion2BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccion2BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccion2BeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccion2BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBordertransaccion2=(TitledBorder)this.transaccion2BeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion2.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion2TransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_transaccion2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion2 = "+this.transaccioncliente.getid_transaccion2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion3TransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion3=true;

			idTienePermisotransaccion3=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion3) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.transaccion3BeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccion3BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccion3BeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_transaccion3()!=null) {
					this.transaccion3BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccion3BeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_transaccion3());
					this.transaccion3BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccion3BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccion3BeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccion3BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBordertransaccion3=(TitledBorder)this.transaccion3BeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion3.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion3TransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_transaccion3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion3 = "+this.transaccioncliente.getid_transaccion3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion4TransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion4=true;

			idTienePermisotransaccion4=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion4) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.transaccion4BeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccion4BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccion4BeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_transaccion4()!=null) {
					this.transaccion4BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccion4BeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_transaccion4());
					this.transaccion4BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccion4BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccion4BeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccion4BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBordertransaccion4=(TitledBorder)this.transaccion4BeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion4.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion4TransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_transaccion4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion4 = "+this.transaccioncliente.getid_transaccion4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion5TransaccionClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion5=true;

			idTienePermisotransaccion5=this.tienePermisosUsuarioEnPaginaWebTransaccionCliente(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion5) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);

				this.transaccion5BeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccion5BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccion5BeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transaccionclienteLogic.getConnexion());

				if(this.transaccioncliente.getid_transaccion5()!=null) {
					this.transaccion5BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccion5BeanSwingJInternalFrame.setIdActual(this.transaccioncliente.getid_transaccion5());
					this.transaccion5BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccion5BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccion5BeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccion5BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionCliente=(TitledBorder)this.jScrollPanelDatosTransaccionCliente.getBorder();
				TitledBorder titledBordertransaccion5=(TitledBorder)this.transaccion5BeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion5.setTitle(titledBorderTransaccionCliente.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion5TransaccionClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.gettransaccioncliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioncliente==null) {
						this.transaccioncliente = new TransaccionCliente();
					}

					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);
				}

				if(this.transaccioncliente.getid_transaccion5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion5 = "+this.transaccioncliente.getid_transaccion5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesBusquedaPorNombre();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdEmpresa();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdModulo();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccion1TransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdTransaccion1();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccion2TransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdTransaccion2();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccion3TransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdTransaccion3();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccion4TransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdTransaccion4();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccion5TransaccionClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionCliente(false,false);

			this.getTransaccionClientesFK_IdTransaccion5();

			this.inicializarActualizarBindingTransaccionCliente(false);

			//if(TransaccionClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransaccionCliente() {
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
			this.jInternalFrameDetalleFormTransaccionCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransaccionCliente.dispose();
			this.jInternalFrameDetalleFormTransaccionCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
			this.jInternalFrameReporteDinamicoTransaccionCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransaccionCliente.dispose();
			this.jInternalFrameReporteDinamicoTransaccionCliente=null;
		}
		
		if(this.jInternalFrameImportacionTransaccionCliente!=null) {
			this.jInternalFrameImportacionTransaccionCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTransaccionCliente.dispose();
			this.jInternalFrameImportacionTransaccionCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransaccionCliente();
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransaccionCliente")) {
				jButtonDuplicarTransaccionClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransaccionCliente")) {
				jButtonCopiarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransaccionCliente")) {
				jButtonVerFormTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransaccionCliente")) {
				jButtonDuplicarTransaccionClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransaccionCliente")) {
				jButtonDuplicarTransaccionClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransaccionCliente")) {
				jButtonModificarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransaccionCliente")) {
				jButtonModificarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransaccionCliente")) {
				jButtonModificarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransaccionCliente")) {
				jButtonActualizarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransaccionCliente")) {
				jButtonActualizarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransaccionCliente")) {
				jButtonActualizarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransaccionCliente")) {
				jButtonEliminarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransaccionCliente")) {
				jButtonEliminarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransaccionCliente")) {
				jButtonEliminarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransaccionCliente")) {
				jButtonCancelarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransaccionCliente")) {
				jButtonCancelarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransaccionCliente")) {
				jButtonCancelarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransaccionCliente")) {
				jButtonCerrarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransaccionCliente")) {
				jButtonCerrarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransaccionCliente")) {
				jButtonCerrarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransaccionCliente")) {
				jButtonMostrarOcultarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransaccionCliente")) {
				jButtonCancelarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransaccionCliente")) {
				jButtonCopiarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransaccionCliente")) {
				jButtonVerFormTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransaccionCliente")) {
				jButtonCopiarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransaccionCliente")) {
				jButtonVerFormTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransaccionCliente")) {
				jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransaccionCliente")) {
				jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransaccionCliente")) {
				jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransaccionCliente")) {
				jButtonAnterioresTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransaccionCliente")) {
				jButtonAnterioresTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransaccionCliente")) {
				jButtonAnterioresTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransaccionCliente")) {
				jButtonSiguientesTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransaccionCliente")) {
				jButtonSiguientesTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransaccionCliente")) {
				jButtonSiguientesTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransaccionCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTransaccionCliente")) {
				jButtonAbrirOrderByTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransaccionCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTransaccionCliente")) {
				jButtonMostrarOcultarTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionCliente")) {
				jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransaccionCliente")) {
				jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransaccionCliente")) {
				jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransaccionCliente")) {
				jButtonCerrarReporteDinamicoTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransaccionCliente")) {
				jButtonGenerarReporteDinamicoTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransaccionCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransaccionCliente")) {
				jButtonCerrarImportacionTransaccionClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransaccionCliente")) {
				
				jButtonGenerarImportacionTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransaccionCliente")) {
				
				jButtonAbrirImportacionTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransaccionCliente")) {
				jComboBoxTiposAccionesTransaccionClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransaccionCliente")) {
				jComboBoxTiposRelacionesTransaccionClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransaccionCliente")) {
				jComboBoxTiposAccionesTransaccionClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransaccionCliente")) {
				
				jComboBoxTiposSeleccionarTransaccionClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransaccionCliente")) {
				jTextFieldValorCampoGeneralTransaccionClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransaccionCliente")) {
				jButtonAbrirOrderByTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransaccionCliente")) {
				jButtonAbrirOrderByTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransaccionCliente")) {
				jButtonCerrarOrderByTransaccionClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionClienteBusqueda")) {
				this.jButtonidTransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionClienteUpdate")) {
				this.jButtonid_empresaTransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionClienteBusqueda")) {
				this.jButtonid_empresaTransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTransaccionClienteUpdate")) {
				this.jButtonid_moduloTransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTransaccionClienteBusqueda")) {
				this.jButtonid_moduloTransaccionClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransaccionClienteBusqueda")) {
				this.jButtonnombreTransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion1TransaccionClienteUpdate")) {
				this.jButtonid_transaccion1TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion1TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion1TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion2TransaccionClienteUpdate")) {
				this.jButtonid_transaccion2TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion2TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion2TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion3TransaccionClienteUpdate")) {
				this.jButtonid_transaccion3TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion3TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion3TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion4TransaccionClienteUpdate")) {
				this.jButtonid_transaccion4TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion4TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion4TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion5TransaccionClienteUpdate")) {
				this.jButtonid_transaccion5TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion5TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion5TransaccionClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTransaccionCliente")) {
				this.jButtonBusquedaPorNombreTransaccionClienteActionPerformed(evt);
			}
			
			;
			
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransaccionCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TransaccionCliente transaccionclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				transaccionclienteLocal=this.transaccioncliente;
			} else {
				transaccionclienteLocal=this.transaccionclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
							
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
								
						
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
								
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
							
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
								
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransaccionCliente")) {
					jCheckBoxSeleccionarTodosTransaccionClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransaccionCliente")) {
					jCheckBoxSeleccionadosTransaccionClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransaccionCliente")) {
					
				}
				
				


				
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
												
				
				


				
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionClienteActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioncliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioncliente);
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionclienteAnterior =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransaccionCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransaccionClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransaccionCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transaccioncliente =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transaccioncliente =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transaccioncliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransaccionCliente")) {
				
				}
				
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransaccionCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransaccionCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransaccionCliente")) {
			
			}
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransaccionCliente();
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransaccionCliente")) {
				jButtonDuplicarTransaccionClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransaccionCliente")) {
				jButtonCopiarTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransaccionCliente")) {
				jButtonVerFormTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransaccionCliente")) {
				jButtonNuevoTransaccionClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransaccionCliente")) {
				jButtonModificarTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransaccionCliente")) {
				jButtonActualizarTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransaccionCliente")) {
				jButtonEliminarTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransaccionCliente")) {
				jButtonCancelarTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransaccionCliente")) {
				jButtonCerrarTransaccionClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransaccionCliente")) {
				jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionCliente")) {
				jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransaccionCliente")) {
				jButtonAbrirOrderByTransaccionClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransaccionCliente")) {
				jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransaccionCliente")) {
				jButtonAnterioresTransaccionClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransaccionCliente")) {
				jButtonSiguientesTransaccionClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionClienteBusqueda")) {
				this.jButtonidTransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionClienteUpdate")) {
				this.jButtonid_empresaTransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionClienteBusqueda")) {
				this.jButtonid_empresaTransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTransaccionClienteUpdate")) {
				this.jButtonid_moduloTransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTransaccionClienteBusqueda")) {
				this.jButtonid_moduloTransaccionClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransaccionClienteBusqueda")) {
				this.jButtonnombreTransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion1TransaccionClienteUpdate")) {
				this.jButtonid_transaccion1TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion1TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion1TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion2TransaccionClienteUpdate")) {
				this.jButtonid_transaccion2TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion2TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion2TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion3TransaccionClienteUpdate")) {
				this.jButtonid_transaccion3TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion3TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion3TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion4TransaccionClienteUpdate")) {
				this.jButtonid_transaccion4TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion4TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion4TransaccionClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion5TransaccionClienteUpdate")) {
				this.jButtonid_transaccion5TransaccionClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion5TransaccionClienteBusqueda")) {
				this.jButtonid_transaccion5TransaccionClienteBusquedaActionPerformed(evt);
			}
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransaccionCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransaccionCliente")) {
				closingInternalFrameTransaccionCliente();
				
			} else if(sTipo.equals("jButtonCancelarTransaccionCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTransaccionCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TransaccionClienteBeanSwingJInternalFrame jInternalFrameParent=(TransaccionClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransaccionClienteActionPerformed(null);
			}
			
			TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioncliente,new Object(),this.transaccionclienteParameterGeneral,this.transaccionclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransaccionCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransaccionCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransaccionCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transaccioncliente)) {
			if(!esControlTabla) {
				if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);			
				}
				
				if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransaccionCliente(this.transaccioncliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccionclienteReturnGeneral=transaccionclienteLogic.procesarEventosTransaccionClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccionclienteLogic.getTransaccionClientes(),this.transaccioncliente,this.transaccionclienteParameterGeneral,this.isEsNuevoTransaccionCliente,classes);//this.transaccionclienteLogic.getTransaccionCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransaccionCliente(this.transaccionclienteReturnGeneral,this.transaccionclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionCliente(classes,this.transaccionclienteReturnGeneral,this.transaccionclienteBean,false);
					}
						
					if(this.transaccionclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente());	
					}
						
					if(this.transaccionclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente(),classes);//this.transaccionclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransaccionCliente(this.transaccioncliente,classes);//this.transaccionclienteBean);									
				}
			
				if(TransaccionClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransaccionCliente(this.transaccioncliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionCliente(this.transaccioncliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transaccionclienteAnterior!=null) {
						this.transaccioncliente=this.transaccionclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccionclienteReturnGeneral=transaccionclienteLogic.procesarEventosTransaccionClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccionclienteLogic.getTransaccionClientes(),this.transaccioncliente,this.transaccionclienteParameterGeneral,this.isEsNuevoTransaccionCliente,classes);//this.transaccionclienteLogic.getTransaccionCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccionclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transaccionclienteReturnGeneral.getTransaccionCliente(),transaccionclienteLogic.getTransaccionClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transaccionclienteReturnGeneral.getTransaccionCliente(),this.transaccionclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransaccionCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransaccionCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransaccionCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransaccionCliente() throws Exception {
		
		TransaccionClienteModel transaccionclienteModel=(TransaccionClienteModel)this.jTableDatosTransaccionCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccionclienteModel.transaccionclientes=this.transaccionclienteLogic.getTransaccionClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transaccionclienteModel.transaccionclientes=this.transaccionclientes;
		}
		
		
		((TransaccionClienteModel) this.jTableDatosTransaccionCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransaccionCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransaccionclienteAnterior(),this.transaccionclienteLogic.getTransaccionClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransaccionclienteAnterior(),this.transaccionclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransaccionCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransaccionCliente(TransaccionCliente transaccioncliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioncliente,new Object(),generalEntityParameterGeneral,this.transaccionclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransaccionClienteConstantesFunciones.getClassesRelationshipsOfTransaccionCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransaccionClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTransaccionCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransaccionCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransaccionClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioncliente,new Object(),generalEntityParameterGeneral,this.transaccionclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransaccionCliente(TransaccionClienteBean transaccionclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionCliente(ArrayList<Classe> classes,TransaccionClienteReturnGeneral transaccionclienteReturnGeneral,TransaccionClienteBean transaccionclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransaccionCliente(TransaccionCliente transaccioncliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transaccioncliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionCliente = new TransaccionClienteDetalleFormJInternalFrame(jDesktopPane,this.transaccionclienteSessionBean.getConGuardarRelaciones(),this.transaccionclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.setVisible(false);
		this.jInternalFrameDetalleFormTransaccionCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransaccionCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransaccionCliente.transaccionclienteLogic=this.transaccionclienteLogic;
		
		this.cargarCombosFrameForeignKeyTransaccionCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransaccionCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransaccionCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransaccionCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionCliente"));
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarTransaccionCliente.addActionListener(new ButtonActionListener(this,"ModificarTransaccionCliente"));

		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionCliente"));
					
		this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemModificarTransaccionCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarTransaccionCliente.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionCliente"));
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionCliente"));
						
		this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemActualizarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarTransaccionCliente.addActionListener (new ButtonActionListener(this,"EliminarTransaccionCliente"));
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionCliente"));
								
		this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemEliminarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CancelarTransaccionCliente"));
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionCliente"));
					
		this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemCancelarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemDetalleCerrarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionCliente"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionCliente"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonidTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_empresaTransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_empresaTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_moduloTransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_moduloTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonnombreTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion1TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion1TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion1TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion1TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion2TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion2TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion2TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion2TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion3TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion3TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion3TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion3TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion4TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion4TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion4TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion4TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion5TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion5TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion5TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion5TransaccionClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransaccionCliente"));
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionCliente"));
		}
		
		this.jTableDatosTransaccionCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransaccionCliente"));
		
		this.jTableDatosTransaccionCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransaccionCliente"));
		
		this.jButtonNuevoTransaccionCliente.addActionListener(new ButtonActionListener(this,"NuevoTransaccionCliente"));
		
		this.jButtonDuplicarTransaccionCliente.addActionListener(new ButtonActionListener(this,"DuplicarTransaccionCliente"));
		
		this.jButtonCopiarTransaccionCliente.addActionListener(new ButtonActionListener(this,"CopiarTransaccionCliente"));
		
		this.jButtonVerFormTransaccionCliente.addActionListener(new ButtonActionListener(this,"VerFormTransaccionCliente"));
		
		
		this.jButtonNuevoToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransaccionCliente"));
			
		this.jButtonDuplicarToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransaccionCliente"));
			
		this.jMenuItemNuevoTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransaccionCliente"));
			
		this.jMenuItemDuplicarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransaccionCliente"));		
		
		
		this.jButtonNuevoRelacionesTransaccionCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransaccionCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransaccionCliente"));
			
		this.jMenuItemNuevoRelacionesTransaccionCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransaccionCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarTransaccionCliente.addActionListener(new ButtonActionListener(this,"ModificarTransaccionCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonModificarToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionCliente"));
			
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemModificarTransaccionCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarTransaccionCliente.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonActualizarToolBarTransaccionCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionCliente"));
				
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemActualizarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarTransaccionCliente.addActionListener (new ButtonActionListener(this,"EliminarTransaccionCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonEliminarToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionCliente"));
						
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemEliminarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CancelarTransaccionCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonCancelarToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionCliente"));
			
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemCancelarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransaccionCliente"));		
		
		
		this.jButtonCerrarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CerrarTransaccionCliente"));
		
		
		this.jButtonCerrarToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransaccionCliente"));
			
		this.jMenuItemCerrarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransaccionCliente"));
			
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jMenuItemDetalleCerrarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransaccionCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionCliente"));
		}
		
		this.jButtonCopiarToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransaccionCliente"));
			
		this.jButtonVerFormToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransaccionCliente"));
		
		this.jMenuItemGuardarCambiosTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransaccionCliente"));
			
		this.jMenuItemCopiarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransaccionCliente"));		
		
		this.jMenuItemVerFormTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransaccionCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransaccionCliente"));
			
		this.jMenuItemGuardarCambiosTablaTransaccionCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionCliente"));		
		
		
		
		this.jButtonRecargarInformacionTransaccionCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransaccionCliente"));
					
		this.jButtonRecargarInformacionToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransaccionCliente"));
		
		this.jMenuItemRecargarInformacionTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransaccionCliente"));		
		
		
		
		this.jButtonAnterioresTransaccionCliente.addActionListener (new ButtonActionListener(this,"AnterioresTransaccionCliente"));
		
		
		this.jButtonAnterioresToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransaccionCliente"));
		
		this.jMenuItemAnterioresTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransaccionCliente"));		
		
		
		this.jButtonSiguientesTransaccionCliente.addActionListener (new ButtonActionListener(this,"SiguientesTransaccionCliente"));
		
		
		this.jButtonSiguientesToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransaccionCliente"));
			
		this.jMenuItemSiguientesTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransaccionCliente"));
			
		this.jMenuItemAbrirOrderByTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransaccionCliente"));
			
		this.jMenuItemMostrarOcultarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransaccionCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransaccionCliente"));
			
		this.jMenuItemDetalleMostarOcultarTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransaccionCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTransaccionCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransaccionCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransaccionCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTransaccionCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransaccionCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransaccionCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransaccionCliente"));

		this.jCheckBoxSeleccionadosTransaccionCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransaccionCliente"));
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTransaccionCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransaccionCliente"));
			
		this.jComboBoxTiposAccionesTransaccionCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTransaccionCliente"));
					
		this.jComboBoxTiposSeleccionarTransaccionCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransaccionCliente"));
			
		this.jTextFieldValorCampoGeneralTransaccionCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransaccionCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonidTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_empresaTransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_empresaTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_moduloTransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_moduloTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonnombreTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion1TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion1TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion1TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion1TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion2TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion2TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion2TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion2TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion3TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion3TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion3TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion3TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion4TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion4TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion4TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion4TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion5TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion5TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion5TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion5TransaccionClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTransaccionCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransaccionCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransaccionCliente!=null) {
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionCliente"));
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionCliente"));
				this.jInternalFrameReporteDinamicoTransaccionCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransaccionCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionCliente"));				
			//this.jButtonGenerarReporteDinamicoTransaccionCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTransaccionCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransaccionCliente!=null) {
				this.jInternalFrameImportacionTransaccionCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionCliente"));
				this.jInternalFrameImportacionTransaccionCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionCliente"));
				this.jInternalFrameImportacionTransaccionCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransaccionCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransaccionCliente"));
			
			this.jButtonAbrirOrderByToolBarTransaccionCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransaccionCliente"));			
			
			if(this.jInternalFrameOrderByTransaccionCliente!=null) {
				this.jInternalFrameOrderByTransaccionCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionCliente.jTabbedPaneRelacionesTransaccionCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionCliente"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTransaccionCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransaccionCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransaccionCliente = (JInternalFrameBase)event.getSource();
	            	
	            TransaccionClienteBeanSwingJInternalFrame jInternalFrameParent=(TransaccionClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransaccionClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransaccionCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransaccionClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransaccionCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransaccionCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransaccionCliente";
		inputMap = this.jButtonNuevoTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransaccionCliente";
		inputMap = this.jButtonNuevoRelacionesTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransaccionCliente";
		inputMap = this.jButtonModificarTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransaccionClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransaccionCliente";
		inputMap = this.jButtonActualizarTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransaccionClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransaccionCliente";
		inputMap = this.jButtonEliminarTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransaccionClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransaccionCliente";
		inputMap = this.jButtonCancelarTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransaccionClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransaccionCliente";
		inputMap = this.jButtonCerrarTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransaccionClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransaccionCliente";
		inputMap = this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonGuardarCambiosTransaccionCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransaccionClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransaccionCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransaccionClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransaccionCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransaccionClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransaccionCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransaccionClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransaccionCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransaccionClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonidTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_empresaTransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_empresaTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_moduloTransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_moduloTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonnombreTransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion1TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion1TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion1TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion1TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion2TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion2TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion2TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion2TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion3TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion3TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion3TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion3TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion4TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion4TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion4TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion4TransaccionClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion5TransaccionClienteUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion5TransaccionClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionCliente.jButtonid_transaccion5TransaccionClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion5TransaccionClienteBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTransaccionCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransaccionCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransaccionCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransaccionClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransaccionClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransaccionCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransaccionCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
					transaccionclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionCliente transaccionclienteAux:transaccionclientes) {
					transaccionclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransaccionClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
						transaccionclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionCliente transaccionclienteAux:transaccionclientes) {
						transaccionclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionCliente transaccionclienteAux:transaccionclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransaccionClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransaccionCliente.getSelectedRows();
			
			TransaccionCliente transaccionclienteLocal=new TransaccionCliente();
			
			//this.seleccionarTodosTransaccionCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionclienteLocal =(TransaccionCliente) this.transaccionclienteLogic.getTransaccionClientes().toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transaccionclienteLocal =(TransaccionCliente) this.transaccionclientes.toArray()[this.jTableDatosTransaccionCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transaccionclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
						transaccionclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionCliente transaccionclienteAux:transaccionclientes) {
						transaccionclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransaccionClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransaccionClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransaccionClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransaccionCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransaccionCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionCliente transaccionclienteAux:this.transaccionclienteLogic.getTransaccionClientes()) {
				
						if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transaccionclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionCliente transaccionclienteAux:transaccionclientes) {
					
						if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transaccionclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransaccionClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransaccionCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransaccionCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransaccionCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransaccionCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTransaccionCliente(conSplash);
				
					this.generarReporteTransaccionClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransaccionClientesSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionCliente();
				
				this.exportarTransaccionClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransaccionClientes();
				//this.importarTransaccionClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransaccionClientesSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Analisis Transaccion Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransaccionCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransaccionCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransaccionCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(TransaccionClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransaccionCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransaccionCliente(conSplash);
					
						//this.actualizarParametrosGeneralTransaccionCliente();
						
						this.generarReporteProcesoAccionTransaccionClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransaccionClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Analisis Transaccion ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Analisis Transaccion Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransaccionCliente();
				
						this.actualizarParametrosGeneralTransaccionCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transaccionclienteReturnGeneral=transaccionclienteLogic.procesarAccionTransaccionClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transaccionclienteLogic.getTransaccionClientes(),this.transaccionclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransaccionClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransaccionCliente();
					
					TransaccionClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransaccionClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxTiposAccionesFormularioTransaccionCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransaccionCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransaccionClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransaccionCliente();
			
			if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
			TransaccionCliente transaccioncliente=new TransaccionCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransaccionCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransaccionCliente.getSelectedItem();
			
			
			
			
			transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(transaccionclientesSeleccionados.size()==1) {
				for(TransaccionCliente transaccionclienteAux:transaccionclientesSeleccionados) {
					transaccioncliente=transaccionclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransaccionCliente();
			
      		//this.finishProcessTransaccionCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransaccionClienteReturnGeneral() throws Exception {
		if(this.transaccionclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transaccionclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transaccionclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transaccionclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transaccionclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transaccionclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransaccionCliente(false);
		}
		
		if(this.transaccionclienteReturnGeneral.getConRetornoLista() || this.transaccionclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.transaccionclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccionclienteLogic.setTransaccionClientes(this.transaccionclienteReturnGeneral.getTransaccionClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.transaccionclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccionclienteLogic.setTransaccionCliente(this.transaccionclienteReturnGeneral.getTransaccionCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTransaccionCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTransaccionCliente() throws Exception {
		
		
	}
	
	public ArrayList<TransaccionCliente> getTransaccionClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransaccionCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TransaccionCliente transaccionclienteAux:transaccionclienteLogic.getTransaccionClientes()) {
					if(transaccionclienteAux.getIsSelected()) {
						transaccionclientesSeleccionados.add(transaccionclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionCliente transaccionclienteAux:this.transaccionclientes) {
					if(transaccionclienteAux.getIsSelected()) {
						transaccionclientesSeleccionados.add(transaccionclienteAux);				
					}
				}
			}
			
			if(transaccionclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transaccionclientesSeleccionados.addAll(this.transaccionclienteLogic.getTransaccionClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transaccionclientesSeleccionados.addAll(this.transaccionclientes);				
					}
				}
			}
		} else {
			transaccionclientesSeleccionados.add(this.transaccioncliente);
		}
		
		return transaccionclientesSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTransaccionClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransaccionClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransaccionClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Analisis Transaccion Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransaccionClientesSeleccionados() throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTransaccionClientesSeleccionados() throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransaccionClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransaccionClientesSeleccionados() throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransaccionCliente();
		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransaccionCliente();
		
		
		//this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados ,transaccionclienteImplementable,transaccionclienteImplementableHome);
	}
	
	public void mostrarImportacionTransaccionClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransaccionCliente();
		
		this.abrirFrameImportacionTransaccionCliente();		
		
			
		//this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados ,transaccionclienteImplementable,transaccionclienteImplementableHome);
	}
	
	public void importarTransaccionClientes() throws Exception {		
	
	}
	
	public void exportarTransaccionClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransaccionClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransaccionClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransaccionClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Analisis Transaccion Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransaccionClientesSeleccionados() throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransaccionCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TransaccionCliente transaccionclienteAux:transaccionclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransaccionCliente(transaccionclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transaccionclienteAux.setsDetalleGeneralEntityReporte(transaccionclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransaccionCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransaccionCliente(TransaccionCliente transaccioncliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transaccioncliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.gettransaccion1_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.gettransaccion2_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.gettransaccion3_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.gettransaccion4_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioncliente.gettransaccion5_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransaccionClientesSeleccionados() throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransaccionClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransaccionCliente(row);				
				iRow++;
			}				
			
			for(TransaccionCliente transaccionclienteAux:transaccionclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransaccionCliente(transaccionclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransaccionClientesSeleccionados() throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();		
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioncliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transaccionclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transaccioncliente");
			//elementRoot.appendChild(element);
		
			for(TransaccionCliente transaccionclienteAux:transaccionclientesSeleccionados) {
				element = document.createElement("transaccioncliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransaccionCliente(transaccionclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Analisis Transaccion Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransaccionCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransaccionCliente(TransaccionCliente transaccioncliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.gettransaccion1_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.gettransaccion2_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.gettransaccion3_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.gettransaccion4_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioncliente.gettransaccion5_descripcion());				
	}
	
	public void setFilaDatosExportarXmlTransaccionCliente(TransaccionCliente transaccioncliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransaccionClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transaccioncliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransaccionClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transaccioncliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transaccioncliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(transaccioncliente.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementnombre = document.createElement(TransaccionClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(transaccioncliente.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtransaccion1_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDTRANSACCION1);
		elementtransaccion1_descripcion.appendChild(document.createTextNode(transaccioncliente.gettransaccion1_descripcion()));
		element.appendChild(elementtransaccion1_descripcion);

		Element elementtransaccion2_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDTRANSACCION2);
		elementtransaccion2_descripcion.appendChild(document.createTextNode(transaccioncliente.gettransaccion2_descripcion()));
		element.appendChild(elementtransaccion2_descripcion);

		Element elementtransaccion3_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDTRANSACCION3);
		elementtransaccion3_descripcion.appendChild(document.createTextNode(transaccioncliente.gettransaccion3_descripcion()));
		element.appendChild(elementtransaccion3_descripcion);

		Element elementtransaccion4_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDTRANSACCION4);
		elementtransaccion4_descripcion.appendChild(document.createTextNode(transaccioncliente.gettransaccion4_descripcion()));
		element.appendChild(elementtransaccion4_descripcion);

		Element elementtransaccion5_descripcion = document.createElement(TransaccionClienteConstantesFunciones.IDTRANSACCION5);
		elementtransaccion5_descripcion.appendChild(document.createTextNode(transaccioncliente.gettransaccion5_descripcion()));
		element.appendChild(elementtransaccion5_descripcion);
	}
	
	public void generarReporteGroupGenericoTransaccionClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TransaccionCliente> transaccionclientesSeleccionados=new ArrayList<TransaccionCliente>();
		
		transaccionclientesSeleccionados=this.getTransaccionClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTransaccionCliente(transaccionclientesSeleccionados);
		
		this.generarReporteTransaccionClientes("Todos",transaccionclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransaccionCliente(ArrayList<TransaccionCliente> transaccionclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TransaccionCliente transaccionclienteAux:transaccionclientesSeleccionados) {
				transaccionclienteAux.setsDetalleGeneralEntityReporte(transaccionclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.gettransaccion1_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.gettransaccion2_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.gettransaccion3_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.gettransaccion4_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5)) {
					existe=true;
					transaccionclienteAux.setsDescripcionGeneralEntityReporte1(transaccionclienteAux.gettransaccion5_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransaccionCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransaccionCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=false;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
			this.isVisibilidadCeldaModificarTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=true;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
			this.isVisibilidadCeldaModificarTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=true;
			this.isVisibilidadCeldaEliminarTransaccionCliente=true;
			this.isVisibilidadCeldaCancelarTransaccionCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
			this.isVisibilidadCeldaModificarTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=true;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransaccionCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=true;
			this.isVisibilidadCeldaModificarTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=false;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
			this.isVisibilidadCeldaActualizarTransaccionCliente=false;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
			this.isVisibilidadCeldaModificarTransaccionCliente=true;
			this.isVisibilidadCeldaActualizarTransaccionCliente=false;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
			this.isVisibilidadCeldaCancelarTransaccionCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransaccionCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=true;
		} else {
			this.actualizarEstadoPanelsTransaccionCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransaccionCliente=false;
			//this.isVisibilidadCeldaVerFormTransaccionCliente=false;
			this.isVisibilidadCeldaDuplicarTransaccionCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transaccionclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTransaccionCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			if(!transaccionclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;												
			}
			
			this.jButtonCerrarTransaccionCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.transaccioncliente)) {
			this.isVisibilidadCeldaActualizarTransaccionCliente=false;
			this.isVisibilidadCeldaEliminarTransaccionCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionCliente() {
	}
	
	public void actualizarEstadoPanelsTransaccionCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransaccionCliente!=null) {
				this.jScrollPanelDatosEdicionTransaccionCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionCliente!=null) {
				this.jScrollPanelDatosTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionCliente!=null) {
				this.jPanelPaginacionTransaccionCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
					this.jTabbedPaneBusquedasTransaccionCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionCliente!=null) {
				this.jTabbedPaneBusquedasTransaccionCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransaccionCliente!=null) {
				this.jPanelParametrosReportesTransaccionCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion1(Boolean isParaTransaccion1){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccion1Negation=!isParaTransaccion1;

			this.isVisibilidadBusquedaPorNombre=isParaTransaccion1Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion2(Boolean isParaTransaccion2){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccion2Negation=!isParaTransaccion2;

			this.isVisibilidadBusquedaPorNombre=isParaTransaccion2Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion3(Boolean isParaTransaccion3){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccion3Negation=!isParaTransaccion3;

			this.isVisibilidadBusquedaPorNombre=isParaTransaccion3Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion4(Boolean isParaTransaccion4){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccion4Negation=!isParaTransaccion4;

			this.isVisibilidadBusquedaPorNombre=isParaTransaccion4Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion5(Boolean isParaTransaccion5){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccion5Negation=!isParaTransaccion5;

			this.isVisibilidadBusquedaPorNombre=isParaTransaccion5Negation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccionCliente.remove(jPanelBusquedaPorNombreTransaccionCliente);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TransaccionClienteSessionBean transaccionclienteSessionBean=new TransaccionClienteSessionBean();
		
		if(this.transaccionclienteSessionBean==null) {
			this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
		}
		
		this.transaccionclienteSessionBean.setsUltimaBusquedaTransaccionCliente(this.getsAccionBusqueda());
		this.transaccionclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.transaccionclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			transaccionclienteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			transaccionclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			transaccionclienteSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TransaccionClienteSessionBean transaccionclienteSessionBean=new TransaccionClienteSessionBean();
		
		if(this.transaccionclienteSessionBean==null) {
			this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
		}
		
		if(this.transaccionclienteSessionBean.getsUltimaBusquedaTransaccionCliente()!=null&&!this.transaccionclienteSessionBean.getsUltimaBusquedaTransaccionCliente().equals("")) {
			this.setsAccionBusqueda(transaccionclienteSessionBean.getsUltimaBusquedaTransaccionCliente());
			this.setiNumeroPaginacion(transaccionclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(transaccionclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(transaccionclienteSessionBean.getnombre());
				transaccionclienteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(transaccionclienteSessionBean.getid_empresa());
				transaccionclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(transaccionclienteSessionBean.getid_modulo());
				transaccionclienteSessionBean.setid_modulo(-1L);
			}
		}
		
		this.transaccionclienteSessionBean.setsUltimaBusquedaTransaccionCliente("");
		this.transaccionclienteSessionBean.setiNumeroPaginacion(TransaccionClienteConstantesFunciones.INUMEROPAGINACION);
		this.transaccionclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransaccionCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransaccionCliente() {
		this.updateBorderResaltarBusquedasFormularioTransaccionCliente();
		this.updateVisibilidadBusquedasFormularioTransaccionCliente();
		this.updateHabilitarBusquedasFormularioTransaccionCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransaccionCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransaccionCliente.getComponents().length>0) {
	

		if(this.transaccionclienteConstantesFunciones.resaltarBusquedaPorNombreTransaccionCliente!=null) {
			index= this.jTabbedPaneBusquedasTransaccionCliente.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionCliente.getComponent(index);
				jPanel.setBorder(this.transaccionclienteConstantesFunciones.resaltarBusquedaPorNombreTransaccionCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransaccionCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransaccionCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionCliente.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionclienteConstantesFunciones.mostrarBusquedaPorNombreTransaccionCliente);
			if(!this.transaccionclienteConstantesFunciones.mostrarBusquedaPorNombreTransaccionCliente && index>-1) {
				this.jTabbedPaneBusquedasTransaccionCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransaccionCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransaccionCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionCliente.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionclienteConstantesFunciones.activarBusquedaPorNombreTransaccionCliente);
				this.jTabbedPaneBusquedasTransaccionCliente.setEnabledAt(index,this.transaccionclienteConstantesFunciones.activarBusquedaPorNombreTransaccionCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransaccionCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTransaccionCliente.indexOfComponent(this.jPanelBusquedaPorNombreTransaccionCliente);

			this.jTabbedPaneBusquedasTransaccionCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionCliente.getComponent(index);

			this.transaccionclienteConstantesFunciones.setResaltarBusquedaPorNombreTransaccionCliente(resaltar);

			jPanel.setBorder(this.transaccionclienteConstantesFunciones.resaltarBusquedaPorNombreTransaccionCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransaccionCliente.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTransaccionCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransaccionCliente();
		this.updateVisibilidadResaltarControlesFormularioTransaccionCliente();
		this.updateHabilitarResaltarControlesFormularioTransaccionCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransaccionCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transaccionclienteConstantesFunciones.resaltaridTransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltaridTransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_empresaTransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_empresaTransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_moduloTransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_moduloTransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarnombreTransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarnombreTransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_transaccion1TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_transaccion1TransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_transaccion2TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_transaccion2TransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_transaccion3TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_transaccion3TransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_transaccion4TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_transaccion4TransaccionCliente);}
		if(this.transaccionclienteConstantesFunciones.resaltarid_transaccion5TransaccionCliente!=null && this.jInternalFrameDetalleFormTransaccionCliente!=null) {this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setBorder(this.transaccionclienteConstantesFunciones.resaltarid_transaccion5TransaccionCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransaccionCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
	
		//this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostraridTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelidTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostraridTransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_empresaTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_empresaTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_empresaTransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_moduloTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_moduloTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_moduloTransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarnombreTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelnombreTransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarnombreTransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion1TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_transaccion1TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion1TransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion2TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_transaccion2TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion2TransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion3TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_transaccion3TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion3TransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion4TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_transaccion4TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion4TransaccionCliente);
		//this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion5TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jPanelid_transaccion5TransaccionCliente.setVisible(this.transaccionclienteConstantesFunciones.mostrarid_transaccion5TransaccionCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransaccionCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionCliente!=null) {
	
		this.jInternalFrameDetalleFormTransaccionCliente.jLabelidTransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activaridTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_empresaTransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_empresaTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_moduloTransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_moduloTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jTextAreanombreTransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarnombreTransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion1TransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_transaccion1TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion2TransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_transaccion2TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion3TransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_transaccion3TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion4TransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_transaccion4TransaccionCliente);
		this.jInternalFrameDetalleFormTransaccionCliente.jComboBoxid_transaccion5TransaccionCliente.setEnabled(this.transaccionclienteConstantesFunciones.activarid_transaccion5TransaccionCliente);
		}
	}
	
		
}