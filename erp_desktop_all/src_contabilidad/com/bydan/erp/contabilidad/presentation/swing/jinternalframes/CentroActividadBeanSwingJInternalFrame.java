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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.CentroActividadConstantesFunciones;
import com.bydan.erp.contabilidad.util.CentroActividadParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.CentroActividadParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.CentroActividadBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CentroActividadBeanSwingJInternalFrame extends CentroActividadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CentroActividadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CentroActividad> centroactividadValidator = new ClassValidator<CentroActividad>(CentroActividad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CentroActividad centroactividad;	
	public CentroActividad centroactividadAux;
	public CentroActividad centroactividadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CentroActividad centroactividadTotales;
	public Long idCentroActividadActual;
	public Long iIdNuevoCentroActividad=0L;
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

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
	}

	public String sFinalQueryComboTipoGrupoFlujoCaja="";

	public List<TipoGrupoFlujoCaja> tipogrupoflujocajasForeignKey;

	public List<TipoGrupoFlujoCaja> gettipogrupoflujocajasForeignKey() {
		return tipogrupoflujocajasForeignKey;
	}

	public void settipogrupoflujocajasForeignKey(List<TipoGrupoFlujoCaja> tipogrupoflujocajasForeignKey) {
		this.tipogrupoflujocajasForeignKey = tipogrupoflujocajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGrupoFlujoCaja tipogrupoflujocajaForeignKey;

	public TipoGrupoFlujoCaja gettipogrupoflujocajaForeignKey() {
		return tipogrupoflujocajaForeignKey;
	}

	public void settipogrupoflujocajaForeignKey(TipoGrupoFlujoCaja tipogrupoflujocajaForeignKey) {
		this.tipogrupoflujocajaForeignKey = tipogrupoflujocajaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPagoAuto=false;

	public Boolean getIsTienePermisosPagoAuto() {
		return isTienePermisosPagoAuto;
	}

	public void setIsTienePermisosPagoAuto(Boolean isTienePermisosPagoAuto) {
		this.isTienePermisosPagoAuto= isTienePermisosPagoAuto;
	}


	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosAutoriPago=false;

	public Boolean getIsTienePermisosAutoriPago() {
		return isTienePermisosAutoriPago;
	}

	public void setIsTienePermisosAutoriPago(Boolean isTienePermisosAutoriPago) {
		this.isTienePermisosAutoriPago= isTienePermisosAutoriPago;
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
	
	public Boolean isPermisoTodoCentroActividad;
	public Boolean isPermisoNuevoCentroActividad;
	public Boolean isPermisoActualizarCentroActividad;
	public Boolean isPermisoActualizarOriginalCentroActividad;
	public Boolean isPermisoEliminarCentroActividad;
	public Boolean isPermisoGuardarCambiosCentroActividad;
	public Boolean isPermisoConsultaCentroActividad;
	public Boolean isPermisoBusquedaCentroActividad;
	public Boolean isPermisoReporteCentroActividad;
	public Boolean isPermisoPaginacionMedioCentroActividad;
	public Boolean isPermisoPaginacionAltoCentroActividad;
	public Boolean isPermisoPaginacionTodoCentroActividad;
	public Boolean isPermisoCopiarCentroActividad;
	public Boolean isPermisoVerFormCentroActividad;
	public Boolean isPermisoDuplicarCentroActividad;
	public Boolean isPermisoOrdenCentroActividad;
	
	
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
	
	public CentroActividadParameterReturnGeneral centroactividadReturnGeneral;
	public CentroActividadParameterReturnGeneral centroactividadParameterGeneral;
	
	

	public PagoAutoLogic pagoautoLogic=null;

	public PagoAutoLogic getPagoAutoLogic() {
		return pagoautoLogic;
	}

	public void setPagoAutoLogic(PagoAutoLogic pagoautoLogic) {
		this.pagoautoLogic = pagoautoLogic;
	}


	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public AutoriPagoLogic autoripagoLogic=null;

	public AutoriPagoLogic getAutoriPagoLogic() {
		return autoripagoLogic;
	}

	public void setAutoriPagoLogic(AutoriPagoLogic autoripagoLogic) {
		this.autoripagoLogic = autoripagoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCentroActividad=false;
	public Boolean esParaAccionDesdeFormularioCentroActividad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CentroActividadSessionBeanAdditional centroactividadSessionBeanAdditional=null;
	
	public CentroActividadSessionBeanAdditional getCentroActividadSessionBeanAdditional() {
		return this.centroactividadSessionBeanAdditional;
	}
	
	public void setCentroActividadSessionBeanAdditional(CentroActividadSessionBeanAdditional centroactividadSessionBeanAdditional) {
		try {
			this.centroactividadSessionBeanAdditional=centroactividadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CentroActividadBeanSwingJInternalFrameAdditional centroactividadBeanSwingJInternalFrameAdditional=null;
	//public class CentroActividadBeanSwingJInternalFrame
	
	public CentroActividadBeanSwingJInternalFrameAdditional getCentroActividadBeanSwingJInternalFrameAdditional() {
		return this.centroactividadBeanSwingJInternalFrameAdditional;
	}
	
	public void setCentroActividadBeanSwingJInternalFrameAdditional(CentroActividadBeanSwingJInternalFrameAdditional centroactividadBeanSwingJInternalFrameAdditional) {
		try {
			this.centroactividadBeanSwingJInternalFrameAdditional=centroactividadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CentroActividadLogic centroactividadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CentroActividad centroactividadBean;
	public CentroActividadConstantesFunciones centroactividadConstantesFunciones;
	//public CentroActividadParameterReturnGeneral centroactividadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	public TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic;
	
	//PARAMETROS
	
	
	//public List<CentroActividad> centroactividads;	
	//public List<CentroActividad> centroactividadsEliminados;
	//public List<CentroActividad> centroactividadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCentroActividad=false;
	public Boolean isVisibilidadCeldaDuplicarCentroActividad=true;
	public Boolean isVisibilidadCeldaCopiarCentroActividad=true;
	public Boolean isVisibilidadCeldaVerFormCentroActividad=true;
	public Boolean isVisibilidadCeldaOrdenCentroActividad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
	public Boolean isVisibilidadCeldaModificarCentroActividad=false;
	public Boolean isVisibilidadCeldaActualizarCentroActividad=false;
	public Boolean isVisibilidadCeldaEliminarCentroActividad=false;
	public Boolean isVisibilidadCeldaCancelarCentroActividad=false;
	public Boolean isVisibilidadCeldaGuardarCentroActividad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCentroActividad=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoCentroActividad() {
		return this.iIdNuevoCentroActividad;
	}

	public void setiIdNuevoCentroActividad(Long iIdNuevoCentroActividad) {
		this.iIdNuevoCentroActividad = iIdNuevoCentroActividad;
	}
	
	public Long getidCentroActividadActual() {
		return this.idCentroActividadActual;
	}

	public void setidCentroActividadActual(Long idCentroActividadActual) {
		this.idCentroActividadActual = idCentroActividadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CentroActividad getcentroactividad() {
		return this.centroactividad;
	}

	public void setcentroactividad(CentroActividad centroactividad) {
		this.centroactividad = centroactividad;
	}
	
	public CentroActividad getcentroactividadAux() {
		return this.centroactividadAux;
	}

	public void setcentroactividadAux(CentroActividad centroactividadAux) {
		this.centroactividadAux = centroactividadAux;
	}				
	
	public CentroActividad getcentroactividadAnterior() {
		return this.centroactividadAnterior;
	}

	public void setcentroactividadAnterior(CentroActividad centroactividadAnterior) {
		this.centroactividadAnterior = centroactividadAnterior;
	}	
	
	public CentroActividad getcentroactividadTotales() {
		return this.centroactividadTotales;
	}

	public void setcentroactividadTotales(CentroActividad centroactividadTotales) {
		this.centroactividadTotales = centroactividadTotales;
	}	
	
	public CentroActividad getcentroactividadBean() {
		return this.centroactividadBean;
	}

	public void setcentroactividadBean(CentroActividad centroactividadBean) {
		this.centroactividadBean = centroactividadBean;
	}	
	
	public CentroActividadParameterReturnGeneral getcentroactividadReturnGeneral() {
		return this.centroactividadReturnGeneral;
	}

	public void setcentroactividadReturnGeneral(CentroActividadParameterReturnGeneral centroactividadReturnGeneral) {
		this.centroactividadReturnGeneral = centroactividadReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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

	public Long id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja=-1L;

	public Long getid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja() {
		return this.id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja;
	}

	public void setid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja(Long id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja) {
		this.id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja = id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja;
	}

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CentroActividadLogic getCentroActividadLogic()	{		
		return centroactividadLogic;
	}

	public void setCentroActividadLogic(CentroActividadLogic centroactividadLogic) {
		this.centroactividadLogic = centroactividadLogic;
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
	
	public Boolean getIsEsNuevoCentroActividad() {
		return isEsNuevoCentroActividad;
	}

	public void setIsEsNuevoCentroActividad(Boolean isEsNuevoCentroActividad) {
		this.isEsNuevoCentroActividad = isEsNuevoCentroActividad;
	}

	public Boolean getEsParaAccionDesdeFormularioCentroActividad() {
		return esParaAccionDesdeFormularioCentroActividad;
	}
	
	public void setEsParaAccionDesdeFormularioCentroActividad(Boolean esParaAccionDesdeFormularioCentroActividad) {
		this.esParaAccionDesdeFormularioCentroActividad = esParaAccionDesdeFormularioCentroActividad;
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

			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(centroactividadSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(centroactividadSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

	public void cargarCombosTipoGrupoFlujoCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogrupoflujocajasForeignKey=new ArrayList<TipoGrupoFlujoCaja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic=new TipoGrupoFlujoCajaLogic();

			//tipogrupoflujocajaLogic.getTipoGrupoFlujoCajaDataAccess().setIsForForeingKeyData(true);

			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipogrupoflujocajaLogic.getTipoGrupoFlujoCajaDataAccess().setIsForForeingKeyData(true);

					tipogrupoflujocajaLogic.getTodosTipoGrupoFlujoCajasWithConnection(sFinalQuery,new Pagination());

					this.tipogrupoflujocajasForeignKey=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGrupoFlujoCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoflujocajaLogic.getEntityWithConnection(centroactividadSessionBean.getlidTipoGrupoFlujoCajaActual());
					this.tipogrupoflujocajasForeignKey.add(tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja());
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

					if(this.centroactividad!=null) {
						this.centroactividad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroActividad!=null) {
						this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCentroActividad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCentroActividad!=null) {
						if(this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCentroActividadGenerico)throws Exception
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
				jComboBoxid_empresaCentroActividadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCentroActividadGenerico!=null && jComboBoxid_empresaCentroActividadGenerico.getItemCount()>0) {
					jComboBoxid_empresaCentroActividadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.centroactividad!=null) {
						this.centroactividad.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormCentroActividad!=null) {
						this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoCentroActividad.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormCentroActividad!=null) {
						if(this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad!=null) {
						jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad!=null) {
							//jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.getItemCount()>0) {
								jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoCentroActividadGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoCentroActividadGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoCentroActividadGenerico!=null && jComboBoxid_tipo_movimientoCentroActividadGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoCentroActividadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGrupoFlujoCajaForeignKey(Long idTipoGrupoFlujoCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasForeignKey) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogrupoflujocajaTemp!=null) {

					if(this.centroactividad!=null) {
						this.centroactividad.setTipoGrupoFlujoCaja(tipogrupoflujocajaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroActividad!=null) {
						this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setSelectedItem(tipogrupoflujocajaTemp);
					}
				} else {
					//jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setSelectedItem(tipogrupoflujocajaTemp);
					if(this.jInternalFrameDetalleFormCentroActividad!=null) {
						if(this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGrupoFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogrupoflujocajaTemp!=null && jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad!=null) {
						jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setSelectedItem(tipogrupoflujocajaTemp);
					} else {
						if(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad!=null) {
							//jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setSelectedItem(tipogrupoflujocajaTemp);
							if(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.getItemCount()>0) {
								jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoGrupoFlujoCajaForeignKeyDescripcion(Long idTipoGrupoFlujoCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasForeignKey) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}


			sDescripcion=TipoGrupoFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGrupoFlujoCajaForeignKeyGenerico(Long idTipoGrupoFlujoCajaSeleccionado,JComboBox jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico)throws Exception
	{
		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasForeignKey) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}

			if(tipogrupoflujocajaTemp!=null) {
				jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico.setSelectedItem(tipogrupoflujocajaTemp);
			} else {
				if(jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico!=null && jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico.getItemCount()>0) {
					jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CentroActividad centroactividad,JComboBox jComboBoxid_empresaCentroActividadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCentroActividadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCentroActividadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				centroactividad.setid_empresa(empresaAux.getId());
				centroactividad.setempresa_descripcion(CentroActividadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				centroactividad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(CentroActividad centroactividad,JComboBox jComboBoxid_tipo_movimientoCentroActividadGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoCentroActividadGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoCentroActividadGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				centroactividad.setid_tipo_movimiento(tipomovimientoAux.getId());
				centroactividad.settipomovimiento_descripcion(CentroActividadConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				centroactividad.setTipoMovimiento(tipomovimientoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGrupoFlujoCajaForeignKey(CentroActividad centroactividad,JComboBox jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico)throws Exception
	{
		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaAux=new TipoGrupoFlujoCaja();

			if(jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico==null) {
				tipogrupoflujocajaAux=(TipoGrupoFlujoCaja)this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getSelectedItem();
			} else {
				tipogrupoflujocajaAux=(TipoGrupoFlujoCaja)jComboBoxid_tipo_grupo_flujo_cajaCentroActividadGenerico.getSelectedItem();
			}

			if(tipogrupoflujocajaAux!=null && tipogrupoflujocajaAux.getId()!=null) {
				centroactividad.setid_tipo_grupo_flujo_caja(tipogrupoflujocajaAux.getId());
				centroactividad.settipogrupoflujocaja_descripcion(CentroActividadConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocajaAux));
				centroactividad.setTipoGrupoFlujoCaja(tipogrupoflujocajaAux);			}
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

					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) { 
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroActividad!=null) { 
					}

					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) { 
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroActividad!=null) { 
					}

					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.addItem(tipomovimiento);
							}
						}

						if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGrupoFlujoCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGrupoFlujoCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) { 
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.removeAllItems();

							for(TipoGrupoFlujoCaja tipogrupoflujocaja:this.tipogrupoflujocajasForeignKey) {
								this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.addItem(tipogrupoflujocaja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroActividad!=null) { 
					}

					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGrupoFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.removeAllItems();

							for(TipoGrupoFlujoCaja tipogrupoflujocaja:this.tipogrupoflujocajasForeignKey) {
								this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.addItem(tipogrupoflujocaja);
							}
						}

						if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoGrupoFlujoCajaForeignKey(TipoGrupoFlujoCaja tipogrupoflujocaja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setSelectedItem(tipogrupoflujocaja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroActividad!=null) {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setSelectedItem(tipogrupoflujocaja);
						} else {
							this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCentroActividad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CentroActividadConstantesFunciones.refrescarForeignKeysDescripcionesCentroActividad(this.centroactividadLogic.getCentroActividads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CentroActividadConstantesFunciones.refrescarForeignKeysDescripcionesCentroActividad(this.centroactividads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoMovimiento.class));
		classes.add(new Classe(TipoGrupoFlujoCaja.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//centroactividadLogic.setCentroActividads(this.centroactividads);
			centroactividadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CentroActividadParameterReturnGeneral getCentroActividadParameterGeneral() {
		return this.centroactividadParameterGeneral;
	}
	
	public void setCentroActividadParameterGeneral(CentroActividadParameterReturnGeneral centroactividadParameterGeneral) {
		this.centroactividadParameterGeneral = centroactividadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCentroActividad() {
		return isPermisoTodoCentroActividad;
	}

	public void setIsPermisoTodoCentroActividad(Boolean isPermisoTodoCentroActividad) {
		this.isPermisoTodoCentroActividad = isPermisoTodoCentroActividad;
	}

	public Boolean getIsPermisoNuevoCentroActividad() {
		return isPermisoNuevoCentroActividad;
	}

	public void setIsPermisoNuevoCentroActividad(Boolean isPermisoNuevoCentroActividad) {
		this.isPermisoNuevoCentroActividad = isPermisoNuevoCentroActividad;
	}

	public Boolean getIsPermisoActualizarCentroActividad() {
		return isPermisoActualizarCentroActividad;
	}

	public void setIsPermisoActualizarCentroActividad(Boolean isPermisoActualizarCentroActividad) {
		this.isPermisoActualizarCentroActividad = isPermisoActualizarCentroActividad;
	}

	public Boolean getIsPermisoEliminarCentroActividad() {
		return isPermisoEliminarCentroActividad;
	}

	public void setIsPermisoEliminarCentroActividad(Boolean isPermisoEliminarCentroActividad) {
		this.isPermisoEliminarCentroActividad = isPermisoEliminarCentroActividad;
	}

	public Boolean getIsPermisoGuardarCambiosCentroActividad() {
		return isPermisoGuardarCambiosCentroActividad;
	}

	public void setIsPermisoGuardarCambiosCentroActividad(Boolean isPermisoGuardarCambiosCentroActividad) {
		this.isPermisoGuardarCambiosCentroActividad = isPermisoGuardarCambiosCentroActividad;
	}
	
	public Boolean getIsPermisoConsultaCentroActividad() {
		return isPermisoConsultaCentroActividad;
	}

	public void setIsPermisoConsultaCentroActividad(Boolean isPermisoConsultaCentroActividad) {
		this.isPermisoConsultaCentroActividad = isPermisoConsultaCentroActividad;
	}

	public Boolean getIsPermisoBusquedaCentroActividad() {
		return isPermisoBusquedaCentroActividad;
	}

	public void setIsPermisoBusquedaCentroActividad(Boolean isPermisoBusquedaCentroActividad) {
		this.isPermisoBusquedaCentroActividad = isPermisoBusquedaCentroActividad;
	}

	public Boolean getIsPermisoReporteCentroActividad() {
		return isPermisoReporteCentroActividad;
	}

	public void setIsPermisoReporteCentroActividad(Boolean isPermisoReporteCentroActividad) {
		this.isPermisoReporteCentroActividad = isPermisoReporteCentroActividad;
	}
	
	public Boolean getIsPermisoPaginacionMedioCentroActividad() {
		return isPermisoPaginacionMedioCentroActividad;
	}

	public void setIsPermisoPaginacionMedioCentroActividad(Boolean isPermisoPaginacionMedioCentroActividad) {
		this.isPermisoPaginacionMedioCentroActividad = isPermisoPaginacionMedioCentroActividad;
	}
	
	public Boolean getIsPermisoPaginacionTodoCentroActividad() {
		return isPermisoPaginacionTodoCentroActividad;
	}

	public void setIsPermisoPaginacionTodoCentroActividad(Boolean isPermisoPaginacionTodoCentroActividad) {
		this.isPermisoPaginacionTodoCentroActividad = isPermisoPaginacionTodoCentroActividad;
	}
	
	public Boolean getIsPermisoPaginacionAltoCentroActividad() {
		return isPermisoPaginacionAltoCentroActividad;
	}

	public void setIsPermisoPaginacionAltoCentroActividad(Boolean isPermisoPaginacionAltoCentroActividad) {
		this.isPermisoPaginacionAltoCentroActividad = isPermisoPaginacionAltoCentroActividad;
	}
	
	public Boolean getIsPermisoCopiarCentroActividad() {
		return isPermisoCopiarCentroActividad;
	}

	public void setIsPermisoCopiarCentroActividad(Boolean isPermisoCopiarCentroActividad) {
		this.isPermisoCopiarCentroActividad = isPermisoCopiarCentroActividad;
	}
	
	public Boolean getIsPermisoVerFormCentroActividad() {
		return isPermisoVerFormCentroActividad;
	}

	public void setIsPermisoVerFormCentroActividad(Boolean isPermisoVerFormCentroActividad) {
		this.isPermisoVerFormCentroActividad = isPermisoVerFormCentroActividad;
	}
	
	public Boolean getIsPermisoDuplicarCentroActividad() {
		return isPermisoDuplicarCentroActividad;
	}

	public void setIsPermisoDuplicarCentroActividad(Boolean isPermisoDuplicarCentroActividad) {
		this.isPermisoDuplicarCentroActividad = isPermisoDuplicarCentroActividad;
	}
	
	public Boolean getIsPermisoOrdenCentroActividad() {
		return isPermisoOrdenCentroActividad;
	}

	public void setIsPermisoOrdenCentroActividad(Boolean isPermisoOrdenCentroActividad) {
		this.isPermisoOrdenCentroActividad = isPermisoOrdenCentroActividad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCentroActividad() {
		return isVisibilidadCeldaNuevoCentroActividad;
	}

	public void setIsVisibilidadCeldaNuevoCentroActividad(Boolean isVisibilidadCeldaNuevoCentroActividad) {
		this.isVisibilidadCeldaNuevoCentroActividad = isVisibilidadCeldaNuevoCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCentroActividad() {
		return isVisibilidadCeldaDuplicarCentroActividad;
	}

	public void setIsVisibilidadCeldaDuplicarCentroActividad(Boolean isVisibilidadCeldaDuplicarCentroActividad) {
		this.isVisibilidadCeldaDuplicarCentroActividad = isVisibilidadCeldaDuplicarCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCentroActividad() {
		return isVisibilidadCeldaCopiarCentroActividad;
	}

	public void setIsVisibilidadCeldaCopiarCentroActividad(Boolean isVisibilidadCeldaCopiarCentroActividad) {
		this.isVisibilidadCeldaCopiarCentroActividad = isVisibilidadCeldaCopiarCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCentroActividad() {
		return isVisibilidadCeldaVerFormCentroActividad;
	}

	public void setIsVisibilidadCeldaVerFormCentroActividad(Boolean isVisibilidadCeldaVerFormCentroActividad) {
		this.isVisibilidadCeldaVerFormCentroActividad = isVisibilidadCeldaVerFormCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCentroActividad() {
		return isVisibilidadCeldaOrdenCentroActividad;
	}

	public void setIsVisibilidadCeldaOrdenCentroActividad(Boolean isVisibilidadCeldaOrdenCentroActividad) {
		this.isVisibilidadCeldaOrdenCentroActividad = isVisibilidadCeldaOrdenCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCentroActividad() {
		return isVisibilidadCeldaNuevoRelacionesCentroActividad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCentroActividad(Boolean isVisibilidadCeldaNuevoRelacionesCentroActividad) {
		this.isVisibilidadCeldaNuevoRelacionesCentroActividad = isVisibilidadCeldaNuevoRelacionesCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCentroActividad() {
		return isVisibilidadCeldaModificarCentroActividad;
	}

	public void setIsVisibilidadCeldaModificarCentroActividad(Boolean isVisibilidadCeldaModificarCentroActividad) {
		this.isVisibilidadCeldaModificarCentroActividad = isVisibilidadCeldaModificarCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCentroActividad() {
		return isVisibilidadCeldaActualizarCentroActividad;
	}

	public void setIsVisibilidadCeldaActualizarCentroActividad(Boolean isVisibilidadCeldaActualizarCentroActividad) {
		this.isVisibilidadCeldaActualizarCentroActividad = isVisibilidadCeldaActualizarCentroActividad;
	}

	public Boolean getIsVisibilidadCeldaEliminarCentroActividad() {
		return isVisibilidadCeldaEliminarCentroActividad;
	}

	public void setIsVisibilidadCeldaEliminarCentroActividad(Boolean isVisibilidadCeldaEliminarCentroActividad) {
		this.isVisibilidadCeldaEliminarCentroActividad = isVisibilidadCeldaEliminarCentroActividad;
	}

	public Boolean getIsVisibilidadCeldaCancelarCentroActividad() {
		return isVisibilidadCeldaCancelarCentroActividad;
	}

	public void setIsVisibilidadCeldaCancelarCentroActividad(Boolean isVisibilidadCeldaCancelarCentroActividad) {
		this.isVisibilidadCeldaCancelarCentroActividad = isVisibilidadCeldaCancelarCentroActividad;
	}

	public Boolean getIsVisibilidadCeldaGuardarCentroActividad() {
		return isVisibilidadCeldaGuardarCentroActividad;
	}

	public void setIsVisibilidadCeldaGuardarCentroActividad(Boolean isVisibilidadCeldaGuardarCentroActividad) {
		this.isVisibilidadCeldaGuardarCentroActividad = isVisibilidadCeldaGuardarCentroActividad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCentroActividad() {
		return isVisibilidadCeldaGuardarCambiosCentroActividad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCentroActividad(Boolean isVisibilidadCeldaGuardarCambiosCentroActividad) {
		this.isVisibilidadCeldaGuardarCambiosCentroActividad = isVisibilidadCeldaGuardarCambiosCentroActividad;
	}
		
	public CentroActividadSessionBean getcentroactividadSessionBean() {
		return this.centroactividadSessionBean;
	}
	
	public void setcentroactividadSessionBean(CentroActividadSessionBean centroactividadSessionBean) {
		this.centroactividadSessionBean=centroactividadSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
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

	public Boolean getisVisibilidadFK_IdTipoGrupoFlujoCaja() {
		return this.isVisibilidadFK_IdTipoGrupoFlujoCaja;
	}

	public void setisVisibilidadFK_IdTipoGrupoFlujoCaja(Boolean isVisibilidadFK_IdTipoGrupoFlujoCaja) {
		this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isVisibilidadFK_IdTipoGrupoFlujoCaja;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCentroActividad(CentroActividad centroactividad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(centroactividad,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(centroactividad,null);
				this.setActualParaGuardarTipoGrupoFlujoCajaForeignKey(centroactividad,null);
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
	
	public void bugActualizarReferenciaActual(CentroActividad centroactividad,CentroActividad centroactividadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCentroActividad(centroactividad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		centroactividadAux.setId(centroactividad.getId());
		centroactividadAux.setVersionRow(centroactividad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCentroActividad();
		
			int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = centroactividadValidator.getInvalidValues(this.centroactividad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			centroactividadLogic.setDatosCliente(datosCliente);
			centroactividadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				centroactividadAux=new  CentroActividad();
				
				centroactividadAux.setIsNew(true);
				centroactividadAux.setIsChanged(true);
				
				centroactividadAux.setCentroActividadOriginal(this.centroactividad);
				
				centroactividadAux.setId(this.centroactividad.getId());	
				centroactividadAux.setVersionRow(this.centroactividad.getVersionRow());	
				centroactividadAux.setid_empresa(this.centroactividad.getid_empresa());	
				centroactividadAux.setcodigo(this.centroactividad.getcodigo());	
				centroactividadAux.setnombre(this.centroactividad.getnombre());	
				centroactividadAux.setid_tipo_movimiento(this.centroactividad.getid_tipo_movimiento());	
				centroactividadAux.setid_tipo_grupo_flujo_caja(this.centroactividad.getid_tipo_grupo_flujo_caja());	
				centroactividadAux.setconsolidado(this.centroactividad.getconsolidado());	
				centroactividadAux.setcon_proyecto(this.centroactividad.getcon_proyecto());	
				centroactividadAux.setobservacion(this.centroactividad.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centroactividadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(centroactividadAux,centroactividadLogic.getCentroActividads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centroactividadAux,centroactividads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centroactividadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.saveCentroActividads();//WithConnection
						//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centroactividad,centroactividadAux);
					
					this.refrescarForeignKeysDescripcionesCentroActividad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos().addAll(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautosEliminados);
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos().addAll(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos.addAll(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautosEliminados);
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos.addAll(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centroactividadLogic.saveCentroActividadRelaciones(centroactividadAux,this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos(),this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());//WithConnection
								//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centroactividad,centroactividadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(new ArrayList<PagoAuto>());
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(new ArrayList<AutoriPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos= new ArrayList<PagoAuto>();
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos= new ArrayList<AutoriPago>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setPagoAutos(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());

							if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setClientes(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setAutoriPagos(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centroactividadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centroactividadAux,centroactividadLogic.getCentroActividads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centroactividadAux,centroactividads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centroactividad,centroactividadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				centroactividadAux=new  CentroActividad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.centroactividadSessionBean.getEsGuardarRelacionado() 
					|| (this.centroactividadSessionBean.getEsGuardarRelacionado() && this.centroactividad.getId()>=0)) {
						
					centroactividadAux.setIsNew(false);
				}
				
				centroactividadAux.setIsDeleted(false);
			
				centroactividadAux.setId(this.centroactividad.getId());	
				centroactividadAux.setVersionRow(this.centroactividad.getVersionRow());	
				centroactividadAux.setid_empresa(this.centroactividad.getid_empresa());	
				centroactividadAux.setcodigo(this.centroactividad.getcodigo());	
				centroactividadAux.setnombre(this.centroactividad.getnombre());	
				centroactividadAux.setid_tipo_movimiento(this.centroactividad.getid_tipo_movimiento());	
				centroactividadAux.setid_tipo_grupo_flujo_caja(this.centroactividad.getid_tipo_grupo_flujo_caja());	
				centroactividadAux.setconsolidado(this.centroactividad.getconsolidado());	
				centroactividadAux.setcon_proyecto(this.centroactividad.getcon_proyecto());	
				centroactividadAux.setobservacion(this.centroactividad.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centroactividadAux,centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centroactividadAux,centroactividads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centroactividadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.saveCentroActividads();//WithConnection
						//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centroactividad,centroactividadAux);
					
					this.refrescarForeignKeysDescripcionesCentroActividad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos().addAll(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautosEliminados);
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos().addAll(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos.addAll(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautosEliminados);
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos.addAll(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centroactividadLogic.saveCentroActividadRelaciones(centroactividadAux,this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos(),this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());//WithConnection
								//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centroactividad,centroactividadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(new ArrayList<PagoAuto>());
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(new ArrayList<AutoriPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos= new ArrayList<PagoAuto>();
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos= new ArrayList<AutoriPago>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setPagoAutos(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());

							if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setClientes(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setAutoriPagos(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centroactividadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centroactividadAux,centroactividadLogic.getCentroActividads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centroactividadAux,centroactividads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centroactividad,centroactividadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				centroactividadAux=new  CentroActividad();
				
				centroactividadAux.setIsNew(false);
				centroactividadAux.setIsChanged(false);
				
				centroactividadAux.setIsDeleted(true);
				
				centroactividadAux.setId(this.centroactividad.getId());	
				centroactividadAux.setVersionRow(this.centroactividad.getVersionRow());	
				centroactividadAux.setid_empresa(this.centroactividad.getid_empresa());	
				centroactividadAux.setcodigo(this.centroactividad.getcodigo());	
				centroactividadAux.setnombre(this.centroactividad.getnombre());	
				centroactividadAux.setid_tipo_movimiento(this.centroactividad.getid_tipo_movimiento());	
				centroactividadAux.setid_tipo_grupo_flujo_caja(this.centroactividad.getid_tipo_grupo_flujo_caja());	
				centroactividadAux.setconsolidado(this.centroactividad.getconsolidado());	
				centroactividadAux.setcon_proyecto(this.centroactividad.getcon_proyecto());	
				centroactividadAux.setobservacion(this.centroactividad.getobservacion());	
				
				if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.centroactividadAux.getId()>=0) {	
						this.centroactividadsEliminados.add(centroactividadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(centroactividadAux,centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centroactividadAux,centroactividads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centroactividadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.saveCentroActividads();//WithConnection
						//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos().addAll(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautosEliminados);
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos().addAll(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos.addAll(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautosEliminados);
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos.addAll(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centroactividadLogic.saveCentroActividadRelaciones(centroactividadAux,this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos(),this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());//WithConnection
								//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(new ArrayList<PagoAuto>());
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(new ArrayList<AutoriPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos= new ArrayList<PagoAuto>();
							this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos= new ArrayList<AutoriPago>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setPagoAutos(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());

							if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setClientes(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();}
							centroactividadAux.setAutoriPagos(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.centroactividadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(centroactividadAux,centroactividadLogic.getCentroActividads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(centroactividadAux,centroactividads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getCentroActividads().addAll(this.centroactividadsEliminados);
					
					centroactividadLogic.saveCentroActividads();//WithConnection
					//centroactividadLogic.getSetVersionRowCentroActividads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCentroActividad();
				
				this.centroactividadsEliminados= new ArrayList<CentroActividad>();		
			}
			
			if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Centro Actividad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.centroactividad=centroactividadAux;
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
      		//this.finishProcessCentroActividad();
      	}
		
	}	
	
	public void actualizarRelaciones(CentroActividad centroactividadLocal) throws Exception {
		
		if(this.centroactividadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				centroactividadLocal.setPagoAutos(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());
				centroactividadLocal.setClientes(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				centroactividadLocal.setAutoriPagos(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
			
			} else {
			
				centroactividadLocal.setPagoAutos(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautos);
				centroactividadLocal.setClientes(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clientes);
				centroactividadLocal.setAutoriPagos(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CentroActividad centroactividadLocal) throws Exception {	
		if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				centroactividadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				centroactividadLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGrupoFlujoCajaDetalleFormJInternalFrame.class)) {
				TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrameLocal=(TipoGrupoFlujoCajaBeanSwingJInternalFrame) ((TipoGrupoFlujoCajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogrupoflujocajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGrupoFlujoCaja(tipogrupoflujocajaBeanSwingJInternalFrameLocal.gettipogrupoflujocaja(),true);
				tipogrupoflujocajaBeanSwingJInternalFrameLocal.actualizarLista(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja,this.tipogrupoflujocajasForeignKey);

				tipogrupoflujocajaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja);

				centroactividadLocal.setTipoGrupoFlujoCaja(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja);

				this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
				this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey("Formulario");
				this.setActualTipoGrupoFlujoCajaForeignKey(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCentroActividadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = centroactividadValidator.getInvalidValues(this.centroactividad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CentroActividad centroactividad,List<CentroActividad> centroactividads) throws Exception {
		try	{		
			CentroActividadConstantesFunciones.actualizarLista(centroactividad,centroactividads,this.centroactividadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CentroActividad centroactividad,List<CentroActividad> centroactividads) throws Exception {
		try	{			
			CentroActividadConstantesFunciones.actualizarSelectedLista(centroactividad,centroactividads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CentroActividad> centroactividadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				centroactividadsLocal=this.centroactividadLogic.getCentroActividads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				centroactividadsLocal=this.centroactividads;
			}
			//ARCHITECTURE
		
			for(CentroActividad centroactividadLocal:centroactividadsLocal) {
				if(this.permiteMantenimiento(centroactividadLocal) && centroactividadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CentroActividadConstantesFunciones.getCentroActividadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelid_empresaCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelcodigoCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelnombreCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelid_tipo_movimientoCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.IDTIPOGRUPOFLUJOCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelid_tipo_grupo_flujo_cajaCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.CONSOLIDADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelconsolidadoCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.CONPROYECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelcon_proyectoCentroActividad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroActividadConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelobservacionCentroActividad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelid_empresaCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelcodigoCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelnombreCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelid_tipo_movimientoCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelid_tipo_grupo_flujo_cajaCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelconsolidadoCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelcon_proyectoCentroActividad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroActividad.jLabelobservacionCentroActividad,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PagoAuto")) {
			if(this.centroactividad==null) {
				this.centroactividad= new CentroActividad();
			}

			if(this.centroactividadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCentroActividad
				this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);

				this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.getpagoauto().setCentroActividad(this.centroactividad);
			}

			return;
		}
		 else  if(sTipo.equals("Cliente")) {
			if(this.centroactividad==null) {
				this.centroactividad= new CentroActividad();
			}

			if(this.centroactividadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCentroActividad
				this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);

				this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.getcliente().setCentroActividad(this.centroactividad);
			}

			return;
		}
		 else  if(sTipo.equals("AutoriPago")) {
			if(this.centroactividad==null) {
				this.centroactividad= new CentroActividad();
			}

			if(this.centroactividadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCentroActividad
				this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);

				this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.getautoripago().setCentroActividad(this.centroactividad);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCentroActividad--;	
		
		
		this.centroactividadAux=new CentroActividad();
		
		this.centroactividadAux.setId(this.iIdNuevoCentroActividad);
		this.centroactividadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centroactividadLogic.getCentroActividads().add(this.centroactividadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.centroactividads.add(this.centroactividadAux);
		}
		//ARCHITECTURE
		
		this.centroactividad=this.centroactividadAux;
		
		if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCentroActividad(this.centroactividad);
			this.setVariablesObjetoActualToFormularioForeignKeyCentroActividad(this.centroactividad);
		}
				
		//this.setDefaultControlesCentroActividad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCentroActividad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCentroActividad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroActividad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroActividad(this.centroactividadBean,this.centroactividad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CentroActividadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
			classes=CentroActividadConstantesFunciones.getClassesRelationshipsOfCentroActividad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.centroactividadReturnGeneral=centroactividadLogic.procesarEventosCentroActividadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centroactividadLogic.getCentroActividads(),this.centroactividad,this.centroactividadParameterGeneral,this.isEsNuevoCentroActividad,classes);//this.centroactividadLogic.getCentroActividad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCentroActividad(this.centroactividadReturnGeneral,this.centroactividadBean,false);
		
		if(this.centroactividadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCentroActividad(this.centroactividadReturnGeneral.getCentroActividad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCentroActividad(this.centroactividadReturnGeneral.getCentroActividad());
		}
		
		if(this.centroactividadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCentroActividad(this.centroactividadReturnGeneral.getCentroActividad(),classes);//this.centroactividadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCentroActividad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCentroActividad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroActividadBeanSwingJInternalFrameAdditional.RecargarFormCentroActividad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCentroActividad(false);
						
			if(centroactividadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getEsGuardarRelacionado() && PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPagoAutoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getEsGuardarRelacionado() && AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAutoriPagoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroActividad();
			}
			
			this.actualizarVisualTableDatosCentroActividad();
			
			this.jTableDatosCentroActividad.setRowSelectionInterval(this.getIndiceNuevoCentroActividad(), this.getIndiceNuevoCentroActividad());
			
			this.seleccionarFilaTablaCentroActividadActual();
						
			this.actualizarEstadoCeldasBotonesCentroActividad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCentroActividad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarcodigoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarnombreCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarconsolidadoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarcon_proyectoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarobservacionCentroActividad);	
		//
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarid_empresaCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarid_tipo_movimientoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setEnabled(isHabilitar && this.centroactividadConstantesFunciones.activarid_tipo_grupo_flujo_cajaCentroActividad);
	};
	
	public void setDefaultControlesCentroActividad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCentroActividad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.centroactividadSessionBean.setConGuardarRelaciones(true);			
			this.centroactividadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.centroactividadSessionBean.setConGuardarRelaciones(false);			
			this.centroactividadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCentroActividad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
				if(centroactividadAux.getId().equals(this.iIdNuevoCentroActividad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroActividad centroactividadAux:this.centroactividads) {
				if(centroactividadAux.getId().equals(this.iIdNuevoCentroActividad)) {
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
	
	public int getIndiceActualCentroActividad(CentroActividad centroactividad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
				if(centroactividadAux.getId().equals(centroactividad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroActividad centroactividadAux:this.centroactividads) {
				if(centroactividadAux.getId().equals(centroactividad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCentroActividad(CentroActividad centroactividadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
				if(centroactividadAux.getCentroActividadOriginal().getId().equals(centroactividadOriginal.getId())) {
					existe=true;
					centroactividadOriginal.setId(centroactividadAux.getId());
					centroactividadOriginal.setVersionRow(centroactividadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroActividad centroactividadAux:this.centroactividads) {
				if(centroactividadAux.getCentroActividadOriginal().getId().equals(centroactividadOriginal.getId())) {
					existe=true;
					centroactividadOriginal.setId(centroactividadAux.getId());
					centroactividadOriginal.setVersionRow(centroactividadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCentroActividad(Boolean esParaCancelar) throws Exception {
		centroactividadsAux=new ArrayList<CentroActividad>();
		centroactividadAux=new CentroActividad();
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
					if(centroactividadAux.getId()<0) {
						centroactividadsAux.add(centroactividadAux);
					}		
				}
				this.iIdNuevoCentroActividad=0L;
				this.centroactividadLogic.getCentroActividads().removeAll(centroactividadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroActividad centroactividadAux:this.centroactividads) {
					if(centroactividadAux.getId()<0) {
						centroactividadsAux.add(centroactividadAux);
					}		
				}
				this.iIdNuevoCentroActividad=0L;
				this.centroactividads.removeAll(centroactividadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCentroActividad 
					&& this.centroactividadLogic.getCentroActividads().size()>0
					) {
					centroactividadAux=this.centroactividadLogic.getCentroActividads().get(this.centroactividadLogic.getCentroActividads().size() - 1);
				
					if(centroactividadAux.getId()<0) {
						this.centroactividadLogic.getCentroActividads().remove(centroactividadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCentroActividad && this.centroactividads.size()>0) {
					centroactividadAux=this.centroactividads.get(this.centroactividads.size() - 1);
				
					if(centroactividadAux.getId()<0) {
						this.centroactividads.remove(centroactividadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCentroActividad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(centroactividad.getId()<0) {
				this.centroactividadLogic.getCentroActividads().remove(this.centroactividad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(centroactividad.getId()<0) {
				this.centroactividads.remove(this.centroactividad);
			}
		}			
	}
	
	public void setEstadosInicialesCentroActividad(List<CentroActividad> centroactividadsAux) throws Exception {
		CentroActividadConstantesFunciones.setEstadosInicialesCentroActividad(centroactividadsAux);
	}
	
	public void setEstadosInicialesCentroActividad(CentroActividad centroactividadAux) throws Exception {
		CentroActividadConstantesFunciones.setEstadosInicialesCentroActividad(centroactividadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCentroActividadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCentroActividad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCentroActividadActual()) {
				if(!this.isEsNuevoCentroActividad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCentroActividad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCentroActividad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCentroActividadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Centro Actividad ?", "MANTENIMIENTO DE Centro Actividad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCentroActividad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CentroActividad centroactividad) throws Exception {
		CentroActividadConstantesFunciones.seleccionarAsignar(this.centroactividad,centroactividad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCentroActividad=this.isPermisoActualizarOriginalCentroActividad;
			
			
			this.seleccionarAsignar(centroactividad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroActividadConstantesFunciones.quitarEspaciosCentroActividad(this.centroactividad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCentroActividad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.centroactividadSessionBean.setsFuncionBusquedaRapida(this.centroactividadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCentroActividad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCentroActividad(esParaCancelar);				
				this.cancelarNuevoCentroActividad(esParaCancelar);								
			}
			
			this.centroactividad=new CentroActividad();
			
			this.inicializarCentroActividad();
			
			this.actualizarEstadoCeldasBotonesCentroActividad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCentroActividad() throws Exception {
		try {
			CentroActividadConstantesFunciones.inicializarCentroActividad(this.centroactividad);
			
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
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.centroactividadLogic.getCentroActividads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCentroActividads(String sAccionBusqueda,List<CentroActividad> centroactividadsParaReportes) throws Exception {
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
					sPathReporteFinal="CentroActividad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CentroActividadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CentroActividadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CentroActividad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Centro Actividades");		
		parameters.put("busquedapor", CentroActividadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PagoAuto.class));
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(AutoriPago.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CentroActividadLogic centroactividadLogicAuxiliar=new CentroActividadLogic();
					centroactividadLogicAuxiliar.setDatosCliente(centroactividadLogic.getDatosCliente());				
					centroactividadLogicAuxiliar.setCentroActividads(centroactividadsParaReportes);
					
					centroactividadLogicAuxiliar.cargarRelacionesLoteForeignKeyCentroActividadWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					centroactividadsParaReportes=centroactividadLogicAuxiliar.getCentroActividads();
					
					//centroactividadLogic.getNewConnexionToDeep();
					
					//for (CentroActividad centroactividad:centroactividadsParaReportes) {
					//	centroactividadLogic.deepLoad(centroactividad, false, DeepLoadType.INCLUDE, classes);
					//}						
					//centroactividadLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//centroactividadLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePagoAuto = AuxiliarReportes.class.getResourceAsStream("PagoAutoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pagoauto", reportFilePagoAuto);

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileAutoriPago = AuxiliarReportes.class.getResourceAsStream("AutoriPagoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_autoripago", reportFileAutoriPago);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCentroActividad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CentroActividadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CentroActividadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCentroActividad=new JRBeanArrayDataSource(CentroActividadJInternalFrame.TraerCentroActividadBeans(centroactividadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCentroActividad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CentroActividadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CentroActividadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CentroActividadBean.TraerCentroActividadBeans(centroactividadsParaReportes).toArray()));
							
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
				this.generarExcelReporteCentroActividads(sAccionBusqueda,sTipoArchivoReporte,centroactividadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCentroActividads(sAccionBusqueda,sTipoArchivoReporte,centroactividadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCentroActividadActionPerformed(null);
					//this.generarExcelReporteCentroActividads(sAccionBusqueda,sTipoArchivoReporte,centroactividadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCentroActividads(sAccionBusqueda,sTipoArchivoReporte,centroactividadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCentroActividads(sAccionBusqueda,sTipoArchivoReporte,centroactividadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCentroActividads(sAccionBusqueda,sTipoArchivoReporte,centroactividadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCentroActividads(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroActividad> centroactividadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroActividads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroActividad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CentroActividad centroactividad : centroactividadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CentroActividadConstantesFunciones.generarExcelReporteDataCentroActividad("NORMAL",row,workbook,centroactividad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCentroActividad(String sTipo,Row row,Workbook workbook) {
		
		CentroActividadConstantesFunciones.generarExcelReporteHeaderCentroActividad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCentroActividads(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroActividad> centroactividadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroActividads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CentroActividad centroactividad : centroactividadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CentroActividadConstantesFunciones.getCentroActividadDescripcion(centroactividad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centroactividad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centroactividad.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centroactividad.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centroactividad.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centroactividad.gettipogrupoflujocaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(centroactividad.getconsolidado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_CONPROYECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CONPROYECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(centroactividad.getcon_proyecto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroActividadConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroActividadConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centroactividad.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCentroActividads(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroActividad> centroactividadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CentroActividad> centroactividadsRespaldo=null;
		
		classes=CentroActividadConstantesFunciones.getClassesRelationshipsOfCentroActividad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.centroactividadLogic.setDatosCliente(this.datosCliente);
		this.centroactividadLogic.setDatosDeep(this.datosDeep);
		this.centroactividadLogic.setIsConDeep(true);
		
		centroactividadsRespaldo=this.centroactividadLogic.getCentroActividads();
		
		this.centroactividadLogic.setCentroActividads(centroactividadsParaReportes);	
		this.centroactividadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		centroactividadsParaReportes=this.centroactividadLogic.getCentroActividads();
		this.centroactividadLogic.setCentroActividads(centroactividadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroActividads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroActividad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CentroActividad centroactividad : centroactividadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCentroActividad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CentroActividadConstantesFunciones.generarExcelReporteDataCentroActividad("NORMAL",row,workbook,centroactividad,cellStyleDataAux);
		
			
			


				//PagoAuto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PagoAutoConstantesFunciones.SCLASSWEBTITULO))) {

				if(centroactividad.getPagoAutos()!=null && centroactividad.getPagoAutos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PagoAutoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PagoAutoConstantesFunciones.generarExcelReporteHeaderPagoAuto("RELACIONADO",row,workbook);
				}

				if(centroactividad.getPagoAutos()!=null) {
					i2=0;
					for(PagoAuto pagoauto : centroactividad.getPagoAutos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PagoAutoConstantesFunciones.generarExcelReporteDataPagoAuto("RELACIONADO",row,workbook,pagoauto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(centroactividad.getClientes()!=null && centroactividad.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(centroactividad.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : centroactividad.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//AutoriPago
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AutoriPagoConstantesFunciones.SCLASSWEBTITULO))) {

				if(centroactividad.getAutoriPagos()!=null && centroactividad.getAutoriPagos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AutoriPagoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AutoriPagoConstantesFunciones.generarExcelReporteHeaderAutoriPago("RELACIONADO",row,workbook);
				}

				if(centroactividad.getAutoriPagos()!=null) {
					i2=0;
					for(AutoriPago autoripago : centroactividad.getAutoriPagos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AutoriPagoConstantesFunciones.generarExcelReporteDataAutoriPago("RELACIONADO",row,workbook,autoripago,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CentroActividadConstantesFunciones.getCentroActividadDescripcion(centroactividad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroActividad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCentroActividad() throws Exception {		
		this.startProcessCentroActividad(true);
	}
	
	public void startProcessCentroActividad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCentroActividad ,this.jPanelParametrosReportesCentroActividad, this.jScrollPanelDatosCentroActividad,this.jPanelPaginacionCentroActividad, this.jScrollPanelDatosEdicionCentroActividad, this.jPanelAccionesCentroActividad,this.jPanelAccionesFormularioCentroActividad,this.jmenuBarCentroActividad,this.jmenuBarDetalleCentroActividad,this.jTtoolBarCentroActividad,this.jTtoolBarDetalleCentroActividad);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroActividad=this.jTabbedPaneBusquedasCentroActividad; 
		
		final JPanel jPanelParametrosReportesCentroActividad=this.jPanelParametrosReportesCentroActividad;
		//final JScrollPane jScrollPanelDatosCentroActividad=this.jScrollPanelDatosCentroActividad;
		final JTable jTableDatosCentroActividad=this.jTableDatosCentroActividad;		
		final JPanel jPanelPaginacionCentroActividad=this.jPanelPaginacionCentroActividad;
		//final JScrollPane jScrollPanelDatosEdicionCentroActividad=this.jScrollPanelDatosEdicionCentroActividad;
		final JPanel jPanelAccionesCentroActividad=this.jPanelAccionesCentroActividad;
		
		JPanel jPanelCamposAuxiliarCentroActividad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCentroActividad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			jPanelCamposAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jPanelCamposCentroActividad;
			jPanelAccionesFormularioAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jPanelAccionesFormularioCentroActividad;
		}
		
		final JPanel jPanelCamposCentroActividad=jPanelCamposAuxiliarCentroActividad;
		final JPanel jPanelAccionesFormularioCentroActividad=jPanelAccionesFormularioAuxiliarCentroActividad;
		
		
		final JMenuBar jmenuBarCentroActividad=this.jmenuBarCentroActividad;
		final JToolBar jTtoolBarCentroActividad=this.jTtoolBarCentroActividad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCentroActividad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroActividad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			jmenuBarDetalleAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jmenuBarDetalleCentroActividad;
			jTtoolBarDetalleAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jTtoolBarDetalleCentroActividad;
		}
		
		final JMenuBar jmenuBarDetalleCentroActividad=jmenuBarDetalleAuxiliarCentroActividad;
		final JToolBar jTtoolBarDetalleCentroActividad=jTtoolBarDetalleAuxiliarCentroActividad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroActividad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroActividad;
			processRunnable.jTableDatos=jTableDatosCentroActividad;
			processRunnable.jPanelCampos=jPanelCamposCentroActividad;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroActividad;
			processRunnable.jPanelAcciones=jPanelAccionesCentroActividad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroActividad;
			
			
			processRunnable.jmenuBar=jmenuBarCentroActividad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroActividad;
			processRunnable.jTtoolBar=jTtoolBarCentroActividad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroActividad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroActividad ,jPanelParametrosReportesCentroActividad,jTableDatosCentroActividad, /*jScrollPanelDatosCentroActividad,*/jPanelCamposCentroActividad,jPanelPaginacionCentroActividad, /*jScrollPanelDatosEdicionCentroActividad,*/ jPanelAccionesCentroActividad,jPanelAccionesFormularioCentroActividad,jmenuBarCentroActividad,jmenuBarDetalleCentroActividad,jTtoolBarCentroActividad,jTtoolBarDetalleCentroActividad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroActividad ,jPanelParametrosReportesCentroActividad, jScrollPanelDatosCentroActividad,jPanelPaginacionCentroActividad, jScrollPanelDatosEdicionCentroActividad, jPanelAccionesCentroActividad,jPanelAccionesFormularioCentroActividad,jmenuBarCentroActividad,jmenuBarDetalleCentroActividad,jTtoolBarCentroActividad,jTtoolBarDetalleCentroActividad);
						
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
	
	public void finishProcessCentroActividad() {// throws Exception 
		this.finishProcessCentroActividad(true);
	}
	
	public void finishProcessCentroActividad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCentroActividad ,this.jPanelParametrosReportesCentroActividad, this.jScrollPanelDatosCentroActividad,this.jPanelPaginacionCentroActividad, this.jScrollPanelDatosEdicionCentroActividad, this.jPanelAccionesCentroActividad,this.jPanelAccionesFormularioCentroActividad,this.jmenuBarCentroActividad,this.jmenuBarDetalleCentroActividad,this.jTtoolBarCentroActividad,this.jTtoolBarDetalleCentroActividad);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroActividad=this.jTabbedPaneBusquedasCentroActividad; 
		
		final JPanel jPanelParametrosReportesCentroActividad=this.jPanelParametrosReportesCentroActividad;
		//final JScrollPane jScrollPanelDatosCentroActividad=this.jScrollPanelDatosCentroActividad;
		final JTable jTableDatosCentroActividad=this.jTableDatosCentroActividad;		
		final JPanel jPanelPaginacionCentroActividad=this.jPanelPaginacionCentroActividad;
		//final JScrollPane jScrollPanelDatosEdicionCentroActividad=this.jScrollPanelDatosEdicionCentroActividad;
		final JPanel jPanelAccionesCentroActividad=this.jPanelAccionesCentroActividad;
		
		JPanel jPanelCamposAuxiliarCentroActividad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCentroActividad=new JPanel();
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			jPanelCamposAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jPanelCamposCentroActividad;
			jPanelAccionesFormularioAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jPanelAccionesFormularioCentroActividad;
		}
		
		final JPanel jPanelCamposCentroActividad=jPanelCamposAuxiliarCentroActividad;
		final JPanel jPanelAccionesFormularioCentroActividad=jPanelAccionesFormularioAuxiliarCentroActividad;
		
		
		final JMenuBar jmenuBarCentroActividad=this.jmenuBarCentroActividad;		
		final JToolBar jTtoolBarCentroActividad=this.jTtoolBarCentroActividad;
				
		JMenuBar jmenuBarDetalleAuxiliarCentroActividad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroActividad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			jmenuBarDetalleAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jmenuBarDetalleCentroActividad;
			jTtoolBarDetalleAuxiliarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jTtoolBarDetalleCentroActividad;		
		}
		
		final JMenuBar jmenuBarDetalleCentroActividad=jmenuBarDetalleAuxiliarCentroActividad;
		final JToolBar jTtoolBarDetalleCentroActividad=jTtoolBarDetalleAuxiliarCentroActividad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroActividad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroActividad;
			processRunnable.jTableDatos=jTableDatosCentroActividad;
			processRunnable.jPanelCampos=jPanelCamposCentroActividad;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroActividad;
			processRunnable.jPanelAcciones=jPanelAccionesCentroActividad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroActividad;
			
			
			processRunnable.jmenuBar=jmenuBarCentroActividad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroActividad;
			processRunnable.jTtoolBar=jTtoolBarCentroActividad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroActividad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCentroActividad ,jPanelParametrosReportesCentroActividad, jTableDatosCentroActividad,/*jScrollPanelDatosCentroActividad,*/jPanelCamposCentroActividad,jPanelPaginacionCentroActividad, /*jScrollPanelDatosEdicionCentroActividad,*/ jPanelAccionesCentroActividad,jPanelAccionesFormularioCentroActividad,jmenuBarCentroActividad,jmenuBarDetalleCentroActividad,jTtoolBarCentroActividad,jTtoolBarDetalleCentroActividad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCentroActividad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCentroActividad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCentroActividad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCentroActividad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCentroActividad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCentroActividad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCentroActividad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCentroActividad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCentroActividad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.centroactividadConstantesFunciones.getsFinalQueryCentroActividad();
		String  finalQueryPaginacionTodos=this.centroactividadConstantesFunciones.getsFinalQueryCentroActividad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CentroActividadConstantesFunciones.getArrayColumnasGlobalesNoCentroActividad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CentroActividadConstantesFunciones.getArrayColumnasGlobalesCentroActividad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CentroActividadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.centroactividadsEliminados= new ArrayList<CentroActividad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCentroActividad();
		
				///*CentroActividadSessionBean*/this.centroactividadSessionBean=new CentroActividadSessionBean();
			
			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
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
					this.iNumeroPaginacion=CentroActividadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CentroActividadConstantesFunciones.getClassesForeignKeysOfCentroActividad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/centroactividad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			centroactividadsAux= new ArrayList<CentroActividad>();
			
				
			centroactividadLogic.setDatosCliente(this.datosCliente);
			centroactividadLogic.setDatosDeep(this.datosDeep);
			centroactividadLogic.setIsConDeep(true);
			
			
			centroactividadLogic.getCentroActividadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					centroactividadLogic.getTodosCentroActividads(finalQueryGlobal,pagination);
					
					//centroactividadLogic.getTodosCentroActividadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(centroactividadLogic.getCentroActividads()==null|| centroactividadLogic.getCentroActividads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centroactividadsAux= new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividadLogic.getCentroActividads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadsAux= new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centroactividadLogic.getTodosCentroActividads(finalQueryGlobal+"",this.pagination);												
							
							//centroactividadLogic.getTodosCentroActividadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCentroActividads("Todos",centroactividadLogic.getCentroActividads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());					
							centroactividadLogic.getCentroActividads().addAll(centroactividadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividads=new ArrayList<CentroActividad>();
							centroactividads.addAll(centroactividadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCentroActividad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCentroActividad=this.idActual;
				
				} else if(this.idCentroActividadActual!=null && this.idCentroActividadActual!=0L) {
					idCentroActividad=idCentroActividadActual;
				}
				
					
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndicePorId(idCentroActividad);
				
				this.centroactividads=new ArrayList<CentroActividad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					centroactividadLogic.getEntity(idCentroActividad);
					
					//centroactividadLogic.getEntityWithConnection(idCentroActividad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());
					centroactividadLogic.getCentroActividads().add(centroactividadLogic.getCentroActividad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centroactividads=new ArrayList<CentroActividad>();
					this.centroactividads.add(centroactividad);
				}
				
				if(centroactividadLogic.getCentroActividad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centroactividadLogic.getCentroActividadsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centroactividadLogic.getCentroActividads()==null||centroactividadLogic.getCentroActividads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centroactividads==null|| centroactividads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadsAux=new ArrayList<CentroActividad>();
						centroactividadsAux.addAll(centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadsAux=new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centroactividadLogic.getCentroActividadsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroActividads("BusquedaPorCodigo",centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroActividads("BusquedaPorCodigo",centroactividads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());
						centroactividadLogic.getCentroActividads().addAll(centroactividadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividads=new ArrayList<CentroActividad>();
							centroactividads.addAll(centroactividadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centroactividadLogic.getCentroActividadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centroactividadLogic.getCentroActividads()==null||centroactividadLogic.getCentroActividads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centroactividads==null|| centroactividads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadsAux=new ArrayList<CentroActividad>();
						centroactividadsAux.addAll(centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadsAux=new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centroactividadLogic.getCentroActividadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroActividads("BusquedaPorNombre",centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroActividads("BusquedaPorNombre",centroactividads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());
						centroactividadLogic.getCentroActividads().addAll(centroactividadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividads=new ArrayList<CentroActividad>();
							centroactividads.addAll(centroactividadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centroactividadLogic.getCentroActividadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centroactividadLogic.getCentroActividads()==null||centroactividadLogic.getCentroActividads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centroactividads==null|| centroactividads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadsAux=new ArrayList<CentroActividad>();
						centroactividadsAux.addAll(centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadsAux=new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centroactividadLogic.getCentroActividadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroActividads("FK_IdEmpresa",centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroActividads("FK_IdEmpresa",centroactividads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());
						centroactividadLogic.getCentroActividads().addAll(centroactividadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividads=new ArrayList<CentroActividad>();
							centroactividads.addAll(centroactividadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGrupoFlujoCaja")) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centroactividadLogic.getCentroActividadsFK_IdTipoGrupoFlujoCaja(finalQueryGlobal,pagination,id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centroactividadLogic.getCentroActividads()==null||centroactividadLogic.getCentroActividads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centroactividads==null|| centroactividads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadsAux=new ArrayList<CentroActividad>();
						centroactividadsAux.addAll(centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadsAux=new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centroactividadLogic.getCentroActividadsFK_IdTipoGrupoFlujoCaja(finalQueryGlobal,pagination,id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroActividads("FK_IdTipoGrupoFlujoCaja",centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroActividads("FK_IdTipoGrupoFlujoCaja",centroactividads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());
						centroactividadLogic.getCentroActividads().addAll(centroactividadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividads=new ArrayList<CentroActividad>();
							centroactividads.addAll(centroactividadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMovimiento")) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centroactividadLogic.getCentroActividadsFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centroactividadLogic.getCentroActividads()==null||centroactividadLogic.getCentroActividads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centroactividads==null|| centroactividads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadsAux=new ArrayList<CentroActividad>();
						centroactividadsAux.addAll(centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadsAux=new ArrayList<CentroActividad>();
							centroactividadsAux.addAll(centroactividads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centroactividadLogic.getCentroActividadsFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroActividadConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroActividads("FK_IdTipoMovimiento",centroactividadLogic.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroActividads("FK_IdTipoMovimiento",centroactividads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadLogic.setCentroActividads(new ArrayList<CentroActividad>());
						centroactividadLogic.getCentroActividads().addAll(centroactividadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividads=new ArrayList<CentroActividad>();
							centroactividads.addAll(centroactividadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCentroActividad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCentroActividad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centroactividadLogic.getCentroActividads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centroactividads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centroactividadLogic.getCentroActividads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centroactividads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CentroActividad centroactividad) {
		Boolean permite=true;
		
		if(this.centroactividad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CentroActividadConstantesFunciones.getOrderByListaCentroActividad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CentroActividadConstantesFunciones.getOrderByListaCentroActividad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroActividad centroactividad:centroactividadLogic.getCentroActividads()) {
				if(centroactividad.getsType().equals(Constantes2.S_TOTALES)) {
					centroactividadTotales=centroactividad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroActividad centroactividad:this.centroactividads) {
				if(centroactividad.getsType().equals(Constantes2.S_TOTALES)) {
					centroactividadTotales=centroactividad;
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
			this.centroactividadAux=new CentroActividad();
			this.centroactividadAux.setsType(Constantes2.S_TOTALES);
			this.centroactividadAux.setIsNew(false);
			this.centroactividadAux.setIsChanged(false);
			this.centroactividadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CentroActividadConstantesFunciones.TotalizarValoresFilaCentroActividad(this.centroactividadLogic.getCentroActividads(),this.centroactividadAux);
				
				this.centroactividadLogic.getCentroActividads().add(this.centroactividadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CentroActividadConstantesFunciones.TotalizarValoresFilaCentroActividad(this.centroactividads,this.centroactividadAux);
				
				this.centroactividads.add(this.centroactividadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		centroactividadTotales=new CentroActividad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centroactividadLogic.getCentroActividads().remove(centroactividadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centroactividads.remove(centroactividadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		centroactividadTotales=new CentroActividad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroActividad centroactividad:centroactividadLogic.getCentroActividads()) {
				if(centroactividad.getsType().equals(Constantes2.S_TOTALES)) {
					centroactividadTotales=centroactividad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroActividadConstantesFunciones.TotalizarValoresFilaCentroActividad(this.centroactividadLogic.getCentroActividads(),centroactividadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroActividad centroactividad:this.centroactividads) {
				if(centroactividad.getsType().equals(Constantes2.S_TOTALES)) {
					centroactividadTotales=centroactividad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroActividadConstantesFunciones.TotalizarValoresFilaCentroActividad(this.centroactividads,centroactividadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCentroActividadsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroActividadsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroActividadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroActividadsFK_IdTipoGrupoFlujoCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGrupoFlujoCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroActividadsFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCentroActividadsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.getCentroActividadsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroActividadsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.getCentroActividadsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroActividadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.getCentroActividadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroActividadsFK_IdTipoGrupoFlujoCaja(String sFinalQuery,Long id_tipo_grupo_flujo_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.getCentroActividadsFK_IdTipoGrupoFlujoCaja(sFinalQuery,this.pagination,id_tipo_grupo_flujo_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroActividadsFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.getCentroActividadsFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosCentroActividad() {
		this.isPermisoTodoCentroActividad=false;
		this.isPermisoNuevoCentroActividad=false;
		this.isPermisoActualizarCentroActividad=false;
		this.isPermisoActualizarOriginalCentroActividad=false;
		this.isPermisoEliminarCentroActividad=false;
		this.isPermisoGuardarCambiosCentroActividad=false;
		this.isPermisoConsultaCentroActividad=false;
		this.isPermisoBusquedaCentroActividad=false;
		this.isPermisoReporteCentroActividad=false;		
		this.isPermisoOrdenCentroActividad=false;		
		this.isPermisoPaginacionMedioCentroActividad=false;		
		this.isPermisoPaginacionAltoCentroActividad=false;
		this.isPermisoPaginacionTodoCentroActividad=false;
		this.isPermisoCopiarCentroActividad=false;		
		this.isPermisoVerFormCentroActividad=false;		
		this.isPermisoDuplicarCentroActividad=false;		
		this.isPermisoOrdenCentroActividad=false;		
	}
	
	public void setPermisosUsuarioCentroActividad(Boolean isPermiso) {
		this.isPermisoTodoCentroActividad=isPermiso;
		this.isPermisoNuevoCentroActividad=isPermiso;
		this.isPermisoActualizarCentroActividad=isPermiso;
		this.isPermisoActualizarOriginalCentroActividad=isPermiso;
		this.isPermisoEliminarCentroActividad=isPermiso;
		this.isPermisoGuardarCambiosCentroActividad=isPermiso;
		this.isPermisoConsultaCentroActividad=isPermiso;
		this.isPermisoBusquedaCentroActividad=isPermiso;
		this.isPermisoReporteCentroActividad=isPermiso;
		this.isPermisoOrdenCentroActividad=isPermiso;		
		this.isPermisoPaginacionMedioCentroActividad=isPermiso;		
		this.isPermisoPaginacionAltoCentroActividad=isPermiso;		
		this.isPermisoPaginacionTodoCentroActividad=isPermiso;		
		this.isPermisoCopiarCentroActividad=isPermiso;		
		this.isPermisoVerFormCentroActividad=isPermiso;		
		this.isPermisoDuplicarCentroActividad=isPermiso;
		this.isPermisoOrdenCentroActividad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCentroActividad(Boolean isPermiso) {
		//this.isPermisoTodoCentroActividad=isPermiso;
		this.isPermisoNuevoCentroActividad=isPermiso;
		this.isPermisoActualizarCentroActividad=isPermiso;
		this.isPermisoActualizarOriginalCentroActividad=isPermiso;
		this.isPermisoEliminarCentroActividad=isPermiso;
		this.isPermisoGuardarCambiosCentroActividad=isPermiso;
		//this.isPermisoConsultaCentroActividad=isPermiso;
		//this.isPermisoBusquedaCentroActividad=isPermiso;
		//this.isPermisoReporteCentroActividad=isPermiso;
		//this.isPermisoOrdenCentroActividad=isPermiso;		
		//this.isPermisoPaginacionMedioCentroActividad=isPermiso;		
		//this.isPermisoPaginacionAltoCentroActividad=isPermiso;		
		//this.isPermisoPaginacionTodoCentroActividad=isPermiso;		
		//this.isPermisoCopiarCentroActividad=isPermiso;		
		//this.isPermisoDuplicarCentroActividad=isPermiso;
		//this.isPermisoOrdenCentroActividad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCentroActividadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PagoAutoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(AutoriPagoConstantesFunciones.SNOMBREOPCION);
		
		if(CentroActividadJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPagoAuto=false;
		this.isTienePermisosPagoAuto=this.verificarGetPermisosUsuarioOpcionCentroActividadClaseRelacionada(this.opcionsRelacionadas,PagoAutoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionCentroActividadClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosAutoriPago=false;
		this.isTienePermisosAutoriPago=this.verificarGetPermisosUsuarioOpcionCentroActividadClaseRelacionada(this.opcionsRelacionadas,AutoriPagoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCentroActividad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCentroActividadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPagoAuto=conPermiso;
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosAutoriPago=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCentroActividadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCentroActividadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCentroActividadClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPagoAuto && this.jInternalFrameDetalleFormCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.remove(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.remove(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosAutoriPago && this.jInternalFrameDetalleFormCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.remove(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCentroActividad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CentroActividadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CentroActividadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCentroActividad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCentroActividad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCentroActividad=this.isPermisoActualizarCentroActividad;
			this.isPermisoEliminarCentroActividad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCentroActividad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCentroActividad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCentroActividad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCentroActividad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCentroActividad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroActividad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCentroActividad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCentroActividad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCentroActividad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCentroActividad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCentroActividad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCentroActividad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroActividad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCentroActividad.setToolTipText(this.jTableDatosCentroActividad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCentroActividad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCentroActividad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CentroActividadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CentroActividadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCentroActividad() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPagoAuto && this.centroactividadConstantesFunciones.mostrarPagoAutoCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pago Auto");
			reporte.setsDescripcion("Pago Auto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCliente && this.centroactividadConstantesFunciones.mostrarClienteCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosAutoriPago && this.centroactividadConstantesFunciones.mostrarAutoriPagoCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Autori Pago");
			reporte.setsDescripcion("Autori Pago");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyCentroActividadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
				this.tipogrupoflujocajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCentroActividadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CentroActividadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCentroActividadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGrupoFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGrupoFlujoCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogrupoflujocajasForeignKey==null||this.tipogrupoflujocajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGrupoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFlujoCajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGrupoFlujoCajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGrupoFlujoCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCentroActividadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CentroActividadParameterReturnGeneral centroactividadReturnGeneral=new CentroActividadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.centroactividadConstantesFunciones.cargarid_empresaCentroActividad)
					 || (this.esRecargarFks && this.centroactividadConstantesFunciones.cargarid_empresaCentroActividad)) {

					if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+centroactividadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoMovimiento="";

				if(((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0) && this.centroactividadConstantesFunciones.cargarid_tipo_movimientoCentroActividad)
					 || (this.esRecargarFks && this.centroactividadConstantesFunciones.cargarid_tipo_movimientoCentroActividad)) {

					if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimiento, "");
						finalQueryGlobalTipoMovimiento+=TipoMovimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimiento=" WHERE " + ConstantesSql.ID + "="+centroactividadSessionBean.getlidTipoMovimientoActual();
					}
				} else {
					finalQueryGlobalTipoMovimiento="NONE";
				}


				String finalQueryGlobalTipoGrupoFlujoCaja="";

				if(((this.tipogrupoflujocajasForeignKey==null||this.tipogrupoflujocajasForeignKey.size()<=0) && this.centroactividadConstantesFunciones.cargarid_tipo_grupo_flujo_cajaCentroActividad)
					 || (this.esRecargarFks && this.centroactividadConstantesFunciones.cargarid_tipo_grupo_flujo_cajaCentroActividad)) {

					if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGrupoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGrupoFlujoCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFlujoCajaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGrupoFlujoCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGrupoFlujoCaja, "");
						finalQueryGlobalTipoGrupoFlujoCaja+=TipoGrupoFlujoCajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGrupoFlujoCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGrupoFlujoCaja=" WHERE " + ConstantesSql.ID + "="+centroactividadSessionBean.getlidTipoGrupoFlujoCajaActual();
					}
				} else {
					finalQueryGlobalTipoGrupoFlujoCaja="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				centroactividadReturnGeneral=centroactividadLogic.cargarCombosLoteForeignKeyCentroActividad(finalQueryGlobalEmpresa,finalQueryGlobalTipoMovimiento,finalQueryGlobalTipoGrupoFlujoCaja);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=centroactividadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoMovimiento.equals("NONE")) {
				this.tipomovimientosForeignKey=centroactividadReturnGeneral.gettipomovimientosForeignKey();
			}

			if(!finalQueryGlobalTipoGrupoFlujoCaja.equals("NONE")) {
				this.tipogrupoflujocajasForeignKey=centroactividadReturnGeneral.gettipogrupoflujocajasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCentroActividad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
			this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {
		try {

			if(!this.centroactividadSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja()) {
				TipoGrupoFlujoCaja tipogrupoflujocaja=new TipoGrupoFlujoCaja();
				TipoGrupoFlujoCajaConstantesFunciones.setTipoGrupoFlujoCajaDescripcion(tipogrupoflujocaja,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogrupoflujocaja.setId(null);

				if(!TipoGrupoFlujoCajaConstantesFunciones.ExisteEnLista(this.tipogrupoflujocajasForeignKey,tipogrupoflujocaja,true)) {

					this.tipogrupoflujocajasForeignKey.add(0,tipogrupoflujocaja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCentroActividad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCentroActividad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCentroActividad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroActividad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCentroActividad(CentroActividad centroactividad)throws Exception {	
		try {
			
			this.setActualTipoMovimientoForeignKey(centroactividad.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoGrupoFlujoCajaForeignKey(centroactividad.getid_tipo_grupo_flujo_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCentroActividad(CentroActividad centroactividad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCentroActividad()throws Exception {	
		try {
			
			this.setActualTipoMovimientoForeignKey(this.centroactividadConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoGrupoFlujoCajaForeignKey(this.centroactividadConstantesFunciones.getid_tipo_grupo_flujo_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCentroActividad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCentroActividad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCentroActividad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCentroActividad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCentroActividad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
			this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCentroActividad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCentroActividad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CentroActividadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CentroActividadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CentroActividadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.centroactividadSessionBean=new CentroActividadSessionBean(); 
		this.centroactividadConstantesFunciones=new CentroActividadConstantesFunciones(); 
		this.centroactividadBean=new CentroActividad();//(this.centroactividadConstantesFunciones); 		
		this.centroactividadReturnGeneral=new CentroActividadParameterReturnGeneral(); 
		
		this.centroactividadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centroactividadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CentroActividadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CentroActividadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CentroActividadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCentroActividad(true);
			
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
			
			this.centroactividadConstantesFunciones=new CentroActividadConstantesFunciones(); 
			this.centroactividadBean=new CentroActividad();//this.centroactividadConstantesFunciones); 			
			this.centroactividadReturnGeneral=new CentroActividadParameterReturnGeneral(); 
		
			CentroActividadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Actividad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.centroactividad=new CentroActividad();
			this.centroactividads = new ArrayList<CentroActividad>();
			this.centroactividadsAux = new ArrayList<CentroActividad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic=new CentroActividadLogic();
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			//this.centroactividadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.centroactividadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCentroActividad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroActividad);	
					}
					
					if(this.jInternalFrameImportacionCentroActividad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroActividad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCentroActividad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCentroActividad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCentroActividad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroActividad);
				this.jInternalFrameDetalleFormCentroActividad.setVisible(false);
				this.jInternalFrameDetalleFormCentroActividad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroActividad);
					this.jInternalFrameReporteDinamicoCentroActividad.setVisible(false);
					this.jInternalFrameReporteDinamicoCentroActividad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCentroActividad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCentroActividad);
					this.jInternalFrameImportacionCentroActividad.setVisible(false);
					this.jInternalFrameImportacionCentroActividad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCentroActividad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCentroActividad);
					this.jInternalFrameOrderByCentroActividad.setVisible(false);
					this.jInternalFrameOrderByCentroActividad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCentroActividadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CentroActividadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.centroactividadReturnGeneral=new CentroActividadParameterReturnGeneral();
			
			this.centroactividadParameterGeneral=new CentroActividadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.centroactividadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CentroActividadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PagoAutoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(AutoriPagoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroActividadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centroactividadSessionBean.getEsGuardarRelacionado(),this.centroactividadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroActividadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centroactividadSessionBean.getEsGuardarRelacionado(),this.centroactividadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaDuplicarCentroActividad=true;
			this.isVisibilidadCeldaCopiarCentroActividad=true;
			this.isVisibilidadCeldaVerFormCentroActividad=true;
			this.isVisibilidadCeldaOrdenCentroActividad=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
			this.isVisibilidadCeldaModificarCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=false;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=false;
			this.isVisibilidadCeldaGuardarCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCentroActividad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCentroActividad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCentroActividad(false);
			
			this.setPermisosUsuarioCentroActividad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centroactividadSessionBean.getEsGuardarRelacionado() 
				|| (this.centroactividadSessionBean.getEsGuardarRelacionado() && this.centroactividadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCentroActividadClasesRelacionadas();
			}
			
			if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCentroActividadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCentroActividad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCentroActividad();
			}
			
			if(!this.isPermisoBusquedaCentroActividad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCentroActividad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCentroActividad,this.isPermisoPaginacionMedioCentroActividad,this.isPermisoPaginacionTodoCentroActividad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CentroActividadConstantesFunciones.getTiposSeleccionarCentroActividad());
				
				this.tiposColumnasSelect=CentroActividadConstantesFunciones.getTiposSeleccionarCentroActividad(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCentroActividad();				
				//this.tiposRelacionesSelect=CentroActividadConstantesFunciones.getTiposRelacionesCentroActividad(true);
				
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
			//if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCentroActividad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCentroActividad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCentroActividad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroActividad() ;
			
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
			
			
			this.pagoautoLogic=new PagoAutoLogic();
			this.clienteLogic=new ClienteLogic();
			this.autoripagoLogic=new AutoriPagoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			this.tipogrupoflujocajaLogic=new TipoGrupoFlujoCajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				centroactividadImplementable= (CentroActividadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroActividadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				centroactividadImplementableHome= (CentroActividadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroActividadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.centroactividads= new ArrayList<CentroActividad>();
			this.centroactividadsEliminados= new ArrayList<CentroActividad>();
						
			this.isEsNuevoCentroActividad=false;
			this.esParaAccionDesdeFormularioCentroActividad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			this.tipogrupoflujocajasForeignKey=new ArrayList<TipoGrupoFlujoCaja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCentroActividad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCentroActividad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CentroActividadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CentroActividadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCentroActividad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCentroActividad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCentroActividad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCentroActividad();
			}
			
			CentroActividadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCentroActividad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCentroActividad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCentroActividad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCentroActividad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CentroActividad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCentroActividad() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCentroActividad")) {
				iIndex=this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();	
				
				

				if(sTitle.equals("Autori Pagos")) {
					if(!AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCentroActividad();

						this.cargarParteTabPanelRelacionadaAutoriPago(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCentroActividad();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pago Autos")) {
					if(!PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCentroActividad();

						this.cargarParteTabPanelRelacionadaPagoAuto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCentroActividad();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAutoriPago(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCentroActividad.cargarSessionConBeanSwingJInternalFrameAutoriPago(false,true,iIndex);
		this.jButtonAutoriPagoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAutoriPago();

		//this.jTabbedPaneRelacionesCentroActividad.updateUI();
		//this.jTabbedPaneRelacionesCentroActividad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCentroActividad.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCentroActividad.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesCentroActividad.updateUI();
		//this.jTabbedPaneRelacionesCentroActividad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCentroActividad.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPagoAuto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCentroActividad.cargarSessionConBeanSwingJInternalFramePagoAuto(false,true,iIndex);
		this.jButtonPagoAutoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPagoAuto();

		//this.jTabbedPaneRelacionesCentroActividad.updateUI();
		//this.jTabbedPaneRelacionesCentroActividad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCentroActividad.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PagoAuto")) {
				int row=this.jTableDatosCentroActividad.getSelectedRow();
				jButtonPagoAutoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosCentroActividad.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("AutoriPago")) {
				int row=this.jTableDatosCentroActividad.getSelectedRow();
				jButtonAutoriPagoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pago Auto")) {

					if(this.isTienePermisosPagoAuto && this.centroactividadConstantesFunciones.mostrarPagoAutoCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pago Autos"+"("+PagoAutoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pago Autos");

						if(centroactividadConstantesFunciones.resaltarPagoAutoCentroActividad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(centroactividadConstantesFunciones.resaltarPagoAutoCentroActividad);
						}

						jmenuItem.setEnabled(this.centroactividadConstantesFunciones.activarPagoAutoCentroActividad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PagoAuto"));

						

						this.jInternalFrameDetalleFormCentroActividad.jmenuDetalleCentroActividad.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.centroactividadConstantesFunciones.mostrarClienteCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(centroactividadConstantesFunciones.resaltarClienteCentroActividad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(centroactividadConstantesFunciones.resaltarClienteCentroActividad);
						}

						jmenuItem.setEnabled(this.centroactividadConstantesFunciones.activarClienteCentroActividad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormCentroActividad.jmenuDetalleCentroActividad.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Autori Pago")) {

					if(this.isTienePermisosAutoriPago && this.centroactividadConstantesFunciones.mostrarAutoriPagoCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Autori Pagos"+"("+AutoriPagoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Autori Pagos");

						if(centroactividadConstantesFunciones.resaltarAutoriPagoCentroActividad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(centroactividadConstantesFunciones.resaltarAutoriPagoCentroActividad);
						}

						jmenuItem.setEnabled(this.centroactividadConstantesFunciones.activarAutoriPagoCentroActividad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AutoriPago"));

						

						this.jInternalFrameDetalleFormCentroActividad.jmenuDetalleCentroActividad.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCentroActividad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCentroActividad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCentroActividad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCentroActividadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCentroActividad();
		
		this.cargarCombosFrameForeignKeyCentroActividad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCentroActividad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCentroActividad();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGrupoFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGrupoFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
				this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGrupoFlujoCaja(this.tipogrupoflujocajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCentroActividadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			
			if(jTableDatosCentroActividad.getRowCount()>=1) {
				jTableDatosCentroActividad.removeRowSelectionInterval(0, jTableDatosCentroActividad.getRowCount()-1);						
			}
			
			this.isEsNuevoCentroActividad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCentroActividad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCentroActividad(true);			
			//this.centroactividad=new CentroActividad();
			//this.centroactividad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroActividad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroActividad() ;
			
			if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroActividad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.centroactividad);	
			this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);				
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CentroActividad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCentroActividadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCentroActividad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCentroActividad.getSelectedRows().length;			
			}
			
			centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCentroActividad--;			
				//CentroActividad centroactividadAux= new CentroActividad();			
				//centroactividadAux.setId(this.iIdNuevoCentroActividad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CentroActividad centroactividadOrigen=new CentroActividad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CentroActividad centroactividadOrigen : centroactividadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							centroactividadOrigen =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centroactividadOrigen =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCentroActividad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.centroactividad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCentroActividad(centroactividadOrigen,this.centroactividad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centroactividadLogic.getCentroActividads().add(this.centroactividadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centroactividads.add(this.centroactividadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCentroActividad(false);
				
				this.jTableDatosCentroActividad.setRowSelectionInterval(this.getIndiceNuevoCentroActividad(), this.getIndiceNuevoCentroActividad());
				
				int iLastRow =  this.jTableDatosCentroActividad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroActividad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroActividad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroActividad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();									
		
			CentroActividad centroactividadOrigen=new CentroActividad();
			CentroActividad centroactividadDestino=new CentroActividad();
				
			centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCentroActividad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || centroactividadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCentroActividad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadOrigen =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centroactividadOrigen =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centroactividadDestino =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centroactividadDestino =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				centroactividadOrigen =centroactividadsSeleccionados.get(0);
				centroactividadDestino =centroactividadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCentroActividad(centroactividadOrigen,centroactividadDestino,true,false);
				
				centroactividadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centroactividadDestino,centroactividadLogic.getCentroActividads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centroactividadDestino,centroactividads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCentroActividad(false);
				
				//this.jTableDatosCentroActividad.setRowSelectionInterval(this.getIndiceNuevoCentroActividad(), this.getIndiceNuevoCentroActividad());
				
				int iLastRow =  this.jTableDatosCentroActividad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroActividad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroActividad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroActividad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCentroActividad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCentroActividad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCentroActividad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCentroActividad.setVisible(!isVisible);
			this.jPanelPaginacionCentroActividad.setVisible(!isVisible);
			this.jPanelAccionesCentroActividad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCentroActividad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCentroActividad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCentroActividad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCentroActividad();
			
			this.abrirFrameOrderByCentroActividad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCentroActividad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCentroActividad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroActividad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCentroActividad.isMaximum()) {
					this.jInternalFrameDetalleFormCentroActividad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCentroActividad.setSize(this.jInternalFrameDetalleFormCentroActividad.iWidthFormulario,this.jInternalFrameDetalleFormCentroActividad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCentroActividad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCentroActividad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCentroActividad.isMaximum()) {
						this.jInternalFrameDetalleFormCentroActividad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth(),CentroActividadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth(),CentroActividadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth(),CentroActividadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAutoriPago();
					}

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPagoAuto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCentroActividad.setVisible(true);
	        this.jInternalFrameDetalleFormCentroActividad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCentroActividad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCentroActividad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCentroActividad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroActividad,false,this);
				} else {
					this.jInternalFrameOrderByCentroActividad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroActividad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCentroActividad);
				this.jInternalFrameOrderByCentroActividad.setVisible(false);
				this.jInternalFrameOrderByCentroActividad.setSelected(false);
				
				this.jInternalFrameOrderByCentroActividad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroActividad"));
				
				this.inicializarActualizarBindingTablaOrderByCentroActividad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCentroActividad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCentroActividad==null) {
				
				this.jInternalFrameImportacionCentroActividad=new ImportacionJInternalFrame(CentroActividadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroActividad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCentroActividad);
				this.jInternalFrameImportacionCentroActividad.setVisible(false);
				this.jInternalFrameImportacionCentroActividad.setSelected(false);


				this.jInternalFrameImportacionCentroActividad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroActividad"));
				this.jInternalFrameImportacionCentroActividad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroActividad"));
				this.jInternalFrameImportacionCentroActividad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroActividad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCentroActividad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCentroActividad==null) {
				this.jInternalFrameReporteDinamicoCentroActividad=new ReporteDinamicoJInternalFrame(CentroActividadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroActividad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroActividad);
				this.jInternalFrameReporteDinamicoCentroActividad.setVisible(false);
				this.jInternalFrameReporteDinamicoCentroActividad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCentroActividad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroActividad"));
				this.jInternalFrameReporteDinamicoCentroActividad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroActividad"));
				this.jInternalFrameReporteDinamicoCentroActividad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroActividad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroActividad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAutoriPago() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPagoAuto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCentroActividad.jContentPaneDetalleCentroActividad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCentroActividad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroActividad);
			
	       	this.jInternalFrameDetalleFormCentroActividad.setVisible(false);
	        this.jInternalFrameDetalleFormCentroActividad.setSelected(false);
			
			//this.jInternalFrameDetalleFormCentroActividad.dispose();
			//this.jInternalFrameDetalleFormCentroActividad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCentroActividad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCentroActividad.setVisible(true);
	        this.jInternalFrameReporteDinamicoCentroActividad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCentroActividad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCentroActividad.setVisible(true);
	        this.jInternalFrameImportacionCentroActividad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCentroActividad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCentroActividad.setVisible(true);
	        this.jInternalFrameOrderByCentroActividad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCentroActividad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCentroActividad.setVisible(false);
	        this.jInternalFrameOrderByCentroActividad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCentroActividad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCentroActividad.setVisible(false);
	        this.jInternalFrameReporteDinamicoCentroActividad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCentroActividad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCentroActividad.setVisible(false);
	        this.jInternalFrameImportacionCentroActividad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCentroActividad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCentroActividad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCentroActividad(true);
			//this.isEsNuevoCentroActividad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCentroActividad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroActividad(false) ;
			
			if(centroactividadSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getEsGuardarRelacionado() && PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPagoAutoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getEsGuardarRelacionado() && AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAutoriPagoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroActividad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroActividad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCentroActividadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCentroActividad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCentroActividad(true);
			//this.isEsNuevoCentroActividad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.centroactividad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCentroActividad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCentroActividad(false) ;
			
			if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroActividad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroActividad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroActividad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGrupoFlujoCaja(List<TipoGrupoFlujoCaja> tipogrupoflujocajasForeignKey)throws Exception{
		TableColumn tableColumnTipoGrupoFlujoCaja=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA));
		TableCellEditor tableCellEditorTipoGrupoFlujoCaja =tableColumnTipoGrupoFlujoCaja.getCellEditor();

		TipoGrupoFlujoCajaTableCell tipogrupoflujocajaTableCellFk=(TipoGrupoFlujoCajaTableCell)tableCellEditorTipoGrupoFlujoCaja;

		if(tipogrupoflujocajaTableCellFk!=null) {
			tipogrupoflujocajaTableCellFk.settipogrupoflujocajasForeignKey(tipogrupoflujocajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroActividad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogrupoflujocajaTableCellFk.setRowActual(intSelectedRow);
			//tipogrupoflujocajaTableCellFk.settipogrupoflujocajasForeignKeyActual(tipogrupoflujocajasForeignKey);
		//}


		if(tipogrupoflujocajaTableCellFk!=null) {
			tipogrupoflujocajaTableCellFk.RecargarTipoGrupoFlujoCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCentroActividad(false);
			
			//if(!this.isEsNuevoCentroActividad) {								
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				
			}
			
			if(this.permiteMantenimiento(this.centroactividad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCentroActividad=true;
					this.inicializarActualizarBindingTablaCentroActividad(false);
					this.isEsNuevoCentroActividad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCentroActividad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCentroActividad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroActividad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroActividad(false);
				
				this.habilitarDeshabilitarControlesCentroActividad(false);
			
												
				
				if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCentroActividad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCentroActividadActionPerformed(evt,centroactividadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCentroActividad(this.centroactividad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCentroActividad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,centroactividadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.centroactividad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCentroActividadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				this.centroactividad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				this.centroactividad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.centroactividad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CentroActividadModel) this.jTableDatosCentroActividad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCentroActividad=true;
				this.inicializarActualizarBindingTablaCentroActividad(false);
				this.isEsNuevoCentroActividad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroActividad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroActividad(false);
				
				this.habilitarDeshabilitarControlesCentroActividad(false);
				
				
				
				if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCentroActividad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCentroActividadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCentroActividad.getRowCount()>=1) {
				jTableDatosCentroActividad.removeRowSelectionInterval(0, jTableDatosCentroActividad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCentroActividad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCentroActividad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroActividad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroActividad(false) ;
			
			this.isEsNuevoCentroActividad=false;
			
			if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCentroActividad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCentroActividadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCentroActividad(false);
				
				//SI ES MANUAL
				if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCentroActividad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCentroActividadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCentroActividad--;			
			//CentroActividad centroactividadAux= new CentroActividad();			
			//centroactividadAux.setId(this.iIdNuevoCentroActividad);
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCentroActividad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
			
			this.centroactividad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.centroactividadLogic.getCentroActividads().add(this.centroactividadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.centroactividads.add(this.centroactividadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCentroActividad(false);
			
			this.jTableDatosCentroActividad.setRowSelectionInterval(this.getIndiceNuevoCentroActividad(), this.getIndiceNuevoCentroActividad());
			
			int iLastRow =  this.jTableDatosCentroActividad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCentroActividad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCentroActividad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCentroActividad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCentroActividadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCentroActividad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroActividad(false);
			
			//SI ES MANUAL
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroActividad();
			}
			
			//this.abrirFrameTreeCentroActividad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCentroActividadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Centro ActividadES ?", "MANTENIMIENTO DE Centro Actividad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCentroActividad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCentroActividad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.centroactividadReturnGeneral=centroactividadLogic.procesarImportacionCentroActividadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.centroactividadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCentroActividadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCentroActividadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCentroActividad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCentroActividad.setFileImportacion(this.jInternalFrameImportacionCentroActividad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCentroActividad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCentroActividad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCentroActividad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCentroActividad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCentroActividadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		

		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CentroActividadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CentroActividadBaseDesign.jrxml";
			
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
			
			this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroActividadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGrupoFlujoCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGrupoFlujoCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGrupoFlujoCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGrupoFlujoCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_CONSOLIDADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nsolidado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nsolidado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nsolidado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nsolidado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_CONPROYECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nProyecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nProyecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nProyecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nProyecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroActividadConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCentroActividad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CentroActividadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CentroActividadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CentroActividadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					sNombreCampoCategoria="id_tipo_grupo_flujo_caja";
					break;

				case CentroActividadConstantesFunciones.LABEL_CONSOLIDADO:
					sNombreCampoCategoria="consolidado";
					break;

				case CentroActividadConstantesFunciones.LABEL_CONPROYECTO:
					sNombreCampoCategoria="con_proyecto";
					break;

				case CentroActividadConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CentroActividadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CentroActividadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CentroActividadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					sNombreCampoCategoriaValor="id_tipo_grupo_flujo_caja";
					break;

				case CentroActividadConstantesFunciones.LABEL_CONSOLIDADO:
					sNombreCampoCategoriaValor="consolidado";
					break;

				case CentroActividadConstantesFunciones.LABEL_CONPROYECTO:
					sNombreCampoCategoriaValor="con_proyecto";
					break;

				case CentroActividadConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroActividadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CentroActividadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CentroActividadConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Grupo Flujo Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_grupo_flujo_caja");
					break;

				case CentroActividadConstantesFunciones.LABEL_CONSOLIDADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Consolidado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"consolidado");
					break;

				case CentroActividadConstantesFunciones.LABEL_CONPROYECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Proyecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_proyecto");
					break;

				case CentroActividadConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoCentroActividadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CentroActividads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CentroActividadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.gettipogrupoflujocaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_CONSOLIDADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.getconsolidado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_CONPROYECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CONPROYECTO);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.getcon_proyecto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroActividadConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroActividadConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(CentroActividad centroactividad:centroactividadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centroactividad.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelCentroActividad(row);				
			//	iRow++;
			//}				
			
			//for(CentroActividad centroactividadAux:centroactividadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCentroActividad(centroactividadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
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
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroActividad(false);
			
			//SI ES MANUAL
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroActividad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCentroActividadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroActividad(false);
			
			//SI ES MANUAL
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroActividad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCentroActividadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroActividad(false);
			
			//SI ES MANUAL
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroActividad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCentroActividad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCentroActividad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCentroActividad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCentroActividad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCentroActividad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCentroActividad.setMinimumSize(dimensionMinimum);
		this.jTableDatosCentroActividad.setMaximumSize(dimensionMaximum);
		this.jTableDatosCentroActividad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCentroActividad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCentroActividad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCentroActividad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCentroActividad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCentroActividad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCentroActividad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroActividad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCentroActividad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CentroActividadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCentroActividad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCentroActividad();
		
		this.inicializarActualizarBindingBotonesManualCentroActividad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCentroActividad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroActividad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCentroActividad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCentroActividad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCentroActividad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCentroActividad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCentroActividad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCentroActividad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCentroActividad.jCheckBoxPostAccionNuevoCentroActividad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCentroActividad.jCheckBoxPostAccionSinCerrarCentroActividad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCentroActividad.jCheckBoxPostAccionSinMensajeCentroActividad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCentroActividad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCentroActividad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCentroActividad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCentroActividad!=null) {
				this.jInternalFrameDetalleFormCentroActividad.jCheckBoxPostAccionNuevoCentroActividad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCentroActividad.jCheckBoxPostAccionSinCerrarCentroActividad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCentroActividad.jCheckBoxPostAccionSinMensajeCentroActividad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCentroActividad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCentroActividad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCentroActividad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCentroActividad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCentroActividad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCentroActividad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCentroActividad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCentroActividad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCentroActividad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCentroActividad(Boolean esInicializar) throws Exception {
		try	{	
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCentroActividad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCentroActividad() throws Exception {
		try	{
			if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroActividad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroActividad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroActividad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCentroActividad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCentroActividad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCentroActividad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCentroActividad.addItem(reporte);
			}
			
			
			if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCentroActividad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCentroActividad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCentroActividad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCentroActividad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCentroActividad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCentroActividad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCentroActividad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroActividad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroActividad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
				this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
				this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroActividad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
				
				if(this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroActividad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCentroActividad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroActividad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroActividad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCentroActividad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoCentroActividad.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreCentroActividad.getText();
		if(this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.getSelectedItem()!=null){this.id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja=((TipoGrupoFlujoCaja)this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.getSelectedItem()!=null){this.id_tipo_movimientoFK_IdTipoMovimiento=((TipoMovimiento)this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCentroActividad(Boolean esInicializar) throws Exception {				
		if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCentroActividad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCentroActividad() throws Exception {
		this.inicializarActualizarBindingTablaCentroActividad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCentroActividad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCentroActividadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCentroActividad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=centroactividadLogic.getCentroActividads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=centroactividads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCentroActividad.setModel(new CentroActividadModel(this.centroactividadLogic.getCentroActividads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCentroActividad.setModel(new CentroActividadModel(this.centroactividads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCentroActividad!=null && this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCentroActividad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CentroActividadConstantesFunciones.SCLASSWEBTITULO,centroactividadConstantesFunciones.resaltarSeleccionarCentroActividad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CentroActividadConstantesFunciones.SCLASSWEBTITULO,centroactividadConstantesFunciones.resaltarSeleccionarCentroActividad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_ID));

		if(this.centroactividadConstantesFunciones.mostraridCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centroactividadConstantesFunciones.resaltaridCentroActividad,this.centroactividadConstantesFunciones.activaridCentroActividad,this,true,"idCentroActividad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centroactividadConstantesFunciones.resaltaridCentroActividad,this.centroactividadConstantesFunciones.activaridCentroActividad,this,true,"idCentroActividad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.centroactividadConstantesFunciones.mostrarid_empresaCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.centroactividadConstantesFunciones.resaltarid_empresaCentroActividad,this,this.centroactividadConstantesFunciones.activarid_empresaCentroActividad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.centroactividadConstantesFunciones.resaltarid_empresaCentroActividad,this,this.centroactividadConstantesFunciones.activarid_empresaCentroActividad,false,"id_empresaCentroActividad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_CODIGO));

		if(this.centroactividadConstantesFunciones.mostrarcodigoCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centroactividadConstantesFunciones.resaltarcodigoCentroActividad,this.centroactividadConstantesFunciones.activarcodigoCentroActividad,this,true,"codigoCentroActividad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centroactividadConstantesFunciones.resaltarcodigoCentroActividad,this.centroactividadConstantesFunciones.activarcodigoCentroActividad,this,true,"codigoCentroActividad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_NOMBRE));

		if(this.centroactividadConstantesFunciones.mostrarnombreCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centroactividadConstantesFunciones.resaltarnombreCentroActividad,this.centroactividadConstantesFunciones.activarnombreCentroActividad,this,true,"nombreCentroActividad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centroactividadConstantesFunciones.resaltarnombreCentroActividad,this.centroactividadConstantesFunciones.activarnombreCentroActividad,this,true,"nombreCentroActividad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.centroactividadConstantesFunciones.mostrarid_tipo_movimientoCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.centroactividadConstantesFunciones.resaltarid_tipo_movimientoCentroActividad,this,this.centroactividadConstantesFunciones.activarid_tipo_movimientoCentroActividad));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.centroactividadConstantesFunciones.resaltarid_tipo_movimientoCentroActividad,this,this.centroactividadConstantesFunciones.activarid_tipo_movimientoCentroActividad,true,"id_tipo_movimientoCentroActividad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA));

		if(this.centroactividadConstantesFunciones.mostrarid_tipo_grupo_flujo_cajaCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGrupoFlujoCajaTableCell(this.tipogrupoflujocajasForeignKey,this.centroactividadConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaCentroActividad,this,this.centroactividadConstantesFunciones.activarid_tipo_grupo_flujo_cajaCentroActividad));
			tableColumn.setCellEditor(new TipoGrupoFlujoCajaTableCell(this.tipogrupoflujocajasForeignKey,this.centroactividadConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaCentroActividad,this,this.centroactividadConstantesFunciones.activarid_tipo_grupo_flujo_cajaCentroActividad,true,"id_tipo_grupo_flujo_cajaCentroActividad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_CONSOLIDADO));

		if(this.centroactividadConstantesFunciones.mostrarconsolidadoCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_CONSOLIDADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.centroactividadConstantesFunciones.resaltarconsolidadoCentroActividad,this.centroactividadConstantesFunciones.activarconsolidadoCentroActividad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.centroactividadConstantesFunciones.resaltarconsolidadoCentroActividad,this.centroactividadConstantesFunciones.activarconsolidadoCentroActividad,this,true,"consolidadoCentroActividad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_CONPROYECTO));

		if(this.centroactividadConstantesFunciones.mostrarcon_proyectoCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_CONPROYECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.centroactividadConstantesFunciones.resaltarcon_proyectoCentroActividad,this.centroactividadConstantesFunciones.activarcon_proyectoCentroActividad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.centroactividadConstantesFunciones.resaltarcon_proyectoCentroActividad,this.centroactividadConstantesFunciones.activarcon_proyectoCentroActividad,this,true,"con_proyectoCentroActividad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,CentroActividadConstantesFunciones.LABEL_OBSERVACION));

		if(this.centroactividadConstantesFunciones.mostrarobservacionCentroActividad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroActividadConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centroactividadConstantesFunciones.resaltarobservacionCentroActividad,this.centroactividadConstantesFunciones.activarobservacionCentroActividad,this,true,"observacionCentroActividad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centroactividadConstantesFunciones.resaltarobservacionCentroActividad,this.centroactividadConstantesFunciones.activarobservacionCentroActividad,this,true,"observacionCentroActividad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroActividadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPagoAuto && this.centroactividadConstantesFunciones.mostrarPagoAutoCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pago Autos");
				tableColumn.setHeaderValue("Pago Autos");
				tableColumn.setCellRenderer(new PagoAutoTableCell(centroactividadConstantesFunciones.resaltarPagoAutoCentroActividad,this,this.centroactividadConstantesFunciones.activarPagoAutoCentroActividad));
				tableColumn.setCellEditor(new PagoAutoTableCell(centroactividadConstantesFunciones.resaltarPagoAutoCentroActividad,this,this.centroactividadConstantesFunciones.activarPagoAutoCentroActividad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCentroActividad.addColumn(tableColumn);
			}

			if(this.isTienePermisosCliente && this.centroactividadConstantesFunciones.mostrarClienteCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(centroactividadConstantesFunciones.resaltarClienteCentroActividad,this,this.centroactividadConstantesFunciones.activarClienteCentroActividad));
				tableColumn.setCellEditor(new ClienteTableCell(centroactividadConstantesFunciones.resaltarClienteCentroActividad,this,this.centroactividadConstantesFunciones.activarClienteCentroActividad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCentroActividad.addColumn(tableColumn);
			}

			if(this.isTienePermisosAutoriPago && this.centroactividadConstantesFunciones.mostrarAutoriPagoCentroActividad && !CentroActividadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Autori Pagos");
				tableColumn.setHeaderValue("Autori Pagos");
				tableColumn.setCellRenderer(new AutoriPagoTableCell(centroactividadConstantesFunciones.resaltarAutoriPagoCentroActividad,this,this.centroactividadConstantesFunciones.activarAutoriPagoCentroActividad));
				tableColumn.setCellEditor(new AutoriPagoTableCell(centroactividadConstantesFunciones.resaltarAutoriPagoCentroActividad,this,this.centroactividadConstantesFunciones.activarAutoriPagoCentroActividad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCentroActividad.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centroactividadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centroactividadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroActividad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centroactividadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centroactividadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroActividad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCentroActividad && this.isPermisoGuardarCambiosCentroActividad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.centroactividadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.centroactividadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCentroActividad.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.centroactividadSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosCentroActividad.addColumn(tableColumn);
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
			
			this.jTableDatosCentroActividad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroActividad && this.isPermisoGuardarCambiosCentroActividad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.centroactividadSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroActividad && this.isPermisoGuardarCambiosCentroActividad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCentroActividad.moveColumn(this.jTableDatosCentroActividad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCentroActividad.moveColumn(this.jTableDatosCentroActividad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.centroactividadSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCentroActividad.moveColumn(this.jTableDatosCentroActividad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCentroActividad.moveColumn(this.jTableDatosCentroActividad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCentroActividad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCentroActividad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCentroActividad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCentroActividad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCentroActividad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCentroActividad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCentroActividad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCentroActividad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=centroactividadLogic.getCentroActividads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=centroactividads.size()-1;
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
		//this.jTableDatosCentroActividad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCentroActividad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCentroActividad();
			
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
				
				//this.isEsNuevoCentroActividad=false;
					
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
				if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCentroActividad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroActividad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroActividad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.centroactividad.getsType().equals("DUPLICADO")
				   || this.centroactividad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCentroActividad=true;
				
				} else {
					this.isEsNuevoCentroActividad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
					if(this.centroactividad.getId()>=0 && !this.centroactividad.getIsNew()) {						
						this.isEsNuevoCentroActividad=false;
						
					} else {
						this.isEsNuevoCentroActividad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCentroActividad(esRelaciones);						
				
				this.seleccionarCentroActividad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.centroactividad.getId()<0) {
					this.isEsNuevoCentroActividad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCentroActividad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCentroActividad(evt,rowIndex);
				}	
				
				if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CentroActividad: " + this.dDif); 
					}
				}								
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCentroActividad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.centroactividad)) {
					if(this.centroactividad.getId()>0) {
						this.centroactividad.setIsDeleted(true);
						
						this.centroactividadsEliminados.add(this.centroactividad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centroactividadLogic.getCentroActividads().remove(this.centroactividad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centroactividads.remove(this.centroactividad);				
					}
					
					
					((CentroActividadModel) this.jTableDatosCentroActividad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroActividad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCentroActividad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCentroActividad) {
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroActividad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroActividad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCentroActividad(this.centroactividad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.centroactividadConstantesFunciones.cargarid_empresaCentroActividad || this.centroactividadConstantesFunciones.event_dependid_empresaCentroActividad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.centroactividad.getid_empresa());
									//this.inicializarActualizarBindingCentroActividad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(centroactividad.getEmpresa()!=null) {
							this.empresasForeignKey.add(centroactividad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.centroactividad.getid_empresa(),false,"Formulario");

					//TipoMovimiento
					if(!this.centroactividadConstantesFunciones.cargarid_tipo_movimientoCentroActividad || this.centroactividadConstantesFunciones.event_dependid_tipo_movimientoCentroActividad) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.centroactividad.getid_tipo_movimiento());
									//this.inicializarActualizarBindingCentroActividad(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(centroactividad.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(centroactividad.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.centroactividad.getid_tipo_movimiento(),false,"Formulario");

					//TipoGrupoFlujoCaja
					if(!this.centroactividadConstantesFunciones.cargarid_tipo_grupo_flujo_cajaCentroActividad || this.centroactividadConstantesFunciones.event_dependid_tipo_grupo_flujo_cajaCentroActividad) {
						//this.cargarCombosTipoGrupoFlujoCajasForeignKeyLista(" where id="+this.centroactividad.getid_tipo_grupo_flujo_caja());
									//this.inicializarActualizarBindingCentroActividad(false,false);
						this.tipogrupoflujocajasForeignKey=new ArrayList<TipoGrupoFlujoCaja>();

						if(centroactividad.getTipoGrupoFlujoCaja()!=null) {
							this.tipogrupoflujocajasForeignKey.add(centroactividad.getTipoGrupoFlujoCaja());
						}

						this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
						this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey("Todos");
					}
					this.setActualTipoGrupoFlujoCajaForeignKey(this.centroactividad.getid_tipo_grupo_flujo_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCentroActividad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCentroActividad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroActividad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroActividad(CentroActividad centroactividad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCentroActividad(centroactividad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroActividad(CentroActividad centroactividad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCentroActividad(centroactividad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCentroActividad(centroactividad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCentroActividad(centroactividad);
	}
	
	public void setVariablesObjetoActualToFormularioCentroActividad(CentroActividad centroactividad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setText(centroactividad.getId().toString());
			this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setText(centroactividad.getcodigo());
			this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setText(centroactividad.getnombre());
			this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setSelected(centroactividad.getconsolidado());
			this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setSelected(centroactividad.getcon_proyecto());
			this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setText(centroactividad.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CentroActividad centroactividadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,centroactividadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CentroActividad centroactividadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				centroactividadLocal=this.centroactividad;
			} else {
				centroactividadLocal=this.centroactividadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(centroactividadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCentroActividad(centroactividadLocal,true);
					
					if(centroactividadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(centroactividadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(centroactividadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCentroActividad(CentroActividad centroactividad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroActividad(centroactividad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(centroactividad);
	}
	
	public void setVariablesFormularioToObjetoActualCentroActividad(CentroActividad centroactividad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroActividad(centroactividad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCentroActividad(CentroActividad centroactividad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.getText()==null || this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.getText()=="" || this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.getText()=="Id") {
				this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setText("0");
			}

			if(conColumnasBase) {centroactividad.setId(Long.parseLong(this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroActividadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelIdCentroActividad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centroactividad.setcodigo(this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroActividadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelcodigoCentroActividad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centroactividad.setnombre(this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroActividadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelnombreCentroActividad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centroactividad.setconsolidado(this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroActividadConstantesFunciones.LABEL_CONSOLIDADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelconsolidadoCentroActividad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centroactividad.setcon_proyecto(this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroActividadConstantesFunciones.LABEL_CONPROYECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelcon_proyectoCentroActividad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centroactividad.setobservacion(this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroActividadConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroActividad.jLabelobservacionCentroActividad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroActividad(CentroActividad centroactividadBean,CentroActividad centroactividad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && centroactividadBean.getid_tipo_movimiento()!=null && !centroactividadBean.getid_tipo_movimiento().equals(-1L))) {centroactividad.setid_tipo_movimiento(centroactividadBean.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && centroactividadBean.getid_tipo_grupo_flujo_caja()!=null && !centroactividadBean.getid_tipo_grupo_flujo_caja().equals(-1L))) {centroactividad.setid_tipo_grupo_flujo_caja(centroactividadBean.getid_tipo_grupo_flujo_caja());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCentroActividad(CentroActividad centroactividadOrigen,CentroActividad centroactividad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centroactividadOrigen.getId()!=null && !centroactividadOrigen.getId().equals(0L))) {centroactividad.setId(centroactividadOrigen.getId());}}
			if(conDefault || (!conDefault && centroactividadOrigen.getcodigo()!=null && !centroactividadOrigen.getcodigo().equals(""))) {centroactividad.setcodigo(centroactividadOrigen.getcodigo());}
			if(conDefault || (!conDefault && centroactividadOrigen.getnombre()!=null && !centroactividadOrigen.getnombre().equals(""))) {centroactividad.setnombre(centroactividadOrigen.getnombre());}
			if(conDefault || (!conDefault && centroactividadOrigen.getid_tipo_movimiento()!=null && !centroactividadOrigen.getid_tipo_movimiento().equals(-1L))) {centroactividad.setid_tipo_movimiento(centroactividadOrigen.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && centroactividadOrigen.getid_tipo_grupo_flujo_caja()!=null && !centroactividadOrigen.getid_tipo_grupo_flujo_caja().equals(-1L))) {centroactividad.setid_tipo_grupo_flujo_caja(centroactividadOrigen.getid_tipo_grupo_flujo_caja());}
			if(conDefault || (!conDefault && centroactividadOrigen.getconsolidado()!=null && !centroactividadOrigen.getconsolidado().equals(false))) {centroactividad.setconsolidado(centroactividadOrigen.getconsolidado());}
			if(conDefault || (!conDefault && centroactividadOrigen.getcon_proyecto()!=null && !centroactividadOrigen.getcon_proyecto().equals(false))) {centroactividad.setcon_proyecto(centroactividadOrigen.getcon_proyecto());}
			if(conDefault || (!conDefault && centroactividadOrigen.getobservacion()!=null && !centroactividadOrigen.getobservacion().equals(""))) {centroactividad.setobservacion(centroactividadOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroActividad(CentroActividad centroactividad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setText(centroactividad.getId().toString());
			this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setText(centroactividad.getcodigo());
			this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setText(centroactividad.getnombre());
			this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setSelected(centroactividad.getconsolidado());
			this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setSelected(centroactividad.getcon_proyecto());
			this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setText(centroactividad.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroActividad(CentroActividadBean centroactividadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setText(centroactividadBean.getId().toString());
			this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setText(centroactividadBean.getcodigo());
			this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setText(centroactividadBean.getnombre());
			this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setSelected(centroactividadBean.getconsolidado());
			this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setSelected(centroactividadBean.getcon_proyecto());
			this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setText(centroactividadBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCentroActividad(CentroActividadParameterReturnGeneral centroactividadReturnGeneral,CentroActividadBean centroactividadBean,Boolean conDefault) throws Exception { 
		try {
			CentroActividad centroactividadLocal=new CentroActividad();
			
			centroactividadLocal=centroactividadReturnGeneral.getCentroActividad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centroactividadLocal.getId()!=null && !centroactividadLocal.getId().equals(0L))) {centroactividadBean.setId(centroactividadLocal.getId());}}
			if(conDefault || (!conDefault && centroactividadLocal.getcodigo()!=null && !centroactividadLocal.getcodigo().equals(""))) {centroactividadBean.setcodigo(centroactividadLocal.getcodigo());}
			if(conDefault || (!conDefault && centroactividadLocal.getnombre()!=null && !centroactividadLocal.getnombre().equals(""))) {centroactividadBean.setnombre(centroactividadLocal.getnombre());}
			if(conDefault || (!conDefault && centroactividadLocal.getid_tipo_movimiento()!=null && !centroactividadLocal.getid_tipo_movimiento().equals(-1L))) {centroactividadBean.setid_tipo_movimiento(centroactividadLocal.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && centroactividadLocal.getid_tipo_grupo_flujo_caja()!=null && !centroactividadLocal.getid_tipo_grupo_flujo_caja().equals(-1L))) {centroactividadBean.setid_tipo_grupo_flujo_caja(centroactividadLocal.getid_tipo_grupo_flujo_caja());}
			if(conDefault || (!conDefault && centroactividadLocal.getconsolidado()!=null && !centroactividadLocal.getconsolidado().equals(false))) {centroactividadBean.setconsolidado(centroactividadLocal.getconsolidado());}
			if(conDefault || (!conDefault && centroactividadLocal.getcon_proyecto()!=null && !centroactividadLocal.getcon_proyecto().equals(false))) {centroactividadBean.setcon_proyecto(centroactividadLocal.getcon_proyecto());}
			if(conDefault || (!conDefault && centroactividadLocal.getobservacion()!=null && !centroactividadLocal.getobservacion().equals(""))) {centroactividadBean.setobservacion(centroactividadLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCentroActividadGenerico(Long idCentroActividadSeleccionado,JComboBox jComboBoxCentroActividad,List<CentroActividad> centroactividadsLocal)throws Exception {
		try {
			CentroActividad  centroactividadTemp=null;

			for(CentroActividad centroactividadAux:centroactividadsLocal) {
				if(centroactividadAux.getId()!=null && centroactividadAux.getId().equals(idCentroActividadSeleccionado)) {
					centroactividadTemp=centroactividadAux;
					break;
				}
			}

			jComboBoxCentroActividad.setSelectedItem(centroactividadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCentroActividadGenerico(JComboBox jComboBoxCentroActividad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroActividad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCentroActividad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroActividad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCentroActividad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PagoAuto")) {
			jButtonPagoAutoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("AutoriPago")) {
			jButtonAutoriPagoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centroactividad=(CentroActividad) centroactividadLogic.getCentroActividads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centroactividad =(CentroActividad) centroactividads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!centroactividad.getIsNew() && !centroactividad.getIsChanged() && !centroactividad.getIsDeleted()) {
				sDescripcion=centroactividad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=centroactividad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!centroactividad.getIsNew() && !centroactividad.getIsChanged() && !centroactividad.getIsDeleted()) {
				sDescripcion=centroactividad.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=centroactividad.gettipomovimiento_descripcion();
			}
		}

		if(sTipo.equals("TipoGrupoFlujoCaja")) {
			//sDescripcion=this.getActualTipoGrupoFlujoCajaForeignKeyDescripcion((Long)value);
			if(!centroactividad.getIsNew() && !centroactividad.getIsChanged() && !centroactividad.getIsDeleted()) {
				sDescripcion=centroactividad.gettipogrupoflujocaja_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGrupoFlujoCajaForeignKeyDescripcion((Long)value);
				sDescripcion=centroactividad.gettipogrupoflujocaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CentroActividad centroactividadRow=new CentroActividad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centroactividadRow=(CentroActividad) centroactividadLogic.getCentroActividads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centroactividadRow=(CentroActividad) centroactividads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPagoAutoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CentroActividad centroactividad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCentroActividad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad = (CentroActividad)this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.centroactividad = (CentroActividad)this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(centroactividad!=null) {
						this.centroactividad = centroactividad;
					} else {
						this.centroactividad = new CentroActividad();
					}
				}

				if(this.isTienePermisosPagoAuto && this.permiteMantenimiento(this.centroactividad)) {
					PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup=new PagoAutoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pagoautoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup;
					} else {
						pagoautoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame;
					}

					List<CentroActividad> centroactividads=new ArrayList<CentroActividad>();
					centroactividads.add(this.centroactividad);
					if(!esRelacionado) {
						//pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setConGuardarRelaciones(false);
						//pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pagoautoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCentroActividad.cargarPagoAutoBeanSwingJInternalFrame(centroactividads,this.centroactividad,pagoautoBeanSwingJInternalFrame,/*conInicializar,*/pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getConGuardarRelaciones(),pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getEsGuardarRelacionado());
					pagoautoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("no_relacionado");

						pagoautoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PagoAutoConstantesFunciones.ITAMANIOFILATABLA + (PagoAutoConstantesFunciones.ITAMANIOFILATABLA/2));

						pagoautoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCentroActividad=(TitledBorder)this.jScrollPanelDatosCentroActividad.getBorder();
						TitledBorder titledBorderPagoAuto=(TitledBorder)pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.getBorder();

						titledBorderPagoAuto.setTitle(titledBorderCentroActividad.getTitle() + " -> Pago Auto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pagoautoBeanSwingJInternalFrame);
						}

						pagoautoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pagoautoBeanSwingJInternalFrame);

						pagoautoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.centroactividadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pago Auto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CentroActividad centroactividad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCentroActividad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad = (CentroActividad)this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.centroactividad = (CentroActividad)this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(centroactividad!=null) {
						this.centroactividad = centroactividad;
					} else {
						this.centroactividad = new CentroActividad();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.centroactividad)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame;
					}

					List<CentroActividad> centroactividads=new ArrayList<CentroActividad>();
					centroactividads.add(this.centroactividad);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCentroActividad.cargarClienteBeanSwingJInternalFrame(centroactividads,this.centroactividad,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCentroActividad=(TitledBorder)this.jScrollPanelDatosCentroActividad.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderCentroActividad.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.centroactividadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonAutoriPagoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CentroActividad centroactividad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCentroActividad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad = (CentroActividad)this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.centroactividad = (CentroActividad)this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(centroactividad!=null) {
						this.centroactividad = centroactividad;
					} else {
						this.centroactividad = new CentroActividad();
					}
				}

				if(this.isTienePermisosAutoriPago && this.permiteMantenimiento(this.centroactividad)) {
					AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup=new AutoriPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						autoripagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup;
					} else {
						autoripagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame;
					}

					List<CentroActividad> centroactividads=new ArrayList<CentroActividad>();
					centroactividads.add(this.centroactividad);
					if(!esRelacionado) {
						//autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setConGuardarRelaciones(false);
						//autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					autoripagoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCentroActividad.cargarAutoriPagoBeanSwingJInternalFrame(centroactividads,this.centroactividad,autoripagoBeanSwingJInternalFrame,/*conInicializar,*/autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getConGuardarRelaciones(),autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.getEsGuardarRelacionado());
					autoripagoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("no_relacionado");

						autoripagoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AutoriPagoConstantesFunciones.ITAMANIOFILATABLA + (AutoriPagoConstantesFunciones.ITAMANIOFILATABLA/2));

						autoripagoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCentroActividad=(TitledBorder)this.jScrollPanelDatosCentroActividad.getBorder();
						TitledBorder titledBorderAutoriPago=(TitledBorder)autoripagoBeanSwingJInternalFrame.jScrollPanelDatosAutoriPago.getBorder();

						titledBorderAutoriPago.setTitle(titledBorderCentroActividad.getTitle() + " -> Autori Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,autoripagoBeanSwingJInternalFrame);
						}

						autoripagoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(autoripagoBeanSwingJInternalFrame);

						autoripagoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.centroactividadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Autori Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCentroActividad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCentroActividad.setVisible((this.isVisibilidadCeldaNuevoCentroActividad && this.isPermisoNuevoCentroActividad));			
			this.jButtonDuplicarCentroActividad.setVisible((this.isVisibilidadCeldaDuplicarCentroActividad && this.isPermisoDuplicarCentroActividad));			
			this.jButtonCopiarCentroActividad.setVisible((this.isVisibilidadCeldaCopiarCentroActividad && this.isPermisoCopiarCentroActividad));
			this.jButtonVerFormCentroActividad.setVisible((this.isVisibilidadCeldaVerFormCentroActividad && this.isPermisoVerFormCentroActividad));
			
			this.jButtonAbrirOrderByCentroActividad.setVisible((this.isVisibilidadCeldaOrdenCentroActividad && this.isPermisoOrdenCentroActividad));			
			
			this.jButtonNuevoRelacionesCentroActividad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroActividad && this.isPermisoNuevoCentroActividad));			
			this.jButtonNuevoGuardarCambiosCentroActividad.setVisible((this.isVisibilidadCeldaNuevoCentroActividad && this.isPermisoNuevoCentroActividad && this.isPermisoGuardarCambiosCentroActividad));
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonModificarCentroActividad.setVisible((this.isVisibilidadCeldaModificarCentroActividad && this.isPermisoActualizarCentroActividad));	
			this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarCentroActividad.setVisible((this.isVisibilidadCeldaActualizarCentroActividad && this.isPermisoActualizarCentroActividad));	
			this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarCentroActividad.setVisible((this.isVisibilidadCeldaEliminarCentroActividad && this.isPermisoEliminarCentroActividad));
			this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarCentroActividad.setVisible(this.isVisibilidadCeldaCancelarCentroActividad);							
			this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCentroActividad && this.isPermisoGuardarCambiosCentroActividad));			
			
			}
						
			this.jButtonGuardarCambiosTablaCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroActividad && this.isPermisoGuardarCambiosCentroActividad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCentroActividad.setVisible((this.isVisibilidadCeldaNuevoCentroActividad && this.isPermisoNuevoCentroActividad));						
			this.jButtonDuplicarToolBarCentroActividad.setVisible((this.isVisibilidadCeldaDuplicarCentroActividad && this.isPermisoDuplicarCentroActividad));						
			this.jButtonCopiarToolBarCentroActividad.setVisible((this.isVisibilidadCeldaCopiarCentroActividad && this.isPermisoCopiarCentroActividad));			
			this.jButtonVerFormToolBarCentroActividad.setVisible((this.isVisibilidadCeldaVerFormCentroActividad && this.isPermisoVerFormCentroActividad));			
			this.jButtonAbrirOrderByToolBarCentroActividad.setVisible((this.isVisibilidadCeldaOrdenCentroActividad && this.isPermisoOrdenCentroActividad));
			this.jButtonNuevoRelacionesToolBarCentroActividad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroActividad && this.isPermisoNuevoCentroActividad));			
			this.jButtonNuevoGuardarCambiosToolBarCentroActividad.setVisible((this.isVisibilidadCeldaNuevoCentroActividad && this.isPermisoNuevoCentroActividad && this.isPermisoGuardarCambiosCentroActividad));			
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonModificarToolBarCentroActividad.setVisible((this.isVisibilidadCeldaModificarCentroActividad && this.isPermisoActualizarCentroActividad));	
			this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarToolBarCentroActividad.setVisible((this.isVisibilidadCeldaActualizarCentroActividad  && this.isPermisoActualizarCentroActividad));	
			this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarToolBarCentroActividad.setVisible((this.isVisibilidadCeldaEliminarCentroActividad && this.isPermisoEliminarCentroActividad));
			this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarToolBarCentroActividad.setVisible(this.isVisibilidadCeldaCancelarCentroActividad);				
			this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosToolBarCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCentroActividad && this.isPermisoGuardarCambiosCentroActividad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroActividad && this.isPermisoGuardarCambiosCentroActividad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCentroActividad.setVisible((this.isVisibilidadCeldaNuevoCentroActividad && this.isPermisoNuevoCentroActividad));			
			this.jMenuItemDuplicarCentroActividad.setVisible((this.isVisibilidadCeldaDuplicarCentroActividad && this.isPermisoDuplicarCentroActividad));			
			this.jMenuItemCopiarCentroActividad.setVisible((this.isVisibilidadCeldaCopiarCentroActividad && this.isPermisoCopiarCentroActividad));			
			this.jMenuItemVerFormCentroActividad.setVisible((this.isVisibilidadCeldaVerFormCentroActividad && this.isPermisoVerFormCentroActividad));			
			this.jMenuItemAbrirOrderByCentroActividad.setVisible((this.isVisibilidadCeldaOrdenCentroActividad && this.isPermisoOrdenCentroActividad));			
			//this.jMenuItemMostrarOcultarCentroActividad.setVisible((this.isVisibilidadCeldaOrdenCentroActividad && this.isPermisoOrdenCentroActividad));
			this.jMenuItemDetalleAbrirOrderByCentroActividad.setVisible((this.isVisibilidadCeldaOrdenCentroActividad && this.isPermisoOrdenCentroActividad));			
			//this.jMenuItemDetalleMostrarOcultarCentroActividad.setVisible((this.isVisibilidadCeldaOrdenCentroActividad && this.isPermisoOrdenCentroActividad));			
			this.jMenuItemNuevoRelacionesCentroActividad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroActividad && this.isPermisoNuevoCentroActividad));			
			this.jMenuItemNuevoGuardarCambiosCentroActividad.setVisible((this.isVisibilidadCeldaNuevoCentroActividad && this.isPermisoNuevoCentroActividad && this.isPermisoGuardarCambiosCentroActividad));									
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemModificarCentroActividad.setVisible((this.isVisibilidadCeldaModificarCentroActividad && this.isPermisoActualizarCentroActividad));	
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemActualizarCentroActividad.setVisible((this.isVisibilidadCeldaActualizarCentroActividad && this.isPermisoActualizarCentroActividad));	
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemEliminarCentroActividad.setVisible((this.isVisibilidadCeldaEliminarCentroActividad && this.isPermisoEliminarCentroActividad));
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemCancelarCentroActividad.setVisible(this.isVisibilidadCeldaCancelarCentroActividad);				
			}
			
			this.jMenuItemGuardarCambiosCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCentroActividad && this.isPermisoGuardarCambiosCentroActividad));						
			this.jMenuItemGuardarCambiosTablaCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroActividad && this.isPermisoGuardarCambiosCentroActividad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCentroActividad=this.jButtonNuevoCentroActividad.isVisible();
			this.isVisibilidadCeldaDuplicarCentroActividad=this.jButtonDuplicarCentroActividad.isVisible();
			this.isVisibilidadCeldaCopiarCentroActividad=this.jButtonCopiarCentroActividad.isVisible();
			this.isVisibilidadCeldaVerFormCentroActividad=this.jButtonVerFormCentroActividad.isVisible();
			
			this.isVisibilidadCeldaOrdenCentroActividad=this.jButtonAbrirOrderByCentroActividad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=this.jButtonNuevoRelacionesCentroActividad.isVisible();
			this.isVisibilidadCeldaModificarCentroActividad=this.jButtonModificarCentroActividad.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.isVisibilidadCeldaActualizarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarCentroActividad.isVisible();
			this.isVisibilidadCeldaEliminarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarCentroActividad.isVisible();
			this.isVisibilidadCeldaCancelarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarCentroActividad.isVisible();
			this.isVisibilidadCeldaGuardarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=this.jButtonGuardarCambiosTablaCentroActividad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCentroActividad=this.jButtonNuevoToolBarCentroActividad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=this.jButtonNuevoRelacionesToolBarCentroActividad.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.isVisibilidadCeldaModificarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonModificarToolBarCentroActividad.isVisible();
			this.isVisibilidadCeldaActualizarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarToolBarCentroActividad.isVisible();
			this.isVisibilidadCeldaEliminarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarToolBarCentroActividad.isVisible();
			this.isVisibilidadCeldaCancelarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarToolBarCentroActividad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroActividad=this.jButtonGuardarCambiosToolBarCentroActividad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=this.jButtonGuardarCambiosTablaToolBarCentroActividad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCentroActividad=this.jMenuItemNuevoCentroActividad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=this.jMenuItemNuevoRelacionesCentroActividad.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.isVisibilidadCeldaModificarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jMenuItemModificarCentroActividad.isVisible();
			this.isVisibilidadCeldaActualizarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jMenuItemActualizarCentroActividad.isVisible();
			this.isVisibilidadCeldaEliminarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jMenuItemEliminarCentroActividad.isVisible();
			this.isVisibilidadCeldaCancelarCentroActividad=this.jInternalFrameDetalleFormCentroActividad.jMenuItemCancelarCentroActividad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroActividad=this.jMenuItemGuardarCambiosCentroActividad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=this.jMenuItemGuardarCambiosTablaCentroActividad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCentroActividad(Boolean esInicializar) {
		if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
				//if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCentroActividad();
			}
			
			this.inicializarActualizarBindingBotonesManualCentroActividad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCentroActividad() {
		this.jButtonNuevoCentroActividad.setVisible(this.isPermisoNuevoCentroActividad);			
		this.jButtonDuplicarCentroActividad.setVisible(this.isPermisoDuplicarCentroActividad);			
		this.jButtonCopiarCentroActividad.setVisible(this.isPermisoCopiarCentroActividad);			
		this.jButtonVerFormCentroActividad.setVisible(this.isPermisoVerFormCentroActividad);			
		
		this.jButtonAbrirOrderByCentroActividad.setVisible(this.isPermisoOrdenCentroActividad);					
		
		this.jButtonNuevoRelacionesCentroActividad.setVisible(this.isPermisoNuevoCentroActividad);			
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonModificarCentroActividad.setVisible(this.isPermisoActualizarCentroActividad);	
			this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarCentroActividad.setVisible(this.isPermisoActualizarCentroActividad);	
			this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarCentroActividad.setVisible(this.isPermisoEliminarCentroActividad);
			this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarCentroActividad.setVisible(this.isVisibilidadCeldaCancelarCentroActividad);						
			this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.setVisible(this.isPermisoGuardarCambiosCentroActividad);							
		}
		
		this.jButtonGuardarCambiosTablaCentroActividad.setVisible(this.isPermisoActualizarCentroActividad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroActividad() {
		this.jInternalFrameDetalleFormCentroActividad.jButtonModificarCentroActividad.setVisible(this.isPermisoActualizarCentroActividad);	
		this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarCentroActividad.setVisible(this.isPermisoActualizarCentroActividad);	
		this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarCentroActividad.setVisible(this.isPermisoEliminarCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarCentroActividad.setVisible(this.isVisibilidadCeldaCancelarCentroActividad);							
		this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.setVisible((this.isVisibilidadCeldaGuardarCentroActividad && this.isPermisoGuardarCambiosCentroActividad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCentroActividad() {
		if(CentroActividadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCentroActividad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCentroActividad() {
	}
	
	public void jTableDatosCentroActividadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCentroActividad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.centroactividad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCentroActividadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCentroActividad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroActividad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroActividad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.centroactividadLogic.getConnexion());

				if(this.centroactividad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.centroactividad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroActividad=(TitledBorder)this.jScrollPanelDatosCentroActividad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCentroActividad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.centroactividad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.centroactividad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.centroactividad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoCentroActividadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebCentroActividad(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroActividad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroActividad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.centroactividadLogic.getConnexion());

				if(this.centroactividad.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.centroactividad.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroActividad=(TitledBorder)this.jScrollPanelDatosCentroActividad.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderCentroActividad.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.centroactividad.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogrupoflujocaja=true;

			idTienePermisotipogrupoflujocaja=this.tienePermisosUsuarioEnPaginaWebCentroActividad(TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogrupoflujocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroActividad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroActividad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);

				this.tipogrupoflujocajaBeanSwingJInternalFrame=new TipoGrupoFlujoCajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogrupoflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogrupoflujocajaBeanSwingJInternalFrame.getTipoGrupoFlujoCajaLogic().setConnexion(this.centroactividadLogic.getConnexion());

				if(this.centroactividad.getid_tipo_grupo_flujo_caja()!=null) {
					this.tipogrupoflujocajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogrupoflujocajaBeanSwingJInternalFrame.setIdActual(this.centroactividad.getid_tipo_grupo_flujo_caja());
					this.tipogrupoflujocajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogrupoflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogrupoflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGrupoFlujoCaja();
				}

				JInternalFrameBase jinternalFrame =this.tipogrupoflujocajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroActividad=(TitledBorder)this.jScrollPanelDatosCentroActividad.getBorder();
				TitledBorder titledBordertipogrupoflujocaja=(TitledBorder)this.tipogrupoflujocajaBeanSwingJInternalFrame.jScrollPanelDatosTipoGrupoFlujoCaja.getBorder();

				titledBordertipogrupoflujocaja.setTitle(titledBorderCentroActividad.getTitle() + " -> Tipo Grupo Flujo Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_grupo_flujo_cajaCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getid_tipo_grupo_flujo_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_grupo_flujo_caja = "+this.centroactividad.getid_tipo_grupo_flujo_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonconsolidadoCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getconsolidado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where consolidado = "+this.centroactividad.getconsolidado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_proyectoCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getcon_proyecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_proyecto = "+this.centroactividad.getcon_proyecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionCentroActividadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.getcentroactividad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centroactividad==null) {
						this.centroactividad = new CentroActividad();
					}

					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);
				}

				if(this.centroactividad.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.centroactividad.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroActividad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoCentroActividadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroActividad(false,false);

			this.getCentroActividadsBusquedaPorCodigo();

			this.inicializarActualizarBindingCentroActividad(false);

			//if(CentroActividadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroActividad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreCentroActividadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroActividad(false,false);

			this.getCentroActividadsBusquedaPorNombre();

			this.inicializarActualizarBindingCentroActividad(false);

			//if(CentroActividadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroActividad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCentroActividadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroActividad(false,false);

			this.getCentroActividadsFK_IdEmpresa();

			this.inicializarActualizarBindingCentroActividad(false);

			//if(CentroActividadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroActividad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGrupoFlujoCajaCentroActividadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroActividad(false,false);

			this.getCentroActividadsFK_IdTipoGrupoFlujoCaja();

			this.inicializarActualizarBindingCentroActividad(false);

			//if(CentroActividadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroActividad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoCentroActividadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroActividad(false,false);

			this.getCentroActividadsFK_IdTipoMovimiento();

			this.inicializarActualizarBindingCentroActividad(false);

			//if(CentroActividadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroActividad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centroactividadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCentroActividad() {
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
		

		if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
			this.jInternalFrameDetalleFormCentroActividad.setVisible(false);	    			
			this.jInternalFrameDetalleFormCentroActividad.dispose();
			this.jInternalFrameDetalleFormCentroActividad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
			this.jInternalFrameReporteDinamicoCentroActividad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCentroActividad.dispose();
			this.jInternalFrameReporteDinamicoCentroActividad=null;
		}
		
		if(this.jInternalFrameImportacionCentroActividad!=null) {
			this.jInternalFrameImportacionCentroActividad.setVisible(false);	    			
			this.jInternalFrameImportacionCentroActividad.dispose();
			this.jInternalFrameImportacionCentroActividad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCentroActividad();
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			
			if(sTipo.equals("NuevoCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCentroActividad")) {
				jButtonDuplicarCentroActividadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCentroActividad")) {
				jButtonCopiarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("VerFormCentroActividad")) {
				jButtonVerFormCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCentroActividad")) {
				jButtonDuplicarCentroActividadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCentroActividad")) {
				jButtonDuplicarCentroActividadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCentroActividad")) {
				jButtonModificarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCentroActividad")) {
				jButtonModificarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCentroActividad")) {
				jButtonModificarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCentroActividad")) {
				jButtonActualizarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCentroActividad")) {
				jButtonActualizarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCentroActividad")) {
				jButtonActualizarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("EliminarCentroActividad")) {
				jButtonEliminarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCentroActividad")) {
				jButtonEliminarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCentroActividad")) {
				jButtonEliminarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("CancelarCentroActividad")) {
				jButtonCancelarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCentroActividad")) {
				jButtonCancelarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCentroActividad")) {
				jButtonCancelarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("CerrarCentroActividad")) {
				jButtonCerrarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCentroActividad")) {
				jButtonCerrarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCentroActividad")) {
				jButtonCerrarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCentroActividad")) {
				jButtonMostrarOcultarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCentroActividad")) {
				jButtonCancelarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCentroActividad")) {
				jButtonCopiarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCentroActividad")) {
				jButtonVerFormCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCentroActividad")) {
				jButtonCopiarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCentroActividad")) {
				jButtonVerFormCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCentroActividad")) {
				jButtonRecargarInformacionCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCentroActividad")) {
				jButtonRecargarInformacionCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCentroActividad")) {
				jButtonRecargarInformacionCentroActividadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCentroActividad")) {
				jButtonAnterioresCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCentroActividad")) {
				jButtonAnterioresCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCentroActividad")) {
				jButtonAnterioresCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCentroActividad")) {
				jButtonSiguientesCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCentroActividad")) {
				jButtonSiguientesCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCentroActividad")) {
				jButtonSiguientesCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCentroActividad") || sTipo.equals("MenuItemDetalleAbrirOrderByCentroActividad")) {
				jButtonAbrirOrderByCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCentroActividad") || sTipo.equals("MenuItemDetalleMostrarOcultarCentroActividad")) {
				jButtonMostrarOcultarCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCentroActividad")) {
				jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCentroActividad")) {
				jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCentroActividad")) {
				jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCentroActividad")) {
				jButtonCerrarReporteDinamicoCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCentroActividad")) {
				jButtonGenerarReporteDinamicoCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCentroActividad")) {
				
				jButtonGenerarExcelReporteDinamicoCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCentroActividad")) {
				jButtonCerrarImportacionCentroActividadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCentroActividad")) {
				
				jButtonGenerarImportacionCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCentroActividad")) {
				
				jButtonAbrirImportacionCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCentroActividad")) {
				jComboBoxTiposAccionesCentroActividadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCentroActividad")) {
				jComboBoxTiposRelacionesCentroActividadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCentroActividad")) {
				jComboBoxTiposAccionesCentroActividadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCentroActividad")) {
				
				jComboBoxTiposSeleccionarCentroActividadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCentroActividad")) {
				jTextFieldValorCampoGeneralCentroActividadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCentroActividad")) {
				jButtonAbrirOrderByCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCentroActividad")) {
				jButtonAbrirOrderByCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCentroActividad")) {
				jButtonCerrarOrderByCentroActividadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroActividadBusqueda")) {
				this.jButtonidCentroActividadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroActividadUpdate")) {
				this.jButtonid_empresaCentroActividadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroActividadBusqueda")) {
				this.jButtonid_empresaCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCentroActividadBusqueda")) {
				this.jButtoncodigoCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCentroActividadBusqueda")) {
				this.jButtonnombreCentroActividadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoCentroActividadUpdate")) {
				this.jButtonid_tipo_movimientoCentroActividadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoCentroActividadBusqueda")) {
				this.jButtonid_tipo_movimientoCentroActividadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaCentroActividadUpdate")) {
				this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaCentroActividadBusqueda")) {
				this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("consolidadoCentroActividadBusqueda")) {
				this.jButtonconsolidadoCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_proyectoCentroActividadBusqueda")) {
				this.jButtoncon_proyectoCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionCentroActividadBusqueda")) {
				this.jButtonobservacionCentroActividadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoCentroActividad")) {
				this.jButtonBusquedaPorCodigoCentroActividadActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreCentroActividad")) {
				this.jButtonBusquedaPorNombreCentroActividadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGrupoFlujoCajaCentroActividad")) {
				this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMovimientoCentroActividad")) {
				this.jButtonFK_IdTipoMovimientoCentroActividadActionPerformed(evt);
			}
			
			;
			
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCentroActividad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CentroActividad centroactividadLocal=null;
			
			if(!this.getEsControlTabla()) {
				centroactividadLocal=this.centroactividad;
			} else {
				centroactividadLocal=this.centroactividadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
							
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
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
			
			


			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
								
						
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
								
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
							
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
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
			
			


			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
								
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCentroActividad")) {
					jCheckBoxSeleccionarTodosCentroActividadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCentroActividad")) {
					jCheckBoxSeleccionadosCentroActividadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCentroActividad")) {
					
				}
				
				


				
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
												
				
				


				
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
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
			
			


			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroActividadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centroactividad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centroactividad);
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
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
				
				


				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroActividad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroActividad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroActividadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centroactividadAnterior =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCentroActividad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCentroActividadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCentroActividad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.centroactividad =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.centroactividad =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.centroactividad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCentroActividad")) {
				
				}
				
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCentroActividad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCentroActividad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCentroActividad")) {
			
			}
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCentroActividad();
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			if(sTipo.equals("NuevoCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCentroActividad")) {
				jButtonDuplicarCentroActividadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCentroActividad")) {
				jButtonCopiarCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCentroActividad")) {
				jButtonVerFormCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCentroActividad")) {
				jButtonNuevoCentroActividadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCentroActividad")) {
				jButtonModificarCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCentroActividad")) {
				jButtonActualizarCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCentroActividad")) {
				jButtonEliminarCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCentroActividad")) {
				jButtonCancelarCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCentroActividad")) {
				jButtonCerrarCentroActividadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCentroActividad")) {
				jButtonGuardarCambiosCentroActividadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCentroActividad")) {
				jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCentroActividad")) {
				jButtonAbrirOrderByCentroActividadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCentroActividad")) {
				jButtonRecargarInformacionCentroActividadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCentroActividad")) {
				jButtonAnterioresCentroActividadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCentroActividad")) {
				jButtonSiguientesCentroActividadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroActividadBusqueda")) {
				this.jButtonidCentroActividadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroActividadUpdate")) {
				this.jButtonid_empresaCentroActividadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroActividadBusqueda")) {
				this.jButtonid_empresaCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCentroActividadBusqueda")) {
				this.jButtoncodigoCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCentroActividadBusqueda")) {
				this.jButtonnombreCentroActividadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoCentroActividadUpdate")) {
				this.jButtonid_tipo_movimientoCentroActividadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoCentroActividadBusqueda")) {
				this.jButtonid_tipo_movimientoCentroActividadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaCentroActividadUpdate")) {
				this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaCentroActividadBusqueda")) {
				this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("consolidadoCentroActividadBusqueda")) {
				this.jButtonconsolidadoCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_proyectoCentroActividadBusqueda")) {
				this.jButtoncon_proyectoCentroActividadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionCentroActividadBusqueda")) {
				this.jButtonobservacionCentroActividadBusquedaActionPerformed(evt);
			}
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCentroActividad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCentroActividad")) {
				closingInternalFrameCentroActividad();
				
			} else if(sTipo.equals("jButtonCancelarCentroActividad")) {
				JInternalFrameBase jInternalFrameDetalleFormCentroActividad = (JInternalFrameBase)evt.getSource();
	            	
	            CentroActividadBeanSwingJInternalFrame jInternalFrameParent=(CentroActividadBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroActividad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCentroActividadActionPerformed(null);
			}
			
			CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centroactividad,new Object(),this.centroactividadParameterGeneral,this.centroactividadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCentroActividad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCentroActividad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCentroActividad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.centroactividad)) {
			if(!esControlTabla) {
				if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);			
				}
				
				if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCentroActividad(this.centroactividad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centroactividadReturnGeneral=centroactividadLogic.procesarEventosCentroActividadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centroactividadLogic.getCentroActividads(),this.centroactividad,this.centroactividadParameterGeneral,this.isEsNuevoCentroActividad,classes);//this.centroactividadLogic.getCentroActividad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCentroActividad(this.centroactividadReturnGeneral,this.centroactividadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCentroActividad(classes,this.centroactividadReturnGeneral,this.centroactividadBean,false);
					}
						
					if(this.centroactividadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCentroActividad(this.centroactividadReturnGeneral.getCentroActividad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCentroActividad(this.centroactividadReturnGeneral.getCentroActividad());	
					}
						
					if(this.centroactividadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCentroActividad(this.centroactividadReturnGeneral.getCentroActividad(),classes);//this.centroactividadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCentroActividad(this.centroactividad,classes);//this.centroactividadBean);									
				}
			
				if(CentroActividadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCentroActividad(this.centroactividad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroActividad(this.centroactividad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.centroactividadAnterior!=null) {
						this.centroactividad=this.centroactividadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centroactividadReturnGeneral=centroactividadLogic.procesarEventosCentroActividadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centroactividadLogic.getCentroActividads(),this.centroactividad,this.centroactividadParameterGeneral,this.isEsNuevoCentroActividad,classes);//this.centroactividadLogic.getCentroActividad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centroactividadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centroactividadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.centroactividadReturnGeneral.getCentroActividad(),centroactividadLogic.getCentroActividads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.centroactividadReturnGeneral.getCentroActividad(),this.centroactividads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCentroActividad.repaint();
				
				//((AbstractTableModel) this.jTableDatosCentroActividad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCentroActividad();
			}
		}
	}
	
	public void actualizarVisualTableDatosCentroActividad() throws Exception {
		
		CentroActividadModel centroactividadModel=(CentroActividadModel)this.jTableDatosCentroActividad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centroactividadModel.centroactividads=this.centroactividadLogic.getCentroActividads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			centroactividadModel.centroactividads=this.centroactividads;
		}
		
		
		((CentroActividadModel) this.jTableDatosCentroActividad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCentroActividad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcentroactividadAnterior(),this.centroactividadLogic.getCentroActividads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcentroactividadAnterior(),this.centroactividads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCentroActividad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCentroActividad(CentroActividad centroactividad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PagoAuto.class)) {
					this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(centroactividad.getPagoAutos());
					this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(centroactividad.getClientes());
					this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriPago.class)) {
					this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(centroactividad.getAutoriPagos());
					this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
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
										
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centroactividad,new Object(),generalEntityParameterGeneral,this.centroactividadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CentroActividadConstantesFunciones.getClassesRelationshipsOfCentroActividad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CentroActividadConstantesFunciones.getClassesRelationshipsFromStringsOfCentroActividad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCentroActividad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CentroActividadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centroactividad,new Object(),generalEntityParameterGeneral,this.centroactividadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCentroActividad(CentroActividadBean centroactividadBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PagoAuto.class)) {
					this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(centroactividad.getPagoAutos());
					this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(centroactividad.getClientes());
					this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriPago.class)) {
					this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.setAutoriPagos(centroactividad.getAutoriPagos());
					this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCentroActividad(ArrayList<Classe> classes,CentroActividadReturnGeneral centroactividadReturnGeneral,CentroActividadBean centroactividadBean,Boolean conDefault) throws Exception {
		
			this.centroactividadBean.setPagoAutos(centroactividadReturnGeneral.getCentroActividad().getPagoAutos());
			this.centroactividadBean.setClientes(centroactividadReturnGeneral.getCentroActividad().getClientes());
			this.centroactividadBean.setAutoriPagos(centroactividadReturnGeneral.getCentroActividad().getAutoriPagos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCentroActividad(CentroActividad centroactividad,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PagoAuto.class)) {
					centroactividad.setPagoAutos(this.jInternalFrameDetalleFormCentroActividad.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					centroactividad.setClientes(this.jInternalFrameDetalleFormCentroActividad.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriPago.class)) {
					centroactividad.setAutoriPagos(this.jInternalFrameDetalleFormCentroActividad.autoripagoBeanSwingJInternalFrame.autoripagoLogic.getAutoriPagos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.centroactividad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCentroActividad = new CentroActividadDetalleFormJInternalFrame(jDesktopPane,this.centroactividadSessionBean.getConGuardarRelaciones(),this.centroactividadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.setVisible(false);
		this.jInternalFrameDetalleFormCentroActividad.setSelected(false);						
		
		this.jInternalFrameDetalleFormCentroActividad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCentroActividad.centroactividadLogic=this.centroactividadLogic;
		
		this.cargarCombosFrameForeignKeyCentroActividad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroActividad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroActividad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCentroActividad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCentroActividad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCentroActividad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroActividad"));
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonModificarCentroActividad.addActionListener(new ButtonActionListener(this,"ModificarCentroActividad"));

		
		this.jInternalFrameDetalleFormCentroActividad.jButtonModificarToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroActividad"));
					
		this.jInternalFrameDetalleFormCentroActividad.jMenuItemModificarCentroActividad.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroActividad"));		
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarCentroActividad.addActionListener (new ButtonActionListener(this,"ActualizarCentroActividad"));
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroActividad"));
						
		this.jInternalFrameDetalleFormCentroActividad.jMenuItemActualizarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroActividad"));		
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarCentroActividad.addActionListener (new ButtonActionListener(this,"EliminarCentroActividad"));
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroActividad"));
								
		this.jInternalFrameDetalleFormCentroActividad.jMenuItemEliminarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroActividad"));		
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarCentroActividad.addActionListener (new ButtonActionListener(this,"CancelarCentroActividad"));
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroActividad"));
					
		this.jInternalFrameDetalleFormCentroActividad.jMenuItemCancelarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroActividad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jMenuItemDetalleCerrarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroActividad"));		
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroActividad"));
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroActividad"));
		
		
		
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroActividad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonidCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"idCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_empresaCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_empresaCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtoncodigoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonnombreCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_movimientoCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_movimientoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonconsolidadoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"consolidadoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtoncon_proyectoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"con_proyectoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonobservacionCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"observacionCentroActividadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroActividad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCentroActividad"));
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroActividad"));
		}
		
		this.jTableDatosCentroActividad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCentroActividad"));
		
		this.jTableDatosCentroActividad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCentroActividad"));
		
		this.jButtonNuevoCentroActividad.addActionListener(new ButtonActionListener(this,"NuevoCentroActividad"));
		
		this.jButtonDuplicarCentroActividad.addActionListener(new ButtonActionListener(this,"DuplicarCentroActividad"));
		
		this.jButtonCopiarCentroActividad.addActionListener(new ButtonActionListener(this,"CopiarCentroActividad"));
		
		this.jButtonVerFormCentroActividad.addActionListener(new ButtonActionListener(this,"VerFormCentroActividad"));
		
		
		this.jButtonNuevoToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"NuevoToolBarCentroActividad"));
			
		this.jButtonDuplicarToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCentroActividad"));
			
		this.jMenuItemNuevoCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCentroActividad"));
			
		this.jMenuItemDuplicarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCentroActividad"));		
		
		
		this.jButtonNuevoRelacionesCentroActividad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCentroActividad"));
		
		
		this.jButtonNuevoRelacionesToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCentroActividad"));
			
		this.jMenuItemNuevoRelacionesCentroActividad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCentroActividad"));		
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonModificarCentroActividad.addActionListener(new ButtonActionListener(this,"ModificarCentroActividad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonModificarToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroActividad"));
			
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemModificarCentroActividad.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroActividad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarCentroActividad.addActionListener (new ButtonActionListener(this,"ActualizarCentroActividad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonActualizarToolBarCentroActividad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroActividad"));
				
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemActualizarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroActividad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarCentroActividad.addActionListener (new ButtonActionListener(this,"EliminarCentroActividad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonEliminarToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroActividad"));
						
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemEliminarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroActividad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarCentroActividad.addActionListener (new ButtonActionListener(this,"CancelarCentroActividad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonCancelarToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroActividad"));
			
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemCancelarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroActividad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCentroActividad"));		
		
		
		this.jButtonCerrarCentroActividad.addActionListener (new ButtonActionListener(this,"CerrarCentroActividad"));
		
		
		this.jButtonCerrarToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"CerrarToolBarCentroActividad"));
			
		this.jMenuItemCerrarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCentroActividad"));
			
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jMenuItemDetalleCerrarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroActividad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosCentroActividad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroActividad"));
		}
		
		this.jButtonCopiarToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"CopiarToolBarCentroActividad"));
			
		this.jButtonVerFormToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"VerFormToolBarCentroActividad"));
		
		this.jMenuItemGuardarCambiosCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCentroActividad"));
			
		this.jMenuItemCopiarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCentroActividad"));		
		
		this.jMenuItemVerFormCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCentroActividad"));		
		
		
		this.jButtonGuardarCambiosTablaCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroActividad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCentroActividad"));
			
		this.jMenuItemGuardarCambiosTablaCentroActividad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroActividad"));		
		
		
		
		this.jButtonRecargarInformacionCentroActividad.addActionListener (new ButtonActionListener(this,"RecargarInformacionCentroActividad"));
					
		this.jButtonRecargarInformacionToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCentroActividad"));
		
		this.jMenuItemRecargarInformacionCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCentroActividad"));		
		
		
		
		this.jButtonAnterioresCentroActividad.addActionListener (new ButtonActionListener(this,"AnterioresCentroActividad"));
		
		
		this.jButtonAnterioresToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCentroActividad"));
		
		this.jMenuItemAnterioresCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCentroActividad"));		
		
		
		this.jButtonSiguientesCentroActividad.addActionListener (new ButtonActionListener(this,"SiguientesCentroActividad"));
		
		
		this.jButtonSiguientesToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCentroActividad"));
			
		this.jMenuItemSiguientesCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCentroActividad"));
			
		this.jMenuItemAbrirOrderByCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCentroActividad"));
			
		this.jMenuItemMostrarOcultarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCentroActividad"));
			
		this.jMenuItemDetalleAbrirOrderByCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCentroActividad"));
			
		this.jMenuItemDetalleMostarOcultarCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCentroActividad"));		
		
		
		this.jButtonNuevoGuardarCambiosCentroActividad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCentroActividad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCentroActividad"));
			
		this.jMenuItemNuevoGuardarCambiosCentroActividad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCentroActividad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCentroActividad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCentroActividad"));

		this.jCheckBoxSeleccionadosCentroActividad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCentroActividad"));
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroActividad"));
		}
		
		
		this.jComboBoxTiposRelacionesCentroActividad.addActionListener (new ButtonActionListener(this,"TiposRelacionesCentroActividad"));
			
		this.jComboBoxTiposAccionesCentroActividad.addActionListener (new ButtonActionListener(this,"TiposAccionesCentroActividad"));
					
		this.jComboBoxTiposSeleccionarCentroActividad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCentroActividad"));
			
		this.jTextFieldValorCampoGeneralCentroActividad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCentroActividad"));		
		
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonidCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"idCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_empresaCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_empresaCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtoncodigoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonnombreCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_movimientoCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_movimientoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonconsolidadoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"consolidadoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtoncon_proyectoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"con_proyectoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonobservacionCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"observacionCentroActividadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoCentroActividad.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoCentroActividad"));

			this.jButtonBusquedaPorNombreCentroActividad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCentroActividad"));

			this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad.addActionListener(new ButtonActionListener(this,"FK_IdTipoGrupoFlujoCajaCentroActividad"));

			this.jButtonFK_IdTipoMovimientoCentroActividad.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoCentroActividad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCentroActividad!=null) {
				this.jInternalFrameReporteDinamicoCentroActividad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroActividad"));
				this.jInternalFrameReporteDinamicoCentroActividad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroActividad"));
				this.jInternalFrameReporteDinamicoCentroActividad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroActividad"));
			}
			
			//this.jButtonCerrarReporteDinamicoCentroActividad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroActividad"));				
			//this.jButtonGenerarReporteDinamicoCentroActividad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroActividad"));
			//this.jButtonGenerarExcelReporteDinamicoCentroActividad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroActividad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCentroActividad!=null) {
				this.jInternalFrameImportacionCentroActividad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroActividad"));
				this.jInternalFrameImportacionCentroActividad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroActividad"));
				this.jInternalFrameImportacionCentroActividad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroActividad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCentroActividad.addActionListener (new ButtonActionListener(this,"AbrirOrderByCentroActividad"));
			
			this.jButtonAbrirOrderByToolBarCentroActividad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCentroActividad"));			
			
			if(this.jInternalFrameOrderByCentroActividad!=null) {
				this.jInternalFrameOrderByCentroActividad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroActividad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCentroActividad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroActividad.jTabbedPaneRelacionesCentroActividad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroActividad"));
		
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
            		closingInternalFrameCentroActividad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCentroActividad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCentroActividad = (JInternalFrameBase)event.getSource();
	            	
	            CentroActividadBeanSwingJInternalFrame jInternalFrameParent=(CentroActividadBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroActividad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCentroActividadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCentroActividad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCentroActividadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCentroActividad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCentroActividad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroActividadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroActividadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroActividadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCentroActividad";
		inputMap = this.jButtonNuevoCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroActividadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroActividadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroActividadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroActividadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCentroActividad";
		inputMap = this.jButtonNuevoRelacionesCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroActividadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCentroActividad";
		inputMap = this.jButtonModificarCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCentroActividadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCentroActividad";
		inputMap = this.jButtonActualizarCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCentroActividadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCentroActividad";
		inputMap = this.jButtonEliminarCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCentroActividadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCentroActividad";
		inputMap = this.jButtonCancelarCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCentroActividadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCentroActividad";
		inputMap = this.jButtonCerrarCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCentroActividadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCentroActividad";
		inputMap = this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCentroActividad.jButtonGuardarCambiosCentroActividad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCentroActividadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCentroActividad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCentroActividadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCentroActividad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCentroActividadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCentroActividad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCentroActividadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCentroActividad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCentroActividadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonidCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"idCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_empresaCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_empresaCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtoncodigoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonnombreCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_movimientoCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_movimientoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoCentroActividadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaCentroActividadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonconsolidadoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"consolidadoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtoncon_proyectoCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"con_proyectoCentroActividadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroActividad.jButtonobservacionCentroActividadBusqueda.addActionListener(new ButtonActionListener(this,"observacionCentroActividadBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoCentroActividad.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoCentroActividad"));

		this.jButtonBusquedaPorNombreCentroActividad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCentroActividad"));

		this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad.addActionListener(new ButtonActionListener(this,"FK_IdTipoGrupoFlujoCajaCentroActividad"));

		this.jButtonFK_IdTipoMovimientoCentroActividad.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoCentroActividad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCentroActividad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCentroActividadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCentroActividadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCentroActividad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCentroActividad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
					centroactividadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroActividad centroactividadAux:centroactividads) {
					centroactividadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCentroActividadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroActividad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
						centroactividadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroActividad centroactividadAux:centroactividads) {
						centroactividadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
					
						if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO)) {
							existe=true;
							centroactividadAux.setconsolidado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CONPROYECTO)) {
							existe=true;
							centroactividadAux.setcon_proyecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroActividad centroactividadAux:centroactividads) {
						
						if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO)) {
							existe=true;
							centroactividadAux.setconsolidado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CONPROYECTO)) {
							existe=true;
							centroactividadAux.setcon_proyecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCentroActividad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroActividad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroActividad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCentroActividadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroActividad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCentroActividad.getSelectedRows();
			
			CentroActividad centroactividadLocal=new CentroActividad();
			
			//this.seleccionarTodosCentroActividad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLocal =(CentroActividad) this.centroactividadLogic.getCentroActividads().toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					centroactividadLocal =(CentroActividad) this.centroactividads.toArray()[this.jTableDatosCentroActividad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				centroactividadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
						centroactividadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroActividad centroactividadAux:centroactividads) {
						centroactividadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCentroActividad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroActividad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroActividad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroActividad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCentroActividadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCentroActividadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCentroActividadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCentroActividad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCentroActividad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroActividad centroactividadAux:this.centroactividadLogic.getCentroActividads()) {
				
						if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							centroactividadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							centroactividadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							centroactividadAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroActividad centroactividadAux:centroactividads) {
					
						if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							centroactividadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							centroactividadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							centroactividadAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCentroActividad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCentroActividadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCentroActividad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCentroActividad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCentroActividad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCentroActividad) {				
					conSplash=true;//false;										
					
					//this.startProcessCentroActividad(conSplash);
				
					this.generarReporteCentroActividadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCentroActividadsSeleccionados();
				//this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroActividadsSeleccionados(false);
				//this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroActividadsSeleccionados(true);
				//this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroActividad();
				
				this.exportarCentroActividadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCentroActividads();
				//this.importarCentroActividads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroActividad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCentroActividadsSeleccionados();
				//this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Centro Actividad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCentroActividad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCentroActividad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCentroActividad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
				}	
			} 			
			else if(CentroActividadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCentroActividad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCentroActividad(conSplash);
					
						//this.actualizarParametrosGeneralCentroActividad();
						
						this.generarReporteProcesoAccionCentroActividadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CentroActividadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Centro ActividadES SELECCIONADOS?", "MANTENIMIENTO DE Centro Actividad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCentroActividad();
				
						this.actualizarParametrosGeneralCentroActividad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.centroactividadReturnGeneral=centroactividadLogic.procesarAccionCentroActividadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.centroactividadLogic.getCentroActividads(),this.centroactividadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCentroActividadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCentroActividad();
					
					CentroActividadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCentroActividadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroActividad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroActividad.jComboBoxTiposAccionesFormularioCentroActividad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCentroActividad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCentroActividadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCentroActividad();
			
			if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
			CentroActividad centroactividad=new CentroActividad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCentroActividad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCentroActividad.getSelectedItem();
			
			
			
			
			centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(centroactividadsSeleccionados.size()==1) {
				for(CentroActividad centroactividadAux:centroactividadsSeleccionados) {
					centroactividad=centroactividadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pago Auto")) {
					jButtonPagoAutoActionPerformed(null,rowIndex,true,false,centroactividad);
				}
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,centroactividad);
				}
				else if(this.sTipoRelacion.equals("Autori Pago")) {
					jButtonAutoriPagoActionPerformed(null,rowIndex,true,false,centroactividad);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCentroActividad();
			
      		//this.finishProcessCentroActividad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCentroActividadReturnGeneral() throws Exception {
		if(this.centroactividadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.centroactividadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.centroactividadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.centroactividadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.centroactividadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.centroactividadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCentroActividad(false);
		}
		
		if(this.centroactividadReturnGeneral.getConRetornoLista() || this.centroactividadReturnGeneral.getConRetornoObjeto()) {
			if(this.centroactividadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centroactividadLogic.setCentroActividads(this.centroactividadReturnGeneral.getCentroActividads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.centroactividadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centroactividadLogic.setCentroActividad(this.centroactividadReturnGeneral.getCentroActividad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCentroActividad(false);
		}
	}
	
	public void actualizarParametrosGeneralCentroActividad() throws Exception {
		
		
	}
	
	public ArrayList<CentroActividad> getCentroActividadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCentroActividad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CentroActividad centroactividadAux:centroactividadLogic.getCentroActividads()) {
					if(centroactividadAux.getIsSelected()) {
						centroactividadsSeleccionados.add(centroactividadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroActividad centroactividadAux:this.centroactividads) {
					if(centroactividadAux.getIsSelected()) {
						centroactividadsSeleccionados.add(centroactividadAux);				
					}
				}
			}
			
			if(centroactividadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						centroactividadsSeleccionados.addAll(this.centroactividadLogic.getCentroActividads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						centroactividadsSeleccionados.addAll(this.centroactividads);				
					}
				}
			}
		} else {
			centroactividadsSeleccionados.add(this.centroactividad);
		}
		
		return centroactividadsSeleccionados;
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
	
	public void generarReporteCentroActividadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCentroActividadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCentroActividadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroActividadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroActividadsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCentroActividadsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Centro Actividad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCentroActividadsSeleccionados() throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados);
		
	}	
	
	public void generarReporteNormalCentroActividadsSeleccionados() throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCentroActividadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCentroActividadsSeleccionados() throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCentroActividad();
		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCentroActividad();
		
		
		//this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados ,centroactividadImplementable,centroactividadImplementableHome);
	}
	
	public void mostrarImportacionCentroActividads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCentroActividad();
		
		this.abrirFrameImportacionCentroActividad();		
		
			
		//this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados ,centroactividadImplementable,centroactividadImplementableHome);
	}
	
	public void importarCentroActividads() throws Exception {		
	
	}
	
	public void exportarCentroActividadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCentroActividadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCentroActividadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCentroActividadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Centro Actividad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCentroActividadsSeleccionados() throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCentroActividad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CentroActividad centroactividadAux:centroactividadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCentroActividad(centroactividadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//centroactividadAux.setsDetalleGeneralEntityReporte(centroactividadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCentroActividad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_CONSOLIDADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_CONPROYECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroActividadConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCentroActividad(CentroActividad centroactividad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=centroactividad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.gettipogrupoflujocaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getconsolidado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getcon_proyecto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centroactividad.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCentroActividadsSeleccionados() throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CentroActividads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCentroActividad(row);				
				iRow++;
			}				
			
			for(CentroActividad centroactividadAux:centroactividadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCentroActividad(centroactividadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCentroActividadsSeleccionados() throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();		
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centroactividad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("centroactividads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("centroactividad");
			//elementRoot.appendChild(element);
		
			for(CentroActividad centroactividadAux:centroactividadsSeleccionados) {
				element = document.createElement("centroactividad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCentroActividad(centroactividadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Actividad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCentroActividad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_CONPROYECTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroActividadConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCentroActividad(CentroActividad centroactividad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.gettipogrupoflujocaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getconsolidado());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getcon_proyecto());
		cell = row.createCell(iColumn++);cell.setCellValue(centroactividad.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlCentroActividad(CentroActividad centroactividad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CentroActividadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(centroactividad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CentroActividadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(centroactividad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CentroActividadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(centroactividad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(CentroActividadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(centroactividad.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CentroActividadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(centroactividad.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipomovimiento_descripcion = document.createElement(CentroActividadConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(centroactividad.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementtipogrupoflujocaja_descripcion = document.createElement(CentroActividadConstantesFunciones.IDTIPOGRUPOFLUJOCAJA);
		elementtipogrupoflujocaja_descripcion.appendChild(document.createTextNode(centroactividad.gettipogrupoflujocaja_descripcion()));
		element.appendChild(elementtipogrupoflujocaja_descripcion);

		Element elementconsolidado = document.createElement(CentroActividadConstantesFunciones.CONSOLIDADO);
		elementconsolidado.appendChild(document.createTextNode(centroactividad.getconsolidado().toString().trim()));
		element.appendChild(elementconsolidado);

		Element elementcon_proyecto = document.createElement(CentroActividadConstantesFunciones.CONPROYECTO);
		elementcon_proyecto.appendChild(document.createTextNode(centroactividad.getcon_proyecto().toString().trim()));
		element.appendChild(elementcon_proyecto);

		Element elementobservacion = document.createElement(CentroActividadConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(centroactividad.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoCentroActividadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CentroActividad> centroactividadsSeleccionados=new ArrayList<CentroActividad>();
		
		centroactividadsSeleccionados=this.getCentroActividadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCentroActividad(centroactividadsSeleccionados);
		
		this.generarReporteCentroActividads("Todos",centroactividadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCentroActividad(ArrayList<CentroActividad> centroactividadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CentroActividad centroactividadAux:centroactividadsSeleccionados) {
				centroactividadAux.setsDetalleGeneralEntityReporte(centroactividadAux.toString());
			
				if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(centroactividadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(centroactividadAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(centroactividadAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(centroactividadAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(centroactividadAux.gettipogrupoflujocaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(centroactividadAux.getconsolidado()));
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_CONPROYECTO)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(centroactividadAux.getcon_proyecto()));
				}
				 else if(sTipoSeleccionar.equals(CentroActividadConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					centroactividadAux.setsDescripcionGeneralEntityReporte1(centroactividadAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroActividadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCentroActividad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCentroActividad=true;
				this.isVisibilidadCeldaNuevoRelacionesCentroActividad=true;
				this.isVisibilidadCeldaGuardarCambiosCentroActividad=true;
			}
			
			this.isVisibilidadCeldaModificarCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=false;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
			this.isVisibilidadCeldaModificarCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=true;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
			this.isVisibilidadCeldaModificarCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=true;
			this.isVisibilidadCeldaEliminarCentroActividad=true;
			this.isVisibilidadCeldaCancelarCentroActividad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
			this.isVisibilidadCeldaModificarCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=true;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCentroActividad=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=true;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=true;
			this.isVisibilidadCeldaModificarCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=false;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
			this.isVisibilidadCeldaActualizarCentroActividad=false;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
			this.isVisibilidadCeldaModificarCentroActividad=true;
			this.isVisibilidadCeldaActualizarCentroActividad=false;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
			this.isVisibilidadCeldaCancelarCentroActividad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroActividad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CentroActividadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCentroActividad=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=true;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=true;
		} else {
			this.actualizarEstadoPanelsCentroActividad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCentroActividad=false;
			//this.isVisibilidadCeldaVerFormCentroActividad=false;
			this.isVisibilidadCeldaDuplicarCentroActividad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!centroactividadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
		} else {
			this.isVisibilidadCeldaNuevoCentroActividad=false;
			this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(centroactividadSessionBean.getEsGuardarRelacionado()) {
			if(!centroactividadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;												
			}
			
			this.jButtonCerrarCentroActividad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCentroActividad=false;
		}
		
		if(!this.permiteMantenimiento(this.centroactividad)) {
			this.isVisibilidadCeldaActualizarCentroActividad=false;
			this.isVisibilidadCeldaEliminarCentroActividad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCentroActividad() {
		this.isVisibilidadCeldaNuevoCentroActividad=false;
		this.isVisibilidadCeldaGuardarCambiosCentroActividad=false;
	}
	
	public void actualizarEstadoPanelsCentroActividad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCentroActividad!=null) {
				this.jScrollPanelDatosEdicionCentroActividad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroActividad!=null) {
				this.jScrollPanelDatosCentroActividad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroActividad!=null) {
				this.jPanelPaginacionCentroActividad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCentroActividad!=null) {
					this.jTabbedPaneBusquedasCentroActividad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroActividad!=null) {
				this.jTabbedPaneBusquedasCentroActividad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCentroActividad!=null) {
				this.jPanelParametrosReportesCentroActividad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelBusquedaPorCodigoCentroActividad);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelBusquedaPorNombreCentroActividad);}

			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFlujoCaja) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelFK_IdTipoMovimientoCentroActividad);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelBusquedaPorCodigoCentroActividad);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelBusquedaPorNombreCentroActividad);}

			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFlujoCaja) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMovimiento;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelFK_IdTipoMovimientoCentroActividad);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGrupoFlujoCaja(Boolean isParaTipoGrupoFlujoCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGrupoFlujoCajaNegation=!isParaTipoGrupoFlujoCaja;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoGrupoFlujoCajaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelBusquedaPorCodigoCentroActividad);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoGrupoFlujoCajaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelBusquedaPorNombreCentroActividad);}

			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isParaTipoGrupoFlujoCaja;
			if(!this.isVisibilidadFK_IdTipoGrupoFlujoCaja) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoGrupoFlujoCajaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasCentroActividad.remove(jPanelFK_IdTipoMovimientoCentroActividad);}
		}
		
	}
	
	

	public String registrarSesionCentroActividadParaPagoAutos() throws Exception {
		Boolean isPaginaPopupPagoAuto=false;

		try {

			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean==null) {
				this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean=new PagoAutoSessionBean();
			}

			this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.setsPathNavegacionActual(centroactividadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPagoAuto=this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePagoAuto(true);
			this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePagoAuto(CentroActividadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.setisBusquedaDesdeForeignKeySesionCentroActividad(true);
			this.jInternalFrameDetalleFormCentroActividad.pagoautoSessionBean.setlidCentroActividadActual(this.idCentroActividadActual);

			centroactividadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCentroActividad(true);
			centroactividadSessionBean.setlIdCentroActividadActualForeignKey(this.idCentroActividadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCentroActividadParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.setsPathNavegacionActual(centroactividadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CentroActividadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.setisBusquedaDesdeForeignKeySesionCentroActividad(true);
			this.jInternalFrameDetalleFormCentroActividad.clienteSessionBean.setlidCentroActividadActual(this.idCentroActividadActual);

			centroactividadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCentroActividad(true);
			centroactividadSessionBean.setlIdCentroActividadActualForeignKey(this.idCentroActividadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCentroActividadParaAutoriPagos() throws Exception {
		Boolean isPaginaPopupAutoriPago=false;

		try {

			if(this.centroactividadSessionBean==null) {
				this.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			if(this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean==null) {
				this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean=new AutoriPagoSessionBean();
			}

			this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.setsPathNavegacionActual(centroactividadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAutoriPago=this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAutoriPago(true);
			this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriPago(CentroActividadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.setisBusquedaDesdeForeignKeySesionCentroActividad(true);
			this.jInternalFrameDetalleFormCentroActividad.autoripagoSessionBean.setlidCentroActividadActual(this.idCentroActividadActual);

			centroactividadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCentroActividad(true);
			centroactividadSessionBean.setlIdCentroActividadActualForeignKey(this.idCentroActividadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CentroActividadSessionBean centroactividadSessionBean=new CentroActividadSessionBean();
		
		if(this.centroactividadSessionBean==null) {
			this.centroactividadSessionBean=new CentroActividadSessionBean();
		}
		
		this.centroactividadSessionBean.setsUltimaBusquedaCentroActividad(this.getsAccionBusqueda());
		this.centroactividadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.centroactividadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			centroactividadSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			centroactividadSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			centroactividadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGrupoFlujoCaja")) {
			centroactividadSessionBean.setid_tipo_grupo_flujo_caja(this.getid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
			centroactividadSessionBean.setid_tipo_movimiento(this.getid_tipo_movimientoFK_IdTipoMovimiento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CentroActividadSessionBean centroactividadSessionBean=new CentroActividadSessionBean();
		
		if(this.centroactividadSessionBean==null) {
			this.centroactividadSessionBean=new CentroActividadSessionBean();
		}
		
		if(this.centroactividadSessionBean.getsUltimaBusquedaCentroActividad()!=null&&!this.centroactividadSessionBean.getsUltimaBusquedaCentroActividad().equals("")) {
			this.setsAccionBusqueda(centroactividadSessionBean.getsUltimaBusquedaCentroActividad());
			this.setiNumeroPaginacion(centroactividadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(centroactividadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(centroactividadSessionBean.getcodigo());
				centroactividadSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(centroactividadSessionBean.getnombre());
				centroactividadSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(centroactividadSessionBean.getid_empresa());
				centroactividadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGrupoFlujoCaja")) {
				this.setid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja(centroactividadSessionBean.getid_tipo_grupo_flujo_caja());
				centroactividadSessionBean.setid_tipo_grupo_flujo_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
				this.setid_tipo_movimientoFK_IdTipoMovimiento(centroactividadSessionBean.getid_tipo_movimiento());
				centroactividadSessionBean.setid_tipo_movimiento(-1L);
			}
		}
		
		this.centroactividadSessionBean.setsUltimaBusquedaCentroActividad("");
		this.centroactividadSessionBean.setiNumeroPaginacion(CentroActividadConstantesFunciones.INUMEROPAGINACION);
		this.centroactividadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCentroActividad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCentroActividad() {
		this.updateBorderResaltarBusquedasFormularioCentroActividad();
		this.updateVisibilidadBusquedasFormularioCentroActividad();
		this.updateHabilitarBusquedasFormularioCentroActividad();
	}
	
	public void updateBorderResaltarBusquedasFormularioCentroActividad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCentroActividad.getComponents().length>0) {
	

		if(this.centroactividadConstantesFunciones.resaltarBusquedaPorCodigoCentroActividad!=null) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorCodigoCentroActividad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarBusquedaPorCodigoCentroActividad);
			}
		}

		if(this.centroactividadConstantesFunciones.resaltarBusquedaPorNombreCentroActividad!=null) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorNombreCentroActividad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarBusquedaPorNombreCentroActividad);
			}
		}

		if(this.centroactividadConstantesFunciones.resaltarFK_IdTipoGrupoFlujoCajaCentroActividad!=null) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarFK_IdTipoGrupoFlujoCajaCentroActividad);
			}
		}

		if(this.centroactividadConstantesFunciones.resaltarFK_IdTipoMovimientoCentroActividad!=null) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoMovimientoCentroActividad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarFK_IdTipoMovimientoCentroActividad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCentroActividad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCentroActividad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorCodigoCentroActividad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centroactividadConstantesFunciones.mostrarBusquedaPorCodigoCentroActividad);
			if(!this.centroactividadConstantesFunciones.mostrarBusquedaPorCodigoCentroActividad && index>-1) {
				this.jTabbedPaneBusquedasCentroActividad.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorNombreCentroActividad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centroactividadConstantesFunciones.mostrarBusquedaPorNombreCentroActividad);
			if(!this.centroactividadConstantesFunciones.mostrarBusquedaPorNombreCentroActividad && index>-1) {
				this.jTabbedPaneBusquedasCentroActividad.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centroactividadConstantesFunciones.mostrarFK_IdTipoGrupoFlujoCajaCentroActividad);
			if(!this.centroactividadConstantesFunciones.mostrarFK_IdTipoGrupoFlujoCajaCentroActividad && index>-1) {
				this.jTabbedPaneBusquedasCentroActividad.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoMovimientoCentroActividad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centroactividadConstantesFunciones.mostrarFK_IdTipoMovimientoCentroActividad);
			if(!this.centroactividadConstantesFunciones.mostrarFK_IdTipoMovimientoCentroActividad && index>-1) {
				this.jTabbedPaneBusquedasCentroActividad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCentroActividad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCentroActividad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorCodigoCentroActividad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centroactividadConstantesFunciones.activarBusquedaPorCodigoCentroActividad);
				this.jTabbedPaneBusquedasCentroActividad.setEnabledAt(index,this.centroactividadConstantesFunciones.activarBusquedaPorCodigoCentroActividad);
			}

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorNombreCentroActividad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centroactividadConstantesFunciones.activarBusquedaPorNombreCentroActividad);
				this.jTabbedPaneBusquedasCentroActividad.setEnabledAt(index,this.centroactividadConstantesFunciones.activarBusquedaPorNombreCentroActividad);
			}

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centroactividadConstantesFunciones.activarFK_IdTipoGrupoFlujoCajaCentroActividad);
				this.jTabbedPaneBusquedasCentroActividad.setEnabledAt(index,this.centroactividadConstantesFunciones.activarFK_IdTipoGrupoFlujoCajaCentroActividad);
			}

			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoMovimientoCentroActividad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centroactividadConstantesFunciones.activarFK_IdTipoMovimientoCentroActividad);
				this.jTabbedPaneBusquedasCentroActividad.setEnabledAt(index,this.centroactividadConstantesFunciones.activarFK_IdTipoMovimientoCentroActividad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCentroActividad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorCodigoCentroActividad);

			this.jTabbedPaneBusquedasCentroActividad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);

			this.centroactividadConstantesFunciones.setResaltarBusquedaPorCodigoCentroActividad(resaltar);

			jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarBusquedaPorCodigoCentroActividad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelBusquedaPorNombreCentroActividad);

			this.jTabbedPaneBusquedasCentroActividad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);

			this.centroactividadConstantesFunciones.setResaltarBusquedaPorNombreCentroActividad(resaltar);

			jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarBusquedaPorNombreCentroActividad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGrupoFlujoCaja")) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);

			this.jTabbedPaneBusquedasCentroActividad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);

			this.centroactividadConstantesFunciones.setResaltarFK_IdTipoGrupoFlujoCajaCentroActividad(resaltar);

			jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarFK_IdTipoGrupoFlujoCajaCentroActividad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMovimiento")) {
			index= this.jTabbedPaneBusquedasCentroActividad.indexOfComponent(this.jPanelFK_IdTipoMovimientoCentroActividad);

			this.jTabbedPaneBusquedasCentroActividad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroActividad.getComponent(index);

			this.centroactividadConstantesFunciones.setResaltarFK_IdTipoMovimientoCentroActividad(resaltar);

			jPanel.setBorder(this.centroactividadConstantesFunciones.resaltarFK_IdTipoMovimientoCentroActividad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCentroActividad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCentroActividad() throws Exception {

		if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCentroActividad();
		this.updateVisibilidadResaltarControlesFormularioCentroActividad();
		this.updateHabilitarResaltarControlesFormularioCentroActividad();
		
	}
	
	public void updateBorderResaltarControlesFormularioCentroActividad() throws Exception {
		if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.centroactividadConstantesFunciones.resaltaridCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltaridCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarid_empresaCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarid_empresaCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarcodigoCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarcodigoCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarnombreCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarnombreCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarid_tipo_movimientoCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarid_tipo_movimientoCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarconsolidadoCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setBorderPainted(true);this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarconsolidadoCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarcon_proyectoCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setBorderPainted(true);this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarcon_proyectoCentroActividad);}
		if(this.centroactividadConstantesFunciones.resaltarobservacionCentroActividad!=null && this.jInternalFrameDetalleFormCentroActividad!=null) {this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setBorder(this.centroactividadConstantesFunciones.resaltarobservacionCentroActividad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCentroActividad() throws Exception {		
		if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
	
		//this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostraridCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelidCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostraridCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarid_empresaCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelid_empresaCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarid_empresaCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarcodigoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelcodigoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarcodigoCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarnombreCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelnombreCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarnombreCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarid_tipo_movimientoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelid_tipo_movimientoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarid_tipo_movimientoCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarid_tipo_grupo_flujo_cajaCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelid_tipo_grupo_flujo_cajaCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarid_tipo_grupo_flujo_cajaCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarconsolidadoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelconsolidadoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarconsolidadoCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarcon_proyectoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelcon_proyectoCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarcon_proyectoCentroActividad);
		//this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarobservacionCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jPanelobservacionCentroActividad.setVisible(this.centroactividadConstantesFunciones.mostrarobservacionCentroActividad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCentroActividad() throws Exception {
		if(this.jInternalFrameDetalleFormCentroActividad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroActividad!=null) {
	
		this.jInternalFrameDetalleFormCentroActividad.jLabelidCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activaridCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_empresaCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarid_empresaCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jTextFieldcodigoCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarcodigoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jTextAreanombreCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarnombreCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_movimientoCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarid_tipo_movimientoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarid_tipo_grupo_flujo_cajaCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jCheckBoxconsolidadoCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarconsolidadoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jCheckBoxcon_proyectoCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarcon_proyectoCentroActividad);
		this.jInternalFrameDetalleFormCentroActividad.jTextAreaobservacionCentroActividad.setEnabled(this.centroactividadConstantesFunciones.activarobservacionCentroActividad);
		}
	}
	
		
}