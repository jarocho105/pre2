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

import com.bydan.erp.cartera.util.GrupoClienteConstantesFunciones;
import com.bydan.erp.cartera.util.GrupoClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.GrupoClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.GrupoClienteBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class GrupoClienteBeanSwingJInternalFrame extends GrupoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GrupoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GrupoCliente> grupoclienteValidator = new ClassValidator<GrupoCliente>(GrupoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GrupoCliente grupocliente;	
	public GrupoCliente grupoclienteAux;
	public GrupoCliente grupoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GrupoCliente grupoclienteTotales;
	public Long idGrupoClienteActual;
	public Long iIdNuevoGrupoCliente=0L;
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

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
	}

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
	}
	public Long idCentroCostoActual=0L;

	public Long getidCentroCostoActual() {
		return idCentroCostoActual;
	}

	public void setidCentroCostoActual(Long idCentroCostoActual) {
		this.idCentroCostoActual= idCentroCostoActual;
	}
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosGrupoClienteFormaPago=false;

	public Boolean getIsTienePermisosGrupoClienteFormaPago() {
		return isTienePermisosGrupoClienteFormaPago;
	}

	public void setIsTienePermisosGrupoClienteFormaPago(Boolean isTienePermisosGrupoClienteFormaPago) {
		this.isTienePermisosGrupoClienteFormaPago= isTienePermisosGrupoClienteFormaPago;
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
	
	public Boolean isPermisoTodoGrupoCliente;
	public Boolean isPermisoNuevoGrupoCliente;
	public Boolean isPermisoActualizarGrupoCliente;
	public Boolean isPermisoActualizarOriginalGrupoCliente;
	public Boolean isPermisoEliminarGrupoCliente;
	public Boolean isPermisoGuardarCambiosGrupoCliente;
	public Boolean isPermisoConsultaGrupoCliente;
	public Boolean isPermisoBusquedaGrupoCliente;
	public Boolean isPermisoReporteGrupoCliente;
	public Boolean isPermisoPaginacionMedioGrupoCliente;
	public Boolean isPermisoPaginacionAltoGrupoCliente;
	public Boolean isPermisoPaginacionTodoGrupoCliente;
	public Boolean isPermisoCopiarGrupoCliente;
	public Boolean isPermisoVerFormGrupoCliente;
	public Boolean isPermisoDuplicarGrupoCliente;
	public Boolean isPermisoOrdenGrupoCliente;
	
	
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
	
	public GrupoClienteParameterReturnGeneral grupoclienteReturnGeneral;
	public GrupoClienteParameterReturnGeneral grupoclienteParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public GrupoClienteFormaPagoLogic grupoclienteformapagoLogic=null;

	public GrupoClienteFormaPagoLogic getGrupoClienteFormaPagoLogic() {
		return grupoclienteformapagoLogic;
	}

	public void setGrupoClienteFormaPagoLogic(GrupoClienteFormaPagoLogic grupoclienteformapagoLogic) {
		this.grupoclienteformapagoLogic = grupoclienteformapagoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGrupoCliente=false;
	public Boolean esParaAccionDesdeFormularioGrupoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GrupoClienteSessionBeanAdditional grupoclienteSessionBeanAdditional=null;
	
	public GrupoClienteSessionBeanAdditional getGrupoClienteSessionBeanAdditional() {
		return this.grupoclienteSessionBeanAdditional;
	}
	
	public void setGrupoClienteSessionBeanAdditional(GrupoClienteSessionBeanAdditional grupoclienteSessionBeanAdditional) {
		try {
			this.grupoclienteSessionBeanAdditional=grupoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GrupoClienteBeanSwingJInternalFrameAdditional grupoclienteBeanSwingJInternalFrameAdditional=null;
	//public class GrupoClienteBeanSwingJInternalFrame
	
	public GrupoClienteBeanSwingJInternalFrameAdditional getGrupoClienteBeanSwingJInternalFrameAdditional() {
		return this.grupoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setGrupoClienteBeanSwingJInternalFrameAdditional(GrupoClienteBeanSwingJInternalFrameAdditional grupoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.grupoclienteBeanSwingJInternalFrameAdditional=grupoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GrupoClienteLogic grupoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GrupoCliente grupoclienteBean;
	public GrupoClienteConstantesFunciones grupoclienteConstantesFunciones;
	//public GrupoClienteParameterReturnGeneral grupoclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public CuentaContableLogic cuentacontableLogic;
	public CentroCostoLogic centrocostoLogic;
	
	//PARAMETROS
	
	
	//public List<GrupoCliente> grupoclientes;	
	//public List<GrupoCliente> grupoclientesEliminados;
	//public List<GrupoCliente> grupoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGrupoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarGrupoCliente=true;
	public Boolean isVisibilidadCeldaCopiarGrupoCliente=true;
	public Boolean isVisibilidadCeldaVerFormGrupoCliente=true;
	public Boolean isVisibilidadCeldaOrdenGrupoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
	public Boolean isVisibilidadCeldaModificarGrupoCliente=false;
	public Boolean isVisibilidadCeldaActualizarGrupoCliente=false;
	public Boolean isVisibilidadCeldaEliminarGrupoCliente=false;
	public Boolean isVisibilidadCeldaCancelarGrupoCliente=false;
	public Boolean isVisibilidadCeldaGuardarGrupoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGrupoCliente=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSiglas=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	
	public Long getiIdNuevoGrupoCliente() {
		return this.iIdNuevoGrupoCliente;
	}

	public void setiIdNuevoGrupoCliente(Long iIdNuevoGrupoCliente) {
		this.iIdNuevoGrupoCliente = iIdNuevoGrupoCliente;
	}
	
	public Long getidGrupoClienteActual() {
		return this.idGrupoClienteActual;
	}

	public void setidGrupoClienteActual(Long idGrupoClienteActual) {
		this.idGrupoClienteActual = idGrupoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GrupoCliente getgrupocliente() {
		return this.grupocliente;
	}

	public void setgrupocliente(GrupoCliente grupocliente) {
		this.grupocliente = grupocliente;
	}
	
	public GrupoCliente getgrupoclienteAux() {
		return this.grupoclienteAux;
	}

	public void setgrupoclienteAux(GrupoCliente grupoclienteAux) {
		this.grupoclienteAux = grupoclienteAux;
	}				
	
	public GrupoCliente getgrupoclienteAnterior() {
		return this.grupoclienteAnterior;
	}

	public void setgrupoclienteAnterior(GrupoCliente grupoclienteAnterior) {
		this.grupoclienteAnterior = grupoclienteAnterior;
	}	
	
	public GrupoCliente getgrupoclienteTotales() {
		return this.grupoclienteTotales;
	}

	public void setgrupoclienteTotales(GrupoCliente grupoclienteTotales) {
		this.grupoclienteTotales = grupoclienteTotales;
	}	
	
	public GrupoCliente getgrupoclienteBean() {
		return this.grupoclienteBean;
	}

	public void setgrupoclienteBean(GrupoCliente grupoclienteBean) {
		this.grupoclienteBean = grupoclienteBean;
	}	
	
	public GrupoClienteParameterReturnGeneral getgrupoclienteReturnGeneral() {
		return this.grupoclienteReturnGeneral;
	}

	public void setgrupoclienteReturnGeneral(GrupoClienteParameterReturnGeneral grupoclienteReturnGeneral) {
		this.grupoclienteReturnGeneral = grupoclienteReturnGeneral;
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

	public String siglasBusquedaPorSiglas="";

	public String getsiglasBusquedaPorSiglas() {
		return this.siglasBusquedaPorSiglas;
	}

	public void setsiglasBusquedaPorSiglas(String siglasBusquedaPorSiglas) {
		this.siglasBusquedaPorSiglas = siglasBusquedaPorSiglas;
	}

	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=null;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GrupoClienteLogic getGrupoClienteLogic()	{		
		return grupoclienteLogic;
	}

	public void setGrupoClienteLogic(GrupoClienteLogic grupoclienteLogic) {
		this.grupoclienteLogic = grupoclienteLogic;
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
	
	public Boolean getIsEsNuevoGrupoCliente() {
		return isEsNuevoGrupoCliente;
	}

	public void setIsEsNuevoGrupoCliente(Boolean isEsNuevoGrupoCliente) {
		this.isEsNuevoGrupoCliente = isEsNuevoGrupoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioGrupoCliente() {
		return esParaAccionDesdeFormularioGrupoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioGrupoCliente(Boolean esParaAccionDesdeFormularioGrupoCliente) {
		this.esParaAccionDesdeFormularioGrupoCliente = esParaAccionDesdeFormularioGrupoCliente;
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

			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(grupoclienteSessionBean.getlidEmpresaActual());
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

			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(grupoclienteSessionBean.getlidModuloActual());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(grupoclienteSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCosto centrocostoNulo = new CentroCosto();

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.centrocostosForeignKey.add(0, centrocostoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(grupoclienteSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

					if(this.grupocliente!=null) {
						this.grupocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGrupoCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGrupoClienteGenerico)throws Exception
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
				jComboBoxid_empresaGrupoClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGrupoClienteGenerico!=null && jComboBoxid_empresaGrupoClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaGrupoClienteGenerico.setSelectedIndex(0);
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

					if(this.grupocliente!=null) {
						this.grupocliente.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloGrupoCliente.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloGrupoClienteGenerico)throws Exception
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
				jComboBoxid_moduloGrupoClienteGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloGrupoClienteGenerico!=null && jComboBoxid_moduloGrupoClienteGenerico.getItemCount()>0) {
					jComboBoxid_moduloGrupoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.grupocliente!=null) {
						this.grupocliente.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableGrupoCliente.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableGrupoClienteGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableGrupoClienteGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableGrupoClienteGenerico!=null && jComboBoxid_cuenta_contableGrupoClienteGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableGrupoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.grupocliente!=null) {
						this.grupocliente.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoGrupoCliente.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
						if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoGrupoClienteGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoGrupoClienteGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoGrupoClienteGenerico!=null && jComboBoxid_centro_costoGrupoClienteGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoGrupoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GrupoCliente grupocliente,JComboBox jComboBoxid_empresaGrupoClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGrupoClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGrupoClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				grupocliente.setid_empresa(empresaAux.getId());
				grupocliente.setempresa_descripcion(GrupoClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				grupocliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(GrupoCliente grupocliente,JComboBox jComboBoxid_moduloGrupoClienteGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloGrupoClienteGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloGrupoClienteGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				grupocliente.setid_modulo(moduloAux.getId());
				grupocliente.setmodulo_descripcion(GrupoClienteConstantesFunciones.getModuloDescripcion(moduloAux));
				grupocliente.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(GrupoCliente grupocliente,JComboBox jComboBoxid_cuenta_contableGrupoClienteGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableGrupoClienteGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableGrupoClienteGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				grupocliente.setid_cuenta_contable(cuentacontableAux.getId());
				grupocliente.setcuentacontable_descripcion(GrupoClienteConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				grupocliente.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(GrupoCliente grupocliente,JComboBox jComboBoxid_centro_costoGrupoClienteGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoGrupoClienteGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoGrupoClienteGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				grupocliente.setid_centro_costo(centrocostoAux.getId());
				grupocliente.setcentrocosto_descripcion(GrupoClienteConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				grupocliente.setCentroCosto(centrocostoAux);			}
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

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
					}

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
					}

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
					}

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoCliente!=null) { 
					}

					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesGrupoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GrupoClienteConstantesFunciones.refrescarForeignKeysDescripcionesGrupoCliente(this.grupoclienteLogic.getGrupoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GrupoClienteConstantesFunciones.refrescarForeignKeysDescripcionesGrupoCliente(this.grupoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(CentroCosto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//grupoclienteLogic.setGrupoClientes(this.grupoclientes);
			grupoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GrupoClienteParameterReturnGeneral getGrupoClienteParameterGeneral() {
		return this.grupoclienteParameterGeneral;
	}
	
	public void setGrupoClienteParameterGeneral(GrupoClienteParameterReturnGeneral grupoclienteParameterGeneral) {
		this.grupoclienteParameterGeneral = grupoclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGrupoCliente() {
		return isPermisoTodoGrupoCliente;
	}

	public void setIsPermisoTodoGrupoCliente(Boolean isPermisoTodoGrupoCliente) {
		this.isPermisoTodoGrupoCliente = isPermisoTodoGrupoCliente;
	}

	public Boolean getIsPermisoNuevoGrupoCliente() {
		return isPermisoNuevoGrupoCliente;
	}

	public void setIsPermisoNuevoGrupoCliente(Boolean isPermisoNuevoGrupoCliente) {
		this.isPermisoNuevoGrupoCliente = isPermisoNuevoGrupoCliente;
	}

	public Boolean getIsPermisoActualizarGrupoCliente() {
		return isPermisoActualizarGrupoCliente;
	}

	public void setIsPermisoActualizarGrupoCliente(Boolean isPermisoActualizarGrupoCliente) {
		this.isPermisoActualizarGrupoCliente = isPermisoActualizarGrupoCliente;
	}

	public Boolean getIsPermisoEliminarGrupoCliente() {
		return isPermisoEliminarGrupoCliente;
	}

	public void setIsPermisoEliminarGrupoCliente(Boolean isPermisoEliminarGrupoCliente) {
		this.isPermisoEliminarGrupoCliente = isPermisoEliminarGrupoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosGrupoCliente() {
		return isPermisoGuardarCambiosGrupoCliente;
	}

	public void setIsPermisoGuardarCambiosGrupoCliente(Boolean isPermisoGuardarCambiosGrupoCliente) {
		this.isPermisoGuardarCambiosGrupoCliente = isPermisoGuardarCambiosGrupoCliente;
	}
	
	public Boolean getIsPermisoConsultaGrupoCliente() {
		return isPermisoConsultaGrupoCliente;
	}

	public void setIsPermisoConsultaGrupoCliente(Boolean isPermisoConsultaGrupoCliente) {
		this.isPermisoConsultaGrupoCliente = isPermisoConsultaGrupoCliente;
	}

	public Boolean getIsPermisoBusquedaGrupoCliente() {
		return isPermisoBusquedaGrupoCliente;
	}

	public void setIsPermisoBusquedaGrupoCliente(Boolean isPermisoBusquedaGrupoCliente) {
		this.isPermisoBusquedaGrupoCliente = isPermisoBusquedaGrupoCliente;
	}

	public Boolean getIsPermisoReporteGrupoCliente() {
		return isPermisoReporteGrupoCliente;
	}

	public void setIsPermisoReporteGrupoCliente(Boolean isPermisoReporteGrupoCliente) {
		this.isPermisoReporteGrupoCliente = isPermisoReporteGrupoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioGrupoCliente() {
		return isPermisoPaginacionMedioGrupoCliente;
	}

	public void setIsPermisoPaginacionMedioGrupoCliente(Boolean isPermisoPaginacionMedioGrupoCliente) {
		this.isPermisoPaginacionMedioGrupoCliente = isPermisoPaginacionMedioGrupoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoGrupoCliente() {
		return isPermisoPaginacionTodoGrupoCliente;
	}

	public void setIsPermisoPaginacionTodoGrupoCliente(Boolean isPermisoPaginacionTodoGrupoCliente) {
		this.isPermisoPaginacionTodoGrupoCliente = isPermisoPaginacionTodoGrupoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoGrupoCliente() {
		return isPermisoPaginacionAltoGrupoCliente;
	}

	public void setIsPermisoPaginacionAltoGrupoCliente(Boolean isPermisoPaginacionAltoGrupoCliente) {
		this.isPermisoPaginacionAltoGrupoCliente = isPermisoPaginacionAltoGrupoCliente;
	}
	
	public Boolean getIsPermisoCopiarGrupoCliente() {
		return isPermisoCopiarGrupoCliente;
	}

	public void setIsPermisoCopiarGrupoCliente(Boolean isPermisoCopiarGrupoCliente) {
		this.isPermisoCopiarGrupoCliente = isPermisoCopiarGrupoCliente;
	}
	
	public Boolean getIsPermisoVerFormGrupoCliente() {
		return isPermisoVerFormGrupoCliente;
	}

	public void setIsPermisoVerFormGrupoCliente(Boolean isPermisoVerFormGrupoCliente) {
		this.isPermisoVerFormGrupoCliente = isPermisoVerFormGrupoCliente;
	}
	
	public Boolean getIsPermisoDuplicarGrupoCliente() {
		return isPermisoDuplicarGrupoCliente;
	}

	public void setIsPermisoDuplicarGrupoCliente(Boolean isPermisoDuplicarGrupoCliente) {
		this.isPermisoDuplicarGrupoCliente = isPermisoDuplicarGrupoCliente;
	}
	
	public Boolean getIsPermisoOrdenGrupoCliente() {
		return isPermisoOrdenGrupoCliente;
	}

	public void setIsPermisoOrdenGrupoCliente(Boolean isPermisoOrdenGrupoCliente) {
		this.isPermisoOrdenGrupoCliente = isPermisoOrdenGrupoCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGrupoCliente() {
		return isVisibilidadCeldaNuevoGrupoCliente;
	}

	public void setIsVisibilidadCeldaNuevoGrupoCliente(Boolean isVisibilidadCeldaNuevoGrupoCliente) {
		this.isVisibilidadCeldaNuevoGrupoCliente = isVisibilidadCeldaNuevoGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGrupoCliente() {
		return isVisibilidadCeldaDuplicarGrupoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarGrupoCliente(Boolean isVisibilidadCeldaDuplicarGrupoCliente) {
		this.isVisibilidadCeldaDuplicarGrupoCliente = isVisibilidadCeldaDuplicarGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGrupoCliente() {
		return isVisibilidadCeldaCopiarGrupoCliente;
	}

	public void setIsVisibilidadCeldaCopiarGrupoCliente(Boolean isVisibilidadCeldaCopiarGrupoCliente) {
		this.isVisibilidadCeldaCopiarGrupoCliente = isVisibilidadCeldaCopiarGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGrupoCliente() {
		return isVisibilidadCeldaVerFormGrupoCliente;
	}

	public void setIsVisibilidadCeldaVerFormGrupoCliente(Boolean isVisibilidadCeldaVerFormGrupoCliente) {
		this.isVisibilidadCeldaVerFormGrupoCliente = isVisibilidadCeldaVerFormGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGrupoCliente() {
		return isVisibilidadCeldaOrdenGrupoCliente;
	}

	public void setIsVisibilidadCeldaOrdenGrupoCliente(Boolean isVisibilidadCeldaOrdenGrupoCliente) {
		this.isVisibilidadCeldaOrdenGrupoCliente = isVisibilidadCeldaOrdenGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGrupoCliente() {
		return isVisibilidadCeldaNuevoRelacionesGrupoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGrupoCliente(Boolean isVisibilidadCeldaNuevoRelacionesGrupoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesGrupoCliente = isVisibilidadCeldaNuevoRelacionesGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGrupoCliente() {
		return isVisibilidadCeldaModificarGrupoCliente;
	}

	public void setIsVisibilidadCeldaModificarGrupoCliente(Boolean isVisibilidadCeldaModificarGrupoCliente) {
		this.isVisibilidadCeldaModificarGrupoCliente = isVisibilidadCeldaModificarGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGrupoCliente() {
		return isVisibilidadCeldaActualizarGrupoCliente;
	}

	public void setIsVisibilidadCeldaActualizarGrupoCliente(Boolean isVisibilidadCeldaActualizarGrupoCliente) {
		this.isVisibilidadCeldaActualizarGrupoCliente = isVisibilidadCeldaActualizarGrupoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarGrupoCliente() {
		return isVisibilidadCeldaEliminarGrupoCliente;
	}

	public void setIsVisibilidadCeldaEliminarGrupoCliente(Boolean isVisibilidadCeldaEliminarGrupoCliente) {
		this.isVisibilidadCeldaEliminarGrupoCliente = isVisibilidadCeldaEliminarGrupoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarGrupoCliente() {
		return isVisibilidadCeldaCancelarGrupoCliente;
	}

	public void setIsVisibilidadCeldaCancelarGrupoCliente(Boolean isVisibilidadCeldaCancelarGrupoCliente) {
		this.isVisibilidadCeldaCancelarGrupoCliente = isVisibilidadCeldaCancelarGrupoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarGrupoCliente() {
		return isVisibilidadCeldaGuardarGrupoCliente;
	}

	public void setIsVisibilidadCeldaGuardarGrupoCliente(Boolean isVisibilidadCeldaGuardarGrupoCliente) {
		this.isVisibilidadCeldaGuardarGrupoCliente = isVisibilidadCeldaGuardarGrupoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGrupoCliente() {
		return isVisibilidadCeldaGuardarCambiosGrupoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGrupoCliente(Boolean isVisibilidadCeldaGuardarCambiosGrupoCliente) {
		this.isVisibilidadCeldaGuardarCambiosGrupoCliente = isVisibilidadCeldaGuardarCambiosGrupoCliente;
	}
		
	public GrupoClienteSessionBean getgrupoclienteSessionBean() {
		return this.grupoclienteSessionBean;
	}
	
	public void setgrupoclienteSessionBean(GrupoClienteSessionBean grupoclienteSessionBean) {
		this.grupoclienteSessionBean=grupoclienteSessionBean;
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

	public Boolean getisVisibilidadBusquedaPorSiglas() {
		return this.isVisibilidadBusquedaPorSiglas;
	}

	public void setisVisibilidadBusquedaPorSiglas(Boolean isVisibilidadBusquedaPorSiglas) {
		this.isVisibilidadBusquedaPorSiglas=isVisibilidadBusquedaPorSiglas;
	}

	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(GrupoCliente grupocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(grupocliente,null);
				this.setActualParaGuardarModuloForeignKey(grupocliente,null);
				this.setActualParaGuardarCuentaContableForeignKey(grupocliente,null);
				this.setActualParaGuardarCentroCostoForeignKey(grupocliente,null);
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
	
	public void bugActualizarReferenciaActual(GrupoCliente grupocliente,GrupoCliente grupoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGrupoCliente(grupocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		grupoclienteAux.setId(grupocliente.getId());
		grupoclienteAux.setVersionRow(grupocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGrupoCliente();
		
			int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = grupoclienteValidator.getInvalidValues(this.grupocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			grupoclienteLogic.setDatosCliente(datosCliente);
			grupoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				grupoclienteAux=new  GrupoCliente();
				
				grupoclienteAux.setIsNew(true);
				grupoclienteAux.setIsChanged(true);
				
				grupoclienteAux.setGrupoClienteOriginal(this.grupocliente);
				
				grupoclienteAux.setId(this.grupocliente.getId());	
				grupoclienteAux.setVersionRow(this.grupocliente.getVersionRow());	
				grupoclienteAux.setid_empresa(this.grupocliente.getid_empresa());	
				grupoclienteAux.setid_modulo(this.grupocliente.getid_modulo());	
				grupoclienteAux.setcodigo(this.grupocliente.getcodigo());	
				grupoclienteAux.setnombre(this.grupocliente.getnombre());	
				grupoclienteAux.setsiglas(this.grupocliente.getsiglas());	
				grupoclienteAux.setsecuencial(this.grupocliente.getsecuencial());	
				grupoclienteAux.setdescripcion(this.grupocliente.getdescripcion());	
				grupoclienteAux.setes_prove(this.grupocliente.getes_prove());	
				grupoclienteAux.setid_cuenta_contable(this.grupocliente.getid_cuenta_contable());	
				
				if(this.grupocliente.getid_centro_costo()!=null && this.grupocliente.getid_centro_costo()>0L) {
					grupoclienteAux.setid_centro_costo(this.grupocliente.getid_centro_costo());
				} else {
					grupoclienteAux.setid_centro_costo(null);
				}	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(grupoclienteAux,grupoclienteLogic.getGrupoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteAux,grupoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.saveGrupoClientes();//WithConnection
						//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupocliente,grupoclienteAux);
					
					this.refrescarForeignKeysDescripcionesGrupoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos.addAll(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoclienteLogic.saveGrupoClienteRelaciones(grupoclienteAux,this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());//WithConnection
								//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupocliente,grupoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos= new ArrayList<GrupoClienteFormaPago>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoclienteAux.setClientes(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoclienteAux.setGrupoClienteFormaPagos(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupoclienteAux,grupoclienteLogic.getGrupoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupoclienteAux,grupoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupocliente,grupoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				grupoclienteAux=new  GrupoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.grupoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.grupoclienteSessionBean.getEsGuardarRelacionado() && this.grupocliente.getId()>=0)) {
						
					grupoclienteAux.setIsNew(false);
				}
				
				grupoclienteAux.setIsDeleted(false);
			
				grupoclienteAux.setId(this.grupocliente.getId());	
				grupoclienteAux.setVersionRow(this.grupocliente.getVersionRow());	
				grupoclienteAux.setid_empresa(this.grupocliente.getid_empresa());	
				grupoclienteAux.setid_modulo(this.grupocliente.getid_modulo());	
				grupoclienteAux.setcodigo(this.grupocliente.getcodigo());	
				grupoclienteAux.setnombre(this.grupocliente.getnombre());	
				grupoclienteAux.setsiglas(this.grupocliente.getsiglas());	
				grupoclienteAux.setsecuencial(this.grupocliente.getsecuencial());	
				grupoclienteAux.setdescripcion(this.grupocliente.getdescripcion());	
				grupoclienteAux.setes_prove(this.grupocliente.getes_prove());	
				grupoclienteAux.setid_cuenta_contable(this.grupocliente.getid_cuenta_contable());	
				
				if(this.grupocliente.getid_centro_costo()!=null && this.grupocliente.getid_centro_costo()>0L) {
					grupoclienteAux.setid_centro_costo(this.grupocliente.getid_centro_costo());
				} else {
					grupoclienteAux.setid_centro_costo(null);
				}	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoclienteAux,grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteAux,grupoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.saveGrupoClientes();//WithConnection
						//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupocliente,grupoclienteAux);
					
					this.refrescarForeignKeysDescripcionesGrupoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos.addAll(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoclienteLogic.saveGrupoClienteRelaciones(grupoclienteAux,this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());//WithConnection
								//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupocliente,grupoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos= new ArrayList<GrupoClienteFormaPago>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoclienteAux.setClientes(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoclienteAux.setGrupoClienteFormaPagos(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupoclienteAux,grupoclienteLogic.getGrupoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupoclienteAux,grupoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupocliente,grupoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				grupoclienteAux=new  GrupoCliente();
				
				grupoclienteAux.setIsNew(false);
				grupoclienteAux.setIsChanged(false);
				
				grupoclienteAux.setIsDeleted(true);
				
				grupoclienteAux.setId(this.grupocliente.getId());	
				grupoclienteAux.setVersionRow(this.grupocliente.getVersionRow());	
				grupoclienteAux.setid_empresa(this.grupocliente.getid_empresa());	
				grupoclienteAux.setid_modulo(this.grupocliente.getid_modulo());	
				grupoclienteAux.setcodigo(this.grupocliente.getcodigo());	
				grupoclienteAux.setnombre(this.grupocliente.getnombre());	
				grupoclienteAux.setsiglas(this.grupocliente.getsiglas());	
				grupoclienteAux.setsecuencial(this.grupocliente.getsecuencial());	
				grupoclienteAux.setdescripcion(this.grupocliente.getdescripcion());	
				grupoclienteAux.setes_prove(this.grupocliente.getes_prove());	
				grupoclienteAux.setid_cuenta_contable(this.grupocliente.getid_cuenta_contable());	
				
				if(this.grupocliente.getid_centro_costo()!=null && this.grupocliente.getid_centro_costo()>0L) {
					grupoclienteAux.setid_centro_costo(this.grupocliente.getid_centro_costo());
				} else {
					grupoclienteAux.setid_centro_costo(null);
				}	
				
				if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.grupoclienteAux.getId()>=0) {	
						this.grupoclientesEliminados.add(grupoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(grupoclienteAux,grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteAux,grupoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.saveGrupoClientes();//WithConnection
						//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos.addAll(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoclienteLogic.saveGrupoClienteRelaciones(grupoclienteAux,this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());//WithConnection
								//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos= new ArrayList<GrupoClienteFormaPago>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoclienteAux.setClientes(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoclienteAux.setGrupoClienteFormaPagos(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(grupoclienteAux,grupoclienteLogic.getGrupoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(grupoclienteAux,grupoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getGrupoClientes().addAll(this.grupoclientesEliminados);
					
					grupoclienteLogic.saveGrupoClientes();//WithConnection
					//grupoclienteLogic.getSetVersionRowGrupoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGrupoCliente();
				
				this.grupoclientesEliminados= new ArrayList<GrupoCliente>();		
			}
			
			if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Grupo Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.grupocliente=grupoclienteAux;
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
      		//this.finishProcessGrupoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(GrupoCliente grupoclienteLocal) throws Exception {
		
		if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				grupoclienteLocal.setClientes(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				grupoclienteLocal.setGrupoClienteFormaPagos(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
			
			} else {
			
				grupoclienteLocal.setClientes(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clientes);
				grupoclienteLocal.setGrupoClienteFormaPagos(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GrupoCliente grupoclienteLocal) throws Exception {	
		if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				grupoclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				grupoclienteLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				grupoclienteLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				grupoclienteLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGrupoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = grupoclienteValidator.getInvalidValues(this.grupocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GrupoCliente grupocliente,List<GrupoCliente> grupoclientes) throws Exception {
		try	{		
			GrupoClienteConstantesFunciones.actualizarLista(grupocliente,grupoclientes,this.grupoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GrupoCliente grupocliente,List<GrupoCliente> grupoclientes) throws Exception {
		try	{			
			GrupoClienteConstantesFunciones.actualizarSelectedLista(grupocliente,grupoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GrupoCliente> grupoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				grupoclientesLocal=this.grupoclienteLogic.getGrupoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				grupoclientesLocal=this.grupoclientes;
			}
			//ARCHITECTURE
		
			for(GrupoCliente grupoclienteLocal:grupoclientesLocal) {
				if(this.permiteMantenimiento(grupoclienteLocal) && grupoclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GrupoClienteConstantesFunciones.getGrupoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_empresaGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_moduloGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelcodigoGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelnombreGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelsiglasGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelsecuencialGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabeldescripcionGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.ESPROVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabeles_proveGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_cuenta_contableGrupoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_centro_costoGrupoCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_empresaGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_moduloGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelcodigoGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelnombreGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelsiglasGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelsecuencialGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabeldescripcionGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabeles_proveGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_cuenta_contableGrupoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoCliente.jLabelid_centro_costoGrupoCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.grupocliente==null) {
				this.grupocliente= new GrupoCliente();
			}

			if(this.grupoclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoCliente
				this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);

				this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.getcliente().setGrupoCliente(this.grupocliente);
			}

			return;
		}
		 else  if(sTipo.equals("GrupoClienteFormaPago")) {
			if(this.grupocliente==null) {
				this.grupocliente= new GrupoCliente();
			}

			if(this.grupoclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoCliente
				this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);

				this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.getgrupoclienteformapago().setGrupoCliente(this.grupocliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGrupoCliente--;	
		
		
		this.grupoclienteAux=new GrupoCliente();
		
		this.grupoclienteAux.setId(this.iIdNuevoGrupoCliente);
		this.grupoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoclienteLogic.getGrupoClientes().add(this.grupoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.grupoclientes.add(this.grupoclienteAux);
		}
		//ARCHITECTURE
		
		this.grupocliente=this.grupoclienteAux;
		
		if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGrupoCliente(this.grupocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoCliente(this.grupocliente);
		}
				
		//this.setDefaultControlesGrupoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGrupoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGrupoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoCliente(this.grupoclienteBean,this.grupocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GrupoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
			classes=GrupoClienteConstantesFunciones.getClassesRelationshipsOfGrupoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.grupoclienteReturnGeneral=grupoclienteLogic.procesarEventosGrupoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoclienteLogic.getGrupoClientes(),this.grupocliente,this.grupoclienteParameterGeneral,this.isEsNuevoGrupoCliente,classes);//this.grupoclienteLogic.getGrupoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGrupoCliente(this.grupoclienteReturnGeneral,this.grupoclienteBean,false);
		
		if(this.grupoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente());
		}
		
		if(this.grupoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente(),classes);//this.grupoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGrupoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGrupoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoClienteBeanSwingJInternalFrameAdditional.RecargarFormGrupoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGrupoCliente(false);
						
			if(grupoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() && GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGrupoClienteFormaPagoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoCliente();
			}
			
			this.actualizarVisualTableDatosGrupoCliente();
			
			this.jTableDatosGrupoCliente.setRowSelectionInterval(this.getIndiceNuevoGrupoCliente(), this.getIndiceNuevoGrupoCliente());
			
			this.seleccionarFilaTablaGrupoClienteActual();
						
			this.actualizarEstadoCeldasBotonesGrupoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGrupoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarcodigoGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarnombreGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarsiglasGrupoCliente);//
		this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarsecuencialGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activardescripcionGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activares_proveGrupoCliente);	
		//
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarid_empresaGrupoCliente);//
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarid_moduloGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarid_cuenta_contableGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setEnabled(isHabilitar && this.grupoclienteConstantesFunciones.activarid_centro_costoGrupoCliente);
	};
	
	public void setDefaultControlesGrupoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGrupoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.grupoclienteSessionBean.setConGuardarRelaciones(true);			
			this.grupoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.grupoclienteSessionBean.setConGuardarRelaciones(false);			
			this.grupoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoGrupoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
				if(grupoclienteAux.getId().equals(this.iIdNuevoGrupoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoCliente grupoclienteAux:this.grupoclientes) {
				if(grupoclienteAux.getId().equals(this.iIdNuevoGrupoCliente)) {
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
	
	public int getIndiceActualGrupoCliente(GrupoCliente grupocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
				if(grupoclienteAux.getId().equals(grupocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoCliente grupoclienteAux:this.grupoclientes) {
				if(grupoclienteAux.getId().equals(grupocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGrupoCliente(GrupoCliente grupoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
				if(grupoclienteAux.getGrupoClienteOriginal().getId().equals(grupoclienteOriginal.getId())) {
					existe=true;
					grupoclienteOriginal.setId(grupoclienteAux.getId());
					grupoclienteOriginal.setVersionRow(grupoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoCliente grupoclienteAux:this.grupoclientes) {
				if(grupoclienteAux.getGrupoClienteOriginal().getId().equals(grupoclienteOriginal.getId())) {
					existe=true;
					grupoclienteOriginal.setId(grupoclienteAux.getId());
					grupoclienteOriginal.setVersionRow(grupoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGrupoCliente(Boolean esParaCancelar) throws Exception {
		grupoclientesAux=new ArrayList<GrupoCliente>();
		grupoclienteAux=new GrupoCliente();
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
					if(grupoclienteAux.getId()<0) {
						grupoclientesAux.add(grupoclienteAux);
					}		
				}
				this.iIdNuevoGrupoCliente=0L;
				this.grupoclienteLogic.getGrupoClientes().removeAll(grupoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoCliente grupoclienteAux:this.grupoclientes) {
					if(grupoclienteAux.getId()<0) {
						grupoclientesAux.add(grupoclienteAux);
					}		
				}
				this.iIdNuevoGrupoCliente=0L;
				this.grupoclientes.removeAll(grupoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGrupoCliente 
					&& this.grupoclienteLogic.getGrupoClientes().size()>0
					) {
					grupoclienteAux=this.grupoclienteLogic.getGrupoClientes().get(this.grupoclienteLogic.getGrupoClientes().size() - 1);
				
					if(grupoclienteAux.getId()<0) {
						this.grupoclienteLogic.getGrupoClientes().remove(grupoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGrupoCliente && this.grupoclientes.size()>0) {
					grupoclienteAux=this.grupoclientes.get(this.grupoclientes.size() - 1);
				
					if(grupoclienteAux.getId()<0) {
						this.grupoclientes.remove(grupoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGrupoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(grupocliente.getId()<0) {
				this.grupoclienteLogic.getGrupoClientes().remove(this.grupocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(grupocliente.getId()<0) {
				this.grupoclientes.remove(this.grupocliente);
			}
		}			
	}
	
	public void setEstadosInicialesGrupoCliente(List<GrupoCliente> grupoclientesAux) throws Exception {
		GrupoClienteConstantesFunciones.setEstadosInicialesGrupoCliente(grupoclientesAux);
	}
	
	public void setEstadosInicialesGrupoCliente(GrupoCliente grupoclienteAux) throws Exception {
		GrupoClienteConstantesFunciones.setEstadosInicialesGrupoCliente(grupoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGrupoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGrupoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGrupoClienteActual()) {
				if(!this.isEsNuevoGrupoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGrupoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGrupoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGrupoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Grupo Cliente ?", "MANTENIMIENTO DE Grupo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGrupoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GrupoCliente grupocliente) throws Exception {
		GrupoClienteConstantesFunciones.seleccionarAsignar(this.grupocliente,grupocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGrupoCliente=this.isPermisoActualizarOriginalGrupoCliente;
			
			
			this.seleccionarAsignar(grupocliente);
			
			

			idCuentaContableActual=grupocliente.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idCentroCostoActual=grupocliente.getid_centro_costo();
			this.seleccionarCentroCostoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoClienteConstantesFunciones.quitarEspaciosGrupoCliente(this.grupocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGrupoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.grupoclienteSessionBean.setsFuncionBusquedaRapida(this.grupoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCentroCostoActual() throws Exception {
		try	{
			CentroCosto centrocostoAux=new CentroCosto();

			if(this.idCentroCostoActual != null && this.idCentroCostoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(this.idCentroCostoActual);
					centrocostoAux= centrocostoLogic.getCentroCosto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				centrocostosForeignKey=new ArrayList<CentroCosto>();
				centrocostosForeignKey.add(centrocostoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGrupoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGrupoCliente(esParaCancelar);				
				this.cancelarNuevoGrupoCliente(esParaCancelar);								
			}
			
			this.grupocliente=new GrupoCliente();
			
			this.inicializarGrupoCliente();
			
			this.actualizarEstadoCeldasBotonesGrupoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGrupoCliente() throws Exception {
		try {
			GrupoClienteConstantesFunciones.inicializarGrupoCliente(this.grupocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.grupoclienteLogic.getGrupoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGrupoClientes(String sAccionBusqueda,List<GrupoCliente> grupoclientesParaReportes) throws Exception {
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
					sPathReporteFinal="GrupoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GrupoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GrupoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GrupoCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Grupo Clientes");		
		parameters.put("busquedapor", GrupoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(GrupoClienteFormaPago.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					GrupoClienteLogic grupoclienteLogicAuxiliar=new GrupoClienteLogic();
					grupoclienteLogicAuxiliar.setDatosCliente(grupoclienteLogic.getDatosCliente());				
					grupoclienteLogicAuxiliar.setGrupoClientes(grupoclientesParaReportes);
					
					grupoclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyGrupoClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					grupoclientesParaReportes=grupoclienteLogicAuxiliar.getGrupoClientes();
					
					//grupoclienteLogic.getNewConnexionToDeep();
					
					//for (GrupoCliente grupocliente:grupoclientesParaReportes) {
					//	grupoclienteLogic.deepLoad(grupocliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//grupoclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//grupoclienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileGrupoClienteFormaPago = AuxiliarReportes.class.getResourceAsStream("GrupoClienteFormaPagoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_grupoclienteformapago", reportFileGrupoClienteFormaPago);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGrupoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GrupoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GrupoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGrupoCliente=new JRBeanArrayDataSource(GrupoClienteJInternalFrame.TraerGrupoClienteBeans(grupoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGrupoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GrupoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GrupoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GrupoClienteBean.TraerGrupoClienteBeans(grupoclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteGrupoClientes(sAccionBusqueda,sTipoArchivoReporte,grupoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGrupoClientes(sAccionBusqueda,sTipoArchivoReporte,grupoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGrupoClienteActionPerformed(null);
					//this.generarExcelReporteGrupoClientes(sAccionBusqueda,sTipoArchivoReporte,grupoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGrupoClientes(sAccionBusqueda,sTipoArchivoReporte,grupoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGrupoClientes(sAccionBusqueda,sTipoArchivoReporte,grupoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGrupoClientes(sAccionBusqueda,sTipoArchivoReporte,grupoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGrupoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoCliente> grupoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GrupoCliente grupocliente : grupoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GrupoClienteConstantesFunciones.generarExcelReporteDataGrupoCliente("NORMAL",row,workbook,grupocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGrupoCliente(String sTipo,Row row,Workbook workbook) {
		
		GrupoClienteConstantesFunciones.generarExcelReporteHeaderGrupoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGrupoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoCliente> grupoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GrupoCliente grupocliente : grupoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getsiglas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_ESPROVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_ESPROVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(grupocliente.getes_prove()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocliente.getcentrocosto_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGrupoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoCliente> grupoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GrupoCliente> grupoclientesRespaldo=null;
		
		classes=GrupoClienteConstantesFunciones.getClassesRelationshipsOfGrupoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.grupoclienteLogic.setDatosCliente(this.datosCliente);
		this.grupoclienteLogic.setDatosDeep(this.datosDeep);
		this.grupoclienteLogic.setIsConDeep(true);
		
		grupoclientesRespaldo=this.grupoclienteLogic.getGrupoClientes();
		
		this.grupoclienteLogic.setGrupoClientes(grupoclientesParaReportes);	
		this.grupoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		grupoclientesParaReportes=this.grupoclienteLogic.getGrupoClientes();
		this.grupoclienteLogic.setGrupoClientes(grupoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GrupoCliente grupocliente : grupoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGrupoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GrupoClienteConstantesFunciones.generarExcelReporteDataGrupoCliente("NORMAL",row,workbook,grupocliente,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupocliente.getClientes()!=null && grupocliente.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(grupocliente.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : grupocliente.getClientes()) {
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


				//GrupoClienteFormaPago
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupocliente.getGrupoClienteFormaPagos()!=null && grupocliente.getGrupoClienteFormaPagos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					GrupoClienteFormaPagoConstantesFunciones.generarExcelReporteHeaderGrupoClienteFormaPago("RELACIONADO",row,workbook);
				}

				if(grupocliente.getGrupoClienteFormaPagos()!=null) {
					i2=0;
					for(GrupoClienteFormaPago grupoclienteformapago : grupocliente.getGrupoClienteFormaPagos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						GrupoClienteFormaPagoConstantesFunciones.generarExcelReporteDataGrupoClienteFormaPago("RELACIONADO",row,workbook,grupoclienteformapago,cellStyleDataAuxHijo);
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
		cell.setCellValue(GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGrupoCliente() throws Exception {		
		this.startProcessGrupoCliente(true);
	}
	
	public void startProcessGrupoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGrupoCliente ,this.jPanelParametrosReportesGrupoCliente, this.jScrollPanelDatosGrupoCliente,this.jPanelPaginacionGrupoCliente, this.jScrollPanelDatosEdicionGrupoCliente, this.jPanelAccionesGrupoCliente,this.jPanelAccionesFormularioGrupoCliente,this.jmenuBarGrupoCliente,this.jmenuBarDetalleGrupoCliente,this.jTtoolBarGrupoCliente,this.jTtoolBarDetalleGrupoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoCliente=this.jTabbedPaneBusquedasGrupoCliente; 
		
		final JPanel jPanelParametrosReportesGrupoCliente=this.jPanelParametrosReportesGrupoCliente;
		//final JScrollPane jScrollPanelDatosGrupoCliente=this.jScrollPanelDatosGrupoCliente;
		final JTable jTableDatosGrupoCliente=this.jTableDatosGrupoCliente;		
		final JPanel jPanelPaginacionGrupoCliente=this.jPanelPaginacionGrupoCliente;
		//final JScrollPane jScrollPanelDatosEdicionGrupoCliente=this.jScrollPanelDatosEdicionGrupoCliente;
		final JPanel jPanelAccionesGrupoCliente=this.jPanelAccionesGrupoCliente;
		
		JPanel jPanelCamposAuxiliarGrupoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGrupoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			jPanelCamposAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jPanelCamposGrupoCliente;
			jPanelAccionesFormularioAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jPanelAccionesFormularioGrupoCliente;
		}
		
		final JPanel jPanelCamposGrupoCliente=jPanelCamposAuxiliarGrupoCliente;
		final JPanel jPanelAccionesFormularioGrupoCliente=jPanelAccionesFormularioAuxiliarGrupoCliente;
		
		
		final JMenuBar jmenuBarGrupoCliente=this.jmenuBarGrupoCliente;
		final JToolBar jTtoolBarGrupoCliente=this.jTtoolBarGrupoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGrupoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			jmenuBarDetalleAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jmenuBarDetalleGrupoCliente;
			jTtoolBarDetalleAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jTtoolBarDetalleGrupoCliente;
		}
		
		final JMenuBar jmenuBarDetalleGrupoCliente=jmenuBarDetalleAuxiliarGrupoCliente;
		final JToolBar jTtoolBarDetalleGrupoCliente=jTtoolBarDetalleAuxiliarGrupoCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoCliente;
			processRunnable.jTableDatos=jTableDatosGrupoCliente;
			processRunnable.jPanelCampos=jPanelCamposGrupoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoCliente;
			processRunnable.jTtoolBar=jTtoolBarGrupoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoCliente ,jPanelParametrosReportesGrupoCliente,jTableDatosGrupoCliente, /*jScrollPanelDatosGrupoCliente,*/jPanelCamposGrupoCliente,jPanelPaginacionGrupoCliente, /*jScrollPanelDatosEdicionGrupoCliente,*/ jPanelAccionesGrupoCliente,jPanelAccionesFormularioGrupoCliente,jmenuBarGrupoCliente,jmenuBarDetalleGrupoCliente,jTtoolBarGrupoCliente,jTtoolBarDetalleGrupoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoCliente ,jPanelParametrosReportesGrupoCliente, jScrollPanelDatosGrupoCliente,jPanelPaginacionGrupoCliente, jScrollPanelDatosEdicionGrupoCliente, jPanelAccionesGrupoCliente,jPanelAccionesFormularioGrupoCliente,jmenuBarGrupoCliente,jmenuBarDetalleGrupoCliente,jTtoolBarGrupoCliente,jTtoolBarDetalleGrupoCliente);
						
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
	
	public void finishProcessGrupoCliente() {// throws Exception 
		this.finishProcessGrupoCliente(true);
	}
	
	public void finishProcessGrupoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGrupoCliente ,this.jPanelParametrosReportesGrupoCliente, this.jScrollPanelDatosGrupoCliente,this.jPanelPaginacionGrupoCliente, this.jScrollPanelDatosEdicionGrupoCliente, this.jPanelAccionesGrupoCliente,this.jPanelAccionesFormularioGrupoCliente,this.jmenuBarGrupoCliente,this.jmenuBarDetalleGrupoCliente,this.jTtoolBarGrupoCliente,this.jTtoolBarDetalleGrupoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoCliente=this.jTabbedPaneBusquedasGrupoCliente; 
		
		final JPanel jPanelParametrosReportesGrupoCliente=this.jPanelParametrosReportesGrupoCliente;
		//final JScrollPane jScrollPanelDatosGrupoCliente=this.jScrollPanelDatosGrupoCliente;
		final JTable jTableDatosGrupoCliente=this.jTableDatosGrupoCliente;		
		final JPanel jPanelPaginacionGrupoCliente=this.jPanelPaginacionGrupoCliente;
		//final JScrollPane jScrollPanelDatosEdicionGrupoCliente=this.jScrollPanelDatosEdicionGrupoCliente;
		final JPanel jPanelAccionesGrupoCliente=this.jPanelAccionesGrupoCliente;
		
		JPanel jPanelCamposAuxiliarGrupoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGrupoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			jPanelCamposAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jPanelCamposGrupoCliente;
			jPanelAccionesFormularioAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jPanelAccionesFormularioGrupoCliente;
		}
		
		final JPanel jPanelCamposGrupoCliente=jPanelCamposAuxiliarGrupoCliente;
		final JPanel jPanelAccionesFormularioGrupoCliente=jPanelAccionesFormularioAuxiliarGrupoCliente;
		
		
		final JMenuBar jmenuBarGrupoCliente=this.jmenuBarGrupoCliente;		
		final JToolBar jTtoolBarGrupoCliente=this.jTtoolBarGrupoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarGrupoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			jmenuBarDetalleAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jmenuBarDetalleGrupoCliente;
			jTtoolBarDetalleAuxiliarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jTtoolBarDetalleGrupoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleGrupoCliente=jmenuBarDetalleAuxiliarGrupoCliente;
		final JToolBar jTtoolBarDetalleGrupoCliente=jTtoolBarDetalleAuxiliarGrupoCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoCliente;
			processRunnable.jTableDatos=jTableDatosGrupoCliente;
			processRunnable.jPanelCampos=jPanelCamposGrupoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoCliente;
			processRunnable.jTtoolBar=jTtoolBarGrupoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGrupoCliente ,jPanelParametrosReportesGrupoCliente, jTableDatosGrupoCliente,/*jScrollPanelDatosGrupoCliente,*/jPanelCamposGrupoCliente,jPanelPaginacionGrupoCliente, /*jScrollPanelDatosEdicionGrupoCliente,*/ jPanelAccionesGrupoCliente,jPanelAccionesFormularioGrupoCliente,jmenuBarGrupoCliente,jmenuBarDetalleGrupoCliente,jTtoolBarGrupoCliente,jTtoolBarDetalleGrupoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGrupoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGrupoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGrupoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGrupoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGrupoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGrupoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGrupoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGrupoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGrupoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.grupoclienteConstantesFunciones.getsFinalQueryGrupoCliente();
		String  finalQueryPaginacionTodos=this.grupoclienteConstantesFunciones.getsFinalQueryGrupoCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesNoGrupoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.grupoclientesEliminados= new ArrayList<GrupoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGrupoCliente();
		
				///*GrupoClienteSessionBean*/this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			
			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
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
					this.iNumeroPaginacion=GrupoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GrupoClienteConstantesFunciones.getClassesForeignKeysOfGrupoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/grupocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			grupoclientesAux= new ArrayList<GrupoCliente>();
			
				
			grupoclienteLogic.setDatosCliente(this.datosCliente);
			grupoclienteLogic.setDatosDeep(this.datosDeep);
			grupoclienteLogic.setIsConDeep(true);
			
			
			grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					grupoclienteLogic.getTodosGrupoClientes(finalQueryGlobal,pagination);
					
					//grupoclienteLogic.getTodosGrupoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(grupoclienteLogic.getGrupoClientes()==null|| grupoclienteLogic.getGrupoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoclientesAux= new ArrayList<GrupoCliente>();
							grupoclientesAux.addAll(grupoclienteLogic.getGrupoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientesAux= new ArrayList<GrupoCliente>();
							grupoclientesAux.addAll(grupoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoclienteLogic.getTodosGrupoClientes(finalQueryGlobal+"",this.pagination);												
							
							//grupoclienteLogic.getTodosGrupoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGrupoClientes("Todos",grupoclienteLogic.getGrupoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoclienteLogic.setGrupoClientes(new ArrayList<GrupoCliente>());					
							grupoclienteLogic.getGrupoClientes().addAll(grupoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientes=new ArrayList<GrupoCliente>();
							grupoclientes.addAll(grupoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGrupoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGrupoCliente=this.idActual;
				
				} else if(this.idGrupoClienteActual!=null && this.idGrupoClienteActual!=0L) {
					idGrupoCliente=idGrupoClienteActual;
				}
				
					
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndicePorId(idGrupoCliente);
				
				this.grupoclientes=new ArrayList<GrupoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					grupoclienteLogic.getEntity(idGrupoCliente);
					
					//grupoclienteLogic.getEntityWithConnection(idGrupoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.setGrupoClientes(new ArrayList<GrupoCliente>());
					grupoclienteLogic.getGrupoClientes().add(grupoclienteLogic.getGrupoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoclientes=new ArrayList<GrupoCliente>();
					this.grupoclientes.add(grupocliente);
				}
				
				if(grupoclienteLogic.getGrupoCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteLogic.getGrupoClientesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteLogic.getGrupoClientes()==null||grupoclienteLogic.getGrupoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclientes==null|| grupoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclientesAux=new ArrayList<GrupoCliente>();
						grupoclientesAux.addAll(grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientesAux=new ArrayList<GrupoCliente>();
							grupoclientesAux.addAll(grupoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteLogic.getGrupoClientesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClientes("BusquedaPorCodigo",grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClientes("BusquedaPorCodigo",grupoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.setGrupoClientes(new ArrayList<GrupoCliente>());
						grupoclienteLogic.getGrupoClientes().addAll(grupoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientes=new ArrayList<GrupoCliente>();
							grupoclientes.addAll(grupoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteLogic.getGrupoClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteLogic.getGrupoClientes()==null||grupoclienteLogic.getGrupoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclientes==null|| grupoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclientesAux=new ArrayList<GrupoCliente>();
						grupoclientesAux.addAll(grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientesAux=new ArrayList<GrupoCliente>();
							grupoclientesAux.addAll(grupoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteLogic.getGrupoClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClientes("BusquedaPorNombre",grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClientes("BusquedaPorNombre",grupoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.setGrupoClientes(new ArrayList<GrupoCliente>());
						grupoclienteLogic.getGrupoClientes().addAll(grupoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientes=new ArrayList<GrupoCliente>();
							grupoclientes.addAll(grupoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSiglas")) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteLogic.getGrupoClientesBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteLogic.getGrupoClientes()==null||grupoclienteLogic.getGrupoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclientes==null|| grupoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclientesAux=new ArrayList<GrupoCliente>();
						grupoclientesAux.addAll(grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientesAux=new ArrayList<GrupoCliente>();
							grupoclientesAux.addAll(grupoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteLogic.getGrupoClientesBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClientes("BusquedaPorSiglas",grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClientes("BusquedaPorSiglas",grupoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.setGrupoClientes(new ArrayList<GrupoCliente>());
						grupoclienteLogic.getGrupoClientes().addAll(grupoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientes=new ArrayList<GrupoCliente>();
							grupoclientes.addAll(grupoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteLogic.getGrupoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteLogic.getGrupoClientes()==null||grupoclienteLogic.getGrupoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclientes==null|| grupoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclientesAux=new ArrayList<GrupoCliente>();
						grupoclientesAux.addAll(grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientesAux=new ArrayList<GrupoCliente>();
							grupoclientesAux.addAll(grupoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteLogic.getGrupoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClientes("FK_IdEmpresa",grupoclienteLogic.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClientes("FK_IdEmpresa",grupoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteLogic.setGrupoClientes(new ArrayList<GrupoCliente>());
						grupoclienteLogic.getGrupoClientes().addAll(grupoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclientes=new ArrayList<GrupoCliente>();
							grupoclientes.addAll(grupoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGrupoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGrupoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoclienteLogic.getGrupoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoclienteLogic.getGrupoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GrupoCliente grupocliente) {
		Boolean permite=true;
		
		if(this.grupocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GrupoClienteConstantesFunciones.getOrderByListaGrupoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GrupoClienteConstantesFunciones.getOrderByListaGrupoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoCliente grupocliente:grupoclienteLogic.getGrupoClientes()) {
				if(grupocliente.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteTotales=grupocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoCliente grupocliente:this.grupoclientes) {
				if(grupocliente.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteTotales=grupocliente;
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
			this.grupoclienteAux=new GrupoCliente();
			this.grupoclienteAux.setsType(Constantes2.S_TOTALES);
			this.grupoclienteAux.setIsNew(false);
			this.grupoclienteAux.setIsChanged(false);
			this.grupoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GrupoClienteConstantesFunciones.TotalizarValoresFilaGrupoCliente(this.grupoclienteLogic.getGrupoClientes(),this.grupoclienteAux);
				
				this.grupoclienteLogic.getGrupoClientes().add(this.grupoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GrupoClienteConstantesFunciones.TotalizarValoresFilaGrupoCliente(this.grupoclientes,this.grupoclienteAux);
				
				this.grupoclientes.add(this.grupoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		grupoclienteTotales=new GrupoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoclienteLogic.getGrupoClientes().remove(grupoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoclientes.remove(grupoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		grupoclienteTotales=new GrupoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoCliente grupocliente:grupoclienteLogic.getGrupoClientes()) {
				if(grupocliente.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteTotales=grupocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoClienteConstantesFunciones.TotalizarValoresFilaGrupoCliente(this.grupoclienteLogic.getGrupoClientes(),grupoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoCliente grupocliente:this.grupoclientes) {
				if(grupocliente.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteTotales=grupocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoClienteConstantesFunciones.TotalizarValoresFilaGrupoCliente(this.grupoclientes,grupoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGrupoClientesBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientesBusquedaPorSiglas()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSiglas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientesFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientesFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientesFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClientePorEmpresaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getGrupoClientesBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientesBusquedaPorSiglas(String sFinalQuery,String siglas)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesBusquedaPorSiglas(sFinalQuery,this.pagination,siglas);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientesFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientesFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientesFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientesFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClientePorEmpresaPorCodigo(Long id_empresa,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClientePorEmpresaPorCodigo(id_empresa,codigo);
				
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
	
	public void inicializarPermisosGrupoCliente() {
		this.isPermisoTodoGrupoCliente=false;
		this.isPermisoNuevoGrupoCliente=false;
		this.isPermisoActualizarGrupoCliente=false;
		this.isPermisoActualizarOriginalGrupoCliente=false;
		this.isPermisoEliminarGrupoCliente=false;
		this.isPermisoGuardarCambiosGrupoCliente=false;
		this.isPermisoConsultaGrupoCliente=false;
		this.isPermisoBusquedaGrupoCliente=false;
		this.isPermisoReporteGrupoCliente=false;		
		this.isPermisoOrdenGrupoCliente=false;		
		this.isPermisoPaginacionMedioGrupoCliente=false;		
		this.isPermisoPaginacionAltoGrupoCliente=false;
		this.isPermisoPaginacionTodoGrupoCliente=false;
		this.isPermisoCopiarGrupoCliente=false;		
		this.isPermisoVerFormGrupoCliente=false;		
		this.isPermisoDuplicarGrupoCliente=false;		
		this.isPermisoOrdenGrupoCliente=false;		
	}
	
	public void setPermisosUsuarioGrupoCliente(Boolean isPermiso) {
		this.isPermisoTodoGrupoCliente=isPermiso;
		this.isPermisoNuevoGrupoCliente=isPermiso;
		this.isPermisoActualizarGrupoCliente=isPermiso;
		this.isPermisoActualizarOriginalGrupoCliente=isPermiso;
		this.isPermisoEliminarGrupoCliente=isPermiso;
		this.isPermisoGuardarCambiosGrupoCliente=isPermiso;
		this.isPermisoConsultaGrupoCliente=isPermiso;
		this.isPermisoBusquedaGrupoCliente=isPermiso;
		this.isPermisoReporteGrupoCliente=isPermiso;
		this.isPermisoOrdenGrupoCliente=isPermiso;		
		this.isPermisoPaginacionMedioGrupoCliente=isPermiso;		
		this.isPermisoPaginacionAltoGrupoCliente=isPermiso;		
		this.isPermisoPaginacionTodoGrupoCliente=isPermiso;		
		this.isPermisoCopiarGrupoCliente=isPermiso;		
		this.isPermisoVerFormGrupoCliente=isPermiso;		
		this.isPermisoDuplicarGrupoCliente=isPermiso;
		this.isPermisoOrdenGrupoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGrupoCliente(Boolean isPermiso) {
		//this.isPermisoTodoGrupoCliente=isPermiso;
		this.isPermisoNuevoGrupoCliente=isPermiso;
		this.isPermisoActualizarGrupoCliente=isPermiso;
		this.isPermisoActualizarOriginalGrupoCliente=isPermiso;
		this.isPermisoEliminarGrupoCliente=isPermiso;
		this.isPermisoGuardarCambiosGrupoCliente=isPermiso;
		//this.isPermisoConsultaGrupoCliente=isPermiso;
		//this.isPermisoBusquedaGrupoCliente=isPermiso;
		//this.isPermisoReporteGrupoCliente=isPermiso;
		//this.isPermisoOrdenGrupoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioGrupoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoGrupoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoGrupoCliente=isPermiso;		
		//this.isPermisoCopiarGrupoCliente=isPermiso;		
		//this.isPermisoDuplicarGrupoCliente=isPermiso;
		//this.isPermisoOrdenGrupoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGrupoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(GrupoClienteFormaPagoConstantesFunciones.SNOMBREOPCION);
		
		if(GrupoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionGrupoClienteClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosGrupoClienteFormaPago=false;
		this.isTienePermisosGrupoClienteFormaPago=this.verificarGetPermisosUsuarioOpcionGrupoClienteClaseRelacionada(this.opcionsRelacionadas,GrupoClienteFormaPagoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGrupoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGrupoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosGrupoClienteFormaPago=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioGrupoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGrupoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGrupoClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.remove(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosGrupoClienteFormaPago && this.jInternalFrameDetalleFormGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.remove(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioGrupoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GrupoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GrupoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGrupoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGrupoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGrupoCliente=this.isPermisoActualizarGrupoCliente;
			this.isPermisoEliminarGrupoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGrupoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGrupoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGrupoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGrupoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGrupoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGrupoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGrupoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGrupoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGrupoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGrupoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGrupoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGrupoCliente.setToolTipText(this.jTableDatosGrupoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGrupoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGrupoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GrupoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GrupoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGrupoCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.grupoclienteConstantesFunciones.mostrarClienteGrupoCliente && !GrupoClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosGrupoClienteFormaPago && this.grupoclienteConstantesFunciones.mostrarGrupoClienteFormaPagoGrupoCliente && !GrupoClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Grupo Cliente Forma Pago");
			reporte.setsDescripcion("Grupo Cliente Forma Pago");
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
	public void inicializarCombosForeignKeyGrupoClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GrupoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGrupoClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GrupoClienteParameterReturnGeneral grupoclienteReturnGeneral=new GrupoClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.grupoclienteConstantesFunciones.cargarid_empresaGrupoCliente)
					 || (this.esRecargarFks && this.grupoclienteConstantesFunciones.cargarid_empresaGrupoCliente)) {

					if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+grupoclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.grupoclienteConstantesFunciones.cargarid_moduloGrupoCliente)
					 || (this.esRecargarFks && this.grupoclienteConstantesFunciones.cargarid_moduloGrupoCliente)) {

					if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+grupoclienteSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.grupoclienteConstantesFunciones.cargarid_cuenta_contableGrupoCliente)
					 || (this.esRecargarFks && this.grupoclienteConstantesFunciones.cargarid_cuenta_contableGrupoCliente)) {

					if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+grupoclienteSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.grupoclienteConstantesFunciones.cargarid_centro_costoGrupoCliente)
					 || (this.esRecargarFks && this.grupoclienteConstantesFunciones.cargarid_centro_costoGrupoCliente)) {

					if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+grupoclienteSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				grupoclienteReturnGeneral=grupoclienteLogic.cargarCombosLoteForeignKeyGrupoCliente(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalCuentaContable,finalQueryGlobalCentroCosto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=grupoclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=grupoclienteReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=grupoclienteReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=grupoclienteReturnGeneral.getcentrocostosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGrupoCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyCentroCosto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.grupoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGrupoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGrupoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGrupoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGrupoCliente(GrupoCliente grupocliente)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(grupocliente.getid_cuenta_contable(),false,"Formulario");
			this.setActualCentroCostoForeignKey(grupocliente.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGrupoCliente(GrupoCliente grupocliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(grupocliente.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableGrupoCliente")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(grupocliente.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(grupocliente.getCentroCosto()!=null && !sTipoEvento.equals("id_centro_costoGrupoCliente")) { //sTipoEvento Evita Bucle Infinito

					this.centrocostosForeignKey=new ArrayList<CentroCosto>();
					this.centrocostosForeignKey.add(grupocliente.getCentroCosto());

					this.addItemDefectoCombosForeignKeyCentroCosto();
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGrupoCliente()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.grupoclienteConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCentroCostoForeignKey(this.grupoclienteConstantesFunciones.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGrupoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGrupoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGrupoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGrupoCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGrupoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public GrupoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GrupoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrupoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.grupoclienteSessionBean=new GrupoClienteSessionBean(); 
		this.grupoclienteConstantesFunciones=new GrupoClienteConstantesFunciones(); 
		this.grupoclienteBean=new GrupoCliente();//(this.grupoclienteConstantesFunciones); 		
		this.grupoclienteReturnGeneral=new GrupoClienteParameterReturnGeneral(); 
		
		this.grupoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GrupoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GrupoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GrupoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGrupoCliente(true);
			
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
			
			this.grupoclienteConstantesFunciones=new GrupoClienteConstantesFunciones(); 
			this.grupoclienteBean=new GrupoCliente();//this.grupoclienteConstantesFunciones); 			
			this.grupoclienteReturnGeneral=new GrupoClienteParameterReturnGeneral(); 
		
			GrupoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.grupocliente=new GrupoCliente();
			this.grupoclientes = new ArrayList<GrupoCliente>();
			this.grupoclientesAux = new ArrayList<GrupoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic=new GrupoClienteLogic();
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.grupoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.grupoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGrupoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoCliente);	
					}
					
					if(this.jInternalFrameImportacionGrupoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGrupoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGrupoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoCliente);
				this.jInternalFrameDetalleFormGrupoCliente.setVisible(false);
				this.jInternalFrameDetalleFormGrupoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoCliente);
					this.jInternalFrameReporteDinamicoGrupoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoGrupoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGrupoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGrupoCliente);
					this.jInternalFrameImportacionGrupoCliente.setVisible(false);
					this.jInternalFrameImportacionGrupoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGrupoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGrupoCliente);
					this.jInternalFrameOrderByGrupoCliente.setVisible(false);
					this.jInternalFrameOrderByGrupoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGrupoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GrupoClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.grupoclienteReturnGeneral=new GrupoClienteParameterReturnGeneral();
			
			this.grupoclienteParameterGeneral=new GrupoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.grupoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GrupoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(GrupoClienteFormaPagoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoclienteSessionBean.getEsGuardarRelacionado(),this.grupoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoclienteSessionBean.getEsGuardarRelacionado(),this.grupoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaDuplicarGrupoCliente=true;
			this.isVisibilidadCeldaCopiarGrupoCliente=true;
			this.isVisibilidadCeldaVerFormGrupoCliente=true;
			this.isVisibilidadCeldaOrdenGrupoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
			this.isVisibilidadCeldaModificarGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=false;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=false;
			this.isVisibilidadCeldaGuardarGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSiglas=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGrupoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGrupoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGrupoCliente(false);
			
			this.setPermisosUsuarioGrupoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.grupoclienteSessionBean.getEsGuardarRelacionado() && this.grupoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGrupoClienteClasesRelacionadas();
			}
			
			if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGrupoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGrupoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGrupoCliente();
			}
			
			if(!this.isPermisoBusquedaGrupoCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGrupoCliente,this.isPermisoPaginacionMedioGrupoCliente,this.isPermisoPaginacionTodoGrupoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GrupoClienteConstantesFunciones.getTiposSeleccionarGrupoCliente());
				
				this.tiposColumnasSelect=GrupoClienteConstantesFunciones.getTiposSeleccionarGrupoCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectGrupoCliente();				
				//this.tiposRelacionesSelect=GrupoClienteConstantesFunciones.getTiposRelacionesGrupoCliente(true);
				
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
			//if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGrupoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioGrupoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioGrupoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoCliente() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.grupoclienteformapagoLogic=new GrupoClienteFormaPagoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.moduloLogic=new ModuloLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				grupoclienteImplementable= (GrupoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				grupoclienteImplementableHome= (GrupoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.grupoclientes= new ArrayList<GrupoCliente>();
			this.grupoclientesEliminados= new ArrayList<GrupoCliente>();
						
			this.isEsNuevoGrupoCliente=false;
			this.esParaAccionDesdeFormularioGrupoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			this.idCentroCostoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGrupoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGrupoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GrupoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GrupoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGrupoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGrupoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGrupoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGrupoCliente();
			}
			
			GrupoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGrupoCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGrupoCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGrupoCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGrupoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GrupoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGrupoCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGrupoCliente")) {
				iIndex=this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoCliente();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Grupo Cliente Forma Pagos")) {
					if(!GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoCliente();

						this.cargarParteTabPanelRelacionadaGrupoClienteFormaPago(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGrupoCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoCliente.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesGrupoCliente.updateUI();
		//this.jTabbedPaneRelacionesGrupoCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoCliente.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaGrupoClienteFormaPago(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoCliente.cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(false,true,iIndex);
		this.jButtonGrupoClienteFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaGrupoClienteFormaPago();

		//this.jTabbedPaneRelacionesGrupoCliente.updateUI();
		//this.jTabbedPaneRelacionesGrupoCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosGrupoCliente.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("GrupoClienteFormaPago")) {
				int row=this.jTableDatosGrupoCliente.getSelectedRow();
				jButtonGrupoClienteFormaPagoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.grupoclienteConstantesFunciones.mostrarClienteGrupoCliente && !GrupoClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(grupoclienteConstantesFunciones.resaltarClienteGrupoCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoclienteConstantesFunciones.resaltarClienteGrupoCliente);
						}

						jmenuItem.setEnabled(this.grupoclienteConstantesFunciones.activarClienteGrupoCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormGrupoCliente.jmenuDetalleGrupoCliente.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Grupo Cliente Forma Pago")) {

					if(this.isTienePermisosGrupoClienteFormaPago && this.grupoclienteConstantesFunciones.mostrarGrupoClienteFormaPagoGrupoCliente && !GrupoClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Grupo Cliente Forma Pagos"+"("+GrupoClienteFormaPagoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Grupo Cliente Forma Pagos");

						if(grupoclienteConstantesFunciones.resaltarGrupoClienteFormaPagoGrupoCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoclienteConstantesFunciones.resaltarGrupoClienteFormaPagoGrupoCliente);
						}

						jmenuItem.setEnabled(this.grupoclienteConstantesFunciones.activarGrupoClienteFormaPagoGrupoCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GrupoClienteFormaPago"));

						

						this.jInternalFrameDetalleFormGrupoCliente.jmenuDetalleGrupoCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGrupoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGrupoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGrupoCliente();
		
		this.cargarCombosFrameForeignKeyGrupoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGrupoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGrupoCliente();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoGrupoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			
			if(jTableDatosGrupoCliente.getRowCount()>=1) {
				jTableDatosGrupoCliente.removeRowSelectionInterval(0, jTableDatosGrupoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoGrupoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGrupoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGrupoCliente(true);			
			//this.grupocliente=new GrupoCliente();
			//this.grupocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoCliente() ;
			
			if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.grupocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);				
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GrupoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGrupoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGrupoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGrupoCliente.getSelectedRows().length;			
			}
			
			grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGrupoCliente--;			
				//GrupoCliente grupoclienteAux= new GrupoCliente();			
				//grupoclienteAux.setId(this.iIdNuevoGrupoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GrupoCliente grupoclienteOrigen=new GrupoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GrupoCliente grupoclienteOrigen : grupoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							grupoclienteOrigen =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteOrigen =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGrupoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.grupocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGrupoCliente(grupoclienteOrigen,this.grupocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoclienteLogic.getGrupoClientes().add(this.grupoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoclientes.add(this.grupoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGrupoCliente(false);
				
				this.jTableDatosGrupoCliente.setRowSelectionInterval(this.getIndiceNuevoGrupoCliente(), this.getIndiceNuevoGrupoCliente());
				
				int iLastRow =  this.jTableDatosGrupoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();									
		
			GrupoCliente grupoclienteOrigen=new GrupoCliente();
			GrupoCliente grupoclienteDestino=new GrupoCliente();
				
			grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGrupoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || grupoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGrupoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteOrigen =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoclienteOrigen =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteDestino =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoclienteDestino =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				grupoclienteOrigen =grupoclientesSeleccionados.get(0);
				grupoclienteDestino =grupoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGrupoCliente(grupoclienteOrigen,grupoclienteDestino,true,false);
				
				grupoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoclienteDestino,grupoclienteLogic.getGrupoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteDestino,grupoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGrupoCliente(false);
				
				//this.jTableDatosGrupoCliente.setRowSelectionInterval(this.getIndiceNuevoGrupoCliente(), this.getIndiceNuevoGrupoCliente());
				
				int iLastRow =  this.jTableDatosGrupoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGrupoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGrupoCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGrupoCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGrupoCliente.setVisible(!isVisible);
			this.jPanelPaginacionGrupoCliente.setVisible(!isVisible);
			this.jPanelAccionesGrupoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGrupoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGrupoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGrupoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGrupoCliente();
			
			this.abrirFrameOrderByGrupoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGrupoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGrupoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGrupoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormGrupoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGrupoCliente.setSize(this.jInternalFrameDetalleFormGrupoCliente.iWidthFormulario,this.jInternalFrameDetalleFormGrupoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGrupoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGrupoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGrupoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormGrupoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGrupoCliente.jContentPaneDetalleGrupoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGrupoCliente.jContentPaneDetalleGrupoCliente.getWidth(),GrupoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGrupoCliente.jContentPaneDetalleGrupoCliente.getWidth(),GrupoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGrupoCliente.jContentPaneDetalleGrupoCliente.getWidth(),GrupoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGrupoClienteFormaPago();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGrupoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormGrupoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGrupoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGrupoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGrupoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoCliente,false,this);
				} else {
					this.jInternalFrameOrderByGrupoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGrupoCliente);
				this.jInternalFrameOrderByGrupoCliente.setVisible(false);
				this.jInternalFrameOrderByGrupoCliente.setSelected(false);
				
				this.jInternalFrameOrderByGrupoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByGrupoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGrupoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGrupoCliente==null) {
				
				this.jInternalFrameImportacionGrupoCliente=new ImportacionJInternalFrame(GrupoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGrupoCliente);
				this.jInternalFrameImportacionGrupoCliente.setVisible(false);
				this.jInternalFrameImportacionGrupoCliente.setSelected(false);


				this.jInternalFrameImportacionGrupoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoCliente"));
				this.jInternalFrameImportacionGrupoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoCliente"));
				this.jInternalFrameImportacionGrupoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGrupoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGrupoCliente==null) {
				this.jInternalFrameReporteDinamicoGrupoCliente=new ReporteDinamicoJInternalFrame(GrupoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoCliente);
				this.jInternalFrameReporteDinamicoGrupoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoGrupoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGrupoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoCliente"));
				this.jInternalFrameReporteDinamicoGrupoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoCliente"));
				this.jInternalFrameReporteDinamicoGrupoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoCliente.jContentPaneDetalleGrupoCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaGrupoClienteFormaPago() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.jScrollPanelDatosGrupoClienteFormaPago.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoCliente.jContentPaneDetalleGrupoCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.jScrollPanelDatosGrupoClienteFormaPago.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.jScrollPanelDatosGrupoClienteFormaPago.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.jScrollPanelDatosGrupoClienteFormaPago.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleGrupoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoCliente);
			
	       	this.jInternalFrameDetalleFormGrupoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormGrupoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormGrupoCliente.dispose();
			//this.jInternalFrameDetalleFormGrupoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGrupoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGrupoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoGrupoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGrupoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGrupoCliente.setVisible(true);
	        this.jInternalFrameImportacionGrupoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGrupoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGrupoCliente.setVisible(true);
	        this.jInternalFrameOrderByGrupoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGrupoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGrupoCliente.setVisible(false);
	        this.jInternalFrameOrderByGrupoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGrupoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGrupoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoGrupoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGrupoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGrupoCliente.setVisible(false);
	        this.jInternalFrameImportacionGrupoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderGrupoCliente.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderGrupoCliente.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGrupoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGrupoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGrupoCliente(true);
			//this.isEsNuevoGrupoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGrupoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoCliente(false) ;
			
			if(grupoclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() && GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGrupoClienteFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGrupoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGrupoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGrupoCliente(true);
			//this.isEsNuevoGrupoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.grupocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGrupoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGrupoCliente(false) ;
			
			if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.grupoclienteConstantesFunciones.cargarid_cuenta_contableGrupoCliente) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingGrupoCliente(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("CentroCosto")) {
				if(!this.grupoclienteConstantesFunciones.cargarid_centro_costoGrupoCliente) {
					this.cargarCombosCentroCostosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingGrupoCliente(false,false);
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_centro_costo (id);

				this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGrupoCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGrupoCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_centro_costo (Long id) throws Exception {
		this.setActualCentroCostoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGrupoCliente(false);
			
			//if(!this.isEsNuevoGrupoCliente) {								
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				
			}
			
			if(this.permiteMantenimiento(this.grupocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGrupoCliente=true;
					this.inicializarActualizarBindingTablaGrupoCliente(false);
					this.isEsNuevoGrupoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGrupoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGrupoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoCliente(false);
				
				this.habilitarDeshabilitarControlesGrupoCliente(false);
			
												
				
				if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGrupoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGrupoClienteActionPerformed(evt,grupoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGrupoCliente(this.grupocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGrupoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,grupoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.grupocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				this.grupocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				this.grupocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.grupocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GrupoClienteModel) this.jTableDatosGrupoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGrupoCliente=true;
				this.inicializarActualizarBindingTablaGrupoCliente(false);
				this.isEsNuevoGrupoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoCliente(false);
				
				this.habilitarDeshabilitarControlesGrupoCliente(false);
				
				
				
				if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGrupoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGrupoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGrupoCliente.getRowCount()>=1) {
				jTableDatosGrupoCliente.removeRowSelectionInterval(0, jTableDatosGrupoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGrupoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGrupoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoCliente(false) ;
			
			this.isEsNuevoGrupoCliente=false;
			
			if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGrupoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGrupoCliente(false);
				
				//SI ES MANUAL
				if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGrupoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGrupoCliente--;			
			//GrupoCliente grupoclienteAux= new GrupoCliente();			
			//grupoclienteAux.setId(this.iIdNuevoGrupoCliente);
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGrupoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
			
			this.grupocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.grupoclienteLogic.getGrupoClientes().add(this.grupoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.grupoclientes.add(this.grupoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGrupoCliente(false);
			
			this.jTableDatosGrupoCliente.setRowSelectionInterval(this.getIndiceNuevoGrupoCliente(), this.getIndiceNuevoGrupoCliente());
			
			int iLastRow =  this.jTableDatosGrupoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGrupoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGrupoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGrupoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGrupoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoCliente(false);
			
			//SI ES MANUAL
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoCliente();
			}
			
			//this.abrirFrameTreeGrupoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Grupo ClienteS ?", "MANTENIMIENTO DE Grupo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGrupoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGrupoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.grupoclienteReturnGeneral=grupoclienteLogic.procesarImportacionGrupoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.grupoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGrupoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGrupoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGrupoCliente.setFileImportacion(this.jInternalFrameImportacionGrupoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGrupoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGrupoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGrupoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGrupoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		

		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GrupoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GrupoClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_ESPROVE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Prove_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Prove_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Prove_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Prove_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGrupoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GrupoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case GrupoClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case GrupoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case GrupoClienteConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;

				case GrupoClienteConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case GrupoClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case GrupoClienteConstantesFunciones.LABEL_ESPROVE:
					sNombreCampoCategoria="es_prove";
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GrupoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case GrupoClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case GrupoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case GrupoClienteConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;

				case GrupoClienteConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case GrupoClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case GrupoClienteConstantesFunciones.LABEL_ESPROVE:
					sNombreCampoCategoriaValor="es_prove";
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case GrupoClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case GrupoClienteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case GrupoClienteConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
					break;

				case GrupoClienteConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case GrupoClienteConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case GrupoClienteConstantesFunciones.LABEL_ESPROVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Proveedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_prove");
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
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
	
	public void jButtonGenerarExcelReporteDinamicoGrupoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GrupoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GrupoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getsiglas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_ESPROVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_ESPROVE);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getes_prove());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(GrupoCliente grupocliente:grupoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocliente.getcentrocosto_descripcion());
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
			//	this.getFilaCabeceraExportarExcelGrupoCliente(row);				
			//	iRow++;
			//}				
			
			//for(GrupoCliente grupoclienteAux:grupoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGrupoCliente(grupoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoCliente(false);
			
			//SI ES MANUAL
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoCliente(false);
			
			//SI ES MANUAL
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGrupoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoCliente(false);
			
			//SI ES MANUAL
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGrupoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGrupoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGrupoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGrupoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGrupoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGrupoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosGrupoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosGrupoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGrupoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGrupoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGrupoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGrupoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGrupoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGrupoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGrupoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGrupoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGrupoCliente();
		
		this.inicializarActualizarBindingBotonesManualGrupoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGrupoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGrupoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGrupoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxPostAccionNuevoGrupoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxPostAccionSinCerrarGrupoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxPostAccionSinMensajeGrupoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGrupoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGrupoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGrupoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
				this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxPostAccionNuevoGrupoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxPostAccionSinCerrarGrupoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxPostAccionSinMensajeGrupoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGrupoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGrupoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGrupoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGrupoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGrupoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGrupoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGrupoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGrupoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGrupoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGrupoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGrupoCliente() throws Exception {
		try	{
			if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGrupoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGrupoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGrupoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGrupoCliente.addItem(reporte);
			}
			
			
			if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGrupoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGrupoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGrupoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGrupoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGrupoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGrupoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGrupoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
				this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
				this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGrupoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGrupoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoGrupoCliente.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreGrupoCliente.getText();
		this.siglasBusquedaPorSiglas=this.jTextFieldsiglasBusquedaPorSiglasGrupoCliente.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGrupoCliente(Boolean esInicializar) throws Exception {				
		if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGrupoCliente() throws Exception {
		this.inicializarActualizarBindingTablaGrupoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGrupoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGrupoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGrupoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=grupoclienteLogic.getGrupoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=grupoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGrupoCliente.setModel(new GrupoClienteModel(this.grupoclienteLogic.getGrupoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGrupoCliente.setModel(new GrupoClienteModel(this.grupoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGrupoCliente!=null && this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGrupoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO,grupoclienteConstantesFunciones.resaltarSeleccionarGrupoCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO,grupoclienteConstantesFunciones.resaltarSeleccionarGrupoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_ID));

		if(this.grupoclienteConstantesFunciones.mostraridGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.grupoclienteConstantesFunciones.resaltaridGrupoCliente,this.grupoclienteConstantesFunciones.activaridGrupoCliente,this,true,"idGrupoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteConstantesFunciones.resaltaridGrupoCliente,this.grupoclienteConstantesFunciones.activaridGrupoCliente,this,true,"idGrupoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.grupoclienteConstantesFunciones.mostrarid_empresaGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.grupoclienteConstantesFunciones.resaltarid_empresaGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_empresaGrupoCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.grupoclienteConstantesFunciones.resaltarid_empresaGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_empresaGrupoCliente,false,"id_empresaGrupoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_IDMODULO));

		if(this.grupoclienteConstantesFunciones.mostrarid_moduloGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.grupoclienteConstantesFunciones.resaltarid_moduloGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_moduloGrupoCliente));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.grupoclienteConstantesFunciones.resaltarid_moduloGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_moduloGrupoCliente,false,"id_moduloGrupoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_CODIGO));

		if(this.grupoclienteConstantesFunciones.mostrarcodigoGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoclienteConstantesFunciones.resaltarcodigoGrupoCliente,this.grupoclienteConstantesFunciones.activarcodigoGrupoCliente,this,true,"codigoGrupoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteConstantesFunciones.resaltarcodigoGrupoCliente,this.grupoclienteConstantesFunciones.activarcodigoGrupoCliente,this,true,"codigoGrupoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.grupoclienteConstantesFunciones.mostrarnombreGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoclienteConstantesFunciones.resaltarnombreGrupoCliente,this.grupoclienteConstantesFunciones.activarnombreGrupoCliente,this,true,"nombreGrupoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteConstantesFunciones.resaltarnombreGrupoCliente,this.grupoclienteConstantesFunciones.activarnombreGrupoCliente,this,true,"nombreGrupoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_SIGLAS));

		if(this.grupoclienteConstantesFunciones.mostrarsiglasGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoclienteConstantesFunciones.resaltarsiglasGrupoCliente,this.grupoclienteConstantesFunciones.activarsiglasGrupoCliente,this,true,"siglasGrupoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteConstantesFunciones.resaltarsiglasGrupoCliente,this.grupoclienteConstantesFunciones.activarsiglasGrupoCliente,this,true,"siglasGrupoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_SECUENCIAL));

		if(this.grupoclienteConstantesFunciones.mostrarsecuencialGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoclienteConstantesFunciones.resaltarsecuencialGrupoCliente,this.grupoclienteConstantesFunciones.activarsecuencialGrupoCliente,this,true,"secuencialGrupoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteConstantesFunciones.resaltarsecuencialGrupoCliente,this.grupoclienteConstantesFunciones.activarsecuencialGrupoCliente,this,true,"secuencialGrupoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.grupoclienteConstantesFunciones.mostrardescripcionGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoclienteConstantesFunciones.resaltardescripcionGrupoCliente,this.grupoclienteConstantesFunciones.activardescripcionGrupoCliente,this,true,"descripcionGrupoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteConstantesFunciones.resaltardescripcionGrupoCliente,this.grupoclienteConstantesFunciones.activardescripcionGrupoCliente,this,true,"descripcionGrupoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_ESPROVE));

		if(this.grupoclienteConstantesFunciones.mostrares_proveGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_ESPROVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.grupoclienteConstantesFunciones.resaltares_proveGrupoCliente,this.grupoclienteConstantesFunciones.activares_proveGrupoCliente));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.grupoclienteConstantesFunciones.resaltares_proveGrupoCliente,this.grupoclienteConstantesFunciones.activares_proveGrupoCliente,this,true,"es_proveGrupoCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.grupoclienteConstantesFunciones.mostrarid_cuenta_contableGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.grupoclienteConstantesFunciones.resaltarid_cuenta_contableGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_cuenta_contableGrupoCliente));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.grupoclienteConstantesFunciones.resaltarid_cuenta_contableGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_cuenta_contableGrupoCliente,true,"id_cuenta_contableGrupoCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.grupoclienteConstantesFunciones.mostrarid_centro_costoGrupoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.grupoclienteConstantesFunciones.resaltarid_centro_costoGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_centro_costoGrupoCliente));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.grupoclienteConstantesFunciones.resaltarid_centro_costoGrupoCliente,this,this.grupoclienteConstantesFunciones.activarid_centro_costoGrupoCliente,true,"id_centro_costoGrupoCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.grupoclienteConstantesFunciones.mostrarClienteGrupoCliente && !GrupoClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(grupoclienteConstantesFunciones.resaltarClienteGrupoCliente,this,this.grupoclienteConstantesFunciones.activarClienteGrupoCliente));
				tableColumn.setCellEditor(new ClienteTableCell(grupoclienteConstantesFunciones.resaltarClienteGrupoCliente,this,this.grupoclienteConstantesFunciones.activarClienteGrupoCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoCliente.addColumn(tableColumn);
			}

			if(this.isTienePermisosGrupoClienteFormaPago && this.grupoclienteConstantesFunciones.mostrarGrupoClienteFormaPagoGrupoCliente && !GrupoClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Grupo Cliente Forma Pagos");
				tableColumn.setHeaderValue("Grupo Cliente Forma Pagos");
				tableColumn.setCellRenderer(new GrupoClienteFormaPagoTableCell(grupoclienteConstantesFunciones.resaltarGrupoClienteFormaPagoGrupoCliente,this,this.grupoclienteConstantesFunciones.activarGrupoClienteFormaPagoGrupoCliente));
				tableColumn.setCellEditor(new GrupoClienteFormaPagoTableCell(grupoclienteConstantesFunciones.resaltarGrupoClienteFormaPagoGrupoCliente,this,this.grupoclienteConstantesFunciones.activarGrupoClienteFormaPagoGrupoCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.grupoclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.grupoclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGrupoCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.grupoclienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosGrupoCliente.addColumn(tableColumn);
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
			
			this.jTableDatosGrupoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupoclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGrupoCliente.moveColumn(this.jTableDatosGrupoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGrupoCliente.moveColumn(this.jTableDatosGrupoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupoclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosGrupoCliente.moveColumn(this.jTableDatosGrupoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGrupoCliente.moveColumn(this.jTableDatosGrupoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGrupoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGrupoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGrupoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGrupoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGrupoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGrupoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGrupoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGrupoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=grupoclienteLogic.getGrupoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=grupoclientes.size()-1;
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
		//this.jTableDatosGrupoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGrupoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGrupoCliente();
			
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
				
				//this.isEsNuevoGrupoCliente=false;
					
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
				if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGrupoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.grupocliente.getsType().equals("DUPLICADO")
				   || this.grupocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGrupoCliente=true;
				
				} else {
					this.isEsNuevoGrupoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.grupocliente.getId()>=0 && !this.grupocliente.getIsNew()) {						
						this.isEsNuevoGrupoCliente=false;
						
					} else {
						this.isEsNuevoGrupoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGrupoCliente(esRelaciones);						
				
				this.seleccionarGrupoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.grupocliente.getId()<0) {
					this.isEsNuevoGrupoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGrupoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGrupoCliente(evt,rowIndex);
				}	
				
				if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GrupoCliente: " + this.dDif); 
					}
				}								
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGrupoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.grupocliente)) {
					if(this.grupocliente.getId()>0) {
						this.grupocliente.setIsDeleted(true);
						
						this.grupoclientesEliminados.add(this.grupocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoclienteLogic.getGrupoClientes().remove(this.grupocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoclientes.remove(this.grupocliente);				
					}
					
					
					((GrupoClienteModel) this.jTableDatosGrupoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGrupoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGrupoCliente) {
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGrupoCliente(this.grupocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.grupoclienteConstantesFunciones.cargarid_empresaGrupoCliente || this.grupoclienteConstantesFunciones.event_dependid_empresaGrupoCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.grupocliente.getid_empresa());
									//this.inicializarActualizarBindingGrupoCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(grupocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(grupocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.grupocliente.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.grupoclienteConstantesFunciones.cargarid_moduloGrupoCliente || this.grupoclienteConstantesFunciones.event_dependid_moduloGrupoCliente) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.grupocliente.getid_modulo());
									//this.inicializarActualizarBindingGrupoCliente(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(grupocliente.getModulo()!=null) {
							this.modulosForeignKey.add(grupocliente.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.grupocliente.getid_modulo(),false,"Formulario");

					//CuentaContable
					if(!this.grupoclienteConstantesFunciones.cargarid_cuenta_contableGrupoCliente || this.grupoclienteConstantesFunciones.event_dependid_cuenta_contableGrupoCliente) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.grupocliente.getid_cuenta_contable());
									//this.inicializarActualizarBindingGrupoCliente(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(grupocliente.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(grupocliente.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.grupocliente.getid_cuenta_contable(),false,"Formulario");

					//CentroCosto
					if(!this.grupoclienteConstantesFunciones.cargarid_centro_costoGrupoCliente || this.grupoclienteConstantesFunciones.event_dependid_centro_costoGrupoCliente) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.grupocliente.getid_centro_costo());
									//this.inicializarActualizarBindingGrupoCliente(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(grupocliente.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(grupocliente.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.grupocliente.getid_centro_costo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGrupoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGrupoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoCliente(GrupoCliente grupocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGrupoCliente(grupocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoCliente(GrupoCliente grupocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGrupoCliente(grupocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGrupoCliente(grupocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGrupoCliente(grupocliente);
	}
	
	public void setVariablesObjetoActualToFormularioGrupoCliente(GrupoCliente grupocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setText(grupocliente.getId().toString());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setText(grupocliente.getcodigo());
			this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setText(grupocliente.getnombre());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setText(grupocliente.getsiglas());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setText(grupocliente.getsecuencial());
			this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setText(grupocliente.getdescripcion());
			this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setSelected(grupocliente.getes_prove());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GrupoCliente grupoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,grupoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GrupoCliente grupoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				grupoclienteLocal=this.grupocliente;
			} else {
				grupoclienteLocal=this.grupoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(grupoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteLocal,true);
					
					if(grupoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(grupoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(grupoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGrupoCliente(GrupoCliente grupocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoCliente(grupocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(grupocliente);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoCliente(GrupoCliente grupocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoCliente(grupocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoCliente(GrupoCliente grupocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.getText()==null || this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.getText()=="" || this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setText("0");
			}

			if(conColumnasBase) {grupocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelIdGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocliente.setcodigo(this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelcodigoGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocliente.setnombre(this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelnombreGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocliente.setsiglas(this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelsiglasGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocliente.setsecuencial(this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabelsecuencialGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocliente.setdescripcion(this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabeldescripcionGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocliente.setes_prove(this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteConstantesFunciones.LABEL_ESPROVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoCliente.jLabeles_proveGrupoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoCliente(GrupoCliente grupoclienteBean,GrupoCliente grupocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && grupoclienteBean.getid_cuenta_contable()!=null && !grupoclienteBean.getid_cuenta_contable().equals(null))) {grupocliente.setid_cuenta_contable(grupoclienteBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && grupoclienteBean.getid_centro_costo()!=null && !grupoclienteBean.getid_centro_costo().equals(null))) {grupocliente.setid_centro_costo(grupoclienteBean.getid_centro_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGrupoCliente(GrupoCliente grupoclienteOrigen,GrupoCliente grupocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoclienteOrigen.getId()!=null && !grupoclienteOrigen.getId().equals(0L))) {grupocliente.setId(grupoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && grupoclienteOrigen.getcodigo()!=null && !grupoclienteOrigen.getcodigo().equals(""))) {grupocliente.setcodigo(grupoclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getnombre()!=null && !grupoclienteOrigen.getnombre().equals(""))) {grupocliente.setnombre(grupoclienteOrigen.getnombre());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getsiglas()!=null && !grupoclienteOrigen.getsiglas().equals(""))) {grupocliente.setsiglas(grupoclienteOrigen.getsiglas());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getsecuencial()!=null && !grupoclienteOrigen.getsecuencial().equals(""))) {grupocliente.setsecuencial(grupoclienteOrigen.getsecuencial());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getdescripcion()!=null && !grupoclienteOrigen.getdescripcion().equals(""))) {grupocliente.setdescripcion(grupoclienteOrigen.getdescripcion());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getes_prove()!=null && !grupoclienteOrigen.getes_prove().equals(false))) {grupocliente.setes_prove(grupoclienteOrigen.getes_prove());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getid_cuenta_contable()!=null && !grupoclienteOrigen.getid_cuenta_contable().equals(null))) {grupocliente.setid_cuenta_contable(grupoclienteOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && grupoclienteOrigen.getid_centro_costo()!=null && !grupoclienteOrigen.getid_centro_costo().equals(null))) {grupocliente.setid_centro_costo(grupoclienteOrigen.getid_centro_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoCliente(GrupoCliente grupocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setText(grupocliente.getId().toString());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setText(grupocliente.getcodigo());
			this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setText(grupocliente.getnombre());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setText(grupocliente.getsiglas());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setText(grupocliente.getsecuencial());
			this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setText(grupocliente.getdescripcion());
			this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setSelected(grupocliente.getes_prove());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoCliente(GrupoClienteBean grupoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setText(grupoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setText(grupoclienteBean.getcodigo());
			this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setText(grupoclienteBean.getnombre());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setText(grupoclienteBean.getsiglas());
			this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setText(grupoclienteBean.getsecuencial());
			this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setText(grupoclienteBean.getdescripcion());
			this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setSelected(grupoclienteBean.getes_prove());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGrupoCliente(GrupoClienteParameterReturnGeneral grupoclienteReturnGeneral,GrupoClienteBean grupoclienteBean,Boolean conDefault) throws Exception { 
		try {
			GrupoCliente grupoclienteLocal=new GrupoCliente();
			
			grupoclienteLocal=grupoclienteReturnGeneral.getGrupoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoclienteLocal.getId()!=null && !grupoclienteLocal.getId().equals(0L))) {grupoclienteBean.setId(grupoclienteLocal.getId());}}
			if(conDefault || (!conDefault && grupoclienteLocal.getcodigo()!=null && !grupoclienteLocal.getcodigo().equals(""))) {grupoclienteBean.setcodigo(grupoclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && grupoclienteLocal.getnombre()!=null && !grupoclienteLocal.getnombre().equals(""))) {grupoclienteBean.setnombre(grupoclienteLocal.getnombre());}
			if(conDefault || (!conDefault && grupoclienteLocal.getsiglas()!=null && !grupoclienteLocal.getsiglas().equals(""))) {grupoclienteBean.setsiglas(grupoclienteLocal.getsiglas());}
			if(conDefault || (!conDefault && grupoclienteLocal.getsecuencial()!=null && !grupoclienteLocal.getsecuencial().equals(""))) {grupoclienteBean.setsecuencial(grupoclienteLocal.getsecuencial());}
			if(conDefault || (!conDefault && grupoclienteLocal.getdescripcion()!=null && !grupoclienteLocal.getdescripcion().equals(""))) {grupoclienteBean.setdescripcion(grupoclienteLocal.getdescripcion());}
			if(conDefault || (!conDefault && grupoclienteLocal.getes_prove()!=null && !grupoclienteLocal.getes_prove().equals(false))) {grupoclienteBean.setes_prove(grupoclienteLocal.getes_prove());}
			if(conDefault || (!conDefault && grupoclienteLocal.getid_cuenta_contable()!=null && !grupoclienteLocal.getid_cuenta_contable().equals(null))) {grupoclienteBean.setid_cuenta_contable(grupoclienteLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && grupoclienteLocal.getid_centro_costo()!=null && !grupoclienteLocal.getid_centro_costo().equals(null))) {grupoclienteBean.setid_centro_costo(grupoclienteLocal.getid_centro_costo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGrupoClienteGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxGrupoCliente,List<GrupoCliente> grupoclientesLocal)throws Exception {
		try {
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesLocal) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			jComboBoxGrupoCliente.setSelectedItem(grupoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGrupoClienteGenerico(JComboBox jComboBoxGrupoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGrupoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGrupoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("GrupoClienteFormaPago")) {
			jButtonGrupoClienteFormaPagoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupocliente=(GrupoCliente) grupoclienteLogic.getGrupoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupocliente =(GrupoCliente) grupoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!grupocliente.getIsNew() && !grupocliente.getIsChanged() && !grupocliente.getIsDeleted()) {
				sDescripcion=grupocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=grupocliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!grupocliente.getIsNew() && !grupocliente.getIsChanged() && !grupocliente.getIsDeleted()) {
				sDescripcion=grupocliente.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=grupocliente.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!grupocliente.getIsNew() && !grupocliente.getIsChanged() && !grupocliente.getIsDeleted()) {
				sDescripcion=grupocliente.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=grupocliente.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!grupocliente.getIsNew() && !grupocliente.getIsChanged() && !grupocliente.getIsDeleted()) {
				sDescripcion=grupocliente.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=grupocliente.getcentrocosto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GrupoCliente grupoclienteRow=new GrupoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoclienteRow=(GrupoCliente) grupoclienteLogic.getGrupoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoclienteRow=(GrupoCliente) grupoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoCliente grupocliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente = (GrupoCliente)this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupocliente = (GrupoCliente)this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupocliente!=null) {
						this.grupocliente = grupocliente;
					} else {
						this.grupocliente = new GrupoCliente();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.grupocliente)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame;
					}

					List<GrupoCliente> grupoclientes=new ArrayList<GrupoCliente>();
					grupoclientes.add(this.grupocliente);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoCliente.cargarClienteBeanSwingJInternalFrame(grupoclientes,this.grupocliente,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderGrupoCliente.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonGrupoClienteFormaPagoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoCliente grupocliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente = (GrupoCliente)this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupocliente = (GrupoCliente)this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupocliente!=null) {
						this.grupocliente = grupocliente;
					} else {
						this.grupocliente = new GrupoCliente();
					}
				}

				if(this.isTienePermisosGrupoClienteFormaPago && this.permiteMantenimiento(this.grupocliente)) {
					GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup=new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						grupoclienteformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup;
					} else {
						grupoclienteformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame;
					}

					List<GrupoCliente> grupoclientes=new ArrayList<GrupoCliente>();
					grupoclientes.add(this.grupocliente);
					if(!esRelacionado) {
						//grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setConGuardarRelaciones(false);
						//grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					grupoclienteformapagoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoCliente.cargarGrupoClienteFormaPagoBeanSwingJInternalFrame(grupoclientes,this.grupocliente,grupoclienteformapagoBeanSwingJInternalFrame,/*conInicializar,*/grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.getConGuardarRelaciones(),grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
					grupoclienteformapagoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsGrupoClienteFormaPago("no_relacionado");

						grupoclienteformapagoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(GrupoClienteFormaPagoConstantesFunciones.ITAMANIOFILATABLA + (GrupoClienteFormaPagoConstantesFunciones.ITAMANIOFILATABLA/2));

						grupoclienteformapagoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
						TitledBorder titledBorderGrupoClienteFormaPago=(TitledBorder)grupoclienteformapagoBeanSwingJInternalFrame.jScrollPanelDatosGrupoClienteFormaPago.getBorder();

						titledBorderGrupoClienteFormaPago.setTitle(titledBorderGrupoCliente.getTitle() + " -> Grupo Cliente Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,grupoclienteformapagoBeanSwingJInternalFrame);
						}

						grupoclienteformapagoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(grupoclienteformapagoBeanSwingJInternalFrame);

						grupoclienteformapagoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Grupo Cliente Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGrupoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoGrupoCliente && this.isPermisoNuevoGrupoCliente));			
			this.jButtonDuplicarGrupoCliente.setVisible((this.isVisibilidadCeldaDuplicarGrupoCliente && this.isPermisoDuplicarGrupoCliente));			
			this.jButtonCopiarGrupoCliente.setVisible((this.isVisibilidadCeldaCopiarGrupoCliente && this.isPermisoCopiarGrupoCliente));
			this.jButtonVerFormGrupoCliente.setVisible((this.isVisibilidadCeldaVerFormGrupoCliente && this.isPermisoVerFormGrupoCliente));
			
			this.jButtonAbrirOrderByGrupoCliente.setVisible((this.isVisibilidadCeldaOrdenGrupoCliente && this.isPermisoOrdenGrupoCliente));			
			
			this.jButtonNuevoRelacionesGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoCliente && this.isPermisoNuevoGrupoCliente));			
			this.jButtonNuevoGuardarCambiosGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoGrupoCliente && this.isPermisoNuevoGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarGrupoCliente.setVisible((this.isVisibilidadCeldaModificarGrupoCliente && this.isPermisoActualizarGrupoCliente));	
			this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarGrupoCliente.setVisible((this.isVisibilidadCeldaActualizarGrupoCliente && this.isPermisoActualizarGrupoCliente));	
			this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarGrupoCliente.setVisible((this.isVisibilidadCeldaEliminarGrupoCliente && this.isPermisoEliminarGrupoCliente));
			this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarGrupoCliente.setVisible(this.isVisibilidadCeldaCancelarGrupoCliente);							
			this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoGrupoCliente && this.isPermisoNuevoGrupoCliente));						
			this.jButtonDuplicarToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaDuplicarGrupoCliente && this.isPermisoDuplicarGrupoCliente));						
			this.jButtonCopiarToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaCopiarGrupoCliente && this.isPermisoCopiarGrupoCliente));			
			this.jButtonVerFormToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaVerFormGrupoCliente && this.isPermisoVerFormGrupoCliente));			
			this.jButtonAbrirOrderByToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaOrdenGrupoCliente && this.isPermisoOrdenGrupoCliente));
			this.jButtonNuevoRelacionesToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoCliente && this.isPermisoNuevoGrupoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoGrupoCliente && this.isPermisoNuevoGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));			
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaModificarGrupoCliente && this.isPermisoActualizarGrupoCliente));	
			this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaActualizarGrupoCliente  && this.isPermisoActualizarGrupoCliente));	
			this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaEliminarGrupoCliente && this.isPermisoEliminarGrupoCliente));
			this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarToolBarGrupoCliente.setVisible(this.isVisibilidadCeldaCancelarGrupoCliente);				
			this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoGrupoCliente && this.isPermisoNuevoGrupoCliente));			
			this.jMenuItemDuplicarGrupoCliente.setVisible((this.isVisibilidadCeldaDuplicarGrupoCliente && this.isPermisoDuplicarGrupoCliente));			
			this.jMenuItemCopiarGrupoCliente.setVisible((this.isVisibilidadCeldaCopiarGrupoCliente && this.isPermisoCopiarGrupoCliente));			
			this.jMenuItemVerFormGrupoCliente.setVisible((this.isVisibilidadCeldaVerFormGrupoCliente && this.isPermisoVerFormGrupoCliente));			
			this.jMenuItemAbrirOrderByGrupoCliente.setVisible((this.isVisibilidadCeldaOrdenGrupoCliente && this.isPermisoOrdenGrupoCliente));			
			//this.jMenuItemMostrarOcultarGrupoCliente.setVisible((this.isVisibilidadCeldaOrdenGrupoCliente && this.isPermisoOrdenGrupoCliente));
			this.jMenuItemDetalleAbrirOrderByGrupoCliente.setVisible((this.isVisibilidadCeldaOrdenGrupoCliente && this.isPermisoOrdenGrupoCliente));			
			//this.jMenuItemDetalleMostrarOcultarGrupoCliente.setVisible((this.isVisibilidadCeldaOrdenGrupoCliente && this.isPermisoOrdenGrupoCliente));			
			this.jMenuItemNuevoRelacionesGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoCliente && this.isPermisoNuevoGrupoCliente));			
			this.jMenuItemNuevoGuardarCambiosGrupoCliente.setVisible((this.isVisibilidadCeldaNuevoGrupoCliente && this.isPermisoNuevoGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));									
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemModificarGrupoCliente.setVisible((this.isVisibilidadCeldaModificarGrupoCliente && this.isPermisoActualizarGrupoCliente));	
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemActualizarGrupoCliente.setVisible((this.isVisibilidadCeldaActualizarGrupoCliente && this.isPermisoActualizarGrupoCliente));	
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemEliminarGrupoCliente.setVisible((this.isVisibilidadCeldaEliminarGrupoCliente && this.isPermisoEliminarGrupoCliente));
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemCancelarGrupoCliente.setVisible(this.isVisibilidadCeldaCancelarGrupoCliente);				
			}
			
			this.jMenuItemGuardarCambiosGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));						
			this.jMenuItemGuardarCambiosTablaGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGrupoCliente=this.jButtonNuevoGrupoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarGrupoCliente=this.jButtonDuplicarGrupoCliente.isVisible();
			this.isVisibilidadCeldaCopiarGrupoCliente=this.jButtonCopiarGrupoCliente.isVisible();
			this.isVisibilidadCeldaVerFormGrupoCliente=this.jButtonVerFormGrupoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenGrupoCliente=this.jButtonAbrirOrderByGrupoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=this.jButtonNuevoRelacionesGrupoCliente.isVisible();
			this.isVisibilidadCeldaModificarGrupoCliente=this.jButtonModificarGrupoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.isVisibilidadCeldaActualizarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarGrupoCliente.isVisible();
			this.isVisibilidadCeldaEliminarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarGrupoCliente.isVisible();
			this.isVisibilidadCeldaCancelarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarGrupoCliente.isVisible();
			this.isVisibilidadCeldaGuardarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=this.jButtonGuardarCambiosTablaGrupoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGrupoCliente=this.jButtonNuevoToolBarGrupoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=this.jButtonNuevoRelacionesToolBarGrupoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.isVisibilidadCeldaModificarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarToolBarGrupoCliente.isVisible();
			this.isVisibilidadCeldaActualizarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarToolBarGrupoCliente.isVisible();
			this.isVisibilidadCeldaEliminarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarToolBarGrupoCliente.isVisible();
			this.isVisibilidadCeldaCancelarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarToolBarGrupoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoCliente=this.jButtonGuardarCambiosToolBarGrupoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=this.jButtonGuardarCambiosTablaToolBarGrupoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGrupoCliente=this.jMenuItemNuevoGrupoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=this.jMenuItemNuevoRelacionesGrupoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.isVisibilidadCeldaModificarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jMenuItemModificarGrupoCliente.isVisible();
			this.isVisibilidadCeldaActualizarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jMenuItemActualizarGrupoCliente.isVisible();
			this.isVisibilidadCeldaEliminarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jMenuItemEliminarGrupoCliente.isVisible();
			this.isVisibilidadCeldaCancelarGrupoCliente=this.jInternalFrameDetalleFormGrupoCliente.jMenuItemCancelarGrupoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoCliente=this.jMenuItemGuardarCambiosGrupoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=this.jMenuItemGuardarCambiosTablaGrupoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGrupoCliente(Boolean esInicializar) {
		if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualGrupoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGrupoCliente() {
		this.jButtonNuevoGrupoCliente.setVisible(this.isPermisoNuevoGrupoCliente);			
		this.jButtonDuplicarGrupoCliente.setVisible(this.isPermisoDuplicarGrupoCliente);			
		this.jButtonCopiarGrupoCliente.setVisible(this.isPermisoCopiarGrupoCliente);			
		this.jButtonVerFormGrupoCliente.setVisible(this.isPermisoVerFormGrupoCliente);			
		
		this.jButtonAbrirOrderByGrupoCliente.setVisible(this.isPermisoOrdenGrupoCliente);					
		
		this.jButtonNuevoRelacionesGrupoCliente.setVisible(this.isPermisoNuevoGrupoCliente);			
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarGrupoCliente.setVisible(this.isPermisoActualizarGrupoCliente);	
			this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarGrupoCliente.setVisible(this.isPermisoActualizarGrupoCliente);	
			this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarGrupoCliente.setVisible(this.isPermisoEliminarGrupoCliente);
			this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarGrupoCliente.setVisible(this.isVisibilidadCeldaCancelarGrupoCliente);						
			this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.setVisible(this.isPermisoGuardarCambiosGrupoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaGrupoCliente.setVisible(this.isPermisoActualizarGrupoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoCliente() {
		this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarGrupoCliente.setVisible(this.isPermisoActualizarGrupoCliente);	
		this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarGrupoCliente.setVisible(this.isPermisoActualizarGrupoCliente);	
		this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarGrupoCliente.setVisible(this.isPermisoEliminarGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarGrupoCliente.setVisible(this.isVisibilidadCeldaCancelarGrupoCliente);							
		this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.setVisible((this.isVisibilidadCeldaGuardarGrupoCliente && this.isPermisoGuardarCambiosGrupoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGrupoCliente() {
		if(GrupoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGrupoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGrupoCliente() {
	}
	
	public void jTableDatosGrupoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGrupoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.grupocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGrupoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGrupoCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.grupoclienteLogic.getConnexion());

				if(this.grupocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.grupocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGrupoCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.grupocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloGrupoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebGrupoCliente(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.grupoclienteLogic.getConnexion());

				if(this.grupocliente.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.grupocliente.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderGrupoCliente.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.grupocliente.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.grupocliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.grupocliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.grupocliente.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.grupocliente.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.grupocliente.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_proveGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getes_prove()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_prove = "+this.grupocliente.getes_prove().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableGrupoClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderGrupoCliente=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosGrupoCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderGrupoCliente.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableGrupoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebGrupoCliente(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.grupoclienteLogic.getConnexion());

				if(this.grupocliente.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.grupocliente.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderGrupoCliente.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.grupocliente.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoGrupoClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="CentroCosto";

			if(!this.sFinalQueryGeneral_centrocosto.equals("")) {
				this.centrocostoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_centrocosto);
				this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.centrocostoBeanSwingJInternalFrame.procesarBusqueda(this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda);
				this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingCentroCosto(false);
			}

			if(!this.sFinalQueryComboCentroCosto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderGrupoCliente=null;
			TitledBorder titledBordercentrocosto=null;

			if(!this.jScrollPanelDatosGrupoCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
				titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderGrupoCliente.getTitle() + " -> Centro Costo");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_centro_costoGrupoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebGrupoCliente(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.grupoclienteLogic.getConnexion());

				if(this.grupocliente.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.grupocliente.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoCliente=(TitledBorder)this.jScrollPanelDatosGrupoCliente.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderGrupoCliente.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoGrupoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.getgrupocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocliente==null) {
						this.grupocliente = new GrupoCliente();
					}

					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);
				}

				if(this.grupocliente.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.grupocliente.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesBusquedaPorCodigo();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesBusquedaPorNombre();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglasGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesBusquedaPorSiglas();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesFK_IdCentroCosto();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesFK_IdCuentaContable();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesFK_IdEmpresa();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloGrupoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoCliente(false,false);

			this.getGrupoClientesFK_IdModulo();

			this.inicializarActualizarBindingGrupoCliente(false);

			//if(GrupoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGrupoCliente() {
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
		

		if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
			this.jInternalFrameDetalleFormGrupoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormGrupoCliente.dispose();
			this.jInternalFrameDetalleFormGrupoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
			this.jInternalFrameReporteDinamicoGrupoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGrupoCliente.dispose();
			this.jInternalFrameReporteDinamicoGrupoCliente=null;
		}
		
		if(this.jInternalFrameImportacionGrupoCliente!=null) {
			this.jInternalFrameImportacionGrupoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionGrupoCliente.dispose();
			this.jInternalFrameImportacionGrupoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGrupoCliente();
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGrupoCliente")) {
				jButtonDuplicarGrupoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGrupoCliente")) {
				jButtonCopiarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormGrupoCliente")) {
				jButtonVerFormGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGrupoCliente")) {
				jButtonDuplicarGrupoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGrupoCliente")) {
				jButtonDuplicarGrupoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGrupoCliente")) {
				jButtonModificarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGrupoCliente")) {
				jButtonModificarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGrupoCliente")) {
				jButtonModificarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGrupoCliente")) {
				jButtonActualizarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGrupoCliente")) {
				jButtonActualizarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGrupoCliente")) {
				jButtonActualizarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarGrupoCliente")) {
				jButtonEliminarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGrupoCliente")) {
				jButtonEliminarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGrupoCliente")) {
				jButtonEliminarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarGrupoCliente")) {
				jButtonCancelarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGrupoCliente")) {
				jButtonCancelarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGrupoCliente")) {
				jButtonCancelarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarGrupoCliente")) {
				jButtonCerrarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGrupoCliente")) {
				jButtonCerrarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGrupoCliente")) {
				jButtonCerrarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGrupoCliente")) {
				jButtonMostrarOcultarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGrupoCliente")) {
				jButtonCancelarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGrupoCliente")) {
				jButtonCopiarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGrupoCliente")) {
				jButtonVerFormGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGrupoCliente")) {
				jButtonCopiarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGrupoCliente")) {
				jButtonVerFormGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGrupoCliente")) {
				jButtonRecargarInformacionGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGrupoCliente")) {
				jButtonRecargarInformacionGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGrupoCliente")) {
				jButtonRecargarInformacionGrupoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGrupoCliente")) {
				jButtonAnterioresGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGrupoCliente")) {
				jButtonAnterioresGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGrupoCliente")) {
				jButtonAnterioresGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGrupoCliente")) {
				jButtonSiguientesGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGrupoCliente")) {
				jButtonSiguientesGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGrupoCliente")) {
				jButtonSiguientesGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGrupoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByGrupoCliente")) {
				jButtonAbrirOrderByGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGrupoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarGrupoCliente")) {
				jButtonMostrarOcultarGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoCliente")) {
				jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGrupoCliente")) {
				jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGrupoCliente")) {
				jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGrupoCliente")) {
				jButtonCerrarReporteDinamicoGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGrupoCliente")) {
				jButtonGenerarReporteDinamicoGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGrupoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGrupoCliente")) {
				jButtonCerrarImportacionGrupoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGrupoCliente")) {
				
				jButtonGenerarImportacionGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGrupoCliente")) {
				
				jButtonAbrirImportacionGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGrupoCliente")) {
				jComboBoxTiposAccionesGrupoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGrupoCliente")) {
				jComboBoxTiposRelacionesGrupoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGrupoCliente")) {
				jComboBoxTiposAccionesGrupoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGrupoCliente")) {
				
				jComboBoxTiposSeleccionarGrupoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGrupoCliente")) {
				jTextFieldValorCampoGeneralGrupoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGrupoCliente")) {
				jButtonAbrirOrderByGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGrupoCliente")) {
				jButtonAbrirOrderByGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGrupoCliente")) {
				jButtonCerrarOrderByGrupoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoClienteBusqueda")) {
				this.jButtonidGrupoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteUpdate")) {
				this.jButtonid_empresaGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteBusqueda")) {
				this.jButtonid_empresaGrupoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloGrupoClienteUpdate")) {
				this.jButtonid_moduloGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloGrupoClienteBusqueda")) {
				this.jButtonid_moduloGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGrupoClienteBusqueda")) {
				this.jButtoncodigoGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreGrupoClienteBusqueda")) {
				this.jButtonnombreGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasGrupoClienteBusqueda")) {
				this.jButtonsiglasGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialGrupoClienteBusqueda")) {
				this.jButtonsecuencialGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionGrupoClienteBusqueda")) {
				this.jButtondescripcionGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_proveGrupoClienteBusqueda")) {
				this.jButtones_proveGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoCliente")) {
				this.jButtonid_cuenta_contableGrupoClienteActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoClienteArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoClienteUpdate")) {
				this.jButtonid_cuenta_contableGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoClienteBusqueda")) {
				this.jButtonid_cuenta_contableGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoGrupoCliente")) {
				this.jButtonid_centro_costoGrupoClienteActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoGrupoClienteArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoGrupoClienteUpdate")) {
				this.jButtonid_centro_costoGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoGrupoClienteBusqueda")) {
				this.jButtonid_centro_costoGrupoClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoGrupoCliente")) {
				this.jButtonBusquedaPorCodigoGrupoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreGrupoCliente")) {
				this.jButtonBusquedaPorNombreGrupoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglasGrupoCliente")) {
				this.jButtonBusquedaPorSiglasGrupoClienteActionPerformed(evt);
			}
			
			;
			
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGrupoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GrupoCliente grupoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				grupoclienteLocal=this.grupocliente;
			} else {
				grupoclienteLocal=this.grupoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
							
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
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
			
			


			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
								
						
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
								
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
							
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
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
			
			


			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
								
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGrupoCliente")) {
					jCheckBoxSeleccionarTodosGrupoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGrupoCliente")) {
					jCheckBoxSeleccionadosGrupoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGrupoCliente")) {
					
				}
				
				


				
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
												
				
				


				
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
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
			
			


			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocliente);
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
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
				
				


				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteAnterior =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGrupoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGrupoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGrupoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.grupocliente =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.grupocliente =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.grupocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGrupoCliente")) {
				
				}
				
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGrupoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGrupoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGrupoCliente")) {
			
			}
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGrupoCliente();
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGrupoCliente")) {
				jButtonDuplicarGrupoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGrupoCliente")) {
				jButtonCopiarGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGrupoCliente")) {
				jButtonVerFormGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGrupoCliente")) {
				jButtonNuevoGrupoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGrupoCliente")) {
				jButtonModificarGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGrupoCliente")) {
				jButtonActualizarGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGrupoCliente")) {
				jButtonEliminarGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGrupoCliente")) {
				jButtonCancelarGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGrupoCliente")) {
				jButtonCerrarGrupoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGrupoCliente")) {
				jButtonGuardarCambiosGrupoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoCliente")) {
				jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGrupoCliente")) {
				jButtonAbrirOrderByGrupoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGrupoCliente")) {
				jButtonRecargarInformacionGrupoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGrupoCliente")) {
				jButtonAnterioresGrupoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGrupoCliente")) {
				jButtonSiguientesGrupoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoClienteBusqueda")) {
				this.jButtonidGrupoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteUpdate")) {
				this.jButtonid_empresaGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteBusqueda")) {
				this.jButtonid_empresaGrupoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloGrupoClienteUpdate")) {
				this.jButtonid_moduloGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloGrupoClienteBusqueda")) {
				this.jButtonid_moduloGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGrupoClienteBusqueda")) {
				this.jButtoncodigoGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreGrupoClienteBusqueda")) {
				this.jButtonnombreGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasGrupoClienteBusqueda")) {
				this.jButtonsiglasGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialGrupoClienteBusqueda")) {
				this.jButtonsecuencialGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionGrupoClienteBusqueda")) {
				this.jButtondescripcionGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_proveGrupoClienteBusqueda")) {
				this.jButtones_proveGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoCliente")) {
				this.jButtonid_cuenta_contableGrupoClienteActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoClienteArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoClienteUpdate")) {
				this.jButtonid_cuenta_contableGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableGrupoClienteBusqueda")) {
				this.jButtonid_cuenta_contableGrupoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoGrupoCliente")) {
				this.jButtonid_centro_costoGrupoClienteActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoGrupoClienteArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoGrupoClienteUpdate")) {
				this.jButtonid_centro_costoGrupoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoGrupoClienteBusqueda")) {
				this.jButtonid_centro_costoGrupoClienteBusquedaActionPerformed(evt);
			}
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGrupoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGrupoCliente")) {
				closingInternalFrameGrupoCliente();
				
			} else if(sTipo.equals("jButtonCancelarGrupoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormGrupoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            GrupoClienteBeanSwingJInternalFrame jInternalFrameParent=(GrupoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGrupoClienteActionPerformed(null);
			}
			
			GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupocliente,new Object(),this.grupoclienteParameterGeneral,this.grupoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGrupoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGrupoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGrupoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.grupocliente)) {
			if(!esControlTabla) {
				if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);			
				}
				
				if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGrupoCliente(this.grupocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoclienteReturnGeneral=grupoclienteLogic.procesarEventosGrupoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoclienteLogic.getGrupoClientes(),this.grupocliente,this.grupoclienteParameterGeneral,this.isEsNuevoGrupoCliente,classes);//this.grupoclienteLogic.getGrupoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGrupoCliente(this.grupoclienteReturnGeneral,this.grupoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGrupoCliente(classes,this.grupoclienteReturnGeneral,this.grupoclienteBean,false);
					}
						
					if(this.grupoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente());	
					}
						
					if(this.grupoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente(),classes);//this.grupoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGrupoCliente(this.grupocliente,classes);//this.grupoclienteBean);									
				}
			
				if(GrupoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGrupoCliente(this.grupocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoCliente(this.grupocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.grupoclienteAnterior!=null) {
						this.grupocliente=this.grupoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoclienteReturnGeneral=grupoclienteLogic.procesarEventosGrupoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoclienteLogic.getGrupoClientes(),this.grupocliente,this.grupoclienteParameterGeneral,this.isEsNuevoGrupoCliente,classes);//this.grupoclienteLogic.getGrupoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.grupoclienteReturnGeneral.getGrupoCliente(),grupoclienteLogic.getGrupoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.grupoclienteReturnGeneral.getGrupoCliente(),this.grupoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGrupoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosGrupoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGrupoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosGrupoCliente() throws Exception {
		
		GrupoClienteModel grupoclienteModel=(GrupoClienteModel)this.jTableDatosGrupoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoclienteModel.grupoclientes=this.grupoclienteLogic.getGrupoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			grupoclienteModel.grupoclientes=this.grupoclientes;
		}
		
		
		((GrupoClienteModel) this.jTableDatosGrupoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGrupoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgrupoclienteAnterior(),this.grupoclienteLogic.getGrupoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgrupoclienteAnterior(),this.grupoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGrupoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGrupoCliente(GrupoCliente grupocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(grupocliente.getClientes());
					this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GrupoClienteFormaPago.class)) {
					this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(grupocliente.getGrupoClienteFormaPagos());
					this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
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
										
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupocliente,new Object(),generalEntityParameterGeneral,this.grupoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GrupoClienteConstantesFunciones.getClassesRelationshipsOfGrupoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GrupoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfGrupoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGrupoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GrupoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupocliente,new Object(),generalEntityParameterGeneral,this.grupoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGrupoCliente(GrupoClienteBean grupoclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(grupocliente.getClientes());
					this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GrupoClienteFormaPago.class)) {
					this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(grupocliente.getGrupoClienteFormaPagos());
					this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGrupoCliente(ArrayList<Classe> classes,GrupoClienteReturnGeneral grupoclienteReturnGeneral,GrupoClienteBean grupoclienteBean,Boolean conDefault) throws Exception {
		
			this.grupoclienteBean.setClientes(grupoclienteReturnGeneral.getGrupoCliente().getClientes());
			this.grupoclienteBean.setGrupoClienteFormaPagos(grupoclienteReturnGeneral.getGrupoCliente().getGrupoClienteFormaPagos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGrupoCliente(GrupoCliente grupocliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					grupocliente.setClientes(this.jInternalFrameDetalleFormGrupoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GrupoClienteFormaPago.class)) {
					grupocliente.setGrupoClienteFormaPagos(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.grupocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGrupoCliente = new GrupoClienteDetalleFormJInternalFrame(jDesktopPane,this.grupoclienteSessionBean.getConGuardarRelaciones(),this.grupoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.setVisible(false);
		this.jInternalFrameDetalleFormGrupoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormGrupoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGrupoCliente.grupoclienteLogic=this.grupoclienteLogic;
		
		this.cargarCombosFrameForeignKeyGrupoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGrupoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGrupoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGrupoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoCliente"));
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarGrupoCliente.addActionListener(new ButtonActionListener(this,"ModificarGrupoCliente"));

		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoCliente"));
					
		this.jInternalFrameDetalleFormGrupoCliente.jMenuItemModificarGrupoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarGrupoCliente.addActionListener (new ButtonActionListener(this,"ActualizarGrupoCliente"));
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoCliente"));
						
		this.jInternalFrameDetalleFormGrupoCliente.jMenuItemActualizarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarGrupoCliente.addActionListener (new ButtonActionListener(this,"EliminarGrupoCliente"));
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoCliente"));
								
		this.jInternalFrameDetalleFormGrupoCliente.jMenuItemEliminarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarGrupoCliente.addActionListener (new ButtonActionListener(this,"CancelarGrupoCliente"));
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoCliente"));
					
		this.jInternalFrameDetalleFormGrupoCliente.jMenuItemCancelarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jMenuItemDetalleCerrarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoCliente"));
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoCliente"));
		
		
		
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonidGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_empresaGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_empresaGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_moduloGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_moduloGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_moduloGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtoncodigoGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonnombreGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonsiglasGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonsecuencialGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"secuencialGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtondescripcionGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtones_proveGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_proveGrupoClienteBusqueda"));
		//jButtonid_cuenta_contableGrupoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableGrupoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoCliente.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoCliente"));
		//jButtonid_cuenta_contableGrupoClienteArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteBusqueda"));
		//jButtonid_centro_costoGrupoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoGrupoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoCliente.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoCliente"));
		//jButtonid_centro_costoGrupoClienteArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGrupoCliente"));
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoCliente"));
		}
		
		this.jTableDatosGrupoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGrupoCliente"));
		
		this.jTableDatosGrupoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGrupoCliente"));
		
		this.jButtonNuevoGrupoCliente.addActionListener(new ButtonActionListener(this,"NuevoGrupoCliente"));
		
		this.jButtonDuplicarGrupoCliente.addActionListener(new ButtonActionListener(this,"DuplicarGrupoCliente"));
		
		this.jButtonCopiarGrupoCliente.addActionListener(new ButtonActionListener(this,"CopiarGrupoCliente"));
		
		this.jButtonVerFormGrupoCliente.addActionListener(new ButtonActionListener(this,"VerFormGrupoCliente"));
		
		
		this.jButtonNuevoToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarGrupoCliente"));
			
		this.jButtonDuplicarToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGrupoCliente"));
			
		this.jMenuItemNuevoGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGrupoCliente"));
			
		this.jMenuItemDuplicarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGrupoCliente"));		
		
		
		this.jButtonNuevoRelacionesGrupoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGrupoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGrupoCliente"));
			
		this.jMenuItemNuevoRelacionesGrupoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGrupoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarGrupoCliente.addActionListener(new ButtonActionListener(this,"ModificarGrupoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonModificarToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoCliente"));
			
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemModificarGrupoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarGrupoCliente.addActionListener (new ButtonActionListener(this,"ActualizarGrupoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonActualizarToolBarGrupoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoCliente"));
				
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemActualizarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarGrupoCliente.addActionListener (new ButtonActionListener(this,"EliminarGrupoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonEliminarToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoCliente"));
						
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemEliminarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarGrupoCliente.addActionListener (new ButtonActionListener(this,"CancelarGrupoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonCancelarToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoCliente"));
			
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemCancelarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGrupoCliente"));		
		
		
		this.jButtonCerrarGrupoCliente.addActionListener (new ButtonActionListener(this,"CerrarGrupoCliente"));
		
		
		this.jButtonCerrarToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarGrupoCliente"));
			
		this.jMenuItemCerrarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGrupoCliente"));
			
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jMenuItemDetalleCerrarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosGrupoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoCliente"));
		}
		
		this.jButtonCopiarToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarGrupoCliente"));
			
		this.jButtonVerFormToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarGrupoCliente"));
		
		this.jMenuItemGuardarCambiosGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGrupoCliente"));
			
		this.jMenuItemCopiarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGrupoCliente"));		
		
		this.jMenuItemVerFormGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGrupoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGrupoCliente"));
			
		this.jMenuItemGuardarCambiosTablaGrupoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoCliente"));		
		
		
		
		this.jButtonRecargarInformacionGrupoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionGrupoCliente"));
					
		this.jButtonRecargarInformacionToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGrupoCliente"));
		
		this.jMenuItemRecargarInformacionGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGrupoCliente"));		
		
		
		
		this.jButtonAnterioresGrupoCliente.addActionListener (new ButtonActionListener(this,"AnterioresGrupoCliente"));
		
		
		this.jButtonAnterioresToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGrupoCliente"));
		
		this.jMenuItemAnterioresGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGrupoCliente"));		
		
		
		this.jButtonSiguientesGrupoCliente.addActionListener (new ButtonActionListener(this,"SiguientesGrupoCliente"));
		
		
		this.jButtonSiguientesToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGrupoCliente"));
			
		this.jMenuItemSiguientesGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGrupoCliente"));
			
		this.jMenuItemAbrirOrderByGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGrupoCliente"));
			
		this.jMenuItemMostrarOcultarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGrupoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGrupoCliente"));
			
		this.jMenuItemDetalleMostarOcultarGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGrupoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosGrupoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGrupoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGrupoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosGrupoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGrupoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGrupoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGrupoCliente"));

		this.jCheckBoxSeleccionadosGrupoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGrupoCliente"));
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesGrupoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesGrupoCliente"));
			
		this.jComboBoxTiposAccionesGrupoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesGrupoCliente"));
					
		this.jComboBoxTiposSeleccionarGrupoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGrupoCliente"));
			
		this.jTextFieldValorCampoGeneralGrupoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGrupoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonidGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_empresaGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_empresaGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_moduloGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_moduloGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_moduloGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtoncodigoGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonnombreGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonsiglasGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonsecuencialGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"secuencialGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtondescripcionGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtones_proveGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_proveGrupoClienteBusqueda"));
		//jButtonid_cuenta_contableGrupoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableGrupoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoCliente.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoCliente"));
		//jButtonid_cuenta_contableGrupoClienteArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteBusqueda"));
		//jButtonid_centro_costoGrupoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoGrupoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoCliente.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoCliente"));
		//jButtonid_centro_costoGrupoClienteArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoGrupoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoGrupoCliente"));

			this.jButtonBusquedaPorNombreGrupoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreGrupoCliente"));

			this.jButtonBusquedaPorSiglasGrupoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasGrupoCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGrupoCliente!=null) {
				this.jInternalFrameReporteDinamicoGrupoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoCliente"));
				this.jInternalFrameReporteDinamicoGrupoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoCliente"));
				this.jInternalFrameReporteDinamicoGrupoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoGrupoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoCliente"));				
			//this.jButtonGenerarReporteDinamicoGrupoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoGrupoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGrupoCliente!=null) {
				this.jInternalFrameImportacionGrupoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoCliente"));
				this.jInternalFrameImportacionGrupoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoCliente"));
				this.jInternalFrameImportacionGrupoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGrupoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByGrupoCliente"));
			
			this.jButtonAbrirOrderByToolBarGrupoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGrupoCliente"));			
			
			if(this.jInternalFrameOrderByGrupoCliente!=null) {
				this.jInternalFrameOrderByGrupoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoCliente.jTabbedPaneRelacionesGrupoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoCliente"));
		
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
            		closingInternalFrameGrupoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGrupoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGrupoCliente = (JInternalFrameBase)event.getSource();
	            	
	            GrupoClienteBeanSwingJInternalFrame jInternalFrameParent=(GrupoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGrupoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGrupoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGrupoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGrupoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGrupoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGrupoCliente";
		inputMap = this.jButtonNuevoGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGrupoCliente";
		inputMap = this.jButtonNuevoRelacionesGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGrupoCliente";
		inputMap = this.jButtonModificarGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGrupoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGrupoCliente";
		inputMap = this.jButtonActualizarGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGrupoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGrupoCliente";
		inputMap = this.jButtonEliminarGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGrupoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGrupoCliente";
		inputMap = this.jButtonCancelarGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGrupoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGrupoCliente";
		inputMap = this.jButtonCerrarGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGrupoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGrupoCliente";
		inputMap = this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGrupoCliente.jButtonGuardarCambiosGrupoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGrupoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGrupoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGrupoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGrupoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGrupoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGrupoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGrupoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGrupoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGrupoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonidGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_empresaGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_empresaGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_moduloGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_moduloGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_moduloGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtoncodigoGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonnombreGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonsiglasGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonsecuencialGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"secuencialGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtondescripcionGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionGrupoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtones_proveGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_proveGrupoClienteBusqueda"));
		//jButtonid_cuenta_contableGrupoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableGrupoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoCliente.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoCliente"));
		//jButtonid_cuenta_contableGrupoClienteArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGrupoClienteBusqueda"));
		//jButtonid_centro_costoGrupoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoGrupoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoCliente.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoCliente"));
		//jButtonid_centro_costoGrupoClienteArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoGrupoClienteBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoGrupoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoGrupoCliente"));

		this.jButtonBusquedaPorNombreGrupoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreGrupoCliente"));

		this.jButtonBusquedaPorSiglasGrupoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasGrupoCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGrupoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGrupoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGrupoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGrupoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGrupoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
					grupoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoCliente grupoclienteAux:grupoclientes) {
					grupoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGrupoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
						grupoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoCliente grupoclienteAux:grupoclientes) {
						grupoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
					
						if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_ESPROVE)) {
							existe=true;
							grupoclienteAux.setes_prove(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoCliente grupoclienteAux:grupoclientes) {
						
						if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_ESPROVE)) {
							existe=true;
							grupoclienteAux.setes_prove(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGrupoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGrupoCliente.getSelectedRows();
			
			GrupoCliente grupoclienteLocal=new GrupoCliente();
			
			//this.seleccionarTodosGrupoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLocal =(GrupoCliente) this.grupoclienteLogic.getGrupoClientes().toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					grupoclienteLocal =(GrupoCliente) this.grupoclientes.toArray()[this.jTableDatosGrupoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				grupoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
						grupoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoCliente grupoclienteAux:grupoclientes) {
						grupoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGrupoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGrupoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGrupoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGrupoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGrupoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGrupoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoCliente grupoclienteAux:this.grupoclienteLogic.getGrupoClientes()) {
				
						if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							grupoclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupoclienteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							grupoclienteAux.setsiglas(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							grupoclienteAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							grupoclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoCliente grupoclienteAux:grupoclientes) {
					
						if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							grupoclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupoclienteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							grupoclienteAux.setsiglas(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							grupoclienteAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							grupoclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGrupoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGrupoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGrupoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGrupoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGrupoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessGrupoCliente(conSplash);
				
					this.generarReporteGrupoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGrupoClientesSeleccionados();
				//this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoCliente();
				
				this.exportarGrupoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGrupoClientes();
				//this.importarGrupoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGrupoClientesSeleccionados();
				//this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Grupo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGrupoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGrupoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGrupoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(GrupoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGrupoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGrupoCliente(conSplash);
					
						//this.actualizarParametrosGeneralGrupoCliente();
						
						this.generarReporteProcesoAccionGrupoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GrupoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Grupo ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Grupo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGrupoCliente();
				
						this.actualizarParametrosGeneralGrupoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.grupoclienteReturnGeneral=grupoclienteLogic.procesarAccionGrupoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.grupoclienteLogic.getGrupoClientes(),this.grupoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGrupoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGrupoCliente();
					
					GrupoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGrupoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoCliente.jComboBoxTiposAccionesFormularioGrupoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGrupoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGrupoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGrupoCliente();
			
			if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
			GrupoCliente grupocliente=new GrupoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGrupoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGrupoCliente.getSelectedItem();
			
			
			
			
			grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(grupoclientesSeleccionados.size()==1) {
				for(GrupoCliente grupoclienteAux:grupoclientesSeleccionados) {
					grupocliente=grupoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,grupocliente);
				}
				else if(this.sTipoRelacion.equals("Grupo Cliente Forma Pago")) {
					jButtonGrupoClienteFormaPagoActionPerformed(null,rowIndex,true,false,grupocliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGrupoCliente();
			
      		//this.finishProcessGrupoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGrupoClienteReturnGeneral() throws Exception {
		if(this.grupoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.grupoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.grupoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.grupoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.grupoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.grupoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGrupoCliente(false);
		}
		
		if(this.grupoclienteReturnGeneral.getConRetornoLista() || this.grupoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.grupoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoclienteLogic.setGrupoClientes(this.grupoclienteReturnGeneral.getGrupoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.grupoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoclienteLogic.setGrupoCliente(this.grupoclienteReturnGeneral.getGrupoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGrupoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralGrupoCliente() throws Exception {
		
		
	}
	
	public ArrayList<GrupoCliente> getGrupoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGrupoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GrupoCliente grupoclienteAux:grupoclienteLogic.getGrupoClientes()) {
					if(grupoclienteAux.getIsSelected()) {
						grupoclientesSeleccionados.add(grupoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoCliente grupoclienteAux:this.grupoclientes) {
					if(grupoclienteAux.getIsSelected()) {
						grupoclientesSeleccionados.add(grupoclienteAux);				
					}
				}
			}
			
			if(grupoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						grupoclientesSeleccionados.addAll(this.grupoclienteLogic.getGrupoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						grupoclientesSeleccionados.addAll(this.grupoclientes);				
					}
				}
			}
		} else {
			grupoclientesSeleccionados.add(this.grupocliente);
		}
		
		return grupoclientesSeleccionados;
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
	
	public void generarReporteGrupoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGrupoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGrupoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesGrupoClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Grupo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGrupoClientesSeleccionados() throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalGrupoClientesSeleccionados() throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGrupoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGrupoClientesSeleccionados() throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGrupoCliente();
		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGrupoCliente();
		
		
		//this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados ,grupoclienteImplementable,grupoclienteImplementableHome);
	}
	
	public void mostrarImportacionGrupoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGrupoCliente();
		
		this.abrirFrameImportacionGrupoCliente();		
		
			
		//this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados ,grupoclienteImplementable,grupoclienteImplementableHome);
	}
	
	public void importarGrupoClientes() throws Exception {		
	
	}
	
	public void exportarGrupoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGrupoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGrupoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGrupoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Grupo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGrupoClientesSeleccionados() throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGrupoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GrupoCliente grupoclienteAux:grupoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGrupoCliente(grupoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//grupoclienteAux.setsDetalleGeneralEntityReporte(grupoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGrupoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_SIGLAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_ESPROVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGrupoCliente(GrupoCliente grupocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=grupocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getsiglas();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getes_prove().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocliente.getcentrocosto_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGrupoClientesSeleccionados() throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GrupoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGrupoCliente(row);				
				iRow++;
			}				
			
			for(GrupoCliente grupoclienteAux:grupoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGrupoCliente(grupoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGrupoClientesSeleccionados() throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();		
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("grupoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("grupocliente");
			//elementRoot.appendChild(element);
		
			for(GrupoCliente grupoclienteAux:grupoclientesSeleccionados) {
				element = document.createElement("grupocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGrupoCliente(grupoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGrupoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_SIGLAS);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_ESPROVE);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGrupoCliente(GrupoCliente grupocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getsiglas());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getes_prove());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocliente.getcentrocosto_descripcion());				
	}
	
	public void setFilaDatosExportarXmlGrupoCliente(GrupoCliente grupocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GrupoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(grupocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GrupoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(grupocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GrupoClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(grupocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(GrupoClienteConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(grupocliente.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementcodigo = document.createElement(GrupoClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(grupocliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(GrupoClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(grupocliente.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(GrupoClienteConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(grupocliente.getsiglas().trim()));
		element.appendChild(elementsiglas);

		Element elementsecuencial = document.createElement(GrupoClienteConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(grupocliente.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementdescripcion = document.createElement(GrupoClienteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(grupocliente.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementes_prove = document.createElement(GrupoClienteConstantesFunciones.ESPROVE);
		elementes_prove.appendChild(document.createTextNode(grupocliente.getes_prove().toString().trim()));
		element.appendChild(elementes_prove);

		Element elementcuentacontable_descripcion = document.createElement(GrupoClienteConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(grupocliente.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(GrupoClienteConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(grupocliente.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);
	}
	
	public void generarReporteGroupGenericoGrupoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GrupoCliente> grupoclientesSeleccionados=new ArrayList<GrupoCliente>();
		
		grupoclientesSeleccionados=this.getGrupoClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGrupoCliente(grupoclientesSeleccionados);
		
		this.generarReporteGrupoClientes("Todos",grupoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGrupoCliente(ArrayList<GrupoCliente> grupoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GrupoCliente grupoclienteAux:grupoclientesSeleccionados) {
				grupoclienteAux.setsDetalleGeneralEntityReporte(grupoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getsiglas());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_ESPROVE)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(grupoclienteAux.getes_prove()));
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					grupoclienteAux.setsDescripcionGeneralEntityReporte1(grupoclienteAux.getcentrocosto_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGrupoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGrupoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosGrupoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=false;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
			this.isVisibilidadCeldaModificarGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=true;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
			this.isVisibilidadCeldaModificarGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=true;
			this.isVisibilidadCeldaEliminarGrupoCliente=true;
			this.isVisibilidadCeldaCancelarGrupoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
			this.isVisibilidadCeldaModificarGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=true;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGrupoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=true;
			this.isVisibilidadCeldaModificarGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=false;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
			this.isVisibilidadCeldaActualizarGrupoCliente=false;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
			this.isVisibilidadCeldaModificarGrupoCliente=true;
			this.isVisibilidadCeldaActualizarGrupoCliente=false;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
			this.isVisibilidadCeldaCancelarGrupoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GrupoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGrupoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=true;
		} else {
			this.actualizarEstadoPanelsGrupoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGrupoCliente=false;
			//this.isVisibilidadCeldaVerFormGrupoCliente=false;
			this.isVisibilidadCeldaDuplicarGrupoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!grupoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoGrupoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(grupoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!grupoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;												
			}
			
			this.jButtonCerrarGrupoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.grupocliente)) {
			this.isVisibilidadCeldaActualizarGrupoCliente=false;
			this.isVisibilidadCeldaEliminarGrupoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoCliente() {
		this.isVisibilidadCeldaNuevoGrupoCliente=false;
		this.isVisibilidadCeldaGuardarCambiosGrupoCliente=false;
	}
	
	public void actualizarEstadoPanelsGrupoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGrupoCliente!=null) {
				this.jScrollPanelDatosEdicionGrupoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoCliente!=null) {
				this.jScrollPanelDatosGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoCliente!=null) {
				this.jPanelPaginacionGrupoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
					this.jTabbedPaneBusquedasGrupoCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoCliente!=null) {
				this.jTabbedPaneBusquedasGrupoCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGrupoCliente!=null) {
				this.jPanelParametrosReportesGrupoCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorCodigoGrupoCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorNombreGrupoCliente);}

			this.isVisibilidadBusquedaPorSiglas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorSiglasGrupoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorCodigo=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorCodigoGrupoCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorNombreGrupoCliente);}

			this.isVisibilidadBusquedaPorSiglas=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorSiglasGrupoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorCodigoGrupoCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorNombreGrupoCliente);}

			this.isVisibilidadBusquedaPorSiglas=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorSiglasGrupoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadBusquedaPorCodigo=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorCodigoGrupoCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorNombreGrupoCliente);}

			this.isVisibilidadBusquedaPorSiglas=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasGrupoCliente.remove(jPanelBusquedaPorSiglasGrupoCliente);}
		}
		
	}
	
	

	public String registrarSesionGrupoClienteParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.setsPathNavegacionActual(grupoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(GrupoClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.setisBusquedaDesdeForeignKeySesionGrupoCliente(true);
			this.jInternalFrameDetalleFormGrupoCliente.clienteSessionBean.setlidGrupoClienteActual(this.idGrupoClienteActual);

			grupoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoCliente(true);
			grupoclienteSessionBean.setlIdGrupoClienteActualForeignKey(this.idGrupoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionGrupoClienteParaGrupoClienteFormaPagos() throws Exception {
		Boolean isPaginaPopupGrupoClienteFormaPago=false;

		try {

			if(this.grupoclienteSessionBean==null) {
				this.grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.setsPathNavegacionActual(grupoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeGrupoClienteFormaPago(true);
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeGrupoClienteFormaPago(GrupoClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.setisBusquedaDesdeForeignKeySesionGrupoCliente(true);
			this.jInternalFrameDetalleFormGrupoCliente.grupoclienteformapagoSessionBean.setlidGrupoClienteActual(this.idGrupoClienteActual);

			grupoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoCliente(true);
			grupoclienteSessionBean.setlIdGrupoClienteActualForeignKey(this.idGrupoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionGrupoClienteParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(grupoclienteSessionBean==null) {
				grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(grupoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.grupoclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(GrupoClienteConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionGrupoCliente(true);
			//cuentacontableSessionBean.setlidGrupoClienteActual(this.idGrupoClienteActual);

			grupoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoCliente(true);
			grupoclienteSessionBean.setlIdGrupoClienteActualForeignKey(this.idGrupoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionGrupoClienteParaBusquedaCentroCostos() throws Exception {
		Boolean isPaginaPopupCentroCosto=false;

		try {

			if(grupoclienteSessionBean==null) {
				grupoclienteSessionBean=new GrupoClienteSessionBean();
			}

			if(centrocostoSessionBean==null) {
				centrocostoSessionBean=new CentroCostoSessionBean();
			}

			centrocostoSessionBean.setsPathNavegacionActual(grupoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
			centrocostoSessionBean.setisPermiteRecargarInformacion(false);
			centrocostoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCentroCosto=centrocostoSessionBean.getisPaginaPopup();
			centrocostoSessionBean.setisPaginaPopup(false);
			centrocostoSessionBean.setEstaModoBusqueda(true);
			centrocostoSessionBean.setsFuncionBusquedaRapida("window.opener.grupoclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_centro_costo(TO_REPLACE);");
			centrocostoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroCosto(true);
			centrocostoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCosto(GrupoClienteConstantesFunciones.SNOMBREOPCION);
			//centrocostoSessionBean.setisBusquedaDesdeForeignKeySesionGrupoCliente(true);
			//centrocostoSessionBean.setlidGrupoClienteActual(this.idGrupoClienteActual);

			grupoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoCliente(true);
			grupoclienteSessionBean.setlIdGrupoClienteActualForeignKey(this.idGrupoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GrupoClienteSessionBean grupoclienteSessionBean=new GrupoClienteSessionBean();
		
		if(this.grupoclienteSessionBean==null) {
			this.grupoclienteSessionBean=new GrupoClienteSessionBean();
		}
		
		this.grupoclienteSessionBean.setsUltimaBusquedaGrupoCliente(this.getsAccionBusqueda());
		this.grupoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.grupoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			grupoclienteSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			grupoclienteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
			grupoclienteSessionBean.setsiglas(this.getsiglasBusquedaPorSiglas());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			grupoclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GrupoClienteSessionBean grupoclienteSessionBean=new GrupoClienteSessionBean();
		
		if(this.grupoclienteSessionBean==null) {
			this.grupoclienteSessionBean=new GrupoClienteSessionBean();
		}
		
		if(this.grupoclienteSessionBean.getsUltimaBusquedaGrupoCliente()!=null&&!this.grupoclienteSessionBean.getsUltimaBusquedaGrupoCliente().equals("")) {
			this.setsAccionBusqueda(grupoclienteSessionBean.getsUltimaBusquedaGrupoCliente());
			this.setiNumeroPaginacion(grupoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(grupoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(grupoclienteSessionBean.getcodigo());
				grupoclienteSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(grupoclienteSessionBean.getnombre());
				grupoclienteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
				this.setsiglasBusquedaPorSiglas(grupoclienteSessionBean.getsiglas());
				grupoclienteSessionBean.setsiglas("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(grupoclienteSessionBean.getid_empresa());
				grupoclienteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.grupoclienteSessionBean.setsUltimaBusquedaGrupoCliente("");
		this.grupoclienteSessionBean.setiNumeroPaginacion(GrupoClienteConstantesFunciones.INUMEROPAGINACION);
		this.grupoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGrupoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGrupoCliente() {
		this.updateBorderResaltarBusquedasFormularioGrupoCliente();
		this.updateVisibilidadBusquedasFormularioGrupoCliente();
		this.updateHabilitarBusquedasFormularioGrupoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioGrupoCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGrupoCliente.getComponents().length>0) {
	

		if(this.grupoclienteConstantesFunciones.resaltarBusquedaPorCodigoGrupoCliente!=null) {
			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
				jPanel.setBorder(this.grupoclienteConstantesFunciones.resaltarBusquedaPorCodigoGrupoCliente);
			}
		}

		if(this.grupoclienteConstantesFunciones.resaltarBusquedaPorNombreGrupoCliente!=null) {
			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorNombreGrupoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
				jPanel.setBorder(this.grupoclienteConstantesFunciones.resaltarBusquedaPorNombreGrupoCliente);
			}
		}

		if(this.grupoclienteConstantesFunciones.resaltarBusquedaPorSiglasGrupoCliente!=null) {
			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorSiglasGrupoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
				jPanel.setBorder(this.grupoclienteConstantesFunciones.resaltarBusquedaPorSiglasGrupoCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGrupoCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGrupoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoclienteConstantesFunciones.mostrarBusquedaPorCodigoGrupoCliente);
			if(!this.grupoclienteConstantesFunciones.mostrarBusquedaPorCodigoGrupoCliente && index>-1) {
				this.jTabbedPaneBusquedasGrupoCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorNombreGrupoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoclienteConstantesFunciones.mostrarBusquedaPorNombreGrupoCliente);
			if(!this.grupoclienteConstantesFunciones.mostrarBusquedaPorNombreGrupoCliente && index>-1) {
				this.jTabbedPaneBusquedasGrupoCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorSiglasGrupoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoclienteConstantesFunciones.mostrarBusquedaPorSiglasGrupoCliente);
			if(!this.grupoclienteConstantesFunciones.mostrarBusquedaPorSiglasGrupoCliente && index>-1) {
				this.jTabbedPaneBusquedasGrupoCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGrupoCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGrupoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoclienteConstantesFunciones.activarBusquedaPorCodigoGrupoCliente);
				this.jTabbedPaneBusquedasGrupoCliente.setEnabledAt(index,this.grupoclienteConstantesFunciones.activarBusquedaPorCodigoGrupoCliente);
			}

			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorNombreGrupoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoclienteConstantesFunciones.activarBusquedaPorNombreGrupoCliente);
				this.jTabbedPaneBusquedasGrupoCliente.setEnabledAt(index,this.grupoclienteConstantesFunciones.activarBusquedaPorNombreGrupoCliente);
			}

			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorSiglasGrupoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoclienteConstantesFunciones.activarBusquedaPorSiglasGrupoCliente);
				this.jTabbedPaneBusquedasGrupoCliente.setEnabledAt(index,this.grupoclienteConstantesFunciones.activarBusquedaPorSiglasGrupoCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGrupoCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoCliente);

			this.jTabbedPaneBusquedasGrupoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);

			this.grupoclienteConstantesFunciones.setResaltarBusquedaPorCodigoGrupoCliente(resaltar);

			jPanel.setBorder(this.grupoclienteConstantesFunciones.resaltarBusquedaPorCodigoGrupoCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorNombreGrupoCliente);

			this.jTabbedPaneBusquedasGrupoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);

			this.grupoclienteConstantesFunciones.setResaltarBusquedaPorNombreGrupoCliente(resaltar);

			jPanel.setBorder(this.grupoclienteConstantesFunciones.resaltarBusquedaPorNombreGrupoCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSiglas")) {
			index= this.jTabbedPaneBusquedasGrupoCliente.indexOfComponent(this.jPanelBusquedaPorSiglasGrupoCliente);

			this.jTabbedPaneBusquedasGrupoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoCliente.getComponent(index);

			this.grupoclienteConstantesFunciones.setResaltarBusquedaPorSiglasGrupoCliente(resaltar);

			jPanel.setBorder(this.grupoclienteConstantesFunciones.resaltarBusquedaPorSiglasGrupoCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGrupoCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGrupoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGrupoCliente();
		this.updateVisibilidadResaltarControlesFormularioGrupoCliente();
		this.updateHabilitarResaltarControlesFormularioGrupoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioGrupoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.grupoclienteConstantesFunciones.resaltaridGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltaridGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarid_empresaGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarid_empresaGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarid_moduloGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarid_moduloGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarcodigoGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarcodigoGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarnombreGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarnombreGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarsiglasGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarsiglasGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarsecuencialGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarsecuencialGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltardescripcionGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltardescripcionGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltares_proveGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setBorderPainted(true);this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltares_proveGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarid_cuenta_contableGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarid_cuenta_contableGrupoCliente);}
		if(this.grupoclienteConstantesFunciones.resaltarid_centro_costoGrupoCliente!=null && this.jInternalFrameDetalleFormGrupoCliente!=null) {this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setBorder(this.grupoclienteConstantesFunciones.resaltarid_centro_costoGrupoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGrupoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
	
		//this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostraridGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelidGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostraridGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_empresaGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelid_empresaGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_empresaGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_moduloGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelid_moduloGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_moduloGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarcodigoGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelcodigoGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarcodigoGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarnombreGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelnombreGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarnombreGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarsiglasGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelsiglasGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarsiglasGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarsecuencialGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelsecuencialGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarsecuencialGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrardescripcionGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPaneldescripcionGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrardescripcionGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrares_proveGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPaneles_proveGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrares_proveGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_cuenta_contableGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelid_cuenta_contableGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_cuenta_contableGrupoCliente);
			this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_cuenta_contableGrupoCliente);
		//this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_centro_costoGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jPanelid_centro_costoGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_centro_costoGrupoCliente);
			this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoCliente.setVisible(this.grupoclienteConstantesFunciones.mostrarid_centro_costoGrupoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGrupoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoCliente!=null) {
	
		this.jInternalFrameDetalleFormGrupoCliente.jLabelidGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activaridGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_empresaGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarid_empresaGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_moduloGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarid_moduloGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextFieldcodigoGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarcodigoGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextAreanombreGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarnombreGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsiglasGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarsiglasGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextFieldsecuencialGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarsecuencialGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jTextAreadescripcionGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activardescripcionGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jCheckBoxes_proveGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activares_proveGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_cuenta_contableGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarid_cuenta_contableGrupoCliente);
			this.jInternalFrameDetalleFormGrupoCliente.jButtonid_cuenta_contableGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarid_cuenta_contableGrupoCliente);
		this.jInternalFrameDetalleFormGrupoCliente.jComboBoxid_centro_costoGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarid_centro_costoGrupoCliente);
			this.jInternalFrameDetalleFormGrupoCliente.jButtonid_centro_costoGrupoCliente.setEnabled(this.grupoclienteConstantesFunciones.activarid_centro_costoGrupoCliente);
		}
	}
	
		
}