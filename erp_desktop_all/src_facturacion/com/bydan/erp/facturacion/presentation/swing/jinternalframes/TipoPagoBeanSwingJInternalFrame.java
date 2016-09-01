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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoPagoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoPagoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoPagoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoPagoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class TipoPagoBeanSwingJInternalFrame extends TipoPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPago> tipopagoValidator = new ClassValidator<TipoPago>(TipoPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPago tipopago;	
	public TipoPago tipopagoAux;
	public TipoPago tipopagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPago tipopagoTotales;
	public Long idTipoPagoActual;
	public Long iIdNuevoTipoPago=0L;
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
	
	public Boolean isPermisoTodoTipoPago;
	public Boolean isPermisoNuevoTipoPago;
	public Boolean isPermisoActualizarTipoPago;
	public Boolean isPermisoActualizarOriginalTipoPago;
	public Boolean isPermisoEliminarTipoPago;
	public Boolean isPermisoGuardarCambiosTipoPago;
	public Boolean isPermisoConsultaTipoPago;
	public Boolean isPermisoBusquedaTipoPago;
	public Boolean isPermisoReporteTipoPago;
	public Boolean isPermisoPaginacionMedioTipoPago;
	public Boolean isPermisoPaginacionAltoTipoPago;
	public Boolean isPermisoPaginacionTodoTipoPago;
	public Boolean isPermisoCopiarTipoPago;
	public Boolean isPermisoVerFormTipoPago;
	public Boolean isPermisoDuplicarTipoPago;
	public Boolean isPermisoOrdenTipoPago;
	
	
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
	
	public TipoPagoParameterReturnGeneral tipopagoReturnGeneral;
	public TipoPagoParameterReturnGeneral tipopagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPago=false;
	public Boolean esParaAccionDesdeFormularioTipoPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoPagoSessionBeanAdditional tipopagoSessionBeanAdditional=null;
	
	public TipoPagoSessionBeanAdditional getTipoPagoSessionBeanAdditional() {
		return this.tipopagoSessionBeanAdditional;
	}
	
	public void setTipoPagoSessionBeanAdditional(TipoPagoSessionBeanAdditional tipopagoSessionBeanAdditional) {
		try {
			this.tipopagoSessionBeanAdditional=tipopagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoPagoBeanSwingJInternalFrameAdditional tipopagoBeanSwingJInternalFrameAdditional=null;
	//public class TipoPagoBeanSwingJInternalFrame
	
	public TipoPagoBeanSwingJInternalFrameAdditional getTipoPagoBeanSwingJInternalFrameAdditional() {
		return this.tipopagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoPagoBeanSwingJInternalFrameAdditional(TipoPagoBeanSwingJInternalFrameAdditional tipopagoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipopagoBeanSwingJInternalFrameAdditional=tipopagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPagoLogic tipopagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPago tipopagoBean;
	public TipoPagoConstantesFunciones tipopagoConstantesFunciones;
	//public TipoPagoParameterReturnGeneral tipopagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoPago> tipopagos;	
	//public List<TipoPago> tipopagosEliminados;
	//public List<TipoPago> tipopagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPago=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPago=true;
	public Boolean isVisibilidadCeldaCopiarTipoPago=true;
	public Boolean isVisibilidadCeldaVerFormTipoPago=true;
	public Boolean isVisibilidadCeldaOrdenTipoPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPago=false;
	public Boolean isVisibilidadCeldaModificarTipoPago=false;
	public Boolean isVisibilidadCeldaActualizarTipoPago=false;
	public Boolean isVisibilidadCeldaEliminarTipoPago=false;
	public Boolean isVisibilidadCeldaCancelarTipoPago=false;
	public Boolean isVisibilidadCeldaGuardarTipoPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPago=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoPago() {
		return this.iIdNuevoTipoPago;
	}

	public void setiIdNuevoTipoPago(Long iIdNuevoTipoPago) {
		this.iIdNuevoTipoPago = iIdNuevoTipoPago;
	}
	
	public Long getidTipoPagoActual() {
		return this.idTipoPagoActual;
	}

	public void setidTipoPagoActual(Long idTipoPagoActual) {
		this.idTipoPagoActual = idTipoPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPago gettipopago() {
		return this.tipopago;
	}

	public void settipopago(TipoPago tipopago) {
		this.tipopago = tipopago;
	}
	
	public TipoPago gettipopagoAux() {
		return this.tipopagoAux;
	}

	public void settipopagoAux(TipoPago tipopagoAux) {
		this.tipopagoAux = tipopagoAux;
	}				
	
	public TipoPago gettipopagoAnterior() {
		return this.tipopagoAnterior;
	}

	public void settipopagoAnterior(TipoPago tipopagoAnterior) {
		this.tipopagoAnterior = tipopagoAnterior;
	}	
	
	public TipoPago gettipopagoTotales() {
		return this.tipopagoTotales;
	}

	public void settipopagoTotales(TipoPago tipopagoTotales) {
		this.tipopagoTotales = tipopagoTotales;
	}	
	
	public TipoPago gettipopagoBean() {
		return this.tipopagoBean;
	}

	public void settipopagoBean(TipoPago tipopagoBean) {
		this.tipopagoBean = tipopagoBean;
	}	
	
	public TipoPagoParameterReturnGeneral gettipopagoReturnGeneral() {
		return this.tipopagoReturnGeneral;
	}

	public void settipopagoReturnGeneral(TipoPagoParameterReturnGeneral tipopagoReturnGeneral) {
		this.tipopagoReturnGeneral = tipopagoReturnGeneral;
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
	
	
	public TipoPagoLogic getTipoPagoLogic()	{		
		return tipopagoLogic;
	}

	public void setTipoPagoLogic(TipoPagoLogic tipopagoLogic) {
		this.tipopagoLogic = tipopagoLogic;
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
	
	public Boolean getIsEsNuevoTipoPago() {
		return isEsNuevoTipoPago;
	}

	public void setIsEsNuevoTipoPago(Boolean isEsNuevoTipoPago) {
		this.isEsNuevoTipoPago = isEsNuevoTipoPago;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPago() {
		return esParaAccionDesdeFormularioTipoPago;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPago(Boolean esParaAccionDesdeFormularioTipoPago) {
		this.esParaAccionDesdeFormularioTipoPago = esParaAccionDesdeFormularioTipoPago;
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

			if(this.tipopagoSessionBean==null) {
				this.tipopagoSessionBean=new TipoPagoSessionBean();
			}

			if(!this.tipopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipopagoSessionBean.getlidEmpresaActual());
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

					if(this.tipopago!=null) {
						this.tipopago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPago!=null) {
						this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoPago!=null) {
						if(this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoPagoGenerico)throws Exception
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
				jComboBoxid_empresaTipoPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoPagoGenerico!=null && jComboBoxid_empresaTipoPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoPago tipopago,JComboBox jComboBoxid_empresaTipoPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipopago.setid_empresa(empresaAux.getId());
				tipopago.setempresa_descripcion(TipoPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipopago.setEmpresa(empresaAux);			}
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

					if(!TipoPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPago!=null) { 
							this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPago!=null) { 
					}

					if(!TipoPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoPago!=null) {
							this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPago!=null) {
							this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPago(this.tipopagoLogic.getTipoPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPago(this.tipopagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipopagoLogic.setTipoPagos(this.tipopagos);
			tipopagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPagoParameterReturnGeneral getTipoPagoParameterGeneral() {
		return this.tipopagoParameterGeneral;
	}
	
	public void setTipoPagoParameterGeneral(TipoPagoParameterReturnGeneral tipopagoParameterGeneral) {
		this.tipopagoParameterGeneral = tipopagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPago() {
		return isPermisoTodoTipoPago;
	}

	public void setIsPermisoTodoTipoPago(Boolean isPermisoTodoTipoPago) {
		this.isPermisoTodoTipoPago = isPermisoTodoTipoPago;
	}

	public Boolean getIsPermisoNuevoTipoPago() {
		return isPermisoNuevoTipoPago;
	}

	public void setIsPermisoNuevoTipoPago(Boolean isPermisoNuevoTipoPago) {
		this.isPermisoNuevoTipoPago = isPermisoNuevoTipoPago;
	}

	public Boolean getIsPermisoActualizarTipoPago() {
		return isPermisoActualizarTipoPago;
	}

	public void setIsPermisoActualizarTipoPago(Boolean isPermisoActualizarTipoPago) {
		this.isPermisoActualizarTipoPago = isPermisoActualizarTipoPago;
	}

	public Boolean getIsPermisoEliminarTipoPago() {
		return isPermisoEliminarTipoPago;
	}

	public void setIsPermisoEliminarTipoPago(Boolean isPermisoEliminarTipoPago) {
		this.isPermisoEliminarTipoPago = isPermisoEliminarTipoPago;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPago() {
		return isPermisoGuardarCambiosTipoPago;
	}

	public void setIsPermisoGuardarCambiosTipoPago(Boolean isPermisoGuardarCambiosTipoPago) {
		this.isPermisoGuardarCambiosTipoPago = isPermisoGuardarCambiosTipoPago;
	}
	
	public Boolean getIsPermisoConsultaTipoPago() {
		return isPermisoConsultaTipoPago;
	}

	public void setIsPermisoConsultaTipoPago(Boolean isPermisoConsultaTipoPago) {
		this.isPermisoConsultaTipoPago = isPermisoConsultaTipoPago;
	}

	public Boolean getIsPermisoBusquedaTipoPago() {
		return isPermisoBusquedaTipoPago;
	}

	public void setIsPermisoBusquedaTipoPago(Boolean isPermisoBusquedaTipoPago) {
		this.isPermisoBusquedaTipoPago = isPermisoBusquedaTipoPago;
	}

	public Boolean getIsPermisoReporteTipoPago() {
		return isPermisoReporteTipoPago;
	}

	public void setIsPermisoReporteTipoPago(Boolean isPermisoReporteTipoPago) {
		this.isPermisoReporteTipoPago = isPermisoReporteTipoPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPago() {
		return isPermisoPaginacionMedioTipoPago;
	}

	public void setIsPermisoPaginacionMedioTipoPago(Boolean isPermisoPaginacionMedioTipoPago) {
		this.isPermisoPaginacionMedioTipoPago = isPermisoPaginacionMedioTipoPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPago() {
		return isPermisoPaginacionTodoTipoPago;
	}

	public void setIsPermisoPaginacionTodoTipoPago(Boolean isPermisoPaginacionTodoTipoPago) {
		this.isPermisoPaginacionTodoTipoPago = isPermisoPaginacionTodoTipoPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPago() {
		return isPermisoPaginacionAltoTipoPago;
	}

	public void setIsPermisoPaginacionAltoTipoPago(Boolean isPermisoPaginacionAltoTipoPago) {
		this.isPermisoPaginacionAltoTipoPago = isPermisoPaginacionAltoTipoPago;
	}
	
	public Boolean getIsPermisoCopiarTipoPago() {
		return isPermisoCopiarTipoPago;
	}

	public void setIsPermisoCopiarTipoPago(Boolean isPermisoCopiarTipoPago) {
		this.isPermisoCopiarTipoPago = isPermisoCopiarTipoPago;
	}
	
	public Boolean getIsPermisoVerFormTipoPago() {
		return isPermisoVerFormTipoPago;
	}

	public void setIsPermisoVerFormTipoPago(Boolean isPermisoVerFormTipoPago) {
		this.isPermisoVerFormTipoPago = isPermisoVerFormTipoPago;
	}
	
	public Boolean getIsPermisoDuplicarTipoPago() {
		return isPermisoDuplicarTipoPago;
	}

	public void setIsPermisoDuplicarTipoPago(Boolean isPermisoDuplicarTipoPago) {
		this.isPermisoDuplicarTipoPago = isPermisoDuplicarTipoPago;
	}
	
	public Boolean getIsPermisoOrdenTipoPago() {
		return isPermisoOrdenTipoPago;
	}

	public void setIsPermisoOrdenTipoPago(Boolean isPermisoOrdenTipoPago) {
		this.isPermisoOrdenTipoPago = isPermisoOrdenTipoPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPago() {
		return isVisibilidadCeldaNuevoTipoPago;
	}

	public void setIsVisibilidadCeldaNuevoTipoPago(Boolean isVisibilidadCeldaNuevoTipoPago) {
		this.isVisibilidadCeldaNuevoTipoPago = isVisibilidadCeldaNuevoTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPago() {
		return isVisibilidadCeldaDuplicarTipoPago;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPago(Boolean isVisibilidadCeldaDuplicarTipoPago) {
		this.isVisibilidadCeldaDuplicarTipoPago = isVisibilidadCeldaDuplicarTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPago() {
		return isVisibilidadCeldaCopiarTipoPago;
	}

	public void setIsVisibilidadCeldaCopiarTipoPago(Boolean isVisibilidadCeldaCopiarTipoPago) {
		this.isVisibilidadCeldaCopiarTipoPago = isVisibilidadCeldaCopiarTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPago() {
		return isVisibilidadCeldaVerFormTipoPago;
	}

	public void setIsVisibilidadCeldaVerFormTipoPago(Boolean isVisibilidadCeldaVerFormTipoPago) {
		this.isVisibilidadCeldaVerFormTipoPago = isVisibilidadCeldaVerFormTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPago() {
		return isVisibilidadCeldaOrdenTipoPago;
	}

	public void setIsVisibilidadCeldaOrdenTipoPago(Boolean isVisibilidadCeldaOrdenTipoPago) {
		this.isVisibilidadCeldaOrdenTipoPago = isVisibilidadCeldaOrdenTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPago() {
		return isVisibilidadCeldaNuevoRelacionesTipoPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPago(Boolean isVisibilidadCeldaNuevoRelacionesTipoPago) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPago = isVisibilidadCeldaNuevoRelacionesTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPago() {
		return isVisibilidadCeldaModificarTipoPago;
	}

	public void setIsVisibilidadCeldaModificarTipoPago(Boolean isVisibilidadCeldaModificarTipoPago) {
		this.isVisibilidadCeldaModificarTipoPago = isVisibilidadCeldaModificarTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPago() {
		return isVisibilidadCeldaActualizarTipoPago;
	}

	public void setIsVisibilidadCeldaActualizarTipoPago(Boolean isVisibilidadCeldaActualizarTipoPago) {
		this.isVisibilidadCeldaActualizarTipoPago = isVisibilidadCeldaActualizarTipoPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPago() {
		return isVisibilidadCeldaEliminarTipoPago;
	}

	public void setIsVisibilidadCeldaEliminarTipoPago(Boolean isVisibilidadCeldaEliminarTipoPago) {
		this.isVisibilidadCeldaEliminarTipoPago = isVisibilidadCeldaEliminarTipoPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPago() {
		return isVisibilidadCeldaCancelarTipoPago;
	}

	public void setIsVisibilidadCeldaCancelarTipoPago(Boolean isVisibilidadCeldaCancelarTipoPago) {
		this.isVisibilidadCeldaCancelarTipoPago = isVisibilidadCeldaCancelarTipoPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPago() {
		return isVisibilidadCeldaGuardarTipoPago;
	}

	public void setIsVisibilidadCeldaGuardarTipoPago(Boolean isVisibilidadCeldaGuardarTipoPago) {
		this.isVisibilidadCeldaGuardarTipoPago = isVisibilidadCeldaGuardarTipoPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPago() {
		return isVisibilidadCeldaGuardarCambiosTipoPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPago(Boolean isVisibilidadCeldaGuardarCambiosTipoPago) {
		this.isVisibilidadCeldaGuardarCambiosTipoPago = isVisibilidadCeldaGuardarCambiosTipoPago;
	}
		
	public TipoPagoSessionBean gettipopagoSessionBean() {
		return this.tipopagoSessionBean;
	}
	
	public void settipopagoSessionBean(TipoPagoSessionBean tipopagoSessionBean) {
		this.tipopagoSessionBean=tipopagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPago(TipoPago tipopago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipopago,null);
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
	
	public void bugActualizarReferenciaActual(TipoPago tipopago,TipoPago tipopagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPago(tipopago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipopagoAux.setId(tipopago.getId());
		tipopagoAux.setVersionRow(tipopago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPago();
		
			int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipopagoValidator.getInvalidValues(this.tipopago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipopagoLogic.setDatosCliente(datosCliente);
			tipopagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipopagoAux=new  TipoPago();
				
				tipopagoAux.setIsNew(true);
				tipopagoAux.setIsChanged(true);
				
				tipopagoAux.setTipoPagoOriginal(this.tipopago);
				
				tipopagoAux.setId(this.tipopago.getId());	
				tipopagoAux.setVersionRow(this.tipopago.getVersionRow());	
				tipopagoAux.setid_empresa(this.tipopago.getid_empresa());	
				tipopagoAux.setcodigo(this.tipopago.getcodigo());	
				tipopagoAux.setnombre(this.tipopago.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipopagoAux,tipopagoLogic.getTipoPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagoAux,tipopagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagoLogic.saveTipoPagos();//WithConnection
						//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopago,tipopagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopagoLogic.saveTipoPagoRelaciones(tipopagoAux);//WithConnection
								//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipopago,tipopagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipopagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipopagoAux,tipopagoLogic.getTipoPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipopagoAux,tipopagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipopago,tipopagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipopagoAux=new  TipoPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipopagoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipopagoSessionBean.getEsGuardarRelacionado() && this.tipopago.getId()>=0)) {
						
					tipopagoAux.setIsNew(false);
				}
				
				tipopagoAux.setIsDeleted(false);
			
				tipopagoAux.setId(this.tipopago.getId());	
				tipopagoAux.setVersionRow(this.tipopago.getVersionRow());	
				tipopagoAux.setid_empresa(this.tipopago.getid_empresa());	
				tipopagoAux.setcodigo(this.tipopago.getcodigo());	
				tipopagoAux.setnombre(this.tipopago.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopagoAux,tipopagoLogic.getTipoPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagoAux,tipopagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagoLogic.saveTipoPagos();//WithConnection
						//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopago,tipopagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopagoLogic.saveTipoPagoRelaciones(tipopagoAux);//WithConnection
								//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipopago,tipopagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipopagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipopagoAux,tipopagoLogic.getTipoPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipopagoAux,tipopagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipopago,tipopagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipopagoAux=new  TipoPago();
				
				tipopagoAux.setIsNew(false);
				tipopagoAux.setIsChanged(false);
				
				tipopagoAux.setIsDeleted(true);
				
				tipopagoAux.setId(this.tipopago.getId());	
				tipopagoAux.setVersionRow(this.tipopago.getVersionRow());	
				tipopagoAux.setid_empresa(this.tipopago.getid_empresa());	
				tipopagoAux.setcodigo(this.tipopago.getcodigo());	
				tipopagoAux.setnombre(this.tipopago.getnombre());	
				
				if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipopagoAux.getId()>=0) {	
						this.tipopagosEliminados.add(tipopagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipopagoAux,tipopagoLogic.getTipoPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagoAux,tipopagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagoLogic.saveTipoPagos();//WithConnection
						//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopagoLogic.saveTipoPagoRelaciones(tipopagoAux);//WithConnection
								//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
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
							if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipopagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipopagoAux,tipopagoLogic.getTipoPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipopagoAux,tipopagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.getTipoPagos().addAll(this.tipopagosEliminados);
					
					tipopagoLogic.saveTipoPagos();//WithConnection
					//tipopagoLogic.getSetVersionRowTipoPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoPago();
				
				this.tipopagosEliminados= new ArrayList<TipoPago>();		
			}
			
			if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipopago=tipopagoAux;
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
      		//this.finishProcessTipoPago();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPago tipopagoLocal) throws Exception {
		
		if(this.tipopagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPago tipopagoLocal) throws Exception {	
		if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipopagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipopagoValidator.getInvalidValues(this.tipopago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPago tipopago,List<TipoPago> tipopagos) throws Exception {
		try	{		
			TipoPagoConstantesFunciones.actualizarLista(tipopago,tipopagos,this.tipopagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPago tipopago,List<TipoPago> tipopagos) throws Exception {
		try	{			
			TipoPagoConstantesFunciones.actualizarSelectedLista(tipopago,tipopagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPago> tipopagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipopagosLocal=this.tipopagoLogic.getTipoPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipopagosLocal=this.tipopagos;
			}
			//ARCHITECTURE
		
			for(TipoPago tipopagoLocal:tipopagosLocal) {
				if(this.permiteMantenimiento(tipopagoLocal) && tipopagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPagoConstantesFunciones.getTipoPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago.jLabelid_empresaTipoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPagoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago.jLabelcodigoTipoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPagoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago.jLabelnombreTipoPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPago.jLabelid_empresaTipoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPago.jLabelcodigoTipoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPago.jLabelnombreTipoPago,"");
		
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
		this.iIdNuevoTipoPago--;	
		
		
		this.tipopagoAux=new TipoPago();
		
		this.tipopagoAux.setId(this.iIdNuevoTipoPago);
		this.tipopagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopagoLogic.getTipoPagos().add(this.tipopagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipopagos.add(this.tipopagoAux);
		}
		//ARCHITECTURE
		
		this.tipopago=this.tipopagoAux;
		
		if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPago(this.tipopago);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPago(this.tipopago);
		}
				
		//this.setDefaultControlesTipoPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPago(this.tipopagoBean,this.tipopago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
			classes=TipoPagoConstantesFunciones.getClassesRelationshipsOfTipoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipopagoReturnGeneral=tipopagoLogic.procesarEventosTipoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopagoLogic.getTipoPagos(),this.tipopago,this.tipopagoParameterGeneral,this.isEsNuevoTipoPago,classes);//this.tipopagoLogic.getTipoPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPago(this.tipopagoReturnGeneral,this.tipopagoBean,false);
		
		if(this.tipopagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPago(this.tipopagoReturnGeneral.getTipoPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPago(this.tipopagoReturnGeneral.getTipoPago());
		}
		
		if(this.tipopagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPago(this.tipopagoReturnGeneral.getTipoPago(),classes);//this.tipopagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPagoBeanSwingJInternalFrameAdditional.RecargarFormTipoPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPago(false);
						
			if(tipopagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPago();
			}
			
			this.actualizarVisualTableDatosTipoPago();
			
			this.jTableDatosTipoPago.setRowSelectionInterval(this.getIndiceNuevoTipoPago(), this.getIndiceNuevoTipoPago());
			
			this.seleccionarFilaTablaTipoPagoActual();
						
			this.actualizarEstadoCeldasBotonesTipoPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setEnabled(isHabilitar && this.tipopagoConstantesFunciones.activarcodigoTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setEnabled(isHabilitar && this.tipopagoConstantesFunciones.activarnombreTipoPago);	
		//
		this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setEnabled(isHabilitar && this.tipopagoConstantesFunciones.activarid_empresaTipoPago);
	};
	
	public void setDefaultControlesTipoPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipopagoSessionBean.setConGuardarRelaciones(true);			
			this.tipopagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.setVisible(true);
			
					
		} else {
			//this.tipopagoSessionBean.setConGuardarRelaciones(false);			
			this.tipopagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
				if(tipopagoAux.getId().equals(this.iIdNuevoTipoPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago tipopagoAux:this.tipopagos) {
				if(tipopagoAux.getId().equals(this.iIdNuevoTipoPago)) {
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
	
	public int getIndiceActualTipoPago(TipoPago tipopago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
				if(tipopagoAux.getId().equals(tipopago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago tipopagoAux:this.tipopagos) {
				if(tipopagoAux.getId().equals(tipopago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPago(TipoPago tipopagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
				if(tipopagoAux.getTipoPagoOriginal().getId().equals(tipopagoOriginal.getId())) {
					existe=true;
					tipopagoOriginal.setId(tipopagoAux.getId());
					tipopagoOriginal.setVersionRow(tipopagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago tipopagoAux:this.tipopagos) {
				if(tipopagoAux.getTipoPagoOriginal().getId().equals(tipopagoOriginal.getId())) {
					existe=true;
					tipopagoOriginal.setId(tipopagoAux.getId());
					tipopagoOriginal.setVersionRow(tipopagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPago(Boolean esParaCancelar) throws Exception {
		tipopagosAux=new ArrayList<TipoPago>();
		tipopagoAux=new TipoPago();
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
					if(tipopagoAux.getId()<0) {
						tipopagosAux.add(tipopagoAux);
					}		
				}
				this.iIdNuevoTipoPago=0L;
				this.tipopagoLogic.getTipoPagos().removeAll(tipopagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago tipopagoAux:this.tipopagos) {
					if(tipopagoAux.getId()<0) {
						tipopagosAux.add(tipopagoAux);
					}		
				}
				this.iIdNuevoTipoPago=0L;
				this.tipopagos.removeAll(tipopagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPago 
					&& this.tipopagoLogic.getTipoPagos().size()>0
					) {
					tipopagoAux=this.tipopagoLogic.getTipoPagos().get(this.tipopagoLogic.getTipoPagos().size() - 1);
				
					if(tipopagoAux.getId()<0) {
						this.tipopagoLogic.getTipoPagos().remove(tipopagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPago && this.tipopagos.size()>0) {
					tipopagoAux=this.tipopagos.get(this.tipopagos.size() - 1);
				
					if(tipopagoAux.getId()<0) {
						this.tipopagos.remove(tipopagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipopago.getId()<0) {
				this.tipopagoLogic.getTipoPagos().remove(this.tipopago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipopago.getId()<0) {
				this.tipopagos.remove(this.tipopago);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPago(List<TipoPago> tipopagosAux) throws Exception {
		TipoPagoConstantesFunciones.setEstadosInicialesTipoPago(tipopagosAux);
	}
	
	public void setEstadosInicialesTipoPago(TipoPago tipopagoAux) throws Exception {
		TipoPagoConstantesFunciones.setEstadosInicialesTipoPago(tipopagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPagoActual()) {
				if(!this.isEsNuevoTipoPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Pago ?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPago tipopago) throws Exception {
		TipoPagoConstantesFunciones.seleccionarAsignar(this.tipopago,tipopago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPago=this.isPermisoActualizarOriginalTipoPago;
			
			
			this.seleccionarAsignar(tipopago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPagoConstantesFunciones.quitarEspaciosTipoPago(this.tipopago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipopagoSessionBean.setsFuncionBusquedaRapida(this.tipopagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPago(esParaCancelar);				
				this.cancelarNuevoTipoPago(esParaCancelar);								
			}
			
			this.tipopago=new TipoPago();
			
			this.inicializarTipoPago();
			
			this.actualizarEstadoCeldasBotonesTipoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPago() throws Exception {
		try {
			TipoPagoConstantesFunciones.inicializarTipoPago(this.tipopago);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipopagoLogic.getTipoPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPagos(String sAccionBusqueda,List<TipoPago> tipopagosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Pagos");		
		parameters.put("busquedapor", TipoPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPago=new JRBeanArrayDataSource(TipoPagoJInternalFrame.TraerTipoPagoBeans(tipopagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPagoBean.TraerTipoPagoBeans(tipopagosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPagos(sAccionBusqueda,sTipoArchivoReporte,tipopagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPagos(sAccionBusqueda,sTipoArchivoReporte,tipopagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPagoActionPerformed(null);
					//this.generarExcelReporteTipoPagos(sAccionBusqueda,sTipoArchivoReporte,tipopagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPagos(sAccionBusqueda,sTipoArchivoReporte,tipopagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPagos(sAccionBusqueda,sTipoArchivoReporte,tipopagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPagos(sAccionBusqueda,sTipoArchivoReporte,tipopagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPago> tipopagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPago tipopago : tipopagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPagoConstantesFunciones.generarExcelReporteDataTipoPago("NORMAL",row,workbook,tipopago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPago(String sTipo,Row row,Workbook workbook) {
		
		TipoPagoConstantesFunciones.generarExcelReporteHeaderTipoPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPago> tipopagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPago tipopago : tipopagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPagoConstantesFunciones.getTipoPagoDescripcion(tipopago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPagoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPagoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopago.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPagoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPagoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopago.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPago> tipopagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPago> tipopagosRespaldo=null;
		
		classes=TipoPagoConstantesFunciones.getClassesRelationshipsOfTipoPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipopagoLogic.setDatosCliente(this.datosCliente);
		this.tipopagoLogic.setDatosDeep(this.datosDeep);
		this.tipopagoLogic.setIsConDeep(true);
		
		tipopagosRespaldo=this.tipopagoLogic.getTipoPagos();
		
		this.tipopagoLogic.setTipoPagos(tipopagosParaReportes);	
		this.tipopagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipopagosParaReportes=this.tipopagoLogic.getTipoPagos();
		this.tipopagoLogic.setTipoPagos(tipopagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPago tipopago : tipopagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPagoConstantesFunciones.generarExcelReporteDataTipoPago("NORMAL",row,workbook,tipopago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoPagoConstantesFunciones.getTipoPagoDescripcion(tipopago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPago() throws Exception {		
		this.startProcessTipoPago(true);
	}
	
	public void startProcessTipoPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoPago ,this.jPanelParametrosReportesTipoPago, this.jScrollPanelDatosTipoPago,this.jPanelPaginacionTipoPago, this.jScrollPanelDatosEdicionTipoPago, this.jPanelAccionesTipoPago,this.jPanelAccionesFormularioTipoPago,this.jmenuBarTipoPago,this.jmenuBarDetalleTipoPago,this.jTtoolBarTipoPago,this.jTtoolBarDetalleTipoPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPago=this.jTabbedPaneBusquedasTipoPago; 
		
		final JPanel jPanelParametrosReportesTipoPago=this.jPanelParametrosReportesTipoPago;
		//final JScrollPane jScrollPanelDatosTipoPago=this.jScrollPanelDatosTipoPago;
		final JTable jTableDatosTipoPago=this.jTableDatosTipoPago;		
		final JPanel jPanelPaginacionTipoPago=this.jPanelPaginacionTipoPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoPago=this.jScrollPanelDatosEdicionTipoPago;
		final JPanel jPanelAccionesTipoPago=this.jPanelAccionesTipoPago;
		
		JPanel jPanelCamposAuxiliarTipoPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
			jPanelCamposAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jPanelCamposTipoPago;
			jPanelAccionesFormularioAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jPanelAccionesFormularioTipoPago;
		}
		
		final JPanel jPanelCamposTipoPago=jPanelCamposAuxiliarTipoPago;
		final JPanel jPanelAccionesFormularioTipoPago=jPanelAccionesFormularioAuxiliarTipoPago;
		
		
		final JMenuBar jmenuBarTipoPago=this.jmenuBarTipoPago;
		final JToolBar jTtoolBarTipoPago=this.jTtoolBarTipoPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
			jmenuBarDetalleAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jmenuBarDetalleTipoPago;
			jTtoolBarDetalleAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jTtoolBarDetalleTipoPago;
		}
		
		final JMenuBar jmenuBarDetalleTipoPago=jmenuBarDetalleAuxiliarTipoPago;
		final JToolBar jTtoolBarDetalleTipoPago=jTtoolBarDetalleAuxiliarTipoPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPago;
			processRunnable.jTableDatos=jTableDatosTipoPago;
			processRunnable.jPanelCampos=jPanelCamposTipoPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPago;
			processRunnable.jTtoolBar=jTtoolBarTipoPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPago ,jPanelParametrosReportesTipoPago,jTableDatosTipoPago, /*jScrollPanelDatosTipoPago,*/jPanelCamposTipoPago,jPanelPaginacionTipoPago, /*jScrollPanelDatosEdicionTipoPago,*/ jPanelAccionesTipoPago,jPanelAccionesFormularioTipoPago,jmenuBarTipoPago,jmenuBarDetalleTipoPago,jTtoolBarTipoPago,jTtoolBarDetalleTipoPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPago ,jPanelParametrosReportesTipoPago, jScrollPanelDatosTipoPago,jPanelPaginacionTipoPago, jScrollPanelDatosEdicionTipoPago, jPanelAccionesTipoPago,jPanelAccionesFormularioTipoPago,jmenuBarTipoPago,jmenuBarDetalleTipoPago,jTtoolBarTipoPago,jTtoolBarDetalleTipoPago);
						
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
	
	public void finishProcessTipoPago() {// throws Exception 
		this.finishProcessTipoPago(true);
	}
	
	public void finishProcessTipoPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoPago ,this.jPanelParametrosReportesTipoPago, this.jScrollPanelDatosTipoPago,this.jPanelPaginacionTipoPago, this.jScrollPanelDatosEdicionTipoPago, this.jPanelAccionesTipoPago,this.jPanelAccionesFormularioTipoPago,this.jmenuBarTipoPago,this.jmenuBarDetalleTipoPago,this.jTtoolBarTipoPago,this.jTtoolBarDetalleTipoPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPago=this.jTabbedPaneBusquedasTipoPago; 
		
		final JPanel jPanelParametrosReportesTipoPago=this.jPanelParametrosReportesTipoPago;
		//final JScrollPane jScrollPanelDatosTipoPago=this.jScrollPanelDatosTipoPago;
		final JTable jTableDatosTipoPago=this.jTableDatosTipoPago;		
		final JPanel jPanelPaginacionTipoPago=this.jPanelPaginacionTipoPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoPago=this.jScrollPanelDatosEdicionTipoPago;
		final JPanel jPanelAccionesTipoPago=this.jPanelAccionesTipoPago;
		
		JPanel jPanelCamposAuxiliarTipoPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
			jPanelCamposAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jPanelCamposTipoPago;
			jPanelAccionesFormularioAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jPanelAccionesFormularioTipoPago;
		}
		
		final JPanel jPanelCamposTipoPago=jPanelCamposAuxiliarTipoPago;
		final JPanel jPanelAccionesFormularioTipoPago=jPanelAccionesFormularioAuxiliarTipoPago;
		
		
		final JMenuBar jmenuBarTipoPago=this.jmenuBarTipoPago;		
		final JToolBar jTtoolBarTipoPago=this.jTtoolBarTipoPago;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
			jmenuBarDetalleAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jmenuBarDetalleTipoPago;
			jTtoolBarDetalleAuxiliarTipoPago=this.jInternalFrameDetalleFormTipoPago.jTtoolBarDetalleTipoPago;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPago=jmenuBarDetalleAuxiliarTipoPago;
		final JToolBar jTtoolBarDetalleTipoPago=jTtoolBarDetalleAuxiliarTipoPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPago;
			processRunnable.jTableDatos=jTableDatosTipoPago;
			processRunnable.jPanelCampos=jPanelCamposTipoPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPago;
			processRunnable.jTtoolBar=jTtoolBarTipoPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPago ,jPanelParametrosReportesTipoPago, jTableDatosTipoPago,/*jScrollPanelDatosTipoPago,*/jPanelCamposTipoPago,jPanelPaginacionTipoPago, /*jScrollPanelDatosEdicionTipoPago,*/ jPanelAccionesTipoPago,jPanelAccionesFormularioTipoPago,jmenuBarTipoPago,jmenuBarDetalleTipoPago,jTtoolBarTipoPago,jTtoolBarDetalleTipoPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipopagoConstantesFunciones.getsFinalQueryTipoPago();
		String  finalQueryPaginacionTodos=this.tipopagoConstantesFunciones.getsFinalQueryTipoPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPagoConstantesFunciones.getArrayColumnasGlobalesNoTipoPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPagoConstantesFunciones.getArrayColumnasGlobalesTipoPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipopagosEliminados= new ArrayList<TipoPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPago();
		
				///*TipoPagoSessionBean*/this.tipopagoSessionBean=new TipoPagoSessionBean();
			
			if(this.tipopagoSessionBean==null) {
				this.tipopagoSessionBean=new TipoPagoSessionBean();
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
					this.iNumeroPaginacion=TipoPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPagoConstantesFunciones.getClassesForeignKeysOfTipoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipopago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipopagosAux= new ArrayList<TipoPago>();
			
				
			tipopagoLogic.setDatosCliente(this.datosCliente);
			tipopagoLogic.setDatosDeep(this.datosDeep);
			tipopagoLogic.setIsConDeep(true);
			
			
			tipopagoLogic.getTipoPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipopagoLogic.getTodosTipoPagos(finalQueryGlobal,pagination);
					
					//tipopagoLogic.getTodosTipoPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipopagoLogic.getTipoPagos()==null|| tipopagoLogic.getTipoPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopagosAux= new ArrayList<TipoPago>();
							tipopagosAux.addAll(tipopagoLogic.getTipoPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagosAux= new ArrayList<TipoPago>();
							tipopagosAux.addAll(tipopagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopagoLogic.getTodosTipoPagos(finalQueryGlobal+"",this.pagination);												
							
							//tipopagoLogic.getTodosTipoPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPagos("Todos",tipopagoLogic.getTipoPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopagoLogic.setTipoPagos(new ArrayList<TipoPago>());					
							tipopagoLogic.getTipoPagos().addAll(tipopagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagos=new ArrayList<TipoPago>();
							tipopagos.addAll(tipopagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPago=this.idActual;
				
				} else if(this.idTipoPagoActual!=null && this.idTipoPagoActual!=0L) {
					idTipoPago=idTipoPagoActual;
				}
				
					
				this.sDetalleReporte=TipoPagoConstantesFunciones.getDetalleIndicePorId(idTipoPago);
				
				this.tipopagos=new ArrayList<TipoPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipopagoLogic.getEntity(idTipoPago);
					
					//tipopagoLogic.getEntityWithConnection(idTipoPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopagoLogic.setTipoPagos(new ArrayList<TipoPago>());
					tipopagoLogic.getTipoPagos().add(tipopagoLogic.getTipoPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopagos=new ArrayList<TipoPago>();
					this.tipopagos.add(tipopago);
				}
				
				if(tipopagoLogic.getTipoPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipopagoLogic.getTipoPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipopagoLogic.getTipoPagos()==null||tipopagoLogic.getTipoPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipopagos==null|| tipopagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagosAux=new ArrayList<TipoPago>();
						tipopagosAux.addAll(tipopagoLogic.getTipoPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagosAux=new ArrayList<TipoPago>();
							tipopagosAux.addAll(tipopagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipopagoLogic.getTipoPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPagos("FK_IdEmpresa",tipopagoLogic.getTipoPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPagos("FK_IdEmpresa",tipopagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagoLogic.setTipoPagos(new ArrayList<TipoPago>());
						tipopagoLogic.getTipoPagos().addAll(tipopagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagos=new ArrayList<TipoPago>();
							tipopagos.addAll(tipopagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopagoLogic.getTipoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopagoLogic.getTipoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPago tipopago) {
		Boolean permite=true;
		
		if(this.tipopago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPagoConstantesFunciones.getOrderByListaTipoPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPagoConstantesFunciones.getOrderByListaTipoPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago tipopago:tipopagoLogic.getTipoPagos()) {
				if(tipopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagoTotales=tipopago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago tipopago:this.tipopagos) {
				if(tipopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagoTotales=tipopago;
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
			this.tipopagoAux=new TipoPago();
			this.tipopagoAux.setsType(Constantes2.S_TOTALES);
			this.tipopagoAux.setIsNew(false);
			this.tipopagoAux.setIsChanged(false);
			this.tipopagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPagoConstantesFunciones.TotalizarValoresFilaTipoPago(this.tipopagoLogic.getTipoPagos(),this.tipopagoAux);
				
				this.tipopagoLogic.getTipoPagos().add(this.tipopagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPagoConstantesFunciones.TotalizarValoresFilaTipoPago(this.tipopagos,this.tipopagoAux);
				
				this.tipopagos.add(this.tipopagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipopagoTotales=new TipoPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopagoLogic.getTipoPagos().remove(tipopagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopagos.remove(tipopagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipopagoTotales=new TipoPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago tipopago:tipopagoLogic.getTipoPagos()) {
				if(tipopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagoTotales=tipopago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPagoConstantesFunciones.TotalizarValoresFilaTipoPago(this.tipopagoLogic.getTipoPagos(),tipopagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago tipopago:this.tipopagos) {
				if(tipopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagoTotales=tipopago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPagoConstantesFunciones.TotalizarValoresFilaTipoPago(this.tipopagos,tipopagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopagoLogic.getTipoPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoPago() {
		this.isPermisoTodoTipoPago=false;
		this.isPermisoNuevoTipoPago=false;
		this.isPermisoActualizarTipoPago=false;
		this.isPermisoActualizarOriginalTipoPago=false;
		this.isPermisoEliminarTipoPago=false;
		this.isPermisoGuardarCambiosTipoPago=false;
		this.isPermisoConsultaTipoPago=false;
		this.isPermisoBusquedaTipoPago=false;
		this.isPermisoReporteTipoPago=false;		
		this.isPermisoOrdenTipoPago=false;		
		this.isPermisoPaginacionMedioTipoPago=false;		
		this.isPermisoPaginacionAltoTipoPago=false;
		this.isPermisoPaginacionTodoTipoPago=false;
		this.isPermisoCopiarTipoPago=false;		
		this.isPermisoVerFormTipoPago=false;		
		this.isPermisoDuplicarTipoPago=false;		
		this.isPermisoOrdenTipoPago=false;		
	}
	
	public void setPermisosUsuarioTipoPago(Boolean isPermiso) {
		this.isPermisoTodoTipoPago=isPermiso;
		this.isPermisoNuevoTipoPago=isPermiso;
		this.isPermisoActualizarTipoPago=isPermiso;
		this.isPermisoActualizarOriginalTipoPago=isPermiso;
		this.isPermisoEliminarTipoPago=isPermiso;
		this.isPermisoGuardarCambiosTipoPago=isPermiso;
		this.isPermisoConsultaTipoPago=isPermiso;
		this.isPermisoBusquedaTipoPago=isPermiso;
		this.isPermisoReporteTipoPago=isPermiso;
		this.isPermisoOrdenTipoPago=isPermiso;		
		this.isPermisoPaginacionMedioTipoPago=isPermiso;		
		this.isPermisoPaginacionAltoTipoPago=isPermiso;		
		this.isPermisoPaginacionTodoTipoPago=isPermiso;		
		this.isPermisoCopiarTipoPago=isPermiso;		
		this.isPermisoVerFormTipoPago=isPermiso;		
		this.isPermisoDuplicarTipoPago=isPermiso;
		this.isPermisoOrdenTipoPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPago(Boolean isPermiso) {
		//this.isPermisoTodoTipoPago=isPermiso;
		this.isPermisoNuevoTipoPago=isPermiso;
		this.isPermisoActualizarTipoPago=isPermiso;
		this.isPermisoActualizarOriginalTipoPago=isPermiso;
		this.isPermisoEliminarTipoPago=isPermiso;
		this.isPermisoGuardarCambiosTipoPago=isPermiso;
		//this.isPermisoConsultaTipoPago=isPermiso;
		//this.isPermisoBusquedaTipoPago=isPermiso;
		//this.isPermisoReporteTipoPago=isPermiso;
		//this.isPermisoOrdenTipoPago=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPago=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPago=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPago=isPermiso;		
		//this.isPermisoCopiarTipoPago=isPermiso;		
		//this.isPermisoDuplicarTipoPago=isPermiso;
		//this.isPermisoOrdenTipoPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPago=this.isPermisoActualizarTipoPago;
			this.isPermisoEliminarTipoPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPago.setToolTipText(this.jTableDatosTipoPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPago() throws Exception {
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
	public void inicializarCombosForeignKeyTipoPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPagoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoPagoParameterReturnGeneral tipopagoReturnGeneral=new TipoPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipopagoConstantesFunciones.cargarid_empresaTipoPago)
					 || (this.esRecargarFks && this.tipopagoConstantesFunciones.cargarid_empresaTipoPago)) {

					if(!this.tipopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipopagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipopagoReturnGeneral=tipopagoLogic.cargarCombosLoteForeignKeyTipoPago(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipopagoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipopagoSessionBean==null) {
				this.tipopagoSessionBean=new TipoPagoSessionBean();
			}

			if(!this.tipopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPago(TipoPago tipopago)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPago(TipoPago tipopago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPago()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago!=null && this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipopagoSessionBean=new TipoPagoSessionBean(); 
		this.tipopagoConstantesFunciones=new TipoPagoConstantesFunciones(); 
		this.tipopagoBean=new TipoPago();//(this.tipopagoConstantesFunciones); 		
		this.tipopagoReturnGeneral=new TipoPagoParameterReturnGeneral(); 
		
		this.tipopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPago(true);
			
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
			
			this.tipopagoConstantesFunciones=new TipoPagoConstantesFunciones(); 
			this.tipopagoBean=new TipoPago();//this.tipopagoConstantesFunciones); 			
			this.tipopagoReturnGeneral=new TipoPagoParameterReturnGeneral(); 
		
			TipoPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipopago=new TipoPago();
			this.tipopagos = new ArrayList<TipoPago>();
			this.tipopagosAux = new ArrayList<TipoPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic=new TipoPagoLogic();
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPago);	
					}
					
					if(this.jInternalFrameImportacionTipoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPago);
				this.jInternalFrameDetalleFormTipoPago.setVisible(false);
				this.jInternalFrameDetalleFormTipoPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPago);
					this.jInternalFrameReporteDinamicoTipoPago.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPago);
					this.jInternalFrameImportacionTipoPago.setVisible(false);
					this.jInternalFrameImportacionTipoPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPago);
					this.jInternalFrameOrderByTipoPago.setVisible(false);
					this.jInternalFrameOrderByTipoPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipopagoReturnGeneral=new TipoPagoParameterReturnGeneral();
			
			this.tipopagoParameterGeneral=new TipoPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipopagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopagoSessionBean.getEsGuardarRelacionado(),this.tipopagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopagoSessionBean.getEsGuardarRelacionado(),this.tipopagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaDuplicarTipoPago=true;
			this.isVisibilidadCeldaCopiarTipoPago=true;
			this.isVisibilidadCeldaVerFormTipoPago=true;
			this.isVisibilidadCeldaOrdenTipoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
			this.isVisibilidadCeldaModificarTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=false;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=false;
			this.isVisibilidadCeldaGuardarTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPago(false);
			
			this.setPermisosUsuarioTipoPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopagoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipopagoSessionBean.getEsGuardarRelacionado() && this.tipopagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPagoClasesRelacionadas();
			}
			
			if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPago();
			}
			
			if(!this.isPermisoBusquedaTipoPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPago,this.isPermisoPaginacionMedioTipoPago,this.isPermisoPaginacionTodoTipoPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPagoConstantesFunciones.getTiposSeleccionarTipoPago());
				
				this.tiposColumnasSelect=TipoPagoConstantesFunciones.getTiposSeleccionarTipoPago(true);
				
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
			//if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago() ;
			
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
				tipopagoImplementable= (TipoPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipopagoImplementableHome= (TipoPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipopagos= new ArrayList<TipoPago>();
			this.tipopagosEliminados= new ArrayList<TipoPago>();
						
			this.isEsNuevoTipoPago=false;
			this.esParaAccionDesdeFormularioTipoPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPago();
			}
			
			TipoPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPago")) {
				iIndex=this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPago();	
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
	
	public void cargarCombosForeignKeyTipoPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPago();
		
		this.cargarCombosFrameForeignKeyTipoPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPago();
		}
	}
	
	
	
	public void jButtonNuevoTipoPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			
			if(jTableDatosTipoPago.getRowCount()>=1) {
				jTableDatosTipoPago.removeRowSelectionInterval(0, jTableDatosTipoPago.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPago(true);			
			//this.tipopago=new TipoPago();
			//this.tipopago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago() ;
			
			if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipopago);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago);				
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPago.getSelectedRows().length;			
			}
			
			tipopagosSeleccionados=this.getTipoPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPago--;			
				//TipoPago tipopagoAux= new TipoPago();			
				//tipopagoAux.setId(this.iIdNuevoTipoPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPago tipopagoOrigen=new TipoPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPago tipopagoOrigen : tipopagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipopagoOrigen =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagoOrigen =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipopago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPago(tipopagoOrigen,this.tipopago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopagoLogic.getTipoPagos().add(this.tipopagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopagos.add(this.tipopagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPago(false);
				
				this.jTableDatosTipoPago.setRowSelectionInterval(this.getIndiceNuevoTipoPago(), this.getIndiceNuevoTipoPago());
				
				int iLastRow =  this.jTableDatosTipoPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();									
		
			TipoPago tipopagoOrigen=new TipoPago();
			TipoPago tipopagoDestino=new TipoPago();
				
			tipopagosSeleccionados=this.getTipoPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipopagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagoOrigen =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopagoOrigen =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagoDestino =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopagoDestino =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipopagoOrigen =tipopagosSeleccionados.get(0);
				tipopagoDestino =tipopagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPago(tipopagoOrigen,tipopagoDestino,true,false);
				
				tipopagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopagoDestino,tipopagoLogic.getTipoPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagoDestino,tipopagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPago(false);
				
				//this.jTableDatosTipoPago.setRowSelectionInterval(this.getIndiceNuevoTipoPago(), this.getIndiceNuevoTipoPago());
				
				int iLastRow =  this.jTableDatosTipoPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoPago.setVisible(!isVisible);
			this.jPanelPaginacionTipoPago.setVisible(!isVisible);
			this.jPanelAccionesTipoPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPago();
			
			this.abrirFrameOrderByTipoPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPago.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPago.setSize(this.jInternalFrameDetalleFormTipoPago.iWidthFormulario,this.jInternalFrameDetalleFormTipoPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPago.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPago.jContentPaneDetalleTipoPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPago.jContentPaneDetalleTipoPago.getWidth(),TipoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPago.jContentPaneDetalleTipoPago.getWidth(),TipoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPago.jContentPaneDetalleTipoPago.getWidth(),TipoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPago.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago,false,this);
				} else {
					this.jInternalFrameOrderByTipoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPago);
				this.jInternalFrameOrderByTipoPago.setVisible(false);
				this.jInternalFrameOrderByTipoPago.setSelected(false);
				
				this.jInternalFrameOrderByTipoPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPago"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPago==null) {
				
				this.jInternalFrameImportacionTipoPago=new ImportacionJInternalFrame(TipoPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPago);
				this.jInternalFrameImportacionTipoPago.setVisible(false);
				this.jInternalFrameImportacionTipoPago.setSelected(false);


				this.jInternalFrameImportacionTipoPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPago"));
				this.jInternalFrameImportacionTipoPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPago"));
				this.jInternalFrameImportacionTipoPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPago==null) {
				this.jInternalFrameReporteDinamicoTipoPago=new ReporteDinamicoJInternalFrame(TipoPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPago);
				this.jInternalFrameReporteDinamicoTipoPago.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPago"));
				this.jInternalFrameReporteDinamicoTipoPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPago"));
				this.jInternalFrameReporteDinamicoTipoPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPago);
			
	       	this.jInternalFrameDetalleFormTipoPago.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPago.dispose();
			//this.jInternalFrameDetalleFormTipoPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPago.setVisible(true);
	        this.jInternalFrameImportacionTipoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPago.setVisible(true);
	        this.jInternalFrameOrderByTipoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPago.setVisible(false);
	        this.jInternalFrameOrderByTipoPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPago.setVisible(false);
	        this.jInternalFrameImportacionTipoPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPago(true);
			//this.isEsNuevoTipoPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPago(false) ;
			
			if(tipopagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPago(true);
			//this.isEsNuevoTipoPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipopago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPago(false) ;
			
			if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPago(false);
			
			//if(!this.isEsNuevoTipoPago) {								
				int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
				
			}
			
			if(this.permiteMantenimiento(this.tipopago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPago=true;
					this.inicializarActualizarBindingTablaTipoPago(false);
					this.isEsNuevoTipoPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPago(false);
				
				this.habilitarDeshabilitarControlesTipoPago(false);
			
												
				
				if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPagoActionPerformed(evt,tipopagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPago(this.tipopago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipopagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipopago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				this.tipopago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				this.tipopago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipopago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPagoModel) this.jTableDatosTipoPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPago=true;
				this.inicializarActualizarBindingTablaTipoPago(false);
				this.isEsNuevoTipoPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPago(false);
				
				this.habilitarDeshabilitarControlesTipoPago(false);
				
				
				
				if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPago.getRowCount()>=1) {
				jTableDatosTipoPago.removeRowSelectionInterval(0, jTableDatosTipoPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago(false) ;
			
			this.isEsNuevoTipoPago=false;
			
			if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPago(false);
				
				//SI ES MANUAL
				if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPago--;			
			//TipoPago tipopagoAux= new TipoPago();			
			//tipopagoAux.setId(this.iIdNuevoTipoPago);
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
			
			this.tipopago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipopagoLogic.getTipoPagos().add(this.tipopagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipopagos.add(this.tipopagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPago(false);
			
			this.jTableDatosTipoPago.setRowSelectionInterval(this.getIndiceNuevoTipoPago(), this.getIndiceNuevoTipoPago());
			
			int iLastRow =  this.jTableDatosTipoPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago(false);
			
			//SI ES MANUAL
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPago();
			}
			
			//this.abrirFrameTreeTipoPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PagoS ?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipopagoReturnGeneral=tipopagoLogic.procesarImportacionTipoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipopagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPago.setFileImportacion(this.jInternalFrameImportacionTipoPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		

		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPagos("Todos",tipopagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPagoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPagoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoPagoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPagoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoPago tipopago:tipopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPagoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPagoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPago tipopago:tipopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopago.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPagoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPagoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPago tipopago:tipopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopago.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPago(row);				
			//	iRow++;
			//}				
			
			//for(TipoPago tipopagoAux:tipopagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPago(tipopagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago(false);
			
			//SI ES MANUAL
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago(false);
			
			//SI ES MANUAL
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago(false);
			
			//SI ES MANUAL
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPago();
		
		this.inicializarActualizarBindingBotonesManualTipoPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPago.jCheckBoxPostAccionNuevoTipoPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPago.jCheckBoxPostAccionSinCerrarTipoPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPago.jCheckBoxPostAccionSinMensajeTipoPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPago!=null) {
				this.jInternalFrameDetalleFormTipoPago.jCheckBoxPostAccionNuevoTipoPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPago.jCheckBoxPostAccionSinCerrarTipoPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPago.jCheckBoxPostAccionSinMensajeTipoPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPago(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago() throws Exception {
		try	{
			if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPago.addItem(reporte);
			}
			
			
			if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
				this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
				this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPago(Boolean esInicializar) throws Exception {				
		if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPago() throws Exception {
		this.inicializarActualizarBindingTablaTipoPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipopagoLogic.getTipoPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipopagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPago.setModel(new TipoPagoModel(this.tipopagoLogic.getTipoPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPago.setModel(new TipoPagoModel(this.tipopagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPago!=null && this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPagoConstantesFunciones.SCLASSWEBTITULO,tipopagoConstantesFunciones.resaltarSeleccionarTipoPago,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPagoConstantesFunciones.SCLASSWEBTITULO,tipopagoConstantesFunciones.resaltarSeleccionarTipoPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,TipoPagoConstantesFunciones.LABEL_ID));

		if(this.tipopagoConstantesFunciones.mostraridTipoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipopagoConstantesFunciones.resaltaridTipoPago,this.tipopagoConstantesFunciones.activaridTipoPago,this,true,"idTipoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopagoConstantesFunciones.resaltaridTipoPago,this.tipopagoConstantesFunciones.activaridTipoPago,this,true,"idTipoPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,TipoPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipopagoConstantesFunciones.mostrarid_empresaTipoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipopagoConstantesFunciones.resaltarid_empresaTipoPago,this,this.tipopagoConstantesFunciones.activarid_empresaTipoPago));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipopagoConstantesFunciones.resaltarid_empresaTipoPago,this,this.tipopagoConstantesFunciones.activarid_empresaTipoPago,false,"id_empresaTipoPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,TipoPagoConstantesFunciones.LABEL_CODIGO));

		if(this.tipopagoConstantesFunciones.mostrarcodigoTipoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopagoConstantesFunciones.resaltarcodigoTipoPago,this.tipopagoConstantesFunciones.activarcodigoTipoPago,this,true,"codigoTipoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopagoConstantesFunciones.resaltarcodigoTipoPago,this.tipopagoConstantesFunciones.activarcodigoTipoPago,this,true,"codigoTipoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,TipoPagoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipopagoConstantesFunciones.mostrarnombreTipoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopagoConstantesFunciones.resaltarnombreTipoPago,this.tipopagoConstantesFunciones.activarnombreTipoPago,this,true,"nombreTipoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopagoConstantesFunciones.resaltarnombreTipoPago,this.tipopagoConstantesFunciones.activarnombreTipoPago,this,true,"nombreTipoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopagoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopagoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPago && this.isPermisoGuardarCambiosTipoPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipopagoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipopagoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPago.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPago && this.isPermisoGuardarCambiosTipoPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPago && this.isPermisoGuardarCambiosTipoPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPago.moveColumn(this.jTableDatosTipoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPago.moveColumn(this.jTableDatosTipoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPago.moveColumn(this.jTableDatosTipoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipopagoLogic.getTipoPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipopagos.size()-1;
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
		//this.jTableDatosTipoPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPago();
			
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
				
				//this.isEsNuevoTipoPago=false;
					
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
				if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipopago.getsType().equals("DUPLICADO")
				   || this.tipopago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPago=true;
				
				} else {
					this.isEsNuevoTipoPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipopago.getId()>=0 && !this.tipopago.getIsNew()) {						
						this.isEsNuevoTipoPago=false;
						
					} else {
						this.isEsNuevoTipoPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPago(esRelaciones);						
				
				this.seleccionarTipoPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipopago.getId()<0) {
					this.isEsNuevoTipoPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPago(evt,rowIndex);
				}	
				
				if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPago: " + this.dDif); 
					}
				}								
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipopago)) {
					if(this.tipopago.getId()>0) {
						this.tipopago.setIsDeleted(true);
						
						this.tipopagosEliminados.add(this.tipopago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopagoLogic.getTipoPagos().remove(this.tipopago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopagos.remove(this.tipopago);				
					}
					
					
					((TipoPagoModel) this.jTableDatosTipoPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPago) {
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPago(this.tipopago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipopagoConstantesFunciones.cargarid_empresaTipoPago || this.tipopagoConstantesFunciones.event_dependid_empresaTipoPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipopago.getid_empresa());
									//this.inicializarActualizarBindingTipoPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipopago.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipopago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipopago.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPago(TipoPago tipopago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPago(tipopago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPago(TipoPago tipopago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPago(tipopago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPago(tipopago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPago(tipopago);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPago(TipoPago tipopago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setText(tipopago.getId().toString());
			this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setText(tipopago.getcodigo());
			this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setText(tipopago.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPago tipopagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipopagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPago tipopagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipopagoLocal=this.tipopago;
			} else {
				tipopagoLocal=this.tipopagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipopagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPago(tipopagoLocal,true);
					
					if(tipopagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipopagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipopagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPago(TipoPago tipopago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPago(tipopago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(tipopago);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPago(TipoPago tipopago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPago(tipopago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPago(TipoPago tipopago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.getText()==null || this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.getText()=="" || this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setText("0");
			}

			if(conColumnasBase) {tipopago.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago.jLabelIdTipoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopago.setcodigo(this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPagoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago.jLabelcodigoTipoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopago.setnombre(this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPagoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago.jLabelnombreTipoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPago(TipoPago tipopagoBean,TipoPago tipopago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPago(TipoPago tipopagoOrigen,TipoPago tipopago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopagoOrigen.getId()!=null && !tipopagoOrigen.getId().equals(0L))) {tipopago.setId(tipopagoOrigen.getId());}}
			if(conDefault || (!conDefault && tipopagoOrigen.getcodigo()!=null && !tipopagoOrigen.getcodigo().equals(""))) {tipopago.setcodigo(tipopagoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipopagoOrigen.getnombre()!=null && !tipopagoOrigen.getnombre().equals(""))) {tipopago.setnombre(tipopagoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPago(TipoPago tipopago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setText(tipopago.getId().toString());
			this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setText(tipopago.getcodigo());
			this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setText(tipopago.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPago(TipoPagoBean tipopagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setText(tipopagoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setText(tipopagoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setText(tipopagoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPago(TipoPagoParameterReturnGeneral tipopagoReturnGeneral,TipoPagoBean tipopagoBean,Boolean conDefault) throws Exception { 
		try {
			TipoPago tipopagoLocal=new TipoPago();
			
			tipopagoLocal=tipopagoReturnGeneral.getTipoPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopagoLocal.getId()!=null && !tipopagoLocal.getId().equals(0L))) {tipopagoBean.setId(tipopagoLocal.getId());}}
			if(conDefault || (!conDefault && tipopagoLocal.getcodigo()!=null && !tipopagoLocal.getcodigo().equals(""))) {tipopagoBean.setcodigo(tipopagoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipopagoLocal.getnombre()!=null && !tipopagoLocal.getnombre().equals(""))) {tipopagoBean.setnombre(tipopagoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPagoGenerico(Long idTipoPagoSeleccionado,JComboBox jComboBoxTipoPago,List<TipoPago> tipopagosLocal)throws Exception {
		try {
			TipoPago  tipopagoTemp=null;

			for(TipoPago tipopagoAux:tipopagosLocal) {
				if(tipopagoAux.getId()!=null && tipopagoAux.getId().equals(idTipoPagoSeleccionado)) {
					tipopagoTemp=tipopagoAux;
					break;
				}
			}

			jComboBoxTipoPago.setSelectedItem(tipopagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPagoGenerico(JComboBox jComboBoxTipoPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopago=(TipoPago) tipopagoLogic.getTipoPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopago =(TipoPago) tipopagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipopago.getIsNew() && !tipopago.getIsChanged() && !tipopago.getIsDeleted()) {
				sDescripcion=tipopago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipopago.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPago tipopagoRow=new TipoPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopagoRow=(TipoPago) tipopagoLogic.getTipoPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopagoRow=(TipoPago) tipopagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPago.setVisible((this.isVisibilidadCeldaNuevoTipoPago && this.isPermisoNuevoTipoPago));			
			this.jButtonDuplicarTipoPago.setVisible((this.isVisibilidadCeldaDuplicarTipoPago && this.isPermisoDuplicarTipoPago));			
			this.jButtonCopiarTipoPago.setVisible((this.isVisibilidadCeldaCopiarTipoPago && this.isPermisoCopiarTipoPago));
			this.jButtonVerFormTipoPago.setVisible((this.isVisibilidadCeldaVerFormTipoPago && this.isPermisoVerFormTipoPago));
			
			this.jButtonAbrirOrderByTipoPago.setVisible((this.isVisibilidadCeldaOrdenTipoPago && this.isPermisoOrdenTipoPago));			
			
			this.jButtonNuevoRelacionesTipoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPago && this.isPermisoNuevoTipoPago));			
			this.jButtonNuevoGuardarCambiosTipoPago.setVisible((this.isVisibilidadCeldaNuevoTipoPago && this.isPermisoNuevoTipoPago && this.isPermisoGuardarCambiosTipoPago));
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.jInternalFrameDetalleFormTipoPago.jButtonModificarTipoPago.setVisible((this.isVisibilidadCeldaModificarTipoPago && this.isPermisoActualizarTipoPago));	
			this.jInternalFrameDetalleFormTipoPago.jButtonActualizarTipoPago.setVisible((this.isVisibilidadCeldaActualizarTipoPago && this.isPermisoActualizarTipoPago));	
			this.jInternalFrameDetalleFormTipoPago.jButtonEliminarTipoPago.setVisible((this.isVisibilidadCeldaEliminarTipoPago && this.isPermisoEliminarTipoPago));
			this.jInternalFrameDetalleFormTipoPago.jButtonCancelarTipoPago.setVisible(this.isVisibilidadCeldaCancelarTipoPago);							
			this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.setVisible((this.isVisibilidadCeldaGuardarTipoPago && this.isPermisoGuardarCambiosTipoPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPago && this.isPermisoGuardarCambiosTipoPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPago.setVisible((this.isVisibilidadCeldaNuevoTipoPago && this.isPermisoNuevoTipoPago));						
			this.jButtonDuplicarToolBarTipoPago.setVisible((this.isVisibilidadCeldaDuplicarTipoPago && this.isPermisoDuplicarTipoPago));						
			this.jButtonCopiarToolBarTipoPago.setVisible((this.isVisibilidadCeldaCopiarTipoPago && this.isPermisoCopiarTipoPago));			
			this.jButtonVerFormToolBarTipoPago.setVisible((this.isVisibilidadCeldaVerFormTipoPago && this.isPermisoVerFormTipoPago));			
			this.jButtonAbrirOrderByToolBarTipoPago.setVisible((this.isVisibilidadCeldaOrdenTipoPago && this.isPermisoOrdenTipoPago));
			this.jButtonNuevoRelacionesToolBarTipoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPago && this.isPermisoNuevoTipoPago));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPago.setVisible((this.isVisibilidadCeldaNuevoTipoPago && this.isPermisoNuevoTipoPago && this.isPermisoGuardarCambiosTipoPago));			
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.jInternalFrameDetalleFormTipoPago.jButtonModificarToolBarTipoPago.setVisible((this.isVisibilidadCeldaModificarTipoPago && this.isPermisoActualizarTipoPago));	
			this.jInternalFrameDetalleFormTipoPago.jButtonActualizarToolBarTipoPago.setVisible((this.isVisibilidadCeldaActualizarTipoPago  && this.isPermisoActualizarTipoPago));	
			this.jInternalFrameDetalleFormTipoPago.jButtonEliminarToolBarTipoPago.setVisible((this.isVisibilidadCeldaEliminarTipoPago && this.isPermisoEliminarTipoPago));
			this.jInternalFrameDetalleFormTipoPago.jButtonCancelarToolBarTipoPago.setVisible(this.isVisibilidadCeldaCancelarTipoPago);				
			this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosToolBarTipoPago.setVisible((this.isVisibilidadCeldaGuardarTipoPago && this.isPermisoGuardarCambiosTipoPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPago && this.isPermisoGuardarCambiosTipoPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPago.setVisible((this.isVisibilidadCeldaNuevoTipoPago && this.isPermisoNuevoTipoPago));			
			this.jMenuItemDuplicarTipoPago.setVisible((this.isVisibilidadCeldaDuplicarTipoPago && this.isPermisoDuplicarTipoPago));			
			this.jMenuItemCopiarTipoPago.setVisible((this.isVisibilidadCeldaCopiarTipoPago && this.isPermisoCopiarTipoPago));			
			this.jMenuItemVerFormTipoPago.setVisible((this.isVisibilidadCeldaVerFormTipoPago && this.isPermisoVerFormTipoPago));			
			this.jMenuItemAbrirOrderByTipoPago.setVisible((this.isVisibilidadCeldaOrdenTipoPago && this.isPermisoOrdenTipoPago));			
			//this.jMenuItemMostrarOcultarTipoPago.setVisible((this.isVisibilidadCeldaOrdenTipoPago && this.isPermisoOrdenTipoPago));
			this.jMenuItemDetalleAbrirOrderByTipoPago.setVisible((this.isVisibilidadCeldaOrdenTipoPago && this.isPermisoOrdenTipoPago));			
			//this.jMenuItemDetalleMostrarOcultarTipoPago.setVisible((this.isVisibilidadCeldaOrdenTipoPago && this.isPermisoOrdenTipoPago));			
			this.jMenuItemNuevoRelacionesTipoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPago && this.isPermisoNuevoTipoPago));			
			this.jMenuItemNuevoGuardarCambiosTipoPago.setVisible((this.isVisibilidadCeldaNuevoTipoPago && this.isPermisoNuevoTipoPago && this.isPermisoGuardarCambiosTipoPago));									
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.jInternalFrameDetalleFormTipoPago.jMenuItemModificarTipoPago.setVisible((this.isVisibilidadCeldaModificarTipoPago && this.isPermisoActualizarTipoPago));	
			this.jInternalFrameDetalleFormTipoPago.jMenuItemActualizarTipoPago.setVisible((this.isVisibilidadCeldaActualizarTipoPago && this.isPermisoActualizarTipoPago));	
			this.jInternalFrameDetalleFormTipoPago.jMenuItemEliminarTipoPago.setVisible((this.isVisibilidadCeldaEliminarTipoPago && this.isPermisoEliminarTipoPago));
			this.jInternalFrameDetalleFormTipoPago.jMenuItemCancelarTipoPago.setVisible(this.isVisibilidadCeldaCancelarTipoPago);				
			}
			
			this.jMenuItemGuardarCambiosTipoPago.setVisible((this.isVisibilidadCeldaGuardarTipoPago && this.isPermisoGuardarCambiosTipoPago));						
			this.jMenuItemGuardarCambiosTablaTipoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPago && this.isPermisoGuardarCambiosTipoPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPago=this.jButtonNuevoTipoPago.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPago=this.jButtonDuplicarTipoPago.isVisible();
			this.isVisibilidadCeldaCopiarTipoPago=this.jButtonCopiarTipoPago.isVisible();
			this.isVisibilidadCeldaVerFormTipoPago=this.jButtonVerFormTipoPago.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPago=this.jButtonAbrirOrderByTipoPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=this.jButtonNuevoRelacionesTipoPago.isVisible();
			this.isVisibilidadCeldaModificarTipoPago=this.jButtonModificarTipoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.isVisibilidadCeldaActualizarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonActualizarTipoPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonEliminarTipoPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonCancelarTipoPago.isVisible();
			this.isVisibilidadCeldaGuardarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPago=this.jButtonGuardarCambiosTablaTipoPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPago=this.jButtonNuevoToolBarTipoPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=this.jButtonNuevoRelacionesToolBarTipoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.isVisibilidadCeldaModificarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonModificarToolBarTipoPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonActualizarToolBarTipoPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonEliminarToolBarTipoPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoPago=this.jInternalFrameDetalleFormTipoPago.jButtonCancelarToolBarTipoPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPago=this.jButtonGuardarCambiosToolBarTipoPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPago=this.jButtonGuardarCambiosTablaToolBarTipoPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPago=this.jMenuItemNuevoTipoPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=this.jMenuItemNuevoRelacionesTipoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.isVisibilidadCeldaModificarTipoPago=this.jInternalFrameDetalleFormTipoPago.jMenuItemModificarTipoPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoPago=this.jInternalFrameDetalleFormTipoPago.jMenuItemActualizarTipoPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoPago=this.jInternalFrameDetalleFormTipoPago.jMenuItemEliminarTipoPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoPago=this.jInternalFrameDetalleFormTipoPago.jMenuItemCancelarTipoPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPago=this.jMenuItemGuardarCambiosTipoPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPago=this.jMenuItemGuardarCambiosTablaTipoPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPago(Boolean esInicializar) {
		if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipopagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPago();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPago() {
		this.jButtonNuevoTipoPago.setVisible(this.isPermisoNuevoTipoPago);			
		this.jButtonDuplicarTipoPago.setVisible(this.isPermisoDuplicarTipoPago);			
		this.jButtonCopiarTipoPago.setVisible(this.isPermisoCopiarTipoPago);			
		this.jButtonVerFormTipoPago.setVisible(this.isPermisoVerFormTipoPago);			
		
		this.jButtonAbrirOrderByTipoPago.setVisible(this.isPermisoOrdenTipoPago);					
		
		this.jButtonNuevoRelacionesTipoPago.setVisible(this.isPermisoNuevoTipoPago);			
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonModificarTipoPago.setVisible(this.isPermisoActualizarTipoPago);	
			this.jInternalFrameDetalleFormTipoPago.jButtonActualizarTipoPago.setVisible(this.isPermisoActualizarTipoPago);	
			this.jInternalFrameDetalleFormTipoPago.jButtonEliminarTipoPago.setVisible(this.isPermisoEliminarTipoPago);
			this.jInternalFrameDetalleFormTipoPago.jButtonCancelarTipoPago.setVisible(this.isVisibilidadCeldaCancelarTipoPago);						
			this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.setVisible(this.isPermisoGuardarCambiosTipoPago);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPago.setVisible(this.isPermisoActualizarTipoPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPago() {
		this.jInternalFrameDetalleFormTipoPago.jButtonModificarTipoPago.setVisible(this.isPermisoActualizarTipoPago);	
		this.jInternalFrameDetalleFormTipoPago.jButtonActualizarTipoPago.setVisible(this.isPermisoActualizarTipoPago);	
		this.jInternalFrameDetalleFormTipoPago.jButtonEliminarTipoPago.setVisible(this.isPermisoEliminarTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jButtonCancelarTipoPago.setVisible(this.isVisibilidadCeldaCancelarTipoPago);							
		this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.setVisible((this.isVisibilidadCeldaGuardarTipoPago && this.isPermisoGuardarCambiosTipoPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPago() {
		if(TipoPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPago() {
	}
	
	public void jTableDatosTipoPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago(this.gettipopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago==null) {
						this.tipopago = new TipoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
				}

				if(this.tipopago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipopago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPago(this.gettipopago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipopagoLogic.getConnexion());

				if(this.tipopago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipopago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPago=(TitledBorder)this.jScrollPanelDatosTipoPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago(this.gettipopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago==null) {
						this.tipopago = new TipoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
				}

				if(this.tipopago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipopago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago(this.gettipopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago==null) {
						this.tipopago = new TipoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
				}

				if(this.tipopago.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipopago.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago(this.gettipopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago==null) {
						this.tipopago = new TipoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);
				}

				if(this.tipopago.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipopago.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPago(false,false);

			this.getTipoPagosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoPago(false);

			//if(TipoPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoPago() {
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
			this.jInternalFrameDetalleFormTipoPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPago.dispose();
			this.jInternalFrameDetalleFormTipoPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
			this.jInternalFrameReporteDinamicoTipoPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPago.dispose();
			this.jInternalFrameReporteDinamicoTipoPago=null;
		}
		
		if(this.jInternalFrameImportacionTipoPago!=null) {
			this.jInternalFrameImportacionTipoPago.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPago.dispose();
			this.jInternalFrameImportacionTipoPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPago();
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPago")) {
				jButtonDuplicarTipoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPago")) {
				jButtonCopiarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPago")) {
				jButtonVerFormTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPago")) {
				jButtonDuplicarTipoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPago")) {
				jButtonDuplicarTipoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPago")) {
				jButtonModificarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPago")) {
				jButtonModificarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPago")) {
				jButtonModificarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPago")) {
				jButtonActualizarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPago")) {
				jButtonActualizarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPago")) {
				jButtonActualizarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPago")) {
				jButtonEliminarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPago")) {
				jButtonEliminarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPago")) {
				jButtonEliminarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPago")) {
				jButtonCancelarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPago")) {
				jButtonCancelarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPago")) {
				jButtonCancelarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPago")) {
				jButtonCerrarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPago")) {
				jButtonCerrarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPago")) {
				jButtonCerrarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPago")) {
				jButtonMostrarOcultarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPago")) {
				jButtonCancelarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPago")) {
				jButtonCopiarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPago")) {
				jButtonVerFormTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPago")) {
				jButtonCopiarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPago")) {
				jButtonVerFormTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPago")) {
				jButtonRecargarInformacionTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPago")) {
				jButtonRecargarInformacionTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPago")) {
				jButtonRecargarInformacionTipoPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPago")) {
				jButtonAnterioresTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPago")) {
				jButtonAnterioresTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPago")) {
				jButtonAnterioresTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPago")) {
				jButtonSiguientesTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPago")) {
				jButtonSiguientesTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPago")) {
				jButtonSiguientesTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPago") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPago")) {
				jButtonAbrirOrderByTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPago") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPago")) {
				jButtonMostrarOcultarTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPago")) {
				jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPago")) {
				jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPago")) {
				jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPago")) {
				jButtonCerrarReporteDinamicoTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPago")) {
				jButtonGenerarReporteDinamicoTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPago")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPago")) {
				jButtonCerrarImportacionTipoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPago")) {
				
				jButtonGenerarImportacionTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPago")) {
				
				jButtonAbrirImportacionTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPago")) {
				jComboBoxTiposAccionesTipoPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPago")) {
				jComboBoxTiposRelacionesTipoPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPago")) {
				jComboBoxTiposAccionesTipoPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPago")) {
				
				jComboBoxTiposSeleccionarTipoPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPago")) {
				jTextFieldValorCampoGeneralTipoPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPago")) {
				jButtonAbrirOrderByTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPago")) {
				jButtonAbrirOrderByTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPago")) {
				jButtonCerrarOrderByTipoPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPagoBusqueda")) {
				this.jButtonidTipoPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPagoUpdate")) {
				this.jButtonid_empresaTipoPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPagoBusqueda")) {
				this.jButtonid_empresaTipoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPagoBusqueda")) {
				this.jButtoncodigoTipoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPagoBusqueda")) {
				this.jButtonnombreTipoPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPago tipopagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipopagoLocal=this.tipopago;
			} else {
				tipopagoLocal=this.tipopagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
							
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
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
			
			


			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
								
						
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
								
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
							
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
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
			
			


			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
								
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPago")) {
					jCheckBoxSeleccionarTodosTipoPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPago")) {
					jCheckBoxSeleccionadosTipoPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPago")) {
					
				}
				
				


				
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
												
				
				


				
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
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
			
			


			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago);
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
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
				
				


				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagoAnterior =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagoAnterior =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipopago =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipopago =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipopago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPago")) {
				
				}
				
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPago")) {
			
			}
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPago();
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPago")) {
				jButtonDuplicarTipoPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPago")) {
				jButtonCopiarTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPago")) {
				jButtonVerFormTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPago")) {
				jButtonNuevoTipoPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPago")) {
				jButtonModificarTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPago")) {
				jButtonActualizarTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPago")) {
				jButtonEliminarTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPago")) {
				jButtonCancelarTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPago")) {
				jButtonCerrarTipoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPago")) {
				jButtonGuardarCambiosTipoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPago")) {
				jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPago")) {
				jButtonAbrirOrderByTipoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPago")) {
				jButtonRecargarInformacionTipoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPago")) {
				jButtonAnterioresTipoPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPago")) {
				jButtonSiguientesTipoPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPagoBusqueda")) {
				this.jButtonidTipoPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPagoUpdate")) {
				this.jButtonid_empresaTipoPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPagoBusqueda")) {
				this.jButtonid_empresaTipoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPagoBusqueda")) {
				this.jButtoncodigoTipoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPagoBusqueda")) {
				this.jButtonnombreTipoPagoBusquedaActionPerformed(evt);
			}
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPago")) {
				closingInternalFrameTipoPago();
				
			} else if(sTipo.equals("jButtonCancelarTipoPago")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPago = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPagoActionPerformed(null);
			}
			
			TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopago,new Object(),this.tipopagoParameterGeneral,this.tipopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipopago)) {
			if(!esControlTabla) {
				if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);			
				}
				
				if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPago(this.tipopago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopagoReturnGeneral=tipopagoLogic.procesarEventosTipoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopagoLogic.getTipoPagos(),this.tipopago,this.tipopagoParameterGeneral,this.isEsNuevoTipoPago,classes);//this.tipopagoLogic.getTipoPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPago(this.tipopagoReturnGeneral,this.tipopagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPago(classes,this.tipopagoReturnGeneral,this.tipopagoBean,false);
					}
						
					if(this.tipopagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPago(this.tipopagoReturnGeneral.getTipoPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPago(this.tipopagoReturnGeneral.getTipoPago());	
					}
						
					if(this.tipopagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPago(this.tipopagoReturnGeneral.getTipoPago(),classes);//this.tipopagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPago(this.tipopago,classes);//this.tipopagoBean);									
				}
			
				if(TipoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPago(this.tipopago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago(this.tipopago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipopagoAnterior!=null) {
						this.tipopago=this.tipopagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopagoReturnGeneral=tipopagoLogic.procesarEventosTipoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopagoLogic.getTipoPagos(),this.tipopago,this.tipopagoParameterGeneral,this.isEsNuevoTipoPago,classes);//this.tipopagoLogic.getTipoPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipopagoReturnGeneral.getTipoPago(),tipopagoLogic.getTipoPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipopagoReturnGeneral.getTipoPago(),this.tipopagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPago() throws Exception {
		
		TipoPagoModel tipopagoModel=(TipoPagoModel)this.jTableDatosTipoPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopagoModel.tipopagos=this.tipopagoLogic.getTipoPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipopagoModel.tipopagos=this.tipopagos;
		}
		
		
		((TipoPagoModel) this.jTableDatosTipoPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipopagoAnterior(),this.tipopagoLogic.getTipoPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipopagoAnterior(),this.tipopagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPago(TipoPago tipopago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
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
										
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopago,new Object(),generalEntityParameterGeneral,this.tipopagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPagoConstantesFunciones.getClassesRelationshipsOfTipoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPagoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopago,new Object(),generalEntityParameterGeneral,this.tipopagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPago(TipoPagoBean tipopagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPago(ArrayList<Classe> classes,TipoPagoReturnGeneral tipopagoReturnGeneral,TipoPagoBean tipopagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPago(TipoPago tipopago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipopago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPago = new TipoPagoDetalleFormJInternalFrame(jDesktopPane,this.tipopagoSessionBean.getConGuardarRelaciones(),this.tipopagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPago);
		this.jInternalFrameDetalleFormTipoPago.setVisible(false);
		this.jInternalFrameDetalleFormTipoPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPago.tipopagoLogic=this.tipopagoLogic;
		
		this.cargarCombosFrameForeignKeyTipoPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPago"));
		
		this.jInternalFrameDetalleFormTipoPago.jButtonModificarTipoPago.addActionListener(new ButtonActionListener(this,"ModificarTipoPago"));

		
		this.jInternalFrameDetalleFormTipoPago.jButtonModificarToolBarTipoPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPago"));
					
		this.jInternalFrameDetalleFormTipoPago.jMenuItemModificarTipoPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonActualizarTipoPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoPago"));
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonActualizarToolBarTipoPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPago"));
						
		this.jInternalFrameDetalleFormTipoPago.jMenuItemActualizarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonEliminarTipoPago.addActionListener (new ButtonActionListener(this,"EliminarTipoPago"));
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonEliminarToolBarTipoPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPago"));
								
		this.jInternalFrameDetalleFormTipoPago.jMenuItemEliminarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonCancelarTipoPago.addActionListener (new ButtonActionListener(this,"CancelarTipoPago"));
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonCancelarToolBarTipoPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPago"));
					
		this.jInternalFrameDetalleFormTipoPago.jMenuItemCancelarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jMenuItemDetalleCerrarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosToolBarTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosToolBarTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonidTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPago.jButtonid_empresaTipoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonid_empresaTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtoncodigoTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonnombreTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPago"));
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPago"));
		}
		
		this.jTableDatosTipoPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPago"));
		
		this.jTableDatosTipoPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPago"));
		
		this.jButtonNuevoTipoPago.addActionListener(new ButtonActionListener(this,"NuevoTipoPago"));
		
		this.jButtonDuplicarTipoPago.addActionListener(new ButtonActionListener(this,"DuplicarTipoPago"));
		
		this.jButtonCopiarTipoPago.addActionListener(new ButtonActionListener(this,"CopiarTipoPago"));
		
		this.jButtonVerFormTipoPago.addActionListener(new ButtonActionListener(this,"VerFormTipoPago"));
		
		
		this.jButtonNuevoToolBarTipoPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPago"));
			
		this.jButtonDuplicarToolBarTipoPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPago"));
			
		this.jMenuItemNuevoTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPago"));
			
		this.jMenuItemDuplicarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPago"));		
		
		
		this.jButtonNuevoRelacionesTipoPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPago"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPago"));
			
		this.jMenuItemNuevoRelacionesTipoPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonModificarTipoPago.addActionListener(new ButtonActionListener(this,"ModificarTipoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonModificarToolBarTipoPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPago"));
			
			this.jInternalFrameDetalleFormTipoPago.jMenuItemModificarTipoPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPago.jButtonActualizarTipoPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonActualizarToolBarTipoPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPago"));
				
			this.jInternalFrameDetalleFormTipoPago.jMenuItemActualizarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonEliminarTipoPago.addActionListener (new ButtonActionListener(this,"EliminarTipoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonEliminarToolBarTipoPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPago"));
						
			this.jInternalFrameDetalleFormTipoPago.jMenuItemEliminarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonCancelarTipoPago.addActionListener (new ButtonActionListener(this,"CancelarTipoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonCancelarToolBarTipoPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPago"));
			
			this.jInternalFrameDetalleFormTipoPago.jMenuItemCancelarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPago"));		
		
		
		this.jButtonCerrarTipoPago.addActionListener (new ButtonActionListener(this,"CerrarTipoPago"));
		
		
		this.jButtonCerrarToolBarTipoPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPago"));
			
		this.jMenuItemCerrarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPago"));
			
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jMenuItemDetalleCerrarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosToolBarTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPago"));
		}
		
		this.jButtonCopiarToolBarTipoPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPago"));
			
		this.jButtonVerFormToolBarTipoPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPago"));
		
		this.jMenuItemGuardarCambiosTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPago"));
			
		this.jMenuItemCopiarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPago"));		
		
		this.jMenuItemVerFormTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPago"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPago"));
			
		this.jMenuItemGuardarCambiosTablaTipoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPago"));		
		
		
		
		this.jButtonRecargarInformacionTipoPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPago"));
					
		this.jButtonRecargarInformacionToolBarTipoPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPago"));
		
		this.jMenuItemRecargarInformacionTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPago"));		
		
		
		
		this.jButtonAnterioresTipoPago.addActionListener (new ButtonActionListener(this,"AnterioresTipoPago"));
		
		
		this.jButtonAnterioresToolBarTipoPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPago"));
		
		this.jMenuItemAnterioresTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPago"));		
		
		
		this.jButtonSiguientesTipoPago.addActionListener (new ButtonActionListener(this,"SiguientesTipoPago"));
		
		
		this.jButtonSiguientesToolBarTipoPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPago"));
			
		this.jMenuItemSiguientesTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPago"));
			
		this.jMenuItemAbrirOrderByTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPago"));
			
		this.jMenuItemMostrarOcultarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPago"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPago"));
			
		this.jMenuItemDetalleMostarOcultarTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPago"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPago"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPago"));

		this.jCheckBoxSeleccionadosTipoPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPago"));
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPago"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPago"));
			
		this.jComboBoxTiposAccionesTipoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPago"));
					
		this.jComboBoxTiposSeleccionarTipoPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPago"));
			
		this.jTextFieldValorCampoGeneralTipoPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonidTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPago.jButtonid_empresaTipoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonid_empresaTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtoncodigoTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonnombreTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPago!=null) {
				this.jInternalFrameReporteDinamicoTipoPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPago"));
				this.jInternalFrameReporteDinamicoTipoPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPago"));
				this.jInternalFrameReporteDinamicoTipoPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPago"));				
			//this.jButtonGenerarReporteDinamicoTipoPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPago"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPago!=null) {
				this.jInternalFrameImportacionTipoPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPago"));
				this.jInternalFrameImportacionTipoPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPago"));
				this.jInternalFrameImportacionTipoPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPago"));
			
			this.jButtonAbrirOrderByToolBarTipoPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPago"));			
			
			if(this.jInternalFrameOrderByTipoPago!=null) {
				this.jInternalFrameOrderByTipoPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago.jTabbedPaneRelacionesTipoPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPago"));
		
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
            		closingInternalFrameTipoPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPago = (JInternalFrameBase)event.getSource();
	            	
	            TipoPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPago";
		inputMap = this.jButtonNuevoTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPago";
		inputMap = this.jButtonNuevoRelacionesTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPago";
		inputMap = this.jButtonModificarTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPago";
		inputMap = this.jButtonActualizarTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPago";
		inputMap = this.jButtonEliminarTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPago";
		inputMap = this.jButtonCancelarTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPago";
		inputMap = this.jButtonCerrarTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPago";
		inputMap = this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPago.jButtonGuardarCambiosTipoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonidTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPago.jButtonid_empresaTipoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonid_empresaTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtoncodigoTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago.jButtonnombreTipoPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPagoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
					tipopagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago tipopagoAux:tipopagos) {
					tipopagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
						tipopagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPago tipopagoAux:tipopagos) {
						tipopagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPago tipopagoAux:tipopagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPago.getSelectedRows();
			
			TipoPago tipopagoLocal=new TipoPago();
			
			//this.seleccionarTodosTipoPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopagoLocal =(TipoPago) this.tipopagoLogic.getTipoPagos().toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipopagoLocal =(TipoPago) this.tipopagos.toArray()[this.jTableDatosTipoPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipopagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
						tipopagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPago tipopagoAux:tipopagos) {
						tipopagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPago tipopagoAux:this.tipopagoLogic.getTipoPagos()) {
				
						if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopagoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago tipopagoAux:tipopagos) {
					
						if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopagoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPago) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPago(conSplash);
				
					this.generarReporteTipoPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPago();
				
				this.exportarTipoPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPagos();
				//this.importarTipoPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoPago(conSplash);
					
						//this.actualizarParametrosGeneralTipoPago();
						
						this.generarReporteProcesoAccionTipoPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo PagoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoPago();
				
						this.actualizarParametrosGeneralTipoPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipopagoReturnGeneral=tipopagoLogic.procesarAccionTipoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipopagoLogic.getTipoPagos(),this.tipopagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPago();
					
					TipoPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPago.jComboBoxTiposAccionesFormularioTipoPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPago();
			
			if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
			TipoPago tipopago=new TipoPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPago.getSelectedItem();
			
			
			
			
			tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipopagosSeleccionados.size()==1) {
				for(TipoPago tipopagoAux:tipopagosSeleccionados) {
					tipopago=tipopagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPago();
			
      		//this.finishProcessTipoPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPagoReturnGeneral() throws Exception {
		if(this.tipopagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipopagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipopagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipopagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipopagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipopagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPago(false);
		}
		
		if(this.tipopagoReturnGeneral.getConRetornoLista() || this.tipopagoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipopagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopagoLogic.setTipoPagos(this.tipopagoReturnGeneral.getTipoPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipopagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopagoLogic.setTipoPago(this.tipopagoReturnGeneral.getTipoPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPago(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPago() throws Exception {
		
		
	}
	
	public ArrayList<TipoPago> getTipoPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPago tipopagoAux:tipopagoLogic.getTipoPagos()) {
					if(tipopagoAux.getIsSelected()) {
						tipopagosSeleccionados.add(tipopagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago tipopagoAux:this.tipopagos) {
					if(tipopagoAux.getIsSelected()) {
						tipopagosSeleccionados.add(tipopagoAux);				
					}
				}
			}
			
			if(tipopagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipopagosSeleccionados.addAll(this.tipopagoLogic.getTipoPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipopagosSeleccionados.addAll(this.tipopagos);				
					}
				}
			}
		} else {
			tipopagosSeleccionados.add(this.tipopago);
		}
		
		return tipopagosSeleccionados;
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
	
	public void generarReporteTipoPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPagosSeleccionados() throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPagos("Todos",tipopagosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPagosSeleccionados() throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPagos("Todos",tipopagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPagos("Todos",tipopagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPagosSeleccionados() throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPago();
		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPago();
		
		
		//this.generarReporteTipoPagos("Todos",tipopagosSeleccionados ,tipopagoImplementable,tipopagoImplementableHome);
	}
	
	public void mostrarImportacionTipoPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPago();
		
		this.abrirFrameImportacionTipoPago();		
		
			
		//this.generarReporteTipoPagos("Todos",tipopagosSeleccionados ,tipopagoImplementable,tipopagoImplementableHome);
	}
	
	public void importarTipoPagos() throws Exception {		
	
	}
	
	public void exportarTipoPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPagosSeleccionados() throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPago tipopagoAux:tipopagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPago(tipopagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipopagoAux.setsDetalleGeneralEntityReporte(tipopagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPago(TipoPago tipopago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipopago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPagosSeleccionados() throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPago(row);				
				iRow++;
			}				
			
			for(TipoPago tipopagoAux:tipopagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPago(tipopagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPagosSeleccionados() throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();		
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipopagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipopago");
			//elementRoot.appendChild(element);
		
			for(TipoPago tipopagoAux:tipopagosSeleccionados) {
				element = document.createElement("tipopago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPago(tipopagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPago(TipoPago tipopago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPago(TipoPago tipopago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipopago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipopago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipopago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoPagoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipopago.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPagoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipopago.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPago> tipopagosSeleccionados=new ArrayList<TipoPago>();
		
		tipopagosSeleccionados=this.getTipoPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPago(tipopagosSeleccionados);
		
		this.generarReporteTipoPagos("Todos",tipopagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPago(ArrayList<TipoPago> tipopagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPago tipopagoAux:tipopagosSeleccionados) {
				tipopagoAux.setsDetalleGeneralEntityReporte(tipopagoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipopagoAux.setsDescripcionGeneralEntityReporte1(tipopagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipopagoAux.setsDescripcionGeneralEntityReporte1(tipopagoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPagoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipopagoAux.setsDescripcionGeneralEntityReporte1(tipopagoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPago=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPago=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPago=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=false;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
			this.isVisibilidadCeldaModificarTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=true;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
			this.isVisibilidadCeldaModificarTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=true;
			this.isVisibilidadCeldaEliminarTipoPago=true;
			this.isVisibilidadCeldaCancelarTipoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
			this.isVisibilidadCeldaModificarTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=true;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=true;
			this.isVisibilidadCeldaModificarTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=false;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
			this.isVisibilidadCeldaActualizarTipoPago=false;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
			this.isVisibilidadCeldaModificarTipoPago=true;
			this.isVisibilidadCeldaActualizarTipoPago=false;
			this.isVisibilidadCeldaEliminarTipoPago=false;
			this.isVisibilidadCeldaCancelarTipoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=true;
		} else {
			this.actualizarEstadoPanelsTipoPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPago=false;
			//this.isVisibilidadCeldaVerFormTipoPago=false;
			this.isVisibilidadCeldaDuplicarTipoPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipopagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipopagoSessionBean.getEsGuardarRelacionado()) {
			if(!tipopagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;												
			}
			
			this.jButtonCerrarTipoPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPago=false;
		}
		
		if(!this.permiteMantenimiento(this.tipopago)) {
			this.isVisibilidadCeldaActualizarTipoPago=false;
			this.isVisibilidadCeldaEliminarTipoPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPago() {
	}
	
	public void actualizarEstadoPanelsTipoPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPago!=null) {
				this.jScrollPanelDatosEdicionTipoPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago!=null) {
				this.jScrollPanelDatosTipoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago!=null) {
				this.jPanelPaginacionTipoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoPago!=null) {
					this.jTabbedPaneBusquedasTipoPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago!=null) {
				this.jTabbedPaneBusquedasTipoPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoPago!=null) {
				this.jPanelParametrosReportesTipoPago.setVisible(true);
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
		
		//TipoPagoSessionBean tipopagoSessionBean=new TipoPagoSessionBean();
		
		if(this.tipopagoSessionBean==null) {
			this.tipopagoSessionBean=new TipoPagoSessionBean();
		}
		
		this.tipopagoSessionBean.setsUltimaBusquedaTipoPago(this.getsAccionBusqueda());
		this.tipopagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipopagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipopagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPagoSessionBean tipopagoSessionBean=new TipoPagoSessionBean();
		
		if(this.tipopagoSessionBean==null) {
			this.tipopagoSessionBean=new TipoPagoSessionBean();
		}
		
		if(this.tipopagoSessionBean.getsUltimaBusquedaTipoPago()!=null&&!this.tipopagoSessionBean.getsUltimaBusquedaTipoPago().equals("")) {
			this.setsAccionBusqueda(tipopagoSessionBean.getsUltimaBusquedaTipoPago());
			this.setiNumeroPaginacion(tipopagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipopagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipopagoSessionBean.getid_empresa());
				tipopagoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipopagoSessionBean.setsUltimaBusquedaTipoPago("");
		this.tipopagoSessionBean.setiNumeroPaginacion(TipoPagoConstantesFunciones.INUMEROPAGINACION);
		this.tipopagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPago() {
		this.updateBorderResaltarBusquedasFormularioTipoPago();
		this.updateVisibilidadBusquedasFormularioTipoPago();
		this.updateHabilitarBusquedasFormularioTipoPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoPago.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoPago() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPago();
		this.updateVisibilidadResaltarControlesFormularioTipoPago();
		this.updateHabilitarResaltarControlesFormularioTipoPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipopagoConstantesFunciones.resaltaridTipoPago!=null && this.jInternalFrameDetalleFormTipoPago!=null) {this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setBorder(this.tipopagoConstantesFunciones.resaltaridTipoPago);}
		if(this.tipopagoConstantesFunciones.resaltarid_empresaTipoPago!=null && this.jInternalFrameDetalleFormTipoPago!=null) {this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setBorder(this.tipopagoConstantesFunciones.resaltarid_empresaTipoPago);}
		if(this.tipopagoConstantesFunciones.resaltarcodigoTipoPago!=null && this.jInternalFrameDetalleFormTipoPago!=null) {this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setBorder(this.tipopagoConstantesFunciones.resaltarcodigoTipoPago);}
		if(this.tipopagoConstantesFunciones.resaltarnombreTipoPago!=null && this.jInternalFrameDetalleFormTipoPago!=null) {this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setBorder(this.tipopagoConstantesFunciones.resaltarnombreTipoPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPago() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
	
		//this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setVisible(this.tipopagoConstantesFunciones.mostraridTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jPanelidTipoPago.setVisible(this.tipopagoConstantesFunciones.mostraridTipoPago);
		//this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setVisible(this.tipopagoConstantesFunciones.mostrarid_empresaTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jPanelid_empresaTipoPago.setVisible(this.tipopagoConstantesFunciones.mostrarid_empresaTipoPago);
		//this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setVisible(this.tipopagoConstantesFunciones.mostrarcodigoTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jPanelcodigoTipoPago.setVisible(this.tipopagoConstantesFunciones.mostrarcodigoTipoPago);
		//this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setVisible(this.tipopagoConstantesFunciones.mostrarnombreTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jPanelnombreTipoPago.setVisible(this.tipopagoConstantesFunciones.mostrarnombreTipoPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPago!=null) {
	
		this.jInternalFrameDetalleFormTipoPago.jLabelidTipoPago.setEnabled(this.tipopagoConstantesFunciones.activaridTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jComboBoxid_empresaTipoPago.setEnabled(this.tipopagoConstantesFunciones.activarid_empresaTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jTextFieldcodigoTipoPago.setEnabled(this.tipopagoConstantesFunciones.activarcodigoTipoPago);
		this.jInternalFrameDetalleFormTipoPago.jTextAreanombreTipoPago.setEnabled(this.tipopagoConstantesFunciones.activarnombreTipoPago);
		}
	}
	
		
}