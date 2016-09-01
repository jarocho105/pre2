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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.ProntoPagoConstantesFunciones;
import com.bydan.erp.puntoventa.util.ProntoPagoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.ProntoPagoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.ProntoPagoBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProntoPagoBeanSwingJInternalFrame extends ProntoPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProntoPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProntoPago> prontopagoValidator = new ClassValidator<ProntoPago>(ProntoPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProntoPago prontopago;	
	public ProntoPago prontopagoAux;
	public ProntoPago prontopagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProntoPago prontopagoTotales;
	public Long idProntoPagoActual;
	public Long iIdNuevoProntoPago=0L;
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
	
	public Boolean isPermisoTodoProntoPago;
	public Boolean isPermisoNuevoProntoPago;
	public Boolean isPermisoActualizarProntoPago;
	public Boolean isPermisoActualizarOriginalProntoPago;
	public Boolean isPermisoEliminarProntoPago;
	public Boolean isPermisoGuardarCambiosProntoPago;
	public Boolean isPermisoConsultaProntoPago;
	public Boolean isPermisoBusquedaProntoPago;
	public Boolean isPermisoReporteProntoPago;
	public Boolean isPermisoPaginacionMedioProntoPago;
	public Boolean isPermisoPaginacionAltoProntoPago;
	public Boolean isPermisoPaginacionTodoProntoPago;
	public Boolean isPermisoCopiarProntoPago;
	public Boolean isPermisoVerFormProntoPago;
	public Boolean isPermisoDuplicarProntoPago;
	public Boolean isPermisoOrdenProntoPago;
	
	
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
	
	public ProntoPagoParameterReturnGeneral prontopagoReturnGeneral;
	public ProntoPagoParameterReturnGeneral prontopagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProntoPago=false;
	public Boolean esParaAccionDesdeFormularioProntoPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProntoPagoSessionBeanAdditional prontopagoSessionBeanAdditional=null;
	
	public ProntoPagoSessionBeanAdditional getProntoPagoSessionBeanAdditional() {
		return this.prontopagoSessionBeanAdditional;
	}
	
	public void setProntoPagoSessionBeanAdditional(ProntoPagoSessionBeanAdditional prontopagoSessionBeanAdditional) {
		try {
			this.prontopagoSessionBeanAdditional=prontopagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProntoPagoBeanSwingJInternalFrameAdditional prontopagoBeanSwingJInternalFrameAdditional=null;
	//public class ProntoPagoBeanSwingJInternalFrame
	
	public ProntoPagoBeanSwingJInternalFrameAdditional getProntoPagoBeanSwingJInternalFrameAdditional() {
		return this.prontopagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProntoPagoBeanSwingJInternalFrameAdditional(ProntoPagoBeanSwingJInternalFrameAdditional prontopagoBeanSwingJInternalFrameAdditional) {
		try {
			this.prontopagoBeanSwingJInternalFrameAdditional=prontopagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProntoPagoLogic prontopagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProntoPago prontopagoBean;
	public ProntoPagoConstantesFunciones prontopagoConstantesFunciones;
	//public ProntoPagoParameterReturnGeneral prontopagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ProntoPago> prontopagos;	
	//public List<ProntoPago> prontopagosEliminados;
	//public List<ProntoPago> prontopagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProntoPago=false;
	public Boolean isVisibilidadCeldaDuplicarProntoPago=true;
	public Boolean isVisibilidadCeldaCopiarProntoPago=true;
	public Boolean isVisibilidadCeldaVerFormProntoPago=true;
	public Boolean isVisibilidadCeldaOrdenProntoPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProntoPago=false;
	public Boolean isVisibilidadCeldaModificarProntoPago=false;
	public Boolean isVisibilidadCeldaActualizarProntoPago=false;
	public Boolean isVisibilidadCeldaEliminarProntoPago=false;
	public Boolean isVisibilidadCeldaCancelarProntoPago=false;
	public Boolean isVisibilidadCeldaGuardarProntoPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProntoPago=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoProntoPago() {
		return this.iIdNuevoProntoPago;
	}

	public void setiIdNuevoProntoPago(Long iIdNuevoProntoPago) {
		this.iIdNuevoProntoPago = iIdNuevoProntoPago;
	}
	
	public Long getidProntoPagoActual() {
		return this.idProntoPagoActual;
	}

	public void setidProntoPagoActual(Long idProntoPagoActual) {
		this.idProntoPagoActual = idProntoPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProntoPago getprontopago() {
		return this.prontopago;
	}

	public void setprontopago(ProntoPago prontopago) {
		this.prontopago = prontopago;
	}
	
	public ProntoPago getprontopagoAux() {
		return this.prontopagoAux;
	}

	public void setprontopagoAux(ProntoPago prontopagoAux) {
		this.prontopagoAux = prontopagoAux;
	}				
	
	public ProntoPago getprontopagoAnterior() {
		return this.prontopagoAnterior;
	}

	public void setprontopagoAnterior(ProntoPago prontopagoAnterior) {
		this.prontopagoAnterior = prontopagoAnterior;
	}	
	
	public ProntoPago getprontopagoTotales() {
		return this.prontopagoTotales;
	}

	public void setprontopagoTotales(ProntoPago prontopagoTotales) {
		this.prontopagoTotales = prontopagoTotales;
	}	
	
	public ProntoPago getprontopagoBean() {
		return this.prontopagoBean;
	}

	public void setprontopagoBean(ProntoPago prontopagoBean) {
		this.prontopagoBean = prontopagoBean;
	}	
	
	public ProntoPagoParameterReturnGeneral getprontopagoReturnGeneral() {
		return this.prontopagoReturnGeneral;
	}

	public void setprontopagoReturnGeneral(ProntoPagoParameterReturnGeneral prontopagoReturnGeneral) {
		this.prontopagoReturnGeneral = prontopagoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProntoPagoLogic getProntoPagoLogic()	{		
		return prontopagoLogic;
	}

	public void setProntoPagoLogic(ProntoPagoLogic prontopagoLogic) {
		this.prontopagoLogic = prontopagoLogic;
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
	
	public Boolean getIsEsNuevoProntoPago() {
		return isEsNuevoProntoPago;
	}

	public void setIsEsNuevoProntoPago(Boolean isEsNuevoProntoPago) {
		this.isEsNuevoProntoPago = isEsNuevoProntoPago;
	}

	public Boolean getEsParaAccionDesdeFormularioProntoPago() {
		return esParaAccionDesdeFormularioProntoPago;
	}
	
	public void setEsParaAccionDesdeFormularioProntoPago(Boolean esParaAccionDesdeFormularioProntoPago) {
		this.esParaAccionDesdeFormularioProntoPago = esParaAccionDesdeFormularioProntoPago;
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

			if(this.prontopagoSessionBean==null) {
				this.prontopagoSessionBean=new ProntoPagoSessionBean();
			}

			if(!this.prontopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(prontopagoSessionBean.getlidEmpresaActual());
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

					if(this.prontopago!=null) {
						this.prontopago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProntoPago!=null) {
						this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProntoPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProntoPago!=null) {
						if(this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProntoPagoGenerico)throws Exception
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
				jComboBoxid_empresaProntoPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProntoPagoGenerico!=null && jComboBoxid_empresaProntoPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaProntoPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProntoPago prontopago,JComboBox jComboBoxid_empresaProntoPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProntoPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProntoPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				prontopago.setid_empresa(empresaAux.getId());
				prontopago.setempresa_descripcion(ProntoPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				prontopago.setEmpresa(empresaAux);			}
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

					if(!ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProntoPago!=null) { 
							this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProntoPago!=null) { 
					}

					if(!ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProntoPago!=null) {
							this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProntoPago!=null) {
							this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesProntoPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProntoPagoConstantesFunciones.refrescarForeignKeysDescripcionesProntoPago(this.prontopagoLogic.getProntoPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProntoPagoConstantesFunciones.refrescarForeignKeysDescripcionesProntoPago(this.prontopagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//prontopagoLogic.setProntoPagos(this.prontopagos);
			prontopagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProntoPagoParameterReturnGeneral getProntoPagoParameterGeneral() {
		return this.prontopagoParameterGeneral;
	}
	
	public void setProntoPagoParameterGeneral(ProntoPagoParameterReturnGeneral prontopagoParameterGeneral) {
		this.prontopagoParameterGeneral = prontopagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProntoPago() {
		return isPermisoTodoProntoPago;
	}

	public void setIsPermisoTodoProntoPago(Boolean isPermisoTodoProntoPago) {
		this.isPermisoTodoProntoPago = isPermisoTodoProntoPago;
	}

	public Boolean getIsPermisoNuevoProntoPago() {
		return isPermisoNuevoProntoPago;
	}

	public void setIsPermisoNuevoProntoPago(Boolean isPermisoNuevoProntoPago) {
		this.isPermisoNuevoProntoPago = isPermisoNuevoProntoPago;
	}

	public Boolean getIsPermisoActualizarProntoPago() {
		return isPermisoActualizarProntoPago;
	}

	public void setIsPermisoActualizarProntoPago(Boolean isPermisoActualizarProntoPago) {
		this.isPermisoActualizarProntoPago = isPermisoActualizarProntoPago;
	}

	public Boolean getIsPermisoEliminarProntoPago() {
		return isPermisoEliminarProntoPago;
	}

	public void setIsPermisoEliminarProntoPago(Boolean isPermisoEliminarProntoPago) {
		this.isPermisoEliminarProntoPago = isPermisoEliminarProntoPago;
	}

	public Boolean getIsPermisoGuardarCambiosProntoPago() {
		return isPermisoGuardarCambiosProntoPago;
	}

	public void setIsPermisoGuardarCambiosProntoPago(Boolean isPermisoGuardarCambiosProntoPago) {
		this.isPermisoGuardarCambiosProntoPago = isPermisoGuardarCambiosProntoPago;
	}
	
	public Boolean getIsPermisoConsultaProntoPago() {
		return isPermisoConsultaProntoPago;
	}

	public void setIsPermisoConsultaProntoPago(Boolean isPermisoConsultaProntoPago) {
		this.isPermisoConsultaProntoPago = isPermisoConsultaProntoPago;
	}

	public Boolean getIsPermisoBusquedaProntoPago() {
		return isPermisoBusquedaProntoPago;
	}

	public void setIsPermisoBusquedaProntoPago(Boolean isPermisoBusquedaProntoPago) {
		this.isPermisoBusquedaProntoPago = isPermisoBusquedaProntoPago;
	}

	public Boolean getIsPermisoReporteProntoPago() {
		return isPermisoReporteProntoPago;
	}

	public void setIsPermisoReporteProntoPago(Boolean isPermisoReporteProntoPago) {
		this.isPermisoReporteProntoPago = isPermisoReporteProntoPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioProntoPago() {
		return isPermisoPaginacionMedioProntoPago;
	}

	public void setIsPermisoPaginacionMedioProntoPago(Boolean isPermisoPaginacionMedioProntoPago) {
		this.isPermisoPaginacionMedioProntoPago = isPermisoPaginacionMedioProntoPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoProntoPago() {
		return isPermisoPaginacionTodoProntoPago;
	}

	public void setIsPermisoPaginacionTodoProntoPago(Boolean isPermisoPaginacionTodoProntoPago) {
		this.isPermisoPaginacionTodoProntoPago = isPermisoPaginacionTodoProntoPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoProntoPago() {
		return isPermisoPaginacionAltoProntoPago;
	}

	public void setIsPermisoPaginacionAltoProntoPago(Boolean isPermisoPaginacionAltoProntoPago) {
		this.isPermisoPaginacionAltoProntoPago = isPermisoPaginacionAltoProntoPago;
	}
	
	public Boolean getIsPermisoCopiarProntoPago() {
		return isPermisoCopiarProntoPago;
	}

	public void setIsPermisoCopiarProntoPago(Boolean isPermisoCopiarProntoPago) {
		this.isPermisoCopiarProntoPago = isPermisoCopiarProntoPago;
	}
	
	public Boolean getIsPermisoVerFormProntoPago() {
		return isPermisoVerFormProntoPago;
	}

	public void setIsPermisoVerFormProntoPago(Boolean isPermisoVerFormProntoPago) {
		this.isPermisoVerFormProntoPago = isPermisoVerFormProntoPago;
	}
	
	public Boolean getIsPermisoDuplicarProntoPago() {
		return isPermisoDuplicarProntoPago;
	}

	public void setIsPermisoDuplicarProntoPago(Boolean isPermisoDuplicarProntoPago) {
		this.isPermisoDuplicarProntoPago = isPermisoDuplicarProntoPago;
	}
	
	public Boolean getIsPermisoOrdenProntoPago() {
		return isPermisoOrdenProntoPago;
	}

	public void setIsPermisoOrdenProntoPago(Boolean isPermisoOrdenProntoPago) {
		this.isPermisoOrdenProntoPago = isPermisoOrdenProntoPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProntoPago() {
		return isVisibilidadCeldaNuevoProntoPago;
	}

	public void setIsVisibilidadCeldaNuevoProntoPago(Boolean isVisibilidadCeldaNuevoProntoPago) {
		this.isVisibilidadCeldaNuevoProntoPago = isVisibilidadCeldaNuevoProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProntoPago() {
		return isVisibilidadCeldaDuplicarProntoPago;
	}

	public void setIsVisibilidadCeldaDuplicarProntoPago(Boolean isVisibilidadCeldaDuplicarProntoPago) {
		this.isVisibilidadCeldaDuplicarProntoPago = isVisibilidadCeldaDuplicarProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProntoPago() {
		return isVisibilidadCeldaCopiarProntoPago;
	}

	public void setIsVisibilidadCeldaCopiarProntoPago(Boolean isVisibilidadCeldaCopiarProntoPago) {
		this.isVisibilidadCeldaCopiarProntoPago = isVisibilidadCeldaCopiarProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProntoPago() {
		return isVisibilidadCeldaVerFormProntoPago;
	}

	public void setIsVisibilidadCeldaVerFormProntoPago(Boolean isVisibilidadCeldaVerFormProntoPago) {
		this.isVisibilidadCeldaVerFormProntoPago = isVisibilidadCeldaVerFormProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProntoPago() {
		return isVisibilidadCeldaOrdenProntoPago;
	}

	public void setIsVisibilidadCeldaOrdenProntoPago(Boolean isVisibilidadCeldaOrdenProntoPago) {
		this.isVisibilidadCeldaOrdenProntoPago = isVisibilidadCeldaOrdenProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProntoPago() {
		return isVisibilidadCeldaNuevoRelacionesProntoPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProntoPago(Boolean isVisibilidadCeldaNuevoRelacionesProntoPago) {
		this.isVisibilidadCeldaNuevoRelacionesProntoPago = isVisibilidadCeldaNuevoRelacionesProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProntoPago() {
		return isVisibilidadCeldaModificarProntoPago;
	}

	public void setIsVisibilidadCeldaModificarProntoPago(Boolean isVisibilidadCeldaModificarProntoPago) {
		this.isVisibilidadCeldaModificarProntoPago = isVisibilidadCeldaModificarProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProntoPago() {
		return isVisibilidadCeldaActualizarProntoPago;
	}

	public void setIsVisibilidadCeldaActualizarProntoPago(Boolean isVisibilidadCeldaActualizarProntoPago) {
		this.isVisibilidadCeldaActualizarProntoPago = isVisibilidadCeldaActualizarProntoPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarProntoPago() {
		return isVisibilidadCeldaEliminarProntoPago;
	}

	public void setIsVisibilidadCeldaEliminarProntoPago(Boolean isVisibilidadCeldaEliminarProntoPago) {
		this.isVisibilidadCeldaEliminarProntoPago = isVisibilidadCeldaEliminarProntoPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarProntoPago() {
		return isVisibilidadCeldaCancelarProntoPago;
	}

	public void setIsVisibilidadCeldaCancelarProntoPago(Boolean isVisibilidadCeldaCancelarProntoPago) {
		this.isVisibilidadCeldaCancelarProntoPago = isVisibilidadCeldaCancelarProntoPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarProntoPago() {
		return isVisibilidadCeldaGuardarProntoPago;
	}

	public void setIsVisibilidadCeldaGuardarProntoPago(Boolean isVisibilidadCeldaGuardarProntoPago) {
		this.isVisibilidadCeldaGuardarProntoPago = isVisibilidadCeldaGuardarProntoPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProntoPago() {
		return isVisibilidadCeldaGuardarCambiosProntoPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProntoPago(Boolean isVisibilidadCeldaGuardarCambiosProntoPago) {
		this.isVisibilidadCeldaGuardarCambiosProntoPago = isVisibilidadCeldaGuardarCambiosProntoPago;
	}
		
	public ProntoPagoSessionBean getprontopagoSessionBean() {
		return this.prontopagoSessionBean;
	}
	
	public void setprontopagoSessionBean(ProntoPagoSessionBean prontopagoSessionBean) {
		this.prontopagoSessionBean=prontopagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProntoPago(ProntoPago prontopago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(prontopago,null);
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
	
	public void bugActualizarReferenciaActual(ProntoPago prontopago,ProntoPago prontopagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProntoPago(prontopago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		prontopagoAux.setId(prontopago.getId());
		prontopagoAux.setVersionRow(prontopago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProntoPago();
		
			int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = prontopagoValidator.getInvalidValues(this.prontopago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			prontopagoLogic.setDatosCliente(datosCliente);
			prontopagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				prontopagoAux=new  ProntoPago();
				
				prontopagoAux.setIsNew(true);
				prontopagoAux.setIsChanged(true);
				
				prontopagoAux.setProntoPagoOriginal(this.prontopago);
				
				prontopagoAux.setId(this.prontopago.getId());	
				prontopagoAux.setVersionRow(this.prontopago.getVersionRow());	
				prontopagoAux.setid_empresa(this.prontopago.getid_empresa());	
				prontopagoAux.setdia_inicio(this.prontopago.getdia_inicio());	
				prontopagoAux.setdia_fin(this.prontopago.getdia_fin());	
				prontopagoAux.setporcentaje_descuento(this.prontopago.getporcentaje_descuento());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.prontopagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(prontopagoAux,prontopagoLogic.getProntoPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prontopagoAux,prontopagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prontopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagoLogic.saveProntoPagos();//WithConnection
						//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.prontopago,prontopagoAux);
					
					this.refrescarForeignKeysDescripcionesProntoPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prontopagoLogic.saveProntoPagoRelaciones(prontopagoAux);//WithConnection
								//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.prontopago,prontopagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.prontopagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(prontopagoAux,prontopagoLogic.getProntoPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(prontopagoAux,prontopagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.prontopago,prontopagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				prontopagoAux=new  ProntoPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.prontopagoSessionBean.getEsGuardarRelacionado() 
					|| (this.prontopagoSessionBean.getEsGuardarRelacionado() && this.prontopago.getId()>=0)) {
						
					prontopagoAux.setIsNew(false);
				}
				
				prontopagoAux.setIsDeleted(false);
			
				prontopagoAux.setId(this.prontopago.getId());	
				prontopagoAux.setVersionRow(this.prontopago.getVersionRow());	
				prontopagoAux.setid_empresa(this.prontopago.getid_empresa());	
				prontopagoAux.setdia_inicio(this.prontopago.getdia_inicio());	
				prontopagoAux.setdia_fin(this.prontopago.getdia_fin());	
				prontopagoAux.setporcentaje_descuento(this.prontopago.getporcentaje_descuento());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(prontopagoAux,prontopagoLogic.getProntoPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prontopagoAux,prontopagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prontopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagoLogic.saveProntoPagos();//WithConnection
						//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.prontopago,prontopagoAux);
					
					this.refrescarForeignKeysDescripcionesProntoPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prontopagoLogic.saveProntoPagoRelaciones(prontopagoAux);//WithConnection
								//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.prontopago,prontopagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.prontopagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(prontopagoAux,prontopagoLogic.getProntoPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(prontopagoAux,prontopagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.prontopago,prontopagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				prontopagoAux=new  ProntoPago();
				
				prontopagoAux.setIsNew(false);
				prontopagoAux.setIsChanged(false);
				
				prontopagoAux.setIsDeleted(true);
				
				prontopagoAux.setId(this.prontopago.getId());	
				prontopagoAux.setVersionRow(this.prontopago.getVersionRow());	
				prontopagoAux.setid_empresa(this.prontopago.getid_empresa());	
				prontopagoAux.setdia_inicio(this.prontopago.getdia_inicio());	
				prontopagoAux.setdia_fin(this.prontopago.getdia_fin());	
				prontopagoAux.setporcentaje_descuento(this.prontopago.getporcentaje_descuento());	
				
				if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.prontopagoAux.getId()>=0) {	
						this.prontopagosEliminados.add(prontopagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(prontopagoAux,prontopagoLogic.getProntoPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prontopagoAux,prontopagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prontopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagoLogic.saveProntoPagos();//WithConnection
						//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prontopagoLogic.saveProntoPagoRelaciones(prontopagoAux);//WithConnection
								//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
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
							if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.prontopagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(prontopagoAux,prontopagoLogic.getProntoPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(prontopagoAux,prontopagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.getProntoPagos().addAll(this.prontopagosEliminados);
					
					prontopagoLogic.saveProntoPagos();//WithConnection
					//prontopagoLogic.getSetVersionRowProntoPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProntoPago();
				
				this.prontopagosEliminados= new ArrayList<ProntoPago>();		
			}
			
			if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pronto Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.prontopago=prontopagoAux;
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
      		//this.finishProcessProntoPago();
      	}
		
	}	
	
	public void actualizarRelaciones(ProntoPago prontopagoLocal) throws Exception {
		
		if(this.prontopagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProntoPago prontopagoLocal) throws Exception {	
		if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				prontopagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProntoPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = prontopagoValidator.getInvalidValues(this.prontopago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProntoPago prontopago,List<ProntoPago> prontopagos) throws Exception {
		try	{		
			ProntoPagoConstantesFunciones.actualizarLista(prontopago,prontopagos,this.prontopagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProntoPago prontopago,List<ProntoPago> prontopagos) throws Exception {
		try	{			
			ProntoPagoConstantesFunciones.actualizarSelectedLista(prontopago,prontopagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProntoPago> prontopagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				prontopagosLocal=this.prontopagoLogic.getProntoPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				prontopagosLocal=this.prontopagos;
			}
			//ARCHITECTURE
		
			for(ProntoPago prontopagoLocal:prontopagosLocal) {
				if(this.permiteMantenimiento(prontopagoLocal) && prontopagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProntoPagoConstantesFunciones.getProntoPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProntoPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabelid_empresaProntoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProntoPagoConstantesFunciones.DIAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabeldia_inicioProntoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProntoPagoConstantesFunciones.DIAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabeldia_finProntoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProntoPagoConstantesFunciones.PORCENTAJEDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabelporcentaje_descuentoProntoPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProntoPago.jLabelid_empresaProntoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProntoPago.jLabeldia_inicioProntoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProntoPago.jLabeldia_finProntoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProntoPago.jLabelporcentaje_descuentoProntoPago,"");
		
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
		this.iIdNuevoProntoPago--;	
		
		
		this.prontopagoAux=new ProntoPago();
		
		this.prontopagoAux.setId(this.iIdNuevoProntoPago);
		this.prontopagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.prontopagoLogic.getProntoPagos().add(this.prontopagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.prontopagos.add(this.prontopagoAux);
		}
		//ARCHITECTURE
		
		this.prontopago=this.prontopagoAux;
		
		if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProntoPago(this.prontopago);
			this.setVariablesObjetoActualToFormularioForeignKeyProntoPago(this.prontopago);
		}
				
		//this.setDefaultControlesProntoPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProntoPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProntoPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProntoPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProntoPago(this.prontopagoBean,this.prontopago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProntoPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
			classes=ProntoPagoConstantesFunciones.getClassesRelationshipsOfProntoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.prontopagoReturnGeneral=prontopagoLogic.procesarEventosProntoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prontopagoLogic.getProntoPagos(),this.prontopago,this.prontopagoParameterGeneral,this.isEsNuevoProntoPago,classes);//this.prontopagoLogic.getProntoPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProntoPago(this.prontopagoReturnGeneral,this.prontopagoBean,false);
		
		if(this.prontopagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProntoPago(this.prontopagoReturnGeneral.getProntoPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProntoPago(this.prontopagoReturnGeneral.getProntoPago());
		}
		
		if(this.prontopagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProntoPago(this.prontopagoReturnGeneral.getProntoPago(),classes);//this.prontopagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProntoPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProntoPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProntoPagoBeanSwingJInternalFrameAdditional.RecargarFormProntoPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProntoPago(false);
						
			if(prontopagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProntoPago();
			}
			
			this.actualizarVisualTableDatosProntoPago();
			
			this.jTableDatosProntoPago.setRowSelectionInterval(this.getIndiceNuevoProntoPago(), this.getIndiceNuevoProntoPago());
			
			this.seleccionarFilaTablaProntoPagoActual();
						
			this.actualizarEstadoCeldasBotonesProntoPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProntoPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setEnabled(isHabilitar && this.prontopagoConstantesFunciones.activardia_inicioProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setEnabled(isHabilitar && this.prontopagoConstantesFunciones.activardia_finProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setEnabled(isHabilitar && this.prontopagoConstantesFunciones.activarporcentaje_descuentoProntoPago);	
		//
		this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setEnabled(isHabilitar && this.prontopagoConstantesFunciones.activarid_empresaProntoPago);
	};
	
	public void setDefaultControlesProntoPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProntoPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.prontopagoSessionBean.setConGuardarRelaciones(true);			
			this.prontopagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.setVisible(true);
			
					
		} else {
			//this.prontopagoSessionBean.setConGuardarRelaciones(false);			
			this.prontopagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProntoPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
				if(prontopagoAux.getId().equals(this.iIdNuevoProntoPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProntoPago prontopagoAux:this.prontopagos) {
				if(prontopagoAux.getId().equals(this.iIdNuevoProntoPago)) {
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
	
	public int getIndiceActualProntoPago(ProntoPago prontopago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
				if(prontopagoAux.getId().equals(prontopago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProntoPago prontopagoAux:this.prontopagos) {
				if(prontopagoAux.getId().equals(prontopago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProntoPago(ProntoPago prontopagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
				if(prontopagoAux.getProntoPagoOriginal().getId().equals(prontopagoOriginal.getId())) {
					existe=true;
					prontopagoOriginal.setId(prontopagoAux.getId());
					prontopagoOriginal.setVersionRow(prontopagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProntoPago prontopagoAux:this.prontopagos) {
				if(prontopagoAux.getProntoPagoOriginal().getId().equals(prontopagoOriginal.getId())) {
					existe=true;
					prontopagoOriginal.setId(prontopagoAux.getId());
					prontopagoOriginal.setVersionRow(prontopagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProntoPago(Boolean esParaCancelar) throws Exception {
		prontopagosAux=new ArrayList<ProntoPago>();
		prontopagoAux=new ProntoPago();
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
					if(prontopagoAux.getId()<0) {
						prontopagosAux.add(prontopagoAux);
					}		
				}
				this.iIdNuevoProntoPago=0L;
				this.prontopagoLogic.getProntoPagos().removeAll(prontopagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProntoPago prontopagoAux:this.prontopagos) {
					if(prontopagoAux.getId()<0) {
						prontopagosAux.add(prontopagoAux);
					}		
				}
				this.iIdNuevoProntoPago=0L;
				this.prontopagos.removeAll(prontopagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProntoPago 
					&& this.prontopagoLogic.getProntoPagos().size()>0
					) {
					prontopagoAux=this.prontopagoLogic.getProntoPagos().get(this.prontopagoLogic.getProntoPagos().size() - 1);
				
					if(prontopagoAux.getId()<0) {
						this.prontopagoLogic.getProntoPagos().remove(prontopagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProntoPago && this.prontopagos.size()>0) {
					prontopagoAux=this.prontopagos.get(this.prontopagos.size() - 1);
				
					if(prontopagoAux.getId()<0) {
						this.prontopagos.remove(prontopagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProntoPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(prontopago.getId()<0) {
				this.prontopagoLogic.getProntoPagos().remove(this.prontopago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(prontopago.getId()<0) {
				this.prontopagos.remove(this.prontopago);
			}
		}			
	}
	
	public void setEstadosInicialesProntoPago(List<ProntoPago> prontopagosAux) throws Exception {
		ProntoPagoConstantesFunciones.setEstadosInicialesProntoPago(prontopagosAux);
	}
	
	public void setEstadosInicialesProntoPago(ProntoPago prontopagoAux) throws Exception {
		ProntoPagoConstantesFunciones.setEstadosInicialesProntoPago(prontopagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProntoPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProntoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProntoPagoActual()) {
				if(!this.isEsNuevoProntoPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProntoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProntoPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProntoPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pronto Pago ?", "MANTENIMIENTO DE Pronto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProntoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProntoPago prontopago) throws Exception {
		ProntoPagoConstantesFunciones.seleccionarAsignar(this.prontopago,prontopago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProntoPago=this.isPermisoActualizarOriginalProntoPago;
			
			
			this.seleccionarAsignar(prontopago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProntoPagoConstantesFunciones.quitarEspaciosProntoPago(this.prontopago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProntoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.prontopagoSessionBean.setsFuncionBusquedaRapida(this.prontopagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProntoPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProntoPago(esParaCancelar);				
				this.cancelarNuevoProntoPago(esParaCancelar);								
			}
			
			this.prontopago=new ProntoPago();
			
			this.inicializarProntoPago();
			
			this.actualizarEstadoCeldasBotonesProntoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProntoPago() throws Exception {
		try {
			ProntoPagoConstantesFunciones.inicializarProntoPago(this.prontopago);
			
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
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.prontopagoLogic.getProntoPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProntoPagos(String sAccionBusqueda,List<ProntoPago> prontopagosParaReportes) throws Exception {
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
					sPathReporteFinal="ProntoPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProntoPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProntoPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProntoPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pronto Pagos");		
		parameters.put("busquedapor", ProntoPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProntoPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProntoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProntoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProntoPago=new JRBeanArrayDataSource(ProntoPagoJInternalFrame.TraerProntoPagoBeans(prontopagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProntoPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProntoPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProntoPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProntoPagoBean.TraerProntoPagoBeans(prontopagosParaReportes).toArray()));
							
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
				this.generarExcelReporteProntoPagos(sAccionBusqueda,sTipoArchivoReporte,prontopagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProntoPagos(sAccionBusqueda,sTipoArchivoReporte,prontopagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProntoPagoActionPerformed(null);
					//this.generarExcelReporteProntoPagos(sAccionBusqueda,sTipoArchivoReporte,prontopagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProntoPagos(sAccionBusqueda,sTipoArchivoReporte,prontopagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProntoPagos(sAccionBusqueda,sTipoArchivoReporte,prontopagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProntoPagos(sAccionBusqueda,sTipoArchivoReporte,prontopagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProntoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProntoPago> prontopagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProntoPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProntoPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProntoPago prontopago : prontopagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProntoPagoConstantesFunciones.generarExcelReporteDataProntoPago("NORMAL",row,workbook,prontopago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProntoPago(String sTipo,Row row,Workbook workbook) {
		
		ProntoPagoConstantesFunciones.generarExcelReporteHeaderProntoPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProntoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProntoPago> prontopagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProntoPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProntoPago prontopago : prontopagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProntoPagoConstantesFunciones.getProntoPagoDescripcion(prontopago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProntoPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prontopago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProntoPagoConstantesFunciones.LABEL_DIAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_DIAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prontopago.getdia_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProntoPagoConstantesFunciones.LABEL_DIAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_DIAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prontopago.getdia_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prontopago.getporcentaje_descuento());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProntoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProntoPago> prontopagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProntoPago> prontopagosRespaldo=null;
		
		classes=ProntoPagoConstantesFunciones.getClassesRelationshipsOfProntoPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.prontopagoLogic.setDatosCliente(this.datosCliente);
		this.prontopagoLogic.setDatosDeep(this.datosDeep);
		this.prontopagoLogic.setIsConDeep(true);
		
		prontopagosRespaldo=this.prontopagoLogic.getProntoPagos();
		
		this.prontopagoLogic.setProntoPagos(prontopagosParaReportes);	
		this.prontopagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		prontopagosParaReportes=this.prontopagoLogic.getProntoPagos();
		this.prontopagoLogic.setProntoPagos(prontopagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProntoPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProntoPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProntoPago prontopago : prontopagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProntoPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProntoPagoConstantesFunciones.generarExcelReporteDataProntoPago("NORMAL",row,workbook,prontopago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProntoPagoConstantesFunciones.getProntoPagoDescripcion(prontopago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProntoPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProntoPago() throws Exception {		
		this.startProcessProntoPago(true);
	}
	
	public void startProcessProntoPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProntoPago ,this.jPanelParametrosReportesProntoPago, this.jScrollPanelDatosProntoPago,this.jPanelPaginacionProntoPago, this.jScrollPanelDatosEdicionProntoPago, this.jPanelAccionesProntoPago,this.jPanelAccionesFormularioProntoPago,this.jmenuBarProntoPago,this.jmenuBarDetalleProntoPago,this.jTtoolBarProntoPago,this.jTtoolBarDetalleProntoPago);		
		
		final JTabbedPane jTabbedPaneBusquedasProntoPago=this.jTabbedPaneBusquedasProntoPago; 
		
		final JPanel jPanelParametrosReportesProntoPago=this.jPanelParametrosReportesProntoPago;
		//final JScrollPane jScrollPanelDatosProntoPago=this.jScrollPanelDatosProntoPago;
		final JTable jTableDatosProntoPago=this.jTableDatosProntoPago;		
		final JPanel jPanelPaginacionProntoPago=this.jPanelPaginacionProntoPago;
		//final JScrollPane jScrollPanelDatosEdicionProntoPago=this.jScrollPanelDatosEdicionProntoPago;
		final JPanel jPanelAccionesProntoPago=this.jPanelAccionesProntoPago;
		
		JPanel jPanelCamposAuxiliarProntoPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProntoPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
			jPanelCamposAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jPanelCamposProntoPago;
			jPanelAccionesFormularioAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jPanelAccionesFormularioProntoPago;
		}
		
		final JPanel jPanelCamposProntoPago=jPanelCamposAuxiliarProntoPago;
		final JPanel jPanelAccionesFormularioProntoPago=jPanelAccionesFormularioAuxiliarProntoPago;
		
		
		final JMenuBar jmenuBarProntoPago=this.jmenuBarProntoPago;
		final JToolBar jTtoolBarProntoPago=this.jTtoolBarProntoPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProntoPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProntoPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
			jmenuBarDetalleAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jmenuBarDetalleProntoPago;
			jTtoolBarDetalleAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jTtoolBarDetalleProntoPago;
		}
		
		final JMenuBar jmenuBarDetalleProntoPago=jmenuBarDetalleAuxiliarProntoPago;
		final JToolBar jTtoolBarDetalleProntoPago=jTtoolBarDetalleAuxiliarProntoPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProntoPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProntoPago;
			processRunnable.jTableDatos=jTableDatosProntoPago;
			processRunnable.jPanelCampos=jPanelCamposProntoPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionProntoPago;
			processRunnable.jPanelAcciones=jPanelAccionesProntoPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProntoPago;
			
			
			processRunnable.jmenuBar=jmenuBarProntoPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProntoPago;
			processRunnable.jTtoolBar=jTtoolBarProntoPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProntoPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProntoPago ,jPanelParametrosReportesProntoPago,jTableDatosProntoPago, /*jScrollPanelDatosProntoPago,*/jPanelCamposProntoPago,jPanelPaginacionProntoPago, /*jScrollPanelDatosEdicionProntoPago,*/ jPanelAccionesProntoPago,jPanelAccionesFormularioProntoPago,jmenuBarProntoPago,jmenuBarDetalleProntoPago,jTtoolBarProntoPago,jTtoolBarDetalleProntoPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProntoPago ,jPanelParametrosReportesProntoPago, jScrollPanelDatosProntoPago,jPanelPaginacionProntoPago, jScrollPanelDatosEdicionProntoPago, jPanelAccionesProntoPago,jPanelAccionesFormularioProntoPago,jmenuBarProntoPago,jmenuBarDetalleProntoPago,jTtoolBarProntoPago,jTtoolBarDetalleProntoPago);
						
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
	
	public void finishProcessProntoPago() {// throws Exception 
		this.finishProcessProntoPago(true);
	}
	
	public void finishProcessProntoPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProntoPago ,this.jPanelParametrosReportesProntoPago, this.jScrollPanelDatosProntoPago,this.jPanelPaginacionProntoPago, this.jScrollPanelDatosEdicionProntoPago, this.jPanelAccionesProntoPago,this.jPanelAccionesFormularioProntoPago,this.jmenuBarProntoPago,this.jmenuBarDetalleProntoPago,this.jTtoolBarProntoPago,this.jTtoolBarDetalleProntoPago);		
		
		final JTabbedPane jTabbedPaneBusquedasProntoPago=this.jTabbedPaneBusquedasProntoPago; 
		
		final JPanel jPanelParametrosReportesProntoPago=this.jPanelParametrosReportesProntoPago;
		//final JScrollPane jScrollPanelDatosProntoPago=this.jScrollPanelDatosProntoPago;
		final JTable jTableDatosProntoPago=this.jTableDatosProntoPago;		
		final JPanel jPanelPaginacionProntoPago=this.jPanelPaginacionProntoPago;
		//final JScrollPane jScrollPanelDatosEdicionProntoPago=this.jScrollPanelDatosEdicionProntoPago;
		final JPanel jPanelAccionesProntoPago=this.jPanelAccionesProntoPago;
		
		JPanel jPanelCamposAuxiliarProntoPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProntoPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
			jPanelCamposAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jPanelCamposProntoPago;
			jPanelAccionesFormularioAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jPanelAccionesFormularioProntoPago;
		}
		
		final JPanel jPanelCamposProntoPago=jPanelCamposAuxiliarProntoPago;
		final JPanel jPanelAccionesFormularioProntoPago=jPanelAccionesFormularioAuxiliarProntoPago;
		
		
		final JMenuBar jmenuBarProntoPago=this.jmenuBarProntoPago;		
		final JToolBar jTtoolBarProntoPago=this.jTtoolBarProntoPago;
				
		JMenuBar jmenuBarDetalleAuxiliarProntoPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProntoPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
			jmenuBarDetalleAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jmenuBarDetalleProntoPago;
			jTtoolBarDetalleAuxiliarProntoPago=this.jInternalFrameDetalleFormProntoPago.jTtoolBarDetalleProntoPago;		
		}
		
		final JMenuBar jmenuBarDetalleProntoPago=jmenuBarDetalleAuxiliarProntoPago;
		final JToolBar jTtoolBarDetalleProntoPago=jTtoolBarDetalleAuxiliarProntoPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProntoPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProntoPago;
			processRunnable.jTableDatos=jTableDatosProntoPago;
			processRunnable.jPanelCampos=jPanelCamposProntoPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionProntoPago;
			processRunnable.jPanelAcciones=jPanelAccionesProntoPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProntoPago;
			
			
			processRunnable.jmenuBar=jmenuBarProntoPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProntoPago;
			processRunnable.jTtoolBar=jTtoolBarProntoPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProntoPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProntoPago ,jPanelParametrosReportesProntoPago, jTableDatosProntoPago,/*jScrollPanelDatosProntoPago,*/jPanelCamposProntoPago,jPanelPaginacionProntoPago, /*jScrollPanelDatosEdicionProntoPago,*/ jPanelAccionesProntoPago,jPanelAccionesFormularioProntoPago,jmenuBarProntoPago,jmenuBarDetalleProntoPago,jTtoolBarProntoPago,jTtoolBarDetalleProntoPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProntoPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProntoPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProntoPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProntoPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProntoPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProntoPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProntoPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProntoPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProntoPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.prontopagoConstantesFunciones.getsFinalQueryProntoPago();
		String  finalQueryPaginacionTodos=this.prontopagoConstantesFunciones.getsFinalQueryProntoPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProntoPagoConstantesFunciones.getArrayColumnasGlobalesNoProntoPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProntoPagoConstantesFunciones.getArrayColumnasGlobalesProntoPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProntoPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.prontopagosEliminados= new ArrayList<ProntoPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProntoPago();
		
				///*ProntoPagoSessionBean*/this.prontopagoSessionBean=new ProntoPagoSessionBean();
			
			if(this.prontopagoSessionBean==null) {
				this.prontopagoSessionBean=new ProntoPagoSessionBean();
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
					this.iNumeroPaginacion=ProntoPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProntoPagoConstantesFunciones.getClassesForeignKeysOfProntoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/prontopago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			prontopagosAux= new ArrayList<ProntoPago>();
			
				
			prontopagoLogic.setDatosCliente(this.datosCliente);
			prontopagoLogic.setDatosDeep(this.datosDeep);
			prontopagoLogic.setIsConDeep(true);
			
			
			prontopagoLogic.getProntoPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					prontopagoLogic.getTodosProntoPagos(finalQueryGlobal,pagination);
					
					//prontopagoLogic.getTodosProntoPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(prontopagoLogic.getProntoPagos()==null|| prontopagoLogic.getProntoPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prontopagosAux= new ArrayList<ProntoPago>();
							prontopagosAux.addAll(prontopagoLogic.getProntoPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prontopagosAux= new ArrayList<ProntoPago>();
							prontopagosAux.addAll(prontopagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prontopagoLogic.getTodosProntoPagos(finalQueryGlobal+"",this.pagination);												
							
							//prontopagoLogic.getTodosProntoPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProntoPagos("Todos",prontopagoLogic.getProntoPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prontopagoLogic.setProntoPagos(new ArrayList<ProntoPago>());					
							prontopagoLogic.getProntoPagos().addAll(prontopagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prontopagos=new ArrayList<ProntoPago>();
							prontopagos.addAll(prontopagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProntoPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProntoPago=this.idActual;
				
				} else if(this.idProntoPagoActual!=null && this.idProntoPagoActual!=0L) {
					idProntoPago=idProntoPagoActual;
				}
				
					
				this.sDetalleReporte=ProntoPagoConstantesFunciones.getDetalleIndicePorId(idProntoPago);
				
				this.prontopagos=new ArrayList<ProntoPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					prontopagoLogic.getEntity(idProntoPago);
					
					//prontopagoLogic.getEntityWithConnection(idProntoPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prontopagoLogic.setProntoPagos(new ArrayList<ProntoPago>());
					prontopagoLogic.getProntoPagos().add(prontopagoLogic.getProntoPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prontopagos=new ArrayList<ProntoPago>();
					this.prontopagos.add(prontopago);
				}
				
				if(prontopagoLogic.getProntoPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProntoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prontopagoLogic.getProntoPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProntoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProntoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prontopagoLogic.getProntoPagos()==null||prontopagoLogic.getProntoPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prontopagos==null|| prontopagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagosAux=new ArrayList<ProntoPago>();
						prontopagosAux.addAll(prontopagoLogic.getProntoPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prontopagosAux=new ArrayList<ProntoPago>();
							prontopagosAux.addAll(prontopagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prontopagoLogic.getProntoPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProntoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProntoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProntoPagos("FK_IdEmpresa",prontopagoLogic.getProntoPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProntoPagos("FK_IdEmpresa",prontopagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagoLogic.setProntoPagos(new ArrayList<ProntoPago>());
						prontopagoLogic.getProntoPagos().addAll(prontopagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prontopagos=new ArrayList<ProntoPago>();
							prontopagos.addAll(prontopagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProntoPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProntoPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=prontopagoLogic.getProntoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prontopagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=prontopagoLogic.getProntoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prontopagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProntoPago prontopago) {
		Boolean permite=true;
		
		if(this.prontopago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProntoPagoConstantesFunciones.getOrderByListaProntoPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProntoPagoConstantesFunciones.getOrderByListaProntoPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProntoPago prontopago:prontopagoLogic.getProntoPagos()) {
				if(prontopago.getsType().equals(Constantes2.S_TOTALES)) {
					prontopagoTotales=prontopago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProntoPago prontopago:this.prontopagos) {
				if(prontopago.getsType().equals(Constantes2.S_TOTALES)) {
					prontopagoTotales=prontopago;
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
			this.prontopagoAux=new ProntoPago();
			this.prontopagoAux.setsType(Constantes2.S_TOTALES);
			this.prontopagoAux.setIsNew(false);
			this.prontopagoAux.setIsChanged(false);
			this.prontopagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProntoPagoConstantesFunciones.TotalizarValoresFilaProntoPago(this.prontopagoLogic.getProntoPagos(),this.prontopagoAux);
				
				this.prontopagoLogic.getProntoPagos().add(this.prontopagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProntoPagoConstantesFunciones.TotalizarValoresFilaProntoPago(this.prontopagos,this.prontopagoAux);
				
				this.prontopagos.add(this.prontopagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		prontopagoTotales=new ProntoPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.prontopagoLogic.getProntoPagos().remove(prontopagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.prontopagos.remove(prontopagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		prontopagoTotales=new ProntoPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProntoPago prontopago:prontopagoLogic.getProntoPagos()) {
				if(prontopago.getsType().equals(Constantes2.S_TOTALES)) {
					prontopagoTotales=prontopago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProntoPagoConstantesFunciones.TotalizarValoresFilaProntoPago(this.prontopagoLogic.getProntoPagos(),prontopagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProntoPago prontopago:this.prontopagos) {
				if(prontopago.getsType().equals(Constantes2.S_TOTALES)) {
					prontopagoTotales=prontopago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProntoPagoConstantesFunciones.TotalizarValoresFilaProntoPago(this.prontopagos,prontopagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProntoPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProntoPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prontopagoLogic.getProntoPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosProntoPago() {
		this.isPermisoTodoProntoPago=false;
		this.isPermisoNuevoProntoPago=false;
		this.isPermisoActualizarProntoPago=false;
		this.isPermisoActualizarOriginalProntoPago=false;
		this.isPermisoEliminarProntoPago=false;
		this.isPermisoGuardarCambiosProntoPago=false;
		this.isPermisoConsultaProntoPago=false;
		this.isPermisoBusquedaProntoPago=false;
		this.isPermisoReporteProntoPago=false;		
		this.isPermisoOrdenProntoPago=false;		
		this.isPermisoPaginacionMedioProntoPago=false;		
		this.isPermisoPaginacionAltoProntoPago=false;
		this.isPermisoPaginacionTodoProntoPago=false;
		this.isPermisoCopiarProntoPago=false;		
		this.isPermisoVerFormProntoPago=false;		
		this.isPermisoDuplicarProntoPago=false;		
		this.isPermisoOrdenProntoPago=false;		
	}
	
	public void setPermisosUsuarioProntoPago(Boolean isPermiso) {
		this.isPermisoTodoProntoPago=isPermiso;
		this.isPermisoNuevoProntoPago=isPermiso;
		this.isPermisoActualizarProntoPago=isPermiso;
		this.isPermisoActualizarOriginalProntoPago=isPermiso;
		this.isPermisoEliminarProntoPago=isPermiso;
		this.isPermisoGuardarCambiosProntoPago=isPermiso;
		this.isPermisoConsultaProntoPago=isPermiso;
		this.isPermisoBusquedaProntoPago=isPermiso;
		this.isPermisoReporteProntoPago=isPermiso;
		this.isPermisoOrdenProntoPago=isPermiso;		
		this.isPermisoPaginacionMedioProntoPago=isPermiso;		
		this.isPermisoPaginacionAltoProntoPago=isPermiso;		
		this.isPermisoPaginacionTodoProntoPago=isPermiso;		
		this.isPermisoCopiarProntoPago=isPermiso;		
		this.isPermisoVerFormProntoPago=isPermiso;		
		this.isPermisoDuplicarProntoPago=isPermiso;
		this.isPermisoOrdenProntoPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProntoPago(Boolean isPermiso) {
		//this.isPermisoTodoProntoPago=isPermiso;
		this.isPermisoNuevoProntoPago=isPermiso;
		this.isPermisoActualizarProntoPago=isPermiso;
		this.isPermisoActualizarOriginalProntoPago=isPermiso;
		this.isPermisoEliminarProntoPago=isPermiso;
		this.isPermisoGuardarCambiosProntoPago=isPermiso;
		//this.isPermisoConsultaProntoPago=isPermiso;
		//this.isPermisoBusquedaProntoPago=isPermiso;
		//this.isPermisoReporteProntoPago=isPermiso;
		//this.isPermisoOrdenProntoPago=isPermiso;		
		//this.isPermisoPaginacionMedioProntoPago=isPermiso;		
		//this.isPermisoPaginacionAltoProntoPago=isPermiso;		
		//this.isPermisoPaginacionTodoProntoPago=isPermiso;		
		//this.isPermisoCopiarProntoPago=isPermiso;		
		//this.isPermisoDuplicarProntoPago=isPermiso;
		//this.isPermisoOrdenProntoPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProntoPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProntoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProntoPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProntoPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProntoPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProntoPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProntoPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProntoPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProntoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProntoPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProntoPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProntoPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProntoPago=this.isPermisoActualizarProntoPago;
			this.isPermisoEliminarProntoPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProntoPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProntoPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProntoPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProntoPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProntoPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProntoPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProntoPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProntoPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProntoPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProntoPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProntoPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProntoPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProntoPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProntoPago.setToolTipText(this.jTableDatosProntoPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProntoPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProntoPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProntoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProntoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProntoPago() throws Exception {
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
	public void inicializarCombosForeignKeyProntoPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProntoPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProntoPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProntoPagoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyProntoPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProntoPagoParameterReturnGeneral prontopagoReturnGeneral=new ProntoPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.prontopagoConstantesFunciones.cargarid_empresaProntoPago)
					 || (this.esRecargarFks && this.prontopagoConstantesFunciones.cargarid_empresaProntoPago)) {

					if(!this.prontopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+prontopagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				prontopagoReturnGeneral=prontopagoLogic.cargarCombosLoteForeignKeyProntoPago(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=prontopagoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProntoPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.prontopagoSessionBean==null) {
				this.prontopagoSessionBean=new ProntoPagoSessionBean();
			}

			if(!this.prontopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyProntoPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProntoPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProntoPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProntoPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProntoPago(ProntoPago prontopago)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProntoPago(ProntoPago prontopago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProntoPago()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProntoPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProntoPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProntoPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProntoPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProntoPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProntoPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProntoPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago!=null && this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ProntoPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProntoPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProntoPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.prontopagoSessionBean=new ProntoPagoSessionBean(); 
		this.prontopagoConstantesFunciones=new ProntoPagoConstantesFunciones(); 
		this.prontopagoBean=new ProntoPago();//(this.prontopagoConstantesFunciones); 		
		this.prontopagoReturnGeneral=new ProntoPagoParameterReturnGeneral(); 
		
		this.prontopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prontopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProntoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProntoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProntoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProntoPago(true);
			
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
			
			this.prontopagoConstantesFunciones=new ProntoPagoConstantesFunciones(); 
			this.prontopagoBean=new ProntoPago();//this.prontopagoConstantesFunciones); 			
			this.prontopagoReturnGeneral=new ProntoPagoParameterReturnGeneral(); 
		
			ProntoPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pronto Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.prontopago=new ProntoPago();
			this.prontopagos = new ArrayList<ProntoPago>();
			this.prontopagosAux = new ArrayList<ProntoPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic=new ProntoPagoLogic();
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			//this.prontopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.prontopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProntoPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProntoPago);	
					}
					
					if(this.jInternalFrameImportacionProntoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProntoPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProntoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProntoPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProntoPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProntoPago);
				this.jInternalFrameDetalleFormProntoPago.setVisible(false);
				this.jInternalFrameDetalleFormProntoPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProntoPago);
					this.jInternalFrameReporteDinamicoProntoPago.setVisible(false);
					this.jInternalFrameReporteDinamicoProntoPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProntoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProntoPago);
					this.jInternalFrameImportacionProntoPago.setVisible(false);
					this.jInternalFrameImportacionProntoPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProntoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProntoPago);
					this.jInternalFrameOrderByProntoPago.setVisible(false);
					this.jInternalFrameOrderByProntoPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProntoPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProntoPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.prontopagoReturnGeneral=new ProntoPagoParameterReturnGeneral();
			
			this.prontopagoParameterGeneral=new ProntoPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.prontopagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProntoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProntoPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.prontopagoSessionBean.getEsGuardarRelacionado(),this.prontopagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProntoPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.prontopagoSessionBean.getEsGuardarRelacionado(),this.prontopagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaDuplicarProntoPago=true;
			this.isVisibilidadCeldaCopiarProntoPago=true;
			this.isVisibilidadCeldaVerFormProntoPago=true;
			this.isVisibilidadCeldaOrdenProntoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
			this.isVisibilidadCeldaModificarProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=false;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=false;
			this.isVisibilidadCeldaGuardarProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProntoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProntoPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProntoPago(false);
			
			this.setPermisosUsuarioProntoPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prontopagoSessionBean.getEsGuardarRelacionado() 
				|| (this.prontopagoSessionBean.getEsGuardarRelacionado() && this.prontopagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProntoPagoClasesRelacionadas();
			}
			
			if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProntoPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProntoPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProntoPago();
			}
			
			if(!this.isPermisoBusquedaProntoPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProntoPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProntoPago,this.isPermisoPaginacionMedioProntoPago,this.isPermisoPaginacionTodoProntoPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProntoPagoConstantesFunciones.getTiposSeleccionarProntoPago());
				
				this.tiposColumnasSelect=ProntoPagoConstantesFunciones.getTiposSeleccionarProntoPago(true);
				
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
			//if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProntoPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProntoPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProntoPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProntoPago() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				prontopagoImplementable= (ProntoPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProntoPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				prontopagoImplementableHome= (ProntoPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProntoPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.prontopagos= new ArrayList<ProntoPago>();
			this.prontopagosEliminados= new ArrayList<ProntoPago>();
						
			this.isEsNuevoProntoPago=false;
			this.esParaAccionDesdeFormularioProntoPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProntoPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProntoPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProntoPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProntoPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProntoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProntoPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProntoPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProntoPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProntoPago();
			}
			
			ProntoPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProntoPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProntoPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProntoPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProntoPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProntoPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProntoPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProntoPago")) {
				iIndex=this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProntoPago();	
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
	
	public void cargarCombosForeignKeyProntoPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProntoPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProntoPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProntoPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProntoPago();
		
		this.cargarCombosFrameForeignKeyProntoPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProntoPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProntoPago();
		}
	}
	
	
	
	public void jButtonNuevoProntoPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			
			if(jTableDatosProntoPago.getRowCount()>=1) {
				jTableDatosProntoPago.removeRowSelectionInterval(0, jTableDatosProntoPago.getRowCount()-1);						
			}
			
			this.isEsNuevoProntoPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProntoPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProntoPago(true);			
			//this.prontopago=new ProntoPago();
			//this.prontopago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProntoPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProntoPago() ;
			
			if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProntoPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.prontopago);	
			this.actualizarInformacion("INFO_PADRE",false,this.prontopago);				
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProntoPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProntoPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProntoPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProntoPago.getSelectedRows().length;			
			}
			
			prontopagosSeleccionados=this.getProntoPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProntoPago--;			
				//ProntoPago prontopagoAux= new ProntoPago();			
				//prontopagoAux.setId(this.iIdNuevoProntoPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProntoPago prontopagoOrigen=new ProntoPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProntoPago prontopagoOrigen : prontopagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							prontopagoOrigen =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prontopagoOrigen =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProntoPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.prontopago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProntoPago(prontopagoOrigen,this.prontopago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.prontopagoLogic.getProntoPagos().add(this.prontopagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.prontopagos.add(this.prontopagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProntoPago(false);
				
				this.jTableDatosProntoPago.setRowSelectionInterval(this.getIndiceNuevoProntoPago(), this.getIndiceNuevoProntoPago());
				
				int iLastRow =  this.jTableDatosProntoPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProntoPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProntoPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProntoPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();									
		
			ProntoPago prontopagoOrigen=new ProntoPago();
			ProntoPago prontopagoDestino=new ProntoPago();
				
			prontopagosSeleccionados=this.getProntoPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProntoPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || prontopagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProntoPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagoOrigen =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						prontopagoOrigen =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prontopagoDestino =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						prontopagoDestino =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				prontopagoOrigen =prontopagosSeleccionados.get(0);
				prontopagoDestino =prontopagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProntoPago(prontopagoOrigen,prontopagoDestino,true,false);
				
				prontopagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(prontopagoDestino,prontopagoLogic.getProntoPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prontopagoDestino,prontopagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProntoPago(false);
				
				//this.jTableDatosProntoPago.setRowSelectionInterval(this.getIndiceNuevoProntoPago(), this.getIndiceNuevoProntoPago());
				
				int iLastRow =  this.jTableDatosProntoPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProntoPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProntoPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProntoPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProntoPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProntoPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProntoPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProntoPago.setVisible(!isVisible);
			this.jPanelPaginacionProntoPago.setVisible(!isVisible);
			this.jPanelAccionesProntoPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProntoPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProntoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProntoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProntoPago();
			
			this.abrirFrameOrderByProntoPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProntoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProntoPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProntoPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProntoPago.isMaximum()) {
					this.jInternalFrameDetalleFormProntoPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProntoPago.setSize(this.jInternalFrameDetalleFormProntoPago.iWidthFormulario,this.jInternalFrameDetalleFormProntoPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProntoPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProntoPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProntoPago.isMaximum()) {
						this.jInternalFrameDetalleFormProntoPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProntoPago.jContentPaneDetalleProntoPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProntoPago.jContentPaneDetalleProntoPago.getWidth(),ProntoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProntoPago.jContentPaneDetalleProntoPago.getWidth(),ProntoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProntoPago.jContentPaneDetalleProntoPago.getWidth(),ProntoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProntoPago.setVisible(true);
	        this.jInternalFrameDetalleFormProntoPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProntoPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProntoPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProntoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProntoPago,false,this);
				} else {
					this.jInternalFrameOrderByProntoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProntoPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProntoPago);
				this.jInternalFrameOrderByProntoPago.setVisible(false);
				this.jInternalFrameOrderByProntoPago.setSelected(false);
				
				this.jInternalFrameOrderByProntoPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProntoPago"));
				
				this.inicializarActualizarBindingTablaOrderByProntoPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProntoPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProntoPago==null) {
				
				this.jInternalFrameImportacionProntoPago=new ImportacionJInternalFrame(ProntoPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProntoPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProntoPago);
				this.jInternalFrameImportacionProntoPago.setVisible(false);
				this.jInternalFrameImportacionProntoPago.setSelected(false);


				this.jInternalFrameImportacionProntoPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProntoPago"));
				this.jInternalFrameImportacionProntoPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProntoPago"));
				this.jInternalFrameImportacionProntoPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProntoPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProntoPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProntoPago==null) {
				this.jInternalFrameReporteDinamicoProntoPago=new ReporteDinamicoJInternalFrame(ProntoPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProntoPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProntoPago);
				this.jInternalFrameReporteDinamicoProntoPago.setVisible(false);
				this.jInternalFrameReporteDinamicoProntoPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProntoPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProntoPago"));
				this.jInternalFrameReporteDinamicoProntoPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProntoPago"));
				this.jInternalFrameReporteDinamicoProntoPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProntoPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProntoPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProntoPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProntoPago);
			
	       	this.jInternalFrameDetalleFormProntoPago.setVisible(false);
	        this.jInternalFrameDetalleFormProntoPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormProntoPago.dispose();
			//this.jInternalFrameDetalleFormProntoPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProntoPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProntoPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoProntoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProntoPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProntoPago.setVisible(true);
	        this.jInternalFrameImportacionProntoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProntoPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProntoPago.setVisible(true);
	        this.jInternalFrameOrderByProntoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProntoPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProntoPago.setVisible(false);
	        this.jInternalFrameOrderByProntoPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProntoPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProntoPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoProntoPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProntoPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProntoPago.setVisible(false);
	        this.jInternalFrameImportacionProntoPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProntoPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProntoPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProntoPago(true);
			//this.isEsNuevoProntoPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProntoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProntoPago(false) ;
			
			if(prontopagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProntoPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProntoPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProntoPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProntoPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProntoPago(true);
			//this.isEsNuevoProntoPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.prontopago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProntoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProntoPago(false) ;
			
			if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProntoPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProntoPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProntoPago(false);
			
			//if(!this.isEsNuevoProntoPago) {								
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				
			}
			
			if(this.permiteMantenimiento(this.prontopago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProntoPago=true;
					this.inicializarActualizarBindingTablaProntoPago(false);
					this.isEsNuevoProntoPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProntoPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProntoPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProntoPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProntoPago(false);
				
				this.habilitarDeshabilitarControlesProntoPago(false);
			
												
				
				if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProntoPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProntoPagoActionPerformed(evt,prontopagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProntoPago(this.prontopago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProntoPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,prontopagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.prontopago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProntoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				this.prontopago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				this.prontopago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.prontopago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProntoPagoModel) this.jTableDatosProntoPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProntoPago=true;
				this.inicializarActualizarBindingTablaProntoPago(false);
				this.isEsNuevoProntoPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProntoPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProntoPago(false);
				
				this.habilitarDeshabilitarControlesProntoPago(false);
				
				
				
				if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProntoPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProntoPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProntoPago.getRowCount()>=1) {
				jTableDatosProntoPago.removeRowSelectionInterval(0, jTableDatosProntoPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProntoPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProntoPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProntoPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProntoPago(false) ;
			
			this.isEsNuevoProntoPago=false;
			
			if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProntoPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProntoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProntoPago(false);
				
				//SI ES MANUAL
				if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProntoPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProntoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProntoPago--;			
			//ProntoPago prontopagoAux= new ProntoPago();			
			//prontopagoAux.setId(this.iIdNuevoProntoPago);
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProntoPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
			
			this.prontopago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.prontopagoLogic.getProntoPagos().add(this.prontopagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.prontopagos.add(this.prontopagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProntoPago(false);
			
			this.jTableDatosProntoPago.setRowSelectionInterval(this.getIndiceNuevoProntoPago(), this.getIndiceNuevoProntoPago());
			
			int iLastRow =  this.jTableDatosProntoPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProntoPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProntoPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProntoPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProntoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProntoPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProntoPago(false);
			
			//SI ES MANUAL
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProntoPago();
			}
			
			//this.abrirFrameTreeProntoPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProntoPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Pronto PagoS ?", "MANTENIMIENTO DE Pronto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProntoPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProntoPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.prontopagoReturnGeneral=prontopagoLogic.procesarImportacionProntoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.prontopagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProntoPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProntoPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProntoPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProntoPago.setFileImportacion(this.jInternalFrameImportacionProntoPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProntoPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProntoPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProntoPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProntoPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProntoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		

		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProntoPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProntoPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteProntoPagos("Todos",prontopagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProntoPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeDescuento_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProntoPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProntoPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAINICIO:
					sNombreCampoCategoria="dia_inicio";
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAFIN:
					sNombreCampoCategoria="dia_fin";
					break;

				case ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO:
					sNombreCampoCategoria="porcentaje_descuento";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProntoPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAINICIO:
					sNombreCampoCategoriaValor="dia_inicio";
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAFIN:
					sNombreCampoCategoriaValor="dia_fin";
					break;

				case ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO:
					sNombreCampoCategoriaValor="porcentaje_descuento";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProntoPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_inicio");
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_fin");
					break;

				case ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_descuento");
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
	
	public void jButtonGenerarExcelReporteDinamicoProntoPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProntoPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProntoPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProntoPago prontopago:prontopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prontopago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_DIAINICIO);
					iRow++;

					for(ProntoPago prontopago:prontopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prontopago.getdia_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProntoPagoConstantesFunciones.LABEL_DIAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_DIAFIN);
					iRow++;

					for(ProntoPago prontopago:prontopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prontopago.getdia_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
					iRow++;

					for(ProntoPago prontopago:prontopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prontopago.getporcentaje_descuento());
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
			//	this.getFilaCabeceraExportarExcelProntoPago(row);				
			//	iRow++;
			//}				
			
			//for(ProntoPago prontopagoAux:prontopagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProntoPago(prontopagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProntoPago(false);
			
			//SI ES MANUAL
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProntoPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProntoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProntoPago(false);
			
			//SI ES MANUAL
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProntoPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProntoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProntoPago(false);
			
			//SI ES MANUAL
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProntoPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProntoPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProntoPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProntoPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProntoPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProntoPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProntoPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosProntoPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosProntoPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProntoPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProntoPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProntoPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProntoPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProntoPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProntoPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProntoPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProntoPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProntoPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProntoPago();
		
		this.inicializarActualizarBindingBotonesManualProntoPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProntoPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProntoPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProntoPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProntoPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProntoPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProntoPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProntoPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProntoPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProntoPago.jCheckBoxPostAccionNuevoProntoPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProntoPago.jCheckBoxPostAccionSinCerrarProntoPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProntoPago.jCheckBoxPostAccionSinMensajeProntoPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProntoPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProntoPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProntoPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProntoPago!=null) {
				this.jInternalFrameDetalleFormProntoPago.jCheckBoxPostAccionNuevoProntoPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProntoPago.jCheckBoxPostAccionSinCerrarProntoPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProntoPago.jCheckBoxPostAccionSinMensajeProntoPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProntoPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProntoPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProntoPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProntoPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProntoPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProntoPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProntoPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProntoPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProntoPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProntoPago(Boolean esInicializar) throws Exception {
		try	{	
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProntoPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProntoPago() throws Exception {
		try	{
			if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProntoPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProntoPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProntoPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProntoPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProntoPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProntoPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProntoPago.addItem(reporte);
			}
			
			
			if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProntoPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProntoPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProntoPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProntoPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProntoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProntoPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProntoPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProntoPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProntoPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
				this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
				this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProntoPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProntoPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProntoPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProntoPagoConstantesFunciones.getTiposSeleccionarProntoPago(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProntoPagoConstantesFunciones.getTiposSeleccionarProntoPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProntoPagoConstantesFunciones.getTiposSeleccionarProntoPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProntoPago.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProntoPago.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProntoPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProntoPago(Boolean esInicializar) throws Exception {				
		if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProntoPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProntoPago() throws Exception {
		this.inicializarActualizarBindingTablaProntoPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProntoPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProntoPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProntoPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=prontopagoLogic.getProntoPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=prontopagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProntoPago.setModel(new ProntoPagoModel(this.prontopagoLogic.getProntoPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProntoPago.setModel(new ProntoPagoModel(this.prontopagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProntoPago!=null && this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProntoPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO,prontopagoConstantesFunciones.resaltarSeleccionarProntoPago,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO,prontopagoConstantesFunciones.resaltarSeleccionarProntoPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,ProntoPagoConstantesFunciones.LABEL_ID));

		if(this.prontopagoConstantesFunciones.mostraridProntoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProntoPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prontopagoConstantesFunciones.resaltaridProntoPago,this.prontopagoConstantesFunciones.activaridProntoPago,iSizeTabla,this,true,"idProntoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prontopagoConstantesFunciones.resaltaridProntoPago,this.prontopagoConstantesFunciones.activaridProntoPago,this,true,"idProntoPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,ProntoPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.prontopagoConstantesFunciones.mostrarid_empresaProntoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProntoPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.prontopagoConstantesFunciones.resaltarid_empresaProntoPago,this,this.prontopagoConstantesFunciones.activarid_empresaProntoPago,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.prontopagoConstantesFunciones.resaltarid_empresaProntoPago,this,this.prontopagoConstantesFunciones.activarid_empresaProntoPago,false,"id_empresaProntoPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,ProntoPagoConstantesFunciones.LABEL_DIAINICIO));

		if(this.prontopagoConstantesFunciones.mostrardia_inicioProntoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProntoPagoConstantesFunciones.LABEL_DIAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prontopagoConstantesFunciones.resaltardia_inicioProntoPago,this.prontopagoConstantesFunciones.activardia_inicioProntoPago,iSizeTabla,this,true,"dia_inicioProntoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prontopagoConstantesFunciones.resaltardia_inicioProntoPago,this.prontopagoConstantesFunciones.activardia_inicioProntoPago,this,true,"dia_inicioProntoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,ProntoPagoConstantesFunciones.LABEL_DIAFIN));

		if(this.prontopagoConstantesFunciones.mostrardia_finProntoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProntoPagoConstantesFunciones.LABEL_DIAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prontopagoConstantesFunciones.resaltardia_finProntoPago,this.prontopagoConstantesFunciones.activardia_finProntoPago,iSizeTabla,this,true,"dia_finProntoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prontopagoConstantesFunciones.resaltardia_finProntoPago,this.prontopagoConstantesFunciones.activardia_finProntoPago,this,true,"dia_finProntoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO));

		if(this.prontopagoConstantesFunciones.mostrarporcentaje_descuentoProntoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prontopagoConstantesFunciones.resaltarporcentaje_descuentoProntoPago,this.prontopagoConstantesFunciones.activarporcentaje_descuentoProntoPago,iSizeTabla,this,true,"porcentaje_descuentoProntoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prontopagoConstantesFunciones.resaltarporcentaje_descuentoProntoPago,this.prontopagoConstantesFunciones.activarporcentaje_descuentoProntoPago,this,true,"porcentaje_descuentoProntoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProntoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.prontopagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.prontopagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProntoPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.prontopagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.prontopagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProntoPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProntoPago && this.isPermisoGuardarCambiosProntoPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.prontopagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.prontopagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProntoPago.addColumn(tableColumn);
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
			
			this.jTableDatosProntoPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProntoPago && this.isPermisoGuardarCambiosProntoPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProntoPago && this.isPermisoGuardarCambiosProntoPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProntoPago.moveColumn(this.jTableDatosProntoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProntoPago.moveColumn(this.jTableDatosProntoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProntoPago.moveColumn(this.jTableDatosProntoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProntoPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProntoPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProntoPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProntoPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProntoPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProntoPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProntoPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProntoPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=prontopagoLogic.getProntoPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=prontopagos.size()-1;
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
		//this.jTableDatosProntoPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProntoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProntoPago();
			
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
				
				//this.isEsNuevoProntoPago=false;
					
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
				if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProntoPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProntoPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProntoPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.prontopago.getsType().equals("DUPLICADO")
				   || this.prontopago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProntoPago=true;
				
				} else {
					this.isEsNuevoProntoPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
					if(this.prontopago.getId()>=0 && !this.prontopago.getIsNew()) {						
						this.isEsNuevoProntoPago=false;
						
					} else {
						this.isEsNuevoProntoPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProntoPago(esRelaciones);						
				
				this.seleccionarProntoPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.prontopago.getId()<0) {
					this.isEsNuevoProntoPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProntoPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProntoPago(evt,rowIndex);
				}	
				
				if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProntoPago: " + this.dDif); 
					}
				}								
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProntoPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.prontopago)) {
					if(this.prontopago.getId()>0) {
						this.prontopago.setIsDeleted(true);
						
						this.prontopagosEliminados.add(this.prontopago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.prontopagoLogic.getProntoPagos().remove(this.prontopago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.prontopagos.remove(this.prontopago);				
					}
					
					
					((ProntoPagoModel) this.jTableDatosProntoPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProntoPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProntoPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProntoPago) {
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProntoPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProntoPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProntoPago(this.prontopago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.prontopagoConstantesFunciones.cargarid_empresaProntoPago || this.prontopagoConstantesFunciones.event_dependid_empresaProntoPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.prontopago.getid_empresa());
									//this.inicializarActualizarBindingProntoPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(prontopago.getEmpresa()!=null) {
							this.empresasForeignKey.add(prontopago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.prontopago.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProntoPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProntoPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProntoPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProntoPago(ProntoPago prontopago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProntoPago(prontopago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProntoPago(ProntoPago prontopago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProntoPago(prontopago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProntoPago(prontopago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProntoPago(prontopago);
	}
	
	public void setVariablesObjetoActualToFormularioProntoPago(ProntoPago prontopago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setText(prontopago.getId().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setText(prontopago.getdia_inicio().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setText(prontopago.getdia_fin().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setText(prontopago.getporcentaje_descuento().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProntoPago prontopagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,prontopagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProntoPago prontopagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				prontopagoLocal=this.prontopago;
			} else {
				prontopagoLocal=this.prontopagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(prontopagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProntoPago(prontopagoLocal,true);
					
					if(prontopagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(prontopagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(prontopagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProntoPago(ProntoPago prontopago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProntoPago(prontopago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(prontopago);
	}
	
	public void setVariablesFormularioToObjetoActualProntoPago(ProntoPago prontopago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProntoPago(prontopago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProntoPago(ProntoPago prontopago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.getText()==null || this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.getText()=="" || this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.getText()=="Id") {
				this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setText("0");
			}

			if(conColumnasBase) {prontopago.setId(Long.parseLong(this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProntoPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabelIdProntoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prontopago.setdia_inicio(Integer.parseInt(this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProntoPagoConstantesFunciones.LABEL_DIAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabeldia_inicioProntoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prontopago.setdia_fin(Integer.parseInt(this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProntoPagoConstantesFunciones.LABEL_DIAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabeldia_finProntoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prontopago.setporcentaje_descuento(Double.parseDouble(this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProntoPago.jLabelporcentaje_descuentoProntoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProntoPago(ProntoPago prontopagoBean,ProntoPago prontopago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProntoPago(ProntoPago prontopagoOrigen,ProntoPago prontopago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && prontopagoOrigen.getId()!=null && !prontopagoOrigen.getId().equals(0L))) {prontopago.setId(prontopagoOrigen.getId());}}
			if(conDefault || (!conDefault && prontopagoOrigen.getdia_inicio()!=null && !prontopagoOrigen.getdia_inicio().equals(0))) {prontopago.setdia_inicio(prontopagoOrigen.getdia_inicio());}
			if(conDefault || (!conDefault && prontopagoOrigen.getdia_fin()!=null && !prontopagoOrigen.getdia_fin().equals(0))) {prontopago.setdia_fin(prontopagoOrigen.getdia_fin());}
			if(conDefault || (!conDefault && prontopagoOrigen.getporcentaje_descuento()!=null && !prontopagoOrigen.getporcentaje_descuento().equals(0.0))) {prontopago.setporcentaje_descuento(prontopagoOrigen.getporcentaje_descuento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProntoPago(ProntoPago prontopago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setText(prontopago.getId().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setText(prontopago.getdia_inicio().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setText(prontopago.getdia_fin().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setText(prontopago.getporcentaje_descuento().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProntoPago(ProntoPagoBean prontopagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setText(prontopagoBean.getId().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setText(prontopagoBean.getdia_inicio().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setText(prontopagoBean.getdia_fin().toString());
			this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setText(prontopagoBean.getporcentaje_descuento().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProntoPago(ProntoPagoParameterReturnGeneral prontopagoReturnGeneral,ProntoPagoBean prontopagoBean,Boolean conDefault) throws Exception { 
		try {
			ProntoPago prontopagoLocal=new ProntoPago();
			
			prontopagoLocal=prontopagoReturnGeneral.getProntoPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && prontopagoLocal.getId()!=null && !prontopagoLocal.getId().equals(0L))) {prontopagoBean.setId(prontopagoLocal.getId());}}
			if(conDefault || (!conDefault && prontopagoLocal.getdia_inicio()!=null && !prontopagoLocal.getdia_inicio().equals(0))) {prontopagoBean.setdia_inicio(prontopagoLocal.getdia_inicio());}
			if(conDefault || (!conDefault && prontopagoLocal.getdia_fin()!=null && !prontopagoLocal.getdia_fin().equals(0))) {prontopagoBean.setdia_fin(prontopagoLocal.getdia_fin());}
			if(conDefault || (!conDefault && prontopagoLocal.getporcentaje_descuento()!=null && !prontopagoLocal.getporcentaje_descuento().equals(0.0))) {prontopagoBean.setporcentaje_descuento(prontopagoLocal.getporcentaje_descuento());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProntoPagoGenerico(Long idProntoPagoSeleccionado,JComboBox jComboBoxProntoPago,List<ProntoPago> prontopagosLocal)throws Exception {
		try {
			ProntoPago  prontopagoTemp=null;

			for(ProntoPago prontopagoAux:prontopagosLocal) {
				if(prontopagoAux.getId()!=null && prontopagoAux.getId().equals(idProntoPagoSeleccionado)) {
					prontopagoTemp=prontopagoAux;
					break;
				}
			}

			jComboBoxProntoPago.setSelectedItem(prontopagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProntoPagoGenerico(JComboBox jComboBoxProntoPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProntoPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProntoPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProntoPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProntoPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prontopago=(ProntoPago) prontopagoLogic.getProntoPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			prontopago =(ProntoPago) prontopagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!prontopago.getIsNew() && !prontopago.getIsChanged() && !prontopago.getIsDeleted()) {
				sDescripcion=prontopago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=prontopago.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProntoPago prontopagoRow=new ProntoPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prontopagoRow=(ProntoPago) prontopagoLogic.getProntoPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			prontopagoRow=(ProntoPago) prontopagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProntoPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProntoPago.setVisible((this.isVisibilidadCeldaNuevoProntoPago && this.isPermisoNuevoProntoPago));			
			this.jButtonDuplicarProntoPago.setVisible((this.isVisibilidadCeldaDuplicarProntoPago && this.isPermisoDuplicarProntoPago));			
			this.jButtonCopiarProntoPago.setVisible((this.isVisibilidadCeldaCopiarProntoPago && this.isPermisoCopiarProntoPago));
			this.jButtonVerFormProntoPago.setVisible((this.isVisibilidadCeldaVerFormProntoPago && this.isPermisoVerFormProntoPago));
			
			this.jButtonAbrirOrderByProntoPago.setVisible((this.isVisibilidadCeldaOrdenProntoPago && this.isPermisoOrdenProntoPago));			
			
			this.jButtonNuevoRelacionesProntoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesProntoPago && this.isPermisoNuevoProntoPago));			
			this.jButtonNuevoGuardarCambiosProntoPago.setVisible((this.isVisibilidadCeldaNuevoProntoPago && this.isPermisoNuevoProntoPago && this.isPermisoGuardarCambiosProntoPago));
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.jInternalFrameDetalleFormProntoPago.jButtonModificarProntoPago.setVisible((this.isVisibilidadCeldaModificarProntoPago && this.isPermisoActualizarProntoPago));	
			this.jInternalFrameDetalleFormProntoPago.jButtonActualizarProntoPago.setVisible((this.isVisibilidadCeldaActualizarProntoPago && this.isPermisoActualizarProntoPago));	
			this.jInternalFrameDetalleFormProntoPago.jButtonEliminarProntoPago.setVisible((this.isVisibilidadCeldaEliminarProntoPago && this.isPermisoEliminarProntoPago));
			this.jInternalFrameDetalleFormProntoPago.jButtonCancelarProntoPago.setVisible(this.isVisibilidadCeldaCancelarProntoPago);							
			this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.setVisible((this.isVisibilidadCeldaGuardarProntoPago && this.isPermisoGuardarCambiosProntoPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaProntoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosProntoPago && this.isPermisoGuardarCambiosProntoPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProntoPago.setVisible((this.isVisibilidadCeldaNuevoProntoPago && this.isPermisoNuevoProntoPago));						
			this.jButtonDuplicarToolBarProntoPago.setVisible((this.isVisibilidadCeldaDuplicarProntoPago && this.isPermisoDuplicarProntoPago));						
			this.jButtonCopiarToolBarProntoPago.setVisible((this.isVisibilidadCeldaCopiarProntoPago && this.isPermisoCopiarProntoPago));			
			this.jButtonVerFormToolBarProntoPago.setVisible((this.isVisibilidadCeldaVerFormProntoPago && this.isPermisoVerFormProntoPago));			
			this.jButtonAbrirOrderByToolBarProntoPago.setVisible((this.isVisibilidadCeldaOrdenProntoPago && this.isPermisoOrdenProntoPago));
			this.jButtonNuevoRelacionesToolBarProntoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesProntoPago && this.isPermisoNuevoProntoPago));			
			this.jButtonNuevoGuardarCambiosToolBarProntoPago.setVisible((this.isVisibilidadCeldaNuevoProntoPago && this.isPermisoNuevoProntoPago && this.isPermisoGuardarCambiosProntoPago));			
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.jInternalFrameDetalleFormProntoPago.jButtonModificarToolBarProntoPago.setVisible((this.isVisibilidadCeldaModificarProntoPago && this.isPermisoActualizarProntoPago));	
			this.jInternalFrameDetalleFormProntoPago.jButtonActualizarToolBarProntoPago.setVisible((this.isVisibilidadCeldaActualizarProntoPago  && this.isPermisoActualizarProntoPago));	
			this.jInternalFrameDetalleFormProntoPago.jButtonEliminarToolBarProntoPago.setVisible((this.isVisibilidadCeldaEliminarProntoPago && this.isPermisoEliminarProntoPago));
			this.jInternalFrameDetalleFormProntoPago.jButtonCancelarToolBarProntoPago.setVisible(this.isVisibilidadCeldaCancelarProntoPago);				
			this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosToolBarProntoPago.setVisible((this.isVisibilidadCeldaGuardarProntoPago && this.isPermisoGuardarCambiosProntoPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProntoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosProntoPago && this.isPermisoGuardarCambiosProntoPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProntoPago.setVisible((this.isVisibilidadCeldaNuevoProntoPago && this.isPermisoNuevoProntoPago));			
			this.jMenuItemDuplicarProntoPago.setVisible((this.isVisibilidadCeldaDuplicarProntoPago && this.isPermisoDuplicarProntoPago));			
			this.jMenuItemCopiarProntoPago.setVisible((this.isVisibilidadCeldaCopiarProntoPago && this.isPermisoCopiarProntoPago));			
			this.jMenuItemVerFormProntoPago.setVisible((this.isVisibilidadCeldaVerFormProntoPago && this.isPermisoVerFormProntoPago));			
			this.jMenuItemAbrirOrderByProntoPago.setVisible((this.isVisibilidadCeldaOrdenProntoPago && this.isPermisoOrdenProntoPago));			
			//this.jMenuItemMostrarOcultarProntoPago.setVisible((this.isVisibilidadCeldaOrdenProntoPago && this.isPermisoOrdenProntoPago));
			this.jMenuItemDetalleAbrirOrderByProntoPago.setVisible((this.isVisibilidadCeldaOrdenProntoPago && this.isPermisoOrdenProntoPago));			
			//this.jMenuItemDetalleMostrarOcultarProntoPago.setVisible((this.isVisibilidadCeldaOrdenProntoPago && this.isPermisoOrdenProntoPago));			
			this.jMenuItemNuevoRelacionesProntoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesProntoPago && this.isPermisoNuevoProntoPago));			
			this.jMenuItemNuevoGuardarCambiosProntoPago.setVisible((this.isVisibilidadCeldaNuevoProntoPago && this.isPermisoNuevoProntoPago && this.isPermisoGuardarCambiosProntoPago));									
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.jInternalFrameDetalleFormProntoPago.jMenuItemModificarProntoPago.setVisible((this.isVisibilidadCeldaModificarProntoPago && this.isPermisoActualizarProntoPago));	
			this.jInternalFrameDetalleFormProntoPago.jMenuItemActualizarProntoPago.setVisible((this.isVisibilidadCeldaActualizarProntoPago && this.isPermisoActualizarProntoPago));	
			this.jInternalFrameDetalleFormProntoPago.jMenuItemEliminarProntoPago.setVisible((this.isVisibilidadCeldaEliminarProntoPago && this.isPermisoEliminarProntoPago));
			this.jInternalFrameDetalleFormProntoPago.jMenuItemCancelarProntoPago.setVisible(this.isVisibilidadCeldaCancelarProntoPago);				
			}
			
			this.jMenuItemGuardarCambiosProntoPago.setVisible((this.isVisibilidadCeldaGuardarProntoPago && this.isPermisoGuardarCambiosProntoPago));						
			this.jMenuItemGuardarCambiosTablaProntoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosProntoPago && this.isPermisoGuardarCambiosProntoPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProntoPago=this.jButtonNuevoProntoPago.isVisible();
			this.isVisibilidadCeldaDuplicarProntoPago=this.jButtonDuplicarProntoPago.isVisible();
			this.isVisibilidadCeldaCopiarProntoPago=this.jButtonCopiarProntoPago.isVisible();
			this.isVisibilidadCeldaVerFormProntoPago=this.jButtonVerFormProntoPago.isVisible();
			
			this.isVisibilidadCeldaOrdenProntoPago=this.jButtonAbrirOrderByProntoPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=this.jButtonNuevoRelacionesProntoPago.isVisible();
			this.isVisibilidadCeldaModificarProntoPago=this.jButtonModificarProntoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.isVisibilidadCeldaActualizarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonActualizarProntoPago.isVisible();
			this.isVisibilidadCeldaEliminarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonEliminarProntoPago.isVisible();
			this.isVisibilidadCeldaCancelarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonCancelarProntoPago.isVisible();
			this.isVisibilidadCeldaGuardarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProntoPago=this.jButtonGuardarCambiosTablaProntoPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProntoPago=this.jButtonNuevoToolBarProntoPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=this.jButtonNuevoRelacionesToolBarProntoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.isVisibilidadCeldaModificarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonModificarToolBarProntoPago.isVisible();
			this.isVisibilidadCeldaActualizarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonActualizarToolBarProntoPago.isVisible();
			this.isVisibilidadCeldaEliminarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonEliminarToolBarProntoPago.isVisible();
			this.isVisibilidadCeldaCancelarProntoPago=this.jInternalFrameDetalleFormProntoPago.jButtonCancelarToolBarProntoPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProntoPago=this.jButtonGuardarCambiosToolBarProntoPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProntoPago=this.jButtonGuardarCambiosTablaToolBarProntoPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProntoPago=this.jMenuItemNuevoProntoPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=this.jMenuItemNuevoRelacionesProntoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.isVisibilidadCeldaModificarProntoPago=this.jInternalFrameDetalleFormProntoPago.jMenuItemModificarProntoPago.isVisible();
			this.isVisibilidadCeldaActualizarProntoPago=this.jInternalFrameDetalleFormProntoPago.jMenuItemActualizarProntoPago.isVisible();
			this.isVisibilidadCeldaEliminarProntoPago=this.jInternalFrameDetalleFormProntoPago.jMenuItemEliminarProntoPago.isVisible();
			this.isVisibilidadCeldaCancelarProntoPago=this.jInternalFrameDetalleFormProntoPago.jMenuItemCancelarProntoPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProntoPago=this.jMenuItemGuardarCambiosProntoPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProntoPago=this.jMenuItemGuardarCambiosTablaProntoPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProntoPago(Boolean esInicializar) {
		if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
				//if(this.prontopagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProntoPago();
			}
			
			this.inicializarActualizarBindingBotonesManualProntoPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProntoPago() {
		this.jButtonNuevoProntoPago.setVisible(this.isPermisoNuevoProntoPago);			
		this.jButtonDuplicarProntoPago.setVisible(this.isPermisoDuplicarProntoPago);			
		this.jButtonCopiarProntoPago.setVisible(this.isPermisoCopiarProntoPago);			
		this.jButtonVerFormProntoPago.setVisible(this.isPermisoVerFormProntoPago);			
		
		this.jButtonAbrirOrderByProntoPago.setVisible(this.isPermisoOrdenProntoPago);					
		
		this.jButtonNuevoRelacionesProntoPago.setVisible(this.isPermisoNuevoProntoPago);			
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonModificarProntoPago.setVisible(this.isPermisoActualizarProntoPago);	
			this.jInternalFrameDetalleFormProntoPago.jButtonActualizarProntoPago.setVisible(this.isPermisoActualizarProntoPago);	
			this.jInternalFrameDetalleFormProntoPago.jButtonEliminarProntoPago.setVisible(this.isPermisoEliminarProntoPago);
			this.jInternalFrameDetalleFormProntoPago.jButtonCancelarProntoPago.setVisible(this.isVisibilidadCeldaCancelarProntoPago);						
			this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.setVisible(this.isPermisoGuardarCambiosProntoPago);							
		}
		
		this.jButtonGuardarCambiosTablaProntoPago.setVisible(this.isPermisoActualizarProntoPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProntoPago() {
		this.jInternalFrameDetalleFormProntoPago.jButtonModificarProntoPago.setVisible(this.isPermisoActualizarProntoPago);	
		this.jInternalFrameDetalleFormProntoPago.jButtonActualizarProntoPago.setVisible(this.isPermisoActualizarProntoPago);	
		this.jInternalFrameDetalleFormProntoPago.jButtonEliminarProntoPago.setVisible(this.isPermisoEliminarProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jButtonCancelarProntoPago.setVisible(this.isVisibilidadCeldaCancelarProntoPago);							
		this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.setVisible((this.isVisibilidadCeldaGuardarProntoPago && this.isPermisoGuardarCambiosProntoPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProntoPago() {
		if(ProntoPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProntoPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProntoPago() {
	}
	
	public void jTableDatosProntoPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProntoPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProntoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProntoPago(this.getprontopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prontopago==null) {
						this.prontopago = new ProntoPago();
					}

					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				}

				if(this.prontopago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.prontopago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProntoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProntoPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProntoPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProntoPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProntoPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProntoPago(this.getprontopago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.prontopagoLogic.getConnexion());

				if(this.prontopago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.prontopago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProntoPago=(TitledBorder)this.jScrollPanelDatosProntoPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProntoPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProntoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProntoPago(this.getprontopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prontopago==null) {
						this.prontopago = new ProntoPago();
					}

					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				}

				if(this.prontopago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.prontopago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProntoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_inicioProntoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProntoPago(this.getprontopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prontopago==null) {
						this.prontopago = new ProntoPago();
					}

					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				}

				if(this.prontopago.getdia_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_inicio = "+this.prontopago.getdia_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProntoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_finProntoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProntoPago(this.getprontopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prontopago==null) {
						this.prontopago = new ProntoPago();
					}

					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				}

				if(this.prontopago.getdia_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_fin = "+this.prontopago.getdia_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProntoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_descuentoProntoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProntoPago(this.getprontopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prontopago==null) {
						this.prontopago = new ProntoPago();
					}

					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);
				}

				if(this.prontopago.getporcentaje_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_descuento = "+this.prontopago.getporcentaje_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProntoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaProntoPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProntoPago(false,false);

			this.getProntoPagosFK_IdEmpresa();

			this.inicializarActualizarBindingProntoPago(false);

			//if(ProntoPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProntoPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prontopagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProntoPago() {
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
			this.jInternalFrameDetalleFormProntoPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormProntoPago.dispose();
			this.jInternalFrameDetalleFormProntoPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
			this.jInternalFrameReporteDinamicoProntoPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProntoPago.dispose();
			this.jInternalFrameReporteDinamicoProntoPago=null;
		}
		
		if(this.jInternalFrameImportacionProntoPago!=null) {
			this.jInternalFrameImportacionProntoPago.setVisible(false);	    			
			this.jInternalFrameImportacionProntoPago.dispose();
			this.jInternalFrameImportacionProntoPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProntoPago();
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProntoPago")) {
				jButtonDuplicarProntoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProntoPago")) {
				jButtonCopiarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProntoPago")) {
				jButtonVerFormProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProntoPago")) {
				jButtonDuplicarProntoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProntoPago")) {
				jButtonDuplicarProntoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProntoPago")) {
				jButtonModificarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProntoPago")) {
				jButtonModificarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProntoPago")) {
				jButtonModificarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProntoPago")) {
				jButtonActualizarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProntoPago")) {
				jButtonActualizarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProntoPago")) {
				jButtonActualizarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProntoPago")) {
				jButtonEliminarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProntoPago")) {
				jButtonEliminarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProntoPago")) {
				jButtonEliminarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProntoPago")) {
				jButtonCancelarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProntoPago")) {
				jButtonCancelarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProntoPago")) {
				jButtonCancelarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProntoPago")) {
				jButtonCerrarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProntoPago")) {
				jButtonCerrarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProntoPago")) {
				jButtonCerrarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProntoPago")) {
				jButtonMostrarOcultarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProntoPago")) {
				jButtonCancelarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProntoPago")) {
				jButtonCopiarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProntoPago")) {
				jButtonVerFormProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProntoPago")) {
				jButtonCopiarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProntoPago")) {
				jButtonVerFormProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProntoPago")) {
				jButtonRecargarInformacionProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProntoPago")) {
				jButtonRecargarInformacionProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProntoPago")) {
				jButtonRecargarInformacionProntoPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProntoPago")) {
				jButtonAnterioresProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProntoPago")) {
				jButtonAnterioresProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProntoPago")) {
				jButtonAnterioresProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProntoPago")) {
				jButtonSiguientesProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProntoPago")) {
				jButtonSiguientesProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProntoPago")) {
				jButtonSiguientesProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProntoPago") || sTipo.equals("MenuItemDetalleAbrirOrderByProntoPago")) {
				jButtonAbrirOrderByProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProntoPago") || sTipo.equals("MenuItemDetalleMostrarOcultarProntoPago")) {
				jButtonMostrarOcultarProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProntoPago")) {
				jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProntoPago")) {
				jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProntoPago")) {
				jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProntoPago")) {
				jButtonCerrarReporteDinamicoProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProntoPago")) {
				jButtonGenerarReporteDinamicoProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProntoPago")) {
				
				jButtonGenerarExcelReporteDinamicoProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProntoPago")) {
				jButtonCerrarImportacionProntoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProntoPago")) {
				
				jButtonGenerarImportacionProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProntoPago")) {
				
				jButtonAbrirImportacionProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProntoPago")) {
				jComboBoxTiposAccionesProntoPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProntoPago")) {
				jComboBoxTiposRelacionesProntoPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProntoPago")) {
				jComboBoxTiposAccionesProntoPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProntoPago")) {
				
				jComboBoxTiposSeleccionarProntoPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProntoPago")) {
				jTextFieldValorCampoGeneralProntoPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProntoPago")) {
				jButtonAbrirOrderByProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProntoPago")) {
				jButtonAbrirOrderByProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProntoPago")) {
				jButtonCerrarOrderByProntoPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProntoPagoBusqueda")) {
				this.jButtonidProntoPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProntoPagoUpdate")) {
				this.jButtonid_empresaProntoPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProntoPagoBusqueda")) {
				this.jButtonid_empresaProntoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_inicioProntoPagoBusqueda")) {
				this.jButtondia_inicioProntoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_finProntoPagoBusqueda")) {
				this.jButtondia_finProntoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_descuentoProntoPagoBusqueda")) {
				this.jButtonporcentaje_descuentoProntoPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProntoPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProntoPago prontopagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				prontopagoLocal=this.prontopago;
			} else {
				prontopagoLocal=this.prontopagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
							
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
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
			
			


			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
								
						
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
								
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
							
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
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
			
			


			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
								
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProntoPago")) {
					jCheckBoxSeleccionarTodosProntoPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProntoPago")) {
					jCheckBoxSeleccionadosProntoPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProntoPago")) {
					
				}
				
				


				
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
												
				
				


				
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
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
			
			


			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProntoPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prontopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prontopago);
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
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
				
				


				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProntoPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProntoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProntoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prontopagoAnterior =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProntoPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProntoPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProntoPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.prontopago =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.prontopago =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.prontopago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProntoPago")) {
				
				}
				
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProntoPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProntoPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProntoPago")) {
			
			}
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProntoPago();
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			if(sTipo.equals("NuevoProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProntoPago")) {
				jButtonDuplicarProntoPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProntoPago")) {
				jButtonCopiarProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProntoPago")) {
				jButtonVerFormProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProntoPago")) {
				jButtonNuevoProntoPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProntoPago")) {
				jButtonModificarProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProntoPago")) {
				jButtonActualizarProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProntoPago")) {
				jButtonEliminarProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProntoPago")) {
				jButtonCancelarProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProntoPago")) {
				jButtonCerrarProntoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProntoPago")) {
				jButtonGuardarCambiosProntoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProntoPago")) {
				jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProntoPago")) {
				jButtonAbrirOrderByProntoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProntoPago")) {
				jButtonRecargarInformacionProntoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProntoPago")) {
				jButtonAnterioresProntoPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProntoPago")) {
				jButtonSiguientesProntoPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProntoPagoBusqueda")) {
				this.jButtonidProntoPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProntoPagoUpdate")) {
				this.jButtonid_empresaProntoPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProntoPagoBusqueda")) {
				this.jButtonid_empresaProntoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_inicioProntoPagoBusqueda")) {
				this.jButtondia_inicioProntoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_finProntoPagoBusqueda")) {
				this.jButtondia_finProntoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_descuentoProntoPagoBusqueda")) {
				this.jButtonporcentaje_descuentoProntoPagoBusquedaActionPerformed(evt);
			}
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProntoPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProntoPago")) {
				closingInternalFrameProntoPago();
				
			} else if(sTipo.equals("jButtonCancelarProntoPago")) {
				JInternalFrameBase jInternalFrameDetalleFormProntoPago = (JInternalFrameBase)evt.getSource();
	            	
	            ProntoPagoBeanSwingJInternalFrame jInternalFrameParent=(ProntoPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormProntoPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProntoPagoActionPerformed(null);
			}
			
			ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.prontopago,new Object(),this.prontopagoParameterGeneral,this.prontopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProntoPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProntoPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProntoPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.prontopago)) {
			if(!esControlTabla) {
				if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);			
				}
				
				if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProntoPago(this.prontopago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.prontopagoReturnGeneral=prontopagoLogic.procesarEventosProntoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prontopagoLogic.getProntoPagos(),this.prontopago,this.prontopagoParameterGeneral,this.isEsNuevoProntoPago,classes);//this.prontopagoLogic.getProntoPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProntoPago(this.prontopagoReturnGeneral,this.prontopagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProntoPago(classes,this.prontopagoReturnGeneral,this.prontopagoBean,false);
					}
						
					if(this.prontopagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProntoPago(this.prontopagoReturnGeneral.getProntoPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProntoPago(this.prontopagoReturnGeneral.getProntoPago());	
					}
						
					if(this.prontopagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProntoPago(this.prontopagoReturnGeneral.getProntoPago(),classes);//this.prontopagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProntoPago(this.prontopago,classes);//this.prontopagoBean);									
				}
			
				if(ProntoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProntoPago(this.prontopago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProntoPago(this.prontopago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.prontopagoAnterior!=null) {
						this.prontopago=this.prontopagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.prontopagoReturnGeneral=prontopagoLogic.procesarEventosProntoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prontopagoLogic.getProntoPagos(),this.prontopago,this.prontopagoParameterGeneral,this.isEsNuevoProntoPago,classes);//this.prontopagoLogic.getProntoPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.prontopagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.prontopagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.prontopagoReturnGeneral.getProntoPago(),prontopagoLogic.getProntoPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.prontopagoReturnGeneral.getProntoPago(),this.prontopagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProntoPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosProntoPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProntoPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosProntoPago() throws Exception {
		
		ProntoPagoModel prontopagoModel=(ProntoPagoModel)this.jTableDatosProntoPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prontopagoModel.prontopagos=this.prontopagoLogic.getProntoPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			prontopagoModel.prontopagos=this.prontopagos;
		}
		
		
		((ProntoPagoModel) this.jTableDatosProntoPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProntoPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprontopagoAnterior(),this.prontopagoLogic.getProntoPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprontopagoAnterior(),this.prontopagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProntoPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProntoPago(ProntoPago prontopago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
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
										
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prontopago,new Object(),generalEntityParameterGeneral,this.prontopagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProntoPagoConstantesFunciones.getClassesRelationshipsOfProntoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProntoPagoConstantesFunciones.getClassesRelationshipsFromStringsOfProntoPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProntoPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProntoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prontopago,new Object(),generalEntityParameterGeneral,this.prontopagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProntoPago(ProntoPagoBean prontopagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProntoPago(ArrayList<Classe> classes,ProntoPagoReturnGeneral prontopagoReturnGeneral,ProntoPagoBean prontopagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProntoPago(ProntoPago prontopago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.prontopago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProntoPago = new ProntoPagoDetalleFormJInternalFrame(jDesktopPane,this.prontopagoSessionBean.getConGuardarRelaciones(),this.prontopagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProntoPago);
		this.jInternalFrameDetalleFormProntoPago.setVisible(false);
		this.jInternalFrameDetalleFormProntoPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormProntoPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProntoPago.prontopagoLogic=this.prontopagoLogic;
		
		this.cargarCombosFrameForeignKeyProntoPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProntoPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProntoPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProntoPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProntoPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProntoPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProntoPago"));
		
		this.jInternalFrameDetalleFormProntoPago.jButtonModificarProntoPago.addActionListener(new ButtonActionListener(this,"ModificarProntoPago"));

		
		this.jInternalFrameDetalleFormProntoPago.jButtonModificarToolBarProntoPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarProntoPago"));
					
		this.jInternalFrameDetalleFormProntoPago.jMenuItemModificarProntoPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarProntoPago"));		
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonActualizarProntoPago.addActionListener (new ButtonActionListener(this,"ActualizarProntoPago"));
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonActualizarToolBarProntoPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProntoPago"));
						
		this.jInternalFrameDetalleFormProntoPago.jMenuItemActualizarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProntoPago"));		
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonEliminarProntoPago.addActionListener (new ButtonActionListener(this,"EliminarProntoPago"));
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonEliminarToolBarProntoPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarProntoPago"));
								
		this.jInternalFrameDetalleFormProntoPago.jMenuItemEliminarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProntoPago"));		
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonCancelarProntoPago.addActionListener (new ButtonActionListener(this,"CancelarProntoPago"));
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonCancelarToolBarProntoPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarProntoPago"));
					
		this.jInternalFrameDetalleFormProntoPago.jMenuItemCancelarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProntoPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jMenuItemDetalleCerrarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProntoPago"));		
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosToolBarProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProntoPago"));
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosToolBarProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProntoPago"));
		
		
		
		this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProntoPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonidProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idProntoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProntoPago.jButtonid_empresaProntoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProntoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonid_empresaProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtondia_inicioProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"dia_inicioProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtondia_finProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"dia_finProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonporcentaje_descuentoProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_descuentoProntoPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProntoPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProntoPago"));
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProntoPago"));
		}
		
		this.jTableDatosProntoPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProntoPago"));
		
		this.jTableDatosProntoPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProntoPago"));
		
		this.jButtonNuevoProntoPago.addActionListener(new ButtonActionListener(this,"NuevoProntoPago"));
		
		this.jButtonDuplicarProntoPago.addActionListener(new ButtonActionListener(this,"DuplicarProntoPago"));
		
		this.jButtonCopiarProntoPago.addActionListener(new ButtonActionListener(this,"CopiarProntoPago"));
		
		this.jButtonVerFormProntoPago.addActionListener(new ButtonActionListener(this,"VerFormProntoPago"));
		
		
		this.jButtonNuevoToolBarProntoPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarProntoPago"));
			
		this.jButtonDuplicarToolBarProntoPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProntoPago"));
			
		this.jMenuItemNuevoProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProntoPago"));
			
		this.jMenuItemDuplicarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProntoPago"));		
		
		
		this.jButtonNuevoRelacionesProntoPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProntoPago"));
		
		
		this.jButtonNuevoRelacionesToolBarProntoPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProntoPago"));
			
		this.jMenuItemNuevoRelacionesProntoPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProntoPago"));		
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonModificarProntoPago.addActionListener(new ButtonActionListener(this,"ModificarProntoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonModificarToolBarProntoPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarProntoPago"));
			
			this.jInternalFrameDetalleFormProntoPago.jMenuItemModificarProntoPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarProntoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProntoPago.jButtonActualizarProntoPago.addActionListener (new ButtonActionListener(this,"ActualizarProntoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonActualizarToolBarProntoPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProntoPago"));
				
			this.jInternalFrameDetalleFormProntoPago.jMenuItemActualizarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProntoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonEliminarProntoPago.addActionListener (new ButtonActionListener(this,"EliminarProntoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonEliminarToolBarProntoPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarProntoPago"));
						
			this.jInternalFrameDetalleFormProntoPago.jMenuItemEliminarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProntoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonCancelarProntoPago.addActionListener (new ButtonActionListener(this,"CancelarProntoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonCancelarToolBarProntoPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarProntoPago"));
			
			this.jInternalFrameDetalleFormProntoPago.jMenuItemCancelarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProntoPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProntoPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProntoPago"));		
		
		
		this.jButtonCerrarProntoPago.addActionListener (new ButtonActionListener(this,"CerrarProntoPago"));
		
		
		this.jButtonCerrarToolBarProntoPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarProntoPago"));
			
		this.jMenuItemCerrarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProntoPago"));
			
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jMenuItemDetalleCerrarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProntoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosProntoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosToolBarProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProntoPago"));
		}
		
		this.jButtonCopiarToolBarProntoPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarProntoPago"));
			
		this.jButtonVerFormToolBarProntoPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarProntoPago"));
		
		this.jMenuItemGuardarCambiosProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProntoPago"));
			
		this.jMenuItemCopiarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProntoPago"));		
		
		this.jMenuItemVerFormProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProntoPago"));		
		
		
		this.jButtonGuardarCambiosTablaProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProntoPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProntoPago"));
			
		this.jMenuItemGuardarCambiosTablaProntoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProntoPago"));		
		
		
		
		this.jButtonRecargarInformacionProntoPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionProntoPago"));
					
		this.jButtonRecargarInformacionToolBarProntoPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProntoPago"));
		
		this.jMenuItemRecargarInformacionProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProntoPago"));		
		
		
		
		this.jButtonAnterioresProntoPago.addActionListener (new ButtonActionListener(this,"AnterioresProntoPago"));
		
		
		this.jButtonAnterioresToolBarProntoPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProntoPago"));
		
		this.jMenuItemAnterioresProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProntoPago"));		
		
		
		this.jButtonSiguientesProntoPago.addActionListener (new ButtonActionListener(this,"SiguientesProntoPago"));
		
		
		this.jButtonSiguientesToolBarProntoPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProntoPago"));
			
		this.jMenuItemSiguientesProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProntoPago"));
			
		this.jMenuItemAbrirOrderByProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProntoPago"));
			
		this.jMenuItemMostrarOcultarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProntoPago"));
			
		this.jMenuItemDetalleAbrirOrderByProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProntoPago"));
			
		this.jMenuItemDetalleMostarOcultarProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProntoPago"));		
		
		
		this.jButtonNuevoGuardarCambiosProntoPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProntoPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProntoPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProntoPago"));
			
		this.jMenuItemNuevoGuardarCambiosProntoPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProntoPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProntoPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProntoPago"));

		this.jCheckBoxSeleccionadosProntoPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProntoPago"));
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProntoPago"));
		}
		
		
		this.jComboBoxTiposRelacionesProntoPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesProntoPago"));
			
		this.jComboBoxTiposAccionesProntoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesProntoPago"));
					
		this.jComboBoxTiposSeleccionarProntoPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProntoPago"));
			
		this.jTextFieldValorCampoGeneralProntoPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProntoPago"));		
		
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonidProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idProntoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProntoPago.jButtonid_empresaProntoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProntoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonid_empresaProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtondia_inicioProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"dia_inicioProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtondia_finProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"dia_finProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonporcentaje_descuentoProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_descuentoProntoPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProntoPago!=null) {
				this.jInternalFrameReporteDinamicoProntoPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProntoPago"));
				this.jInternalFrameReporteDinamicoProntoPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProntoPago"));
				this.jInternalFrameReporteDinamicoProntoPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProntoPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoProntoPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProntoPago"));				
			//this.jButtonGenerarReporteDinamicoProntoPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProntoPago"));
			//this.jButtonGenerarExcelReporteDinamicoProntoPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProntoPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProntoPago!=null) {
				this.jInternalFrameImportacionProntoPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProntoPago"));
				this.jInternalFrameImportacionProntoPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProntoPago"));
				this.jInternalFrameImportacionProntoPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProntoPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProntoPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByProntoPago"));
			
			this.jButtonAbrirOrderByToolBarProntoPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProntoPago"));			
			
			if(this.jInternalFrameOrderByProntoPago!=null) {
				this.jInternalFrameOrderByProntoPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProntoPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProntoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProntoPago.jTabbedPaneRelacionesProntoPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProntoPago"));
		
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
            		closingInternalFrameProntoPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProntoPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProntoPago = (JInternalFrameBase)event.getSource();
	            	
	            ProntoPagoBeanSwingJInternalFrame jInternalFrameParent=(ProntoPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormProntoPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProntoPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProntoPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProntoPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProntoPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProntoPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProntoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProntoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProntoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProntoPago";
		inputMap = this.jButtonNuevoProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProntoPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProntoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProntoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProntoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProntoPago";
		inputMap = this.jButtonNuevoRelacionesProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProntoPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProntoPago";
		inputMap = this.jButtonModificarProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProntoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProntoPago";
		inputMap = this.jButtonActualizarProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProntoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProntoPago";
		inputMap = this.jButtonEliminarProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProntoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProntoPago";
		inputMap = this.jButtonCancelarProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProntoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProntoPago";
		inputMap = this.jButtonCerrarProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProntoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProntoPago";
		inputMap = this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProntoPago.jButtonGuardarCambiosProntoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProntoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProntoPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProntoPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProntoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProntoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProntoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProntoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProntoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProntoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonidProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idProntoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProntoPago.jButtonid_empresaProntoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProntoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonid_empresaProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtondia_inicioProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"dia_inicioProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtondia_finProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"dia_finProntoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProntoPago.jButtonporcentaje_descuentoProntoPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_descuentoProntoPagoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProntoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProntoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProntoPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProntoPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProntoPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
					prontopagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProntoPago prontopagoAux:prontopagos) {
					prontopagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProntoPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProntoPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
						prontopagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProntoPago prontopagoAux:prontopagos) {
						prontopagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProntoPago prontopagoAux:prontopagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProntoPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProntoPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProntoPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProntoPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProntoPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProntoPago.getSelectedRows();
			
			ProntoPago prontopagoLocal=new ProntoPago();
			
			//this.seleccionarTodosProntoPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prontopagoLocal =(ProntoPago) this.prontopagoLogic.getProntoPagos().toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					prontopagoLocal =(ProntoPago) this.prontopagos.toArray()[this.jTableDatosProntoPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				prontopagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
						prontopagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProntoPago prontopagoAux:prontopagos) {
						prontopagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProntoPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProntoPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProntoPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProntoPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProntoPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProntoPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProntoPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProntoPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProntoPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProntoPago prontopagoAux:this.prontopagoLogic.getProntoPagos()) {
				
						if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_DIAINICIO)) {
							existe=true;
							prontopagoAux.setdia_inicio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_DIAFIN)) {
							existe=true;
							prontopagoAux.setdia_fin(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO)) {
							existe=true;
							prontopagoAux.setporcentaje_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProntoPago prontopagoAux:prontopagos) {
					
						if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_DIAINICIO)) {
							existe=true;
							prontopagoAux.setdia_inicio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_DIAFIN)) {
							existe=true;
							prontopagoAux.setdia_fin(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO)) {
							existe=true;
							prontopagoAux.setporcentaje_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProntoPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProntoPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProntoPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProntoPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProntoPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProntoPago) {				
					conSplash=true;//false;										
					
					//this.startProcessProntoPago(conSplash);
				
					this.generarReporteProntoPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProntoPagosSeleccionados();
				//this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProntoPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProntoPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProntoPago();
				
				this.exportarProntoPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProntoPagos();
				//this.importarProntoPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProntoPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProntoPagosSeleccionados();
				//this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pronto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProntoPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProntoPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProntoPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
				}	
			} 			
			else if(ProntoPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProntoPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProntoPago(conSplash);
					
						//this.actualizarParametrosGeneralProntoPago();
						
						this.generarReporteProcesoAccionProntoPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProntoPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pronto PagoS SELECCIONADOS?", "MANTENIMIENTO DE Pronto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProntoPago();
				
						this.actualizarParametrosGeneralProntoPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.prontopagoReturnGeneral=prontopagoLogic.procesarAccionProntoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.prontopagoLogic.getProntoPagos(),this.prontopagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProntoPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProntoPago();
					
					ProntoPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProntoPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProntoPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProntoPago.jComboBoxTiposAccionesFormularioProntoPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProntoPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProntoPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProntoPago();
			
			if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
			ProntoPago prontopago=new ProntoPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProntoPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProntoPago.getSelectedItem();
			
			
			
			
			prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(prontopagosSeleccionados.size()==1) {
				for(ProntoPago prontopagoAux:prontopagosSeleccionados) {
					prontopago=prontopagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProntoPago();
			
      		//this.finishProcessProntoPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProntoPagoReturnGeneral() throws Exception {
		if(this.prontopagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.prontopagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.prontopagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.prontopagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.prontopagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.prontopagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProntoPago(false);
		}
		
		if(this.prontopagoReturnGeneral.getConRetornoLista() || this.prontopagoReturnGeneral.getConRetornoObjeto()) {
			if(this.prontopagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.prontopagoLogic.setProntoPagos(this.prontopagoReturnGeneral.getProntoPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.prontopagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.prontopagoLogic.setProntoPago(this.prontopagoReturnGeneral.getProntoPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProntoPago(false);
		}
	}
	
	public void actualizarParametrosGeneralProntoPago() throws Exception {
		
		
	}
	
	public ArrayList<ProntoPago> getProntoPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProntoPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProntoPago prontopagoAux:prontopagoLogic.getProntoPagos()) {
					if(prontopagoAux.getIsSelected()) {
						prontopagosSeleccionados.add(prontopagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProntoPago prontopagoAux:this.prontopagos) {
					if(prontopagoAux.getIsSelected()) {
						prontopagosSeleccionados.add(prontopagoAux);				
					}
				}
			}
			
			if(prontopagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						prontopagosSeleccionados.addAll(this.prontopagoLogic.getProntoPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						prontopagosSeleccionados.addAll(this.prontopagos);				
					}
				}
			}
		} else {
			prontopagosSeleccionados.add(this.prontopago);
		}
		
		return prontopagosSeleccionados;
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
	
	public void generarReporteProntoPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProntoPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProntoPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProntoPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProntoPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pronto Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProntoPagosSeleccionados() throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProntoPagos("Todos",prontopagosSeleccionados);
		
	}	
	
	public void generarReporteNormalProntoPagosSeleccionados() throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProntoPagos("Todos",prontopagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProntoPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProntoPagos("Todos",prontopagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProntoPagosSeleccionados() throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProntoPago();
		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProntoPago();
		
		
		//this.generarReporteProntoPagos("Todos",prontopagosSeleccionados ,prontopagoImplementable,prontopagoImplementableHome);
	}
	
	public void mostrarImportacionProntoPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProntoPago();
		
		this.abrirFrameImportacionProntoPago();		
		
			
		//this.generarReporteProntoPagos("Todos",prontopagosSeleccionados ,prontopagoImplementable,prontopagoImplementableHome);
	}
	
	public void importarProntoPagos() throws Exception {		
	
	}
	
	public void exportarProntoPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProntoPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProntoPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProntoPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pronto Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProntoPagosSeleccionados() throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProntoPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProntoPago prontopagoAux:prontopagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProntoPago(prontopagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//prontopagoAux.setsDetalleGeneralEntityReporte(prontopagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProntoPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProntoPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProntoPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProntoPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProntoPagoConstantesFunciones.LABEL_DIAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProntoPagoConstantesFunciones.LABEL_DIAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProntoPago(ProntoPago prontopago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=prontopago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=prontopago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=prontopago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prontopago.getdia_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prontopago.getdia_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prontopago.getporcentaje_descuento().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProntoPagosSeleccionados() throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProntoPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProntoPago(row);				
				iRow++;
			}				
			
			for(ProntoPago prontopagoAux:prontopagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProntoPago(prontopagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProntoPagosSeleccionados() throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();		
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prontopago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("prontopagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("prontopago");
			//elementRoot.appendChild(element);
		
			for(ProntoPago prontopagoAux:prontopagosSeleccionados) {
				element = document.createElement("prontopago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProntoPago(prontopagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProntoPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_DIAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_DIAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProntoPago(ProntoPago prontopago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(prontopago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(prontopago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prontopago.getdia_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(prontopago.getdia_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(prontopago.getporcentaje_descuento());				
	}
	
	public void setFilaDatosExportarXmlProntoPago(ProntoPago prontopago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProntoPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(prontopago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProntoPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(prontopago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProntoPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(prontopago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementdia_inicio = document.createElement(ProntoPagoConstantesFunciones.DIAINICIO);
		elementdia_inicio.appendChild(document.createTextNode(prontopago.getdia_inicio().toString().trim()));
		element.appendChild(elementdia_inicio);

		Element elementdia_fin = document.createElement(ProntoPagoConstantesFunciones.DIAFIN);
		elementdia_fin.appendChild(document.createTextNode(prontopago.getdia_fin().toString().trim()));
		element.appendChild(elementdia_fin);

		Element elementporcentaje_descuento = document.createElement(ProntoPagoConstantesFunciones.PORCENTAJEDESCUENTO);
		elementporcentaje_descuento.appendChild(document.createTextNode(prontopago.getporcentaje_descuento().toString().trim()));
		element.appendChild(elementporcentaje_descuento);
	}
	
	public void generarReporteGroupGenericoProntoPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProntoPago> prontopagosSeleccionados=new ArrayList<ProntoPago>();
		
		prontopagosSeleccionados=this.getProntoPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProntoPago(prontopagosSeleccionados);
		
		this.generarReporteProntoPagos("Todos",prontopagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProntoPago(ArrayList<ProntoPago> prontopagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProntoPago prontopagoAux:prontopagosSeleccionados) {
				prontopagoAux.setsDetalleGeneralEntityReporte(prontopagoAux.toString());
			
				if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					prontopagoAux.setsDescripcionGeneralEntityReporte1(prontopagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_DIAINICIO)) {
					existe=true;
					prontopagoAux.setsDescripcionGeneralEntityReporte1(prontopagoAux.getdia_inicio().toString());
				}
				 else if(sTipoSeleccionar.equals(ProntoPagoConstantesFunciones.LABEL_DIAFIN)) {
					existe=true;
					prontopagoAux.setsDescripcionGeneralEntityReporte1(prontopagoAux.getdia_fin().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProntoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProntoPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProntoPago=true;
				this.isVisibilidadCeldaNuevoRelacionesProntoPago=true;
				this.isVisibilidadCeldaGuardarCambiosProntoPago=true;
			}
			
			this.isVisibilidadCeldaModificarProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=false;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
			this.isVisibilidadCeldaModificarProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=true;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
			this.isVisibilidadCeldaModificarProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=true;
			this.isVisibilidadCeldaEliminarProntoPago=true;
			this.isVisibilidadCeldaCancelarProntoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
			this.isVisibilidadCeldaModificarProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=true;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProntoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=true;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=true;
			this.isVisibilidadCeldaModificarProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=false;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
			this.isVisibilidadCeldaActualizarProntoPago=false;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
			this.isVisibilidadCeldaModificarProntoPago=true;
			this.isVisibilidadCeldaActualizarProntoPago=false;
			this.isVisibilidadCeldaEliminarProntoPago=false;
			this.isVisibilidadCeldaCancelarProntoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarProntoPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProntoPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProntoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=true;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=true;
		} else {
			this.actualizarEstadoPanelsProntoPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProntoPago=false;
			//this.isVisibilidadCeldaVerFormProntoPago=false;
			this.isVisibilidadCeldaDuplicarProntoPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!prontopagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
		} else {
			this.isVisibilidadCeldaNuevoProntoPago=false;
			this.isVisibilidadCeldaGuardarCambiosProntoPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(prontopagoSessionBean.getEsGuardarRelacionado()) {
			if(!prontopagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;												
			}
			
			this.jButtonCerrarProntoPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProntoPago=false;
		}
		
		if(!this.permiteMantenimiento(this.prontopago)) {
			this.isVisibilidadCeldaActualizarProntoPago=false;
			this.isVisibilidadCeldaEliminarProntoPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProntoPago() {
	}
	
	public void actualizarEstadoPanelsProntoPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProntoPago!=null) {
				this.jScrollPanelDatosEdicionProntoPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProntoPago!=null) {
				this.jScrollPanelDatosProntoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionProntoPago!=null) {
				this.jPanelPaginacionProntoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProntoPago!=null) {
					this.jTabbedPaneBusquedasProntoPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProntoPago!=null) {
				this.jTabbedPaneBusquedasProntoPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProntoPago!=null) {
				this.jPanelParametrosReportesProntoPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProntoPagoSessionBean prontopagoSessionBean=new ProntoPagoSessionBean();
		
		if(this.prontopagoSessionBean==null) {
			this.prontopagoSessionBean=new ProntoPagoSessionBean();
		}
		
		this.prontopagoSessionBean.setsUltimaBusquedaProntoPago(this.getsAccionBusqueda());
		this.prontopagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.prontopagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			prontopagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProntoPagoSessionBean prontopagoSessionBean=new ProntoPagoSessionBean();
		
		if(this.prontopagoSessionBean==null) {
			this.prontopagoSessionBean=new ProntoPagoSessionBean();
		}
		
		if(this.prontopagoSessionBean.getsUltimaBusquedaProntoPago()!=null&&!this.prontopagoSessionBean.getsUltimaBusquedaProntoPago().equals("")) {
			this.setsAccionBusqueda(prontopagoSessionBean.getsUltimaBusquedaProntoPago());
			this.setiNumeroPaginacion(prontopagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(prontopagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(prontopagoSessionBean.getid_empresa());
				prontopagoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.prontopagoSessionBean.setsUltimaBusquedaProntoPago("");
		this.prontopagoSessionBean.setiNumeroPaginacion(ProntoPagoConstantesFunciones.INUMEROPAGINACION);
		this.prontopagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProntoPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProntoPago() {
		this.updateBorderResaltarBusquedasFormularioProntoPago();
		this.updateVisibilidadBusquedasFormularioProntoPago();
		this.updateHabilitarBusquedasFormularioProntoPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioProntoPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProntoPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProntoPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProntoPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProntoPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProntoPago.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProntoPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarProntoPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProntoPago() throws Exception {

		if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProntoPago();
		this.updateVisibilidadResaltarControlesFormularioProntoPago();
		this.updateHabilitarResaltarControlesFormularioProntoPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioProntoPago() throws Exception {
		if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.prontopagoConstantesFunciones.resaltaridProntoPago!=null && this.jInternalFrameDetalleFormProntoPago!=null) {this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setBorder(this.prontopagoConstantesFunciones.resaltaridProntoPago);}
		if(this.prontopagoConstantesFunciones.resaltarid_empresaProntoPago!=null && this.jInternalFrameDetalleFormProntoPago!=null) {this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setBorder(this.prontopagoConstantesFunciones.resaltarid_empresaProntoPago);}
		if(this.prontopagoConstantesFunciones.resaltardia_inicioProntoPago!=null && this.jInternalFrameDetalleFormProntoPago!=null) {this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setBorder(this.prontopagoConstantesFunciones.resaltardia_inicioProntoPago);}
		if(this.prontopagoConstantesFunciones.resaltardia_finProntoPago!=null && this.jInternalFrameDetalleFormProntoPago!=null) {this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setBorder(this.prontopagoConstantesFunciones.resaltardia_finProntoPago);}
		if(this.prontopagoConstantesFunciones.resaltarporcentaje_descuentoProntoPago!=null && this.jInternalFrameDetalleFormProntoPago!=null) {this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setBorder(this.prontopagoConstantesFunciones.resaltarporcentaje_descuentoProntoPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProntoPago() throws Exception {		
		if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
	
		//this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setVisible(this.prontopagoConstantesFunciones.mostraridProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jPanelidProntoPago.setVisible(this.prontopagoConstantesFunciones.mostraridProntoPago);
		//this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrarid_empresaProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jPanelid_empresaProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrarid_empresaProntoPago);
		//this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrardia_inicioProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jPaneldia_inicioProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrardia_inicioProntoPago);
		//this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrardia_finProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jPaneldia_finProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrardia_finProntoPago);
		//this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrarporcentaje_descuentoProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jPanelporcentaje_descuentoProntoPago.setVisible(this.prontopagoConstantesFunciones.mostrarporcentaje_descuentoProntoPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProntoPago() throws Exception {
		if(this.jInternalFrameDetalleFormProntoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProntoPago!=null) {
	
		this.jInternalFrameDetalleFormProntoPago.jLabelidProntoPago.setEnabled(this.prontopagoConstantesFunciones.activaridProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jComboBoxid_empresaProntoPago.setEnabled(this.prontopagoConstantesFunciones.activarid_empresaProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jTextFielddia_inicioProntoPago.setEnabled(this.prontopagoConstantesFunciones.activardia_inicioProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jTextFielddia_finProntoPago.setEnabled(this.prontopagoConstantesFunciones.activardia_finProntoPago);
		this.jInternalFrameDetalleFormProntoPago.jTextFieldporcentaje_descuentoProntoPago.setEnabled(this.prontopagoConstantesFunciones.activarporcentaje_descuentoProntoPago);
		}
	}
	
		
}